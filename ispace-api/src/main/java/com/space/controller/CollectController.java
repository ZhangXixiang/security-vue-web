package com.space.controller;

import com.space.common.dto.IResult;
import com.space.common.dto.PageInfoDto;
import com.space.common.dto.ResponseDto;
import com.space.common.dto.dis.collect.CollectReqDto;
import com.space.common.dto.dis.collect.CollectResDto;
import com.space.common.dto.dis.collect.CollectSerachDto;
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
public class CollectController extends BaseController {

	@ApiOperation(value="点赞、收藏或取消", produces = "application/json") 
	@ApiResponses(
			value = {
					@ApiResponse(code = 200, message = "操作成功"),
					@ApiResponse(code = 300, message = "操作失败")
			}
	)
	@PostMapping("topic/answer/collect")
	@ResponseBody
	public String collect(HttpServletRequest request, @Valid @RequestBody CollectReqDto reqDto, BindingResult bind) throws Exception{
		String userId = super.getTokenDto(request);
		reqDto.setUserId(userId);
		boolean ok = collectService.collect(reqDto);
		if(ok){
			return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.SUCCESS, "操作成功"));
		}
		return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.FAILING, "操作失败"));
	}
	
	@ApiOperation(value="消息中的收藏与赞", produces = "application/json") 
	@ApiResponses(
		value = {
				@ApiResponse(code = 201, message = "分页对象", response = PageInfoDto.class),
				@ApiResponse(code = 202, message = "分页对象中list的数据", response = CollectResDto.class)
		}
	)
	@PostMapping("topic/answer/collect/user")
	@ResponseBody
	public String getComment(HttpServletRequest request, @Valid @RequestBody CollectSerachDto serachDto, BindingResult bind) throws Exception{
		String userId = super.getTokenDto(request);
		serachDto.setUserId(userId);
		PageInfoDto<CollectResDto> resDtos = collectService.getByUserId(serachDto);
		return JsonUtil.objectToJsonString(new ResponseDto<PageInfoDto<CollectResDto>>(IResult.SUCCESS, "操作成功", resDtos));
	}
	

	
}
