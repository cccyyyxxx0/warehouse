package com.yeqifu.bus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 9216 kB
 * </p>
 *
 * @author cyx
 * @since 2020-12-05
 */
@Data
@EqualsAndHashCode(callSuper = false)//实现equals方法和hashcode方法
@Accessors(chain = true)//产生get,set方法
@TableName("bus_customer")
@ToString
public class Customer implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String customername;//客户名称

    private String zip;//邮编

    private String address;//地址

    private String telephone;//客户电话

    private String connectionpersion;//联系人

    private String phone;//联系人电话

    private String bank;//开户银行

    private String account;//银行账号

    private String email;//邮箱

    private String fax;//传真

    private Integer available;//是否可用


}
