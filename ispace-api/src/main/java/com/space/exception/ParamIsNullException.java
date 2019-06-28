package com.space.exception;

/**
 * 
* @ClassName: NoVersionException
* @Description: TODO(参数校验异常处理)
* @author ThinkPad
* @date 2018年5月15日 上午12:35:15
*
 */
public class ParamIsNullException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final String parameterName;
    private final String parameterType;

    public ParamIsNullException(String parameterName, String parameterType) {
        super("");
        this.parameterName = parameterName;
        this.parameterType = parameterType;
    }

    @Override
    public String getMessage() {
        return " parameter \'" + this.parameterName + "\' 不能为空 !";
    }

    public final String getParameterName() {
        return this.parameterName;
    }

    public final String getParameterType() {
        return this.parameterType;
    }

	
}
