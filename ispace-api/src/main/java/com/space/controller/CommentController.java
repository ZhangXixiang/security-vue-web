package com.space.controller;

import com.space.common.dto.IResult;
import com.space.common.dto.PageInfoDto;
import com.space.common.dto.ResponseDto;
import com.space.common.dto.dis.comment.CommentReqDto;
import com.space.common.dto.dis.comment.CommentReqUserDto;
import com.space.common.dto.dis.comment.CommentResDto;
import com.space.common.dto.dis.comment.CommentSearchDto;
import com.space.common.util.JsonUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("v1/")
public class CommentController extends BaseController {

	@ApiOperation(value="评论", produces = "application/json") 
	@ApiResponses(
			value = {
					@ApiResponse(code = 200, message = "操作成功"),
					@ApiResponse(code = 300, message = "操作失败")
			}
	)
	@PostMapping("topic/answer/comment")
	@ResponseBody
	public String comment(HttpServletRequest request, @Valid @RequestBody CommentReqDto reqDto, BindingResult bind) throws Exception{
		String userId = super.getTokenDto(request);
		reqDto.setUserId(userId);
		boolean ok = commentService.comment(reqDto);
		if(ok){
			return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.SUCCESS, "操作成功"));
		}
		return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.FAILING, "操作失败"));
	}
	
	@ApiOperation(value="根据answerId分页获取相关评论", produces = "application/json") 

	@ApiResponses(
		value = {
				@ApiResponse(code = 201, message = "分页对象", response = PageInfoDto.class),
				@ApiResponse(code = 202, message = "分页对象中list的数据", response = CommentResDto.class)
		}
	)
	@PostMapping("topic/answer/comments")
	@ResponseBody
	public String getByAnswerId(HttpServletRequest request, @Valid @RequestBody CommentSearchDto searchDto, BindingResult bind) throws Exception{
		super.getTokenDto(request);
		PageInfoDto<CommentResDto> page = commentService.getByAnswerId(searchDto);
		return JsonUtil.objectToJsonString(new ResponseDto<PageInfoDto<CommentResDto>>(IResult.SUCCESS, "操作成功", page));
	}
	
	@ApiOperation(value="我发布的评论|我收到的评论", produces = "application/json") 
	@ApiResponses(
		value = {
				@ApiResponse(code = 201, message = "分页对象", response = PageInfoDto.class),
				@ApiResponse(code = 202, message = "分页对象中list的数据", response = CommentResDto.class)
		}
	)
	@PostMapping("topic/answer/comment/user")
	@ResponseBody
	public String pubComment(HttpServletRequest request, @Valid @RequestBody CommentReqUserDto reqUserDto, BindingResult bind) throws Exception{
		String userId = super.getTokenDto(request);
		reqUserDto.setUserId(userId);
		if(reqUserDto.getType() == 1){
			PageInfoDto<CommentResDto> page = commentService.obtain(reqUserDto);
			return JsonUtil.objectToJsonString(new ResponseDto<PageInfoDto<CommentResDto>>(IResult.SUCCESS, "操作成功", page));
		}else{
			PageInfoDto<CommentResDto> page = commentService.getByUserId(reqUserDto);
			return JsonUtil.objectToJsonString(new ResponseDto<PageInfoDto<CommentResDto>>(IResult.SUCCESS, "操作成功", page));
		}
		
	}
	
}
