package com.platform.business.model.dto;

import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 字典表
 * </p>
 *
 */
@Data
public class DemoDto{

    /**
     * 编号
     */
	private Integer id;
    /**
     * 数据值
     */
	private String name;
    /**
     * 描述
     */
	private String description;
    /**
     * 排序（升序）
     */
	private BigDecimal sort;
	/**
	 * 备注信息
	 */
	private String remarks;
	 /**
	 * 删除标记
	 */
	private String delFlag;
	/**
	 * 创建者
	 */
	private String createBy;
    /**
     * 创建时间
     */
	private Date createTime;
	/**
	 * 更新者
	 */
	private String updateBy;
    /**
     * 更新时间
     */
	private Date updateTime;

	@Override
	public String toString() {
		return "DemoDto{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", sort=" + sort +
				", remarks='" + remarks + '\'' +
				", delFlag='" + delFlag + '\'' +
				", createBy='" + createBy + '\'' +
				", createTime=" + createTime +
				", updateBy='" + updateBy + '\'' +
				", updateTime=" + updateTime +
				'}';
	}
}
