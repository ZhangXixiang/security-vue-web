package com.space.mybatis.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "article_rel_user")
public class ArticleRelUser implements Serializable {
    
	@Id
	@GeneratedValue(generator = "JDBC")
    @Column(name = "id")
	private Integer id;

	@Column(name = "pid")
    private Integer pid;

	@Column(name = "article_id")
    private Integer articleId;

	@Column(name = "commenter_id")
    private String commenterId;

	@Column(name = "type")
    private Integer type;

	@Column(name = "content")
    private String content;

	@Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

}