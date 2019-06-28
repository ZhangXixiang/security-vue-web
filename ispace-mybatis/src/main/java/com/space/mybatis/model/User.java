package com.space.mybatis.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "user")
public class User implements Serializable {
    
	@Id
	@GeneratedValue(generator = "UUID")
    @Column(name = "id")
	private String id;

	@Column(name = "account")
    private String account;

	@Column(name = "name")
    private String name;

	@Column(name = "job")
    private String job;

	@Column(name = "office_phone")
    private String officePhone;

	@Column(name = "home_phone")
    private String homePhone;

	@Column(name = "per_email")
    private String perEmail;

	@Column(name = "per_zipcode")
    private String perZipcode;

	@Column(name = "person_addr")
    private String personAddr;

	@Column(name = "gender")
    private String gender;

	@Column(name = "common_remark")
    private String commonRemark;

	@Column(name = "certificates_id")
    private String certificatesId;

	@Column(name = "fund_account")
    private String fundAccount;

	@Column(name = "holder_account")
    private String holderAccount;

	@Column(name = "seted_pay_pwd")
    private String setedPayPwd;

	@Column(name = "part_categories2")
    private String partCategories2;

	@Column(name = "user_channel")
    private String userChannel;

	@Column(name = "urgent_mobile")
    private String urgentMobile;

	@Column(name = "head_img")
    private String headImg;

	@Column(name = "flower_name")
    private String flowerName;

    private static final long serialVersionUID = 1L;

}