package com.app.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
	@NotEmpty(message="Uname is required")
	@Size(min=3, max=8, message= "Age should be 3 to 8 charecters")
	private String uname;
	
	@NotEmpty(message="Pwd is required")
	private String pwd;
	
	@NotEmpty(message="Email is required")
	@Email(message="Enter valid email Id")
	private String email;
	
	@NotEmpty(message="Pno is required")
	@Size(min=10, message="Pno sholud have atleast 10 digits")
	private String pno;
	
	@NotNull(message="Age is required")
	@Min(value=21, message="Age should be Min 21 years")
	@Max(value=60, message="Age should not cross 60 years")
	private String age;
	

}
