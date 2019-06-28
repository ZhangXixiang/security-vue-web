package com.space.controller;

import com.space.common.dto.IResult;
import com.space.common.dto.ResponseDto;
import com.space.common.dto.dis.binner.BinnerResDto;
import com.space.common.dto.dis.topic.TopicResDto;
import com.space.common.util.JsonUtil;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("v1/topic")
public class TopicaController extends BaseController {
	
	@ApiOperation(value="话题和binner || 根据话题id返回话题详情", produces = "application/json")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name = "topicId", value = "话题id", paramType = "query", dataType = "String")
	})
	@ApiResponses(
			value = {
					@ApiResponse(code = 201, message = "话题对象", response = TopicResDto.class),
					@ApiResponse(code = 202, message = "binner对象", response = BinnerResDto.class)
			}
	)
	@GetMapping
	@ResponseBody
	public String topic_get(HttpServletRequest request, String topicId) throws Exception{
		String userId = super.getTokenDto(request);
		Integer id = null;
		if(topicId != null){
			id = Integer.parseInt(topicId);
		}
		Map<String, Object> res = topicService.getTopicAndSlider(id, userId);
		return JsonUtil.objectToJsonString(new ResponseDto<Map<String, Object>>(IResult.SUCCESS, "操作成功", res));
	}
	
}
