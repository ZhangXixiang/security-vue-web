package com.space.common.dto.dis.follow;

import lombok.Data;

import java.io.Serializable;


@Data
public class FollowResDTO implements Serializable {

    private Integer id;

    private Integer topicId;

    private String userId;

    private String topicName;

}
