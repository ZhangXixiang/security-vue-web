package com.space.controller;

import com.space.common.dto.IResult;
import com.space.common.dto.PageInfoDto;
import com.space.common.dto.ResponseDto;
import com.space.common.dto.dis.answer.AnswerReqDto;
import com.space.common.dto.dis.answer.AnswerResDto;
import com.space.common.dto.dis.answer.AnswerSearchDto;
import com.space.common.dto.dis.answer.MyAnswerReqDto;
import com.space.common.util.JsonUtil;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("v1/")
public class AnswerController extends BaseController {
	
	//上传图片路径
	@Value("${application.profile}")
	private  String uploadPath;
	
	@ApiOperation(value="获取保存的记录", produces = "application/json") 
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "topicId", value = "话题ID", paramType = "query", dataType = "int", required = true)
	})
	@PostMapping(value ="topic/answer/cache")
	@ResponseBody
	public String announce_save(HttpServletRequest request, String topicId) throws Exception{
		String userId = super.getTokenDto(request);
		if(topicId == null){
			return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.PARAM_NULL, "topicId不能为空"));
		}
		String answerReqDto = redisService.get(userId + "-" + topicId);
		return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.SUCCESS, "操作成功", answerReqDto));
	}
		
	@ApiOperation(value="根据条件查询文章列表。点赞排序字段:good_count, 发布排序字段:create_time;正序:ASC 倒序：DESC;", produces = "application/json") 
	@ApiResponses(
			value = {
					@ApiResponse(code = 201, message = "分页对象", response = PageInfoDto.class),
					@ApiResponse(code = 202, message = "分页对象中list的数据", response = AnswerResDto.class)
			}
	)
	@PostMapping("/topic/answer")
	@ResponseBody
	public String getPageBytop(HttpServletRequest request, @Valid @RequestBody AnswerSearchDto searchDto, BindingResult bind) throws Exception{
		String userId = super.getTokenDto(request);
		searchDto.setUserId(userId);
		PageInfoDto<AnswerResDto> page = answerService.getPage(searchDto, null);
		return JsonUtil.objectToJsonString(new ResponseDto<PageInfoDto<AnswerResDto>>(IResult.SUCCESS, "操作成功", page));
	}
	
	@ApiOperation(value="发布(表单与文件同时上传)", produces = "content-type=multipart/form-data") 
	@PostMapping(value ="topic/answer/announce", headers = "content-type=multipart/form-data")
	@ResponseBody
	public String announce(HttpServletRequest request, @RequestParam(name = "files", required = false) MultipartFile[] files,
						   @Valid AnswerReqDto dto, BindingResult bind) throws Exception{
		String userId = super.getTokenDto(request);
		List<Map<String, String>> res = new ArrayList<Map<String, String>>();
		res = super.upload(files, uploadPath, dto.getType());
		boolean ok = answerService.addAnswer(dto, userId, res);
		if(ok){
			return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.SUCCESS, "操作成功"));
		}else{
			return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.FAILING, "操作失败"));
		}
	}
	
	@ApiOperation(value="根据回答ID获取回答详情", produces = "application/json") 
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "answerId", value = "回答ID", paramType = "query", dataType = "String", required = true)
	})
	@ApiResponses(
			value = {
					@ApiResponse(code = 200, message = "回答实体", response = AnswerResDto.class)
			}
	)
	@GetMapping(value ="topic/answer")
	@ResponseBody
	public String getByAnswerId(HttpServletRequest request, String answerId) throws Exception{
		String userId = super.getTokenDto(request);
		if(answerId == null){
			return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.PARAM_NULL, "answerId不能为空"));
		}
		AnswerResDto resDto = answerService.getByIdOver(Integer.parseInt(answerId), userId);
		return JsonUtil.objectToJsonString(new ResponseDto<AnswerResDto>(IResult.SUCCESS, "操作成功", resDto));
	}
	
	@ApiOperation(value="我的回答", produces = "application/json") 
	@ApiResponses(
		value = {
				@ApiResponse(code = 201, message = "分页对象", response = PageInfoDto.class),
				@ApiResponse(code = 202, message = "分页对象中list的数据", response = AnswerResDto.class)
		}
	)
	@PostMapping("topic/answer/user")
	@ResponseBody
	public String myArticle(HttpServletRequest request, @Valid @RequestBody MyAnswerReqDto reqDto, BindingResult bind) throws Exception{
		String userId = super.getTokenDto(request);
		AnswerSearchDto searchDto = new AnswerSearchDto();
		searchDto.setPageNum(reqDto.getPageNum());
		searchDto.setPageSize(reqDto.getPageSize());
		searchDto.setOrderTag("create_time");
		searchDto.setOrderType("DESC");
		PageInfoDto<AnswerResDto> page = answerService.getPage(searchDto, userId);
		return JsonUtil.objectToJsonString(new ResponseDto<PageInfoDto<AnswerResDto>>(IResult.SUCCESS, "操作成功", page));
	}
	
	@ApiOperation(value="删除回答", produces = "application/json") 
	@ApiResponses(
			value = {
					@ApiResponse(code = 200, message = "操作成功"),
					@ApiResponse(code = 300, message = "操作失败"),
			}
		)
	@DeleteMapping("topic/answer")
	@ResponseBody
	public String delAnswer(HttpServletRequest request, @RequestParam Integer answerId) throws Exception{
		if(answerId == null){
			return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.PARAM_NULL, "answerId不能为空"));
		}
		String userId = super.getTokenDto(request);
		boolean ok = answerService.delAnswer(answerId, userId);
		if(ok){
			return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.SUCCESS, "操作成功"));
		}else{
			return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.FAILING, "操作失败"));
		}
	}
}









