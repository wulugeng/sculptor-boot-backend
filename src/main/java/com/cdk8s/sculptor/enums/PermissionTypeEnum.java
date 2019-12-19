package com.cdk8s.sculptor.enums;

import java.util.HashMap;
import java.util.Map;

public enum PermissionTypeEnum implements BasicEnum {
	TOP_DIRECTORY(1, "一级目录"),
	MENU(2, "菜单"),
	BUTTON(3, "按钮");

	private Integer code;
	private String description;

	PermissionTypeEnum(final Integer code, final String description) {
		this.code = code;
		this.description = description;
	}

	@Override
	public Integer getCode() {
		return code;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public static Map<Integer, String> getAllEnum() {
		Map<Integer, String> map = new HashMap<>();
		PermissionTypeEnum[] allEnums = values();
		for (PermissionTypeEnum enumObject : allEnums) {
			map.put(enumObject.getCode(), enumObject.getDescription());
		}
		return map;
	}

	public static PermissionTypeEnum getEnumByCode(Integer code) {
		if (null == code) {
			return null;
		}
		PermissionTypeEnum[] allEnums = values();
		for (PermissionTypeEnum enumObject : allEnums) {
			if (enumObject.getCode().equals(code)) {
				return enumObject;
			}
		}
		return null;
	}

	public static String getDescriptionByCode(Integer code) {
		if (null == code) {
			return null;
		}
		PermissionTypeEnum[] allEnums = values();
		for (PermissionTypeEnum enumObject : allEnums) {
			if (enumObject.getCode().equals(code)) {
				return enumObject.getDescription();
			}
		}
		return null;
	}

	public static String getNameByCode(Integer code) {
		if (null == code) {
			return null;
		}
		PermissionTypeEnum[] allEnums = values();
		for (PermissionTypeEnum enumObject : allEnums) {
			if (enumObject.getCode().equals(code)) {
				return enumObject.name();
			}
		}
		return null;
	}
}
