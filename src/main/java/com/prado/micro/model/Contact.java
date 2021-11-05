package com.prado.micro.model;

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
public class Contact {
	private long contactId;
	private String contactName;
	private String contactType;
	private long phoneNumber;
	private String alternatePhoneNumber;
	private String email;
	private String primaryContactType;
	private long userId;
}
