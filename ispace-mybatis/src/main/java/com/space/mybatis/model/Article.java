package com.space.mybatis.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "article")
public class Article implements Serializable {
    
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

	@Column(name = "create_id")
    private String createId;

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

    private static final long serialVersionUID = 1L;

}