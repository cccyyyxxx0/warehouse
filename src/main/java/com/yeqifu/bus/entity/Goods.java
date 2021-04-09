package com.yeqifu.bus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 9216 kB; (`providerid`) REFER `warehouse/bus_provider`(`id`)
 * </p>
 *
 * @author cyx
 * @since 2020-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bus_goods")
@ToString
public class Goods implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String goodsname;//商品名称

    private String produceplace;//供应地

    private String size;//规格

    private String goodspackage;//包装

    private String productcode;//生产批号

    private String promitcode;//批准文号

    private String description;//商品描述

    private Double price;//销售价格

    private Integer number;//数量

    private Integer dangernum;//库存预警值

    private String goodsimg;//商品图片

    private Integer available;//是否可用

    private Integer providerid;//供应商

    @TableField(exist = false)
    private String providername;//


}
