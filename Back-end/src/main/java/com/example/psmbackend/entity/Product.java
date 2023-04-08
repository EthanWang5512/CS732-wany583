package com.example.psmbackend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value = "product")
public class Product implements Cloneable{

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("`category_id`")
    private Integer categoryId;

    @TableField("`title`")
    private String title;

    @TableField("`description`")
    private String description;

    @TableField("`price`")
    private Float price;

    @TableField("`product_image`")
    private String productImage;

    @TableField("`is_active`")
    private Integer isActive;


}
