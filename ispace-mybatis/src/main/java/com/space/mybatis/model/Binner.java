package com.space.mybatis.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "binner")
public class Binner implements Serializable {
    
	@Id
	@GeneratedValue(generator = "JDBC")
    @Column(name = "id")
	private Integer id;

	@Column(name = "path")
    private String path;

	@Column(name = "sort")
    private Integer sort;

	@Column(name = "user_id")
    private String userId;

	@Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

}