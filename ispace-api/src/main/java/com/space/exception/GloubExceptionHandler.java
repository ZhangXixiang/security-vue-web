//package com.space.exception;
//
//import com.space.common.dto.IResult;
//import com.space.common.dto.ResponseDto;
//import com.space.common.util.JsonUtil;
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.MalformedJwtException;
//import io.jsonwebtoken.SignatureException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.format.datetime.DateFormatter;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.MissingServletRequestParameterException;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//
//@CrossOrigin
//@RestControllerAdvice
//public class GloubExceptionHandler{
//
//	private static Logger LOGGER = LoggerFactory.getLogger(GloubExceptionHandler.class);
//
//
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        System.out.println("initBinder");
//        //统一日期处理
//        binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
//        //追加校验器
//        //binder.addValidators(personValidator);
//    }
//
//	@ExceptionHandler
//	public Object businessExceptionHandler(Exception exception, HttpServletRequest req) {
//		ResponseDto<String> response = new ResponseDto<String>();
//		if (exception instanceof ExpiredJwtException || exception instanceof SignatureException ||
//			exception instanceof MalformedJwtException || exception instanceof MissingServletRequestParameterException){
//			LOGGER.error("token过期:" + exception.getMessage(), exception);
//			response.setResult(HttpStatus.BAD_REQUEST.toString());
//			response.setMsg("「token过期,请重新登录!」");
//		}else if (exception instanceof ParamIsNullException) {
//			LOGGER.error("===参数校验异常处理===");
//			response.setResult(IResult.PARAM_NULL);
//			response.setMsg(exception.getMessage());
//		}else {
//			LOGGER.error("「系统异常」", exception);
//			response.setResult(HttpStatus.INTERNAL_SERVER_ERROR.toString());
//			response.setMsg("「系统异常!」");
//		}
//
//		String contentTypeHeader = req.getHeader("Content-Type");
//		String acceptHeader = req.getHeader("Accept");
//		String xRequestedWith = req.getHeader("X-Requested-With");
//		if ((contentTypeHeader != null && contentTypeHeader.contains("application/json"))
//				|| (acceptHeader != null && acceptHeader.contains("application/json"))
//				|| "XMLHttpRequest".equalsIgnoreCase(xRequestedWith)) {
//			return JsonUtil.objectToJsonString(response);
//		} else {
//			ModelAndView modelAndView = new ModelAndView();
//			modelAndView.addObject("msg", response.getMsg());
//			modelAndView.addObject("result", response.getResult());
//			if(response.getResult().equals(HttpStatus.BAD_REQUEST.toString())){
//				modelAndView = new ModelAndView();
//				modelAndView.addObject("result", response.getResult());
//				modelAndView.setViewName("redirect:/");
//			}else if (response.getResult().equals(HttpStatus.UNAUTHORIZED.toString())) {
//				modelAndView = new ModelAndView();
//				modelAndView.addObject("result", response.getResult());
//				modelAndView.setViewName("/NewFile");
//			}else{
//				modelAndView.setViewName("/globalError");
//			}
//			return modelAndView;
//		}
//	}
//}
//
//
//
//
//
