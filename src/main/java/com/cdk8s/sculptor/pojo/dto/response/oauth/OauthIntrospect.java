package com.cdk8s.sculptor.pojo.dto.response.oauth;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class OauthIntrospect implements Serializable {

	private static final long serialVersionUID = -1L;

	private String tokenType;
	private String grantType;
	private String clientId;
	private Long exp;
	private Long iat;

}
