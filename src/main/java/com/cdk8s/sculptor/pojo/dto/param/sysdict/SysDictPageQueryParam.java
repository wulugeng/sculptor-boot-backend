package com.cdk8s.sculptor.pojo.dto.param.sysdict;

import com.cdk8s.sculptor.pojo.dto.param.bases.PageParam;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

@ApiModel(value = "SysDictPageQueryParam")
@Setter
@Getter
@ToString(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SysDictPageQueryParam extends PageParam {

	private static final long serialVersionUID = -1L;

	@ApiModelProperty(value = "主键ID")
	private Long id;

	@ApiModelProperty(value = "字典名称")
	private String dictName;

	@ApiModelProperty(value = "字典编码")
	private String dictCode;

	@ApiModelProperty(value = "字典值类型")
	@Range(min = 1, max = 5, message = "字典值类型数值不正确")
	private Integer dictValueTypeEnum;

	@ApiModelProperty(value = "排序")
	@Range(min = 1, max = 100, message = "排序数值不正确")
	private Integer ranking;

	@ApiModelProperty(value = "描述")
	private String description;

	@ApiModelProperty(value = "启用状态")
	@Range(min = 1, max = 2, message = "启用状态数值不正确")
	private Integer stateEnum;

	@ApiModelProperty(value = "创建人")
	private Long createUserId;


}
