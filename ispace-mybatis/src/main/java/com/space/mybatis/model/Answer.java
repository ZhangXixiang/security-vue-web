package com.space.mybatis.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "answer")
public class Answer implements Serializable {
    
	@Id
	@GeneratedValue(generator = "JDBC")
    @Column(name = "id")
	private Integer id;

	@Column(name = "topic_id")
    private Integer topicId;

	@Column(name = "title")
    private String title;

	@Column(name = "cont")
    private String cont;

	@Column(name = "user_id")
    private String userId;

	@Column(name = "create_time")
    private Date createTime;

	@Column(name = "is_origin")
    private Integer isOrigin;

	@Column(name = "good_count")
    private Integer goodCount;

	@Column(name = "collect_count")
    private Integer collectCount;

	@Column(name = "comment_count")
    private Integer commentCount;

	@Column(name = "u_t")
    private Date uT;

	@Column(name = "u_p")
    private String uP;

	@Column(name = "is_deleted")
    private Integer isDeleted;

    private static final long serialVersionUID = 1L;

}