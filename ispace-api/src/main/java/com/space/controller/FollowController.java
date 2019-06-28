package com.space.controller;

import com.space.common.dto.IResult;
import com.space.common.dto.PageInfoDto;
import com.space.common.dto.ResponseDto;
import com.space.common.dto.dis.follow.FollowReqDto;
import com.space.common.dto.dis.follow.FollowSearchDto;
import com.space.common.dto.dis.topic.TopicResDto;
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
public class FollowController extends BaseController {

	
	@ApiOperation(value="关注或取消关注", produces = "application/json") 
	@ApiResponses(
			value = {
					@ApiResponse(code = 200, message = "操作成功"),
					@ApiResponse(code = 300, message = "操作失败")
			}
	)
	@PostMapping("/topic/follow")
	@ResponseBody
	public String follow_post(HttpServletRequest request, @Valid @RequestBody FollowReqDto reqDto, BindingResult bind) throws Exception{
		String userId = super.getTokenDto(request);
		reqDto.setUserId(userId);
		
		boolean ok = followService.follow(reqDto);
		if(ok){
			return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.SUCCESS, "操作成功"));
		}
		return JsonUtil.objectToJsonString(new ResponseDto<String>(IResult.FAILING, "操作失败"));
	}
	
	@ApiOperation(value="我关注的话题", produces = "application/json") 
	@ApiResponses(
			value = {
					@ApiResponse(code = 201, message = "分页对象", response = PageInfoDto.class),
					@ApiResponse(code = 202, message = "分页对象中list的数据", response = TopicResDto.class)
			}
	)
	@PostMapping("/topic/follow/user")
	@ResponseBody
	public String myFollow(HttpServletRequest request, @Valid @RequestBody FollowSearchDto searchDto, BindingResult bind) throws Exception{
		String userId = super.getTokenDto(request);
		searchDto.setUserId(userId);
		PageInfoDto<TopicResDto> page = followService.myFollow(searchDto);
		return JsonUtil.objectToJsonString(new ResponseDto<PageInfoDto<TopicResDto>>(IResult.SUCCESS, "操作成功", page));
	}
	
}
