package com.microserviceemail.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class EmailDto {


	private String ownerRef;
	@Email
	private String emailFrom;
	@Email
	private String emailTo;
	private String subject;
	private String text;
	
}
