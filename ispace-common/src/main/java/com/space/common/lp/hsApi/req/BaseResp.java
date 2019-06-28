package com.space.common.lp.hsApi.req;

import lombok.*;
import org.springframework.validation.BindException;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaseResp {

	protected int errorCode;
	protected String errorMessage;

	public void error(Throwable error) {
		if (error instanceof BindException) {
			BindException be = (BindException) error;
			String msg = be.getBindingResult().getAllErrors().get(0).getDefaultMessage();
			this.errorCode = -1;
			this.errorMessage = msg;
		} else {
			this.errorCode = -1;
			this.errorMessage = error.getMessage();
		}
	}

}
