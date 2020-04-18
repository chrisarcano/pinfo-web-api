package com.cda.pinfo.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("USER")
public class User {
	@Id
	@Column("USER_ID")
    private Integer userId;
	@Column("USER_NAME")
	private String userName;
	private String email;
    @Column("BIRTH_DATE")
    private LocalDate birthDate;
    @Column("CONTACT_NUMBER")
    private String contactNumber;
}
