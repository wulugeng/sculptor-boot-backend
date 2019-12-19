package com.cdk8s.sculptor.pojo.bo.service.syspermission;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class SysPermissionCreateServiceBO implements Serializable {

	private static final long serialVersionUID = -1L;

	private Long id;
	private String permissionName;
	private String permissionCode;
	private String permissionUrl;
	private Integer permissionTypeEnum;
	private Long parentId;
	private String parentIds;
	private String iconClass;
	private Integer visibleEnum;
	private Integer boolExtLinkEnum;
	private Integer boolNewTabEnum;
	private Integer ranking;
	private String description;
	private Integer stateEnum;
	private Integer deleteEnum;
	private Long createDate;
	private Long createUserId;
	private Long updateDate;
	private Long updateUserId;
	private Long deleteDate;
	private Long deleteUserId;

}
