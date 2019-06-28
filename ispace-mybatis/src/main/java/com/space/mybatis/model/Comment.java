package com.space.mybatis.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "comment")
public class Comment implements Serializable {
    
	@Id
	@GeneratedValue(generator = "JDBC")
    @Column(name = "id")
	private Integer id;

	@Column(name = "pid")
    private Integer pid;

	@Column(name = "answer_id")
    private Integer answerId;
	
	@Column(name = "answer_title")
	private String answerTitle;

	@Column(name = "user_id")
    private String userId;

	@Column(name = "content")
    private String content;

	@Column(name = "create_time")
    private Date createTime;

	@Column(name = "u_t")
	private Date uT;

	@Column(name = "u_p")
	private String uP;

	@Column(name = "is_deleted")
	private Integer isDeleted;

    private static final long serialVersionUID = 1L;

}