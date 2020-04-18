package com.cda.pinfo.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserDTO {
    private Integer userId;
	private String userName;
	private String email;
    private LocalDate birthDate;
    private String contactNumber;
}
