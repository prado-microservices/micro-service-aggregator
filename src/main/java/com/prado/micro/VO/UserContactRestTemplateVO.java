package com.prado.micro.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.prado.micro.model.Contact;
import com.prado.micro.model.User;

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
public class UserContactRestTemplateVO {
	
	@JsonInclude(Include.NON_NULL)
	private User user;
	
	@JsonInclude(Include.NON_NULL)
	private Contact contact;
}
