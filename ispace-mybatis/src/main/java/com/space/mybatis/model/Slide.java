package com.space.mybatis.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "slide")
public class Slide implements Serializable {
    
	@Id
	@GeneratedValue(generator = "JDBC")
    @Column(name = "id")
	private Integer id;

	@Column(name = "path")
    private String path;

	@Column(name = "sort")
    private Integer sort;

	@Column(name = "create_user_id")
    private String createUserId;

	@Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

}