package com.lsdSpringCloud.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("lsdDemo")
public class LsdDemo implements Serializable {
    @TableId("id")
    private int id;
    @TableField("user")
    private String user;
    @TableField("name")
    private String name;

}
