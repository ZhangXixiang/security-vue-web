package com.space.mybatis.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "topic_rel_user")
public class TopicRelUser implements Serializable {
    
	@Id
	@GeneratedValue(generator = "JDBC")
    @Column(name = "id")
	private Integer id;

	@Column(name = "topic_id")
    private Integer topicId;

	@Column(name = "user_id")
    private String userId;

    private static final long serialVersionUID = 1L;

}