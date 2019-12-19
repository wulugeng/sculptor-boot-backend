package com.cdk8s.sculptor.pojo.bo.cache.oauth;

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
public class OauthRefreshTokenToRedisBO extends OauthTokenToRedisBO implements Serializable {

	private static final long serialVersionUID = -1L;

	//因为不会经常被查询，所以不直接存用户信息
	private String userInfoRedisKey;

}
