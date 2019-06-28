package com.space.common.util.im;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/4/8 0008.
 */
@Component
@Getter
@Setter
public class IMSignUtil {
    public static final Integer returnCode_success =  200;
    public static final Integer returnCode_errerparm =  414;
    @Value("${IMAppKey}")
    private String appKey;
    @Value("${IMAppSecret}")
    private String appSecret;
    @Value("${IMCreteurl}")
    private String IMCreteurl;
    @Value("${IMRefreshToken}")
    private String IMRefreshToken;

}
