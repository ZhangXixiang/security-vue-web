package com.space.mybatis.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "resource")
public class Resource implements Serializable {
    
	@Id
	@GeneratedValue(generator = "JDBC")
    @Column(name = "id")
	private Integer id;

	@Column(name = "path")
    private String path;

	@Column(name = "type")
    private Integer type;

	@Column(name = "sort")
    private Integer sort;

	@Column(name = "answer_id")
    private Integer answerId;
	
	@Column(name = "wide")
	private Float wide;
	
	@Column(name = "high")
	private Float high;

    private static final long serialVersionUID = 1L;

}