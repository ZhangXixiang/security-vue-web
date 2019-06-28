package com.space.mybatis.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "collect")
public class Collect implements Serializable {
    
	@Id
	@GeneratedValue(generator = "JDBC")
    @Column(name = "id")
	private Integer id;

	@Column(name = "answer_id")
    private Integer answerId;
	
	@Column(name = "answer_title")
	private String answerTitle;

	@Column(name = "user_id")
    private String userId;

	@Column(name = "type")
    private Integer type;

	@Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

}