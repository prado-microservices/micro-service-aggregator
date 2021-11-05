package com.prado.micro.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	private long userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private int userAge;
	private long departmentId;
	private String deptFlag;
	
	//Contact Change
	@JsonInclude(Include.NON_NULL)
	private long contactId;
}
