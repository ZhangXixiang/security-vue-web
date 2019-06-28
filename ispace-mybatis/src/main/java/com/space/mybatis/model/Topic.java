package com.space.mybatis.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "topic")
public class Topic implements Serializable {
    
	@Id
	@GeneratedValue(generator = "JDBC")
    @Column(name = "id")
	private Integer id;

	@Column(name = "name")
    private String name;

	@Column(name = "content")
    private String content;

	@Column(name = "icon")
    private String icon;

	@Column(name = "sort")
    private Integer sort;

	@Column(name = "create_time")
    private Date createTime;

	@Column(name = "comment_count")
    private Integer commentCount;

	@Column(name = "collect_count")
    private Integer collectCount;

	@Column(name = "user_id")
    private String userId;

	@Column(name = "u_t")
	private Date uT;

	@Column(name = "u_p")
	private String uP;

	@Column(name = "is_deleted")
    private Integer isDeleted;

    private static final long serialVersionUID = 1L;

}