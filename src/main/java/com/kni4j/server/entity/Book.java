package com.kni4j.server.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "图书信息")
public class Book {
    @ApiModelProperty(value = "这是id")
    private Integer id;
    @ApiModelProperty(value = "这是name")
    private String name;
    @ApiModelProperty(value = "这是价格")
    private String price;
}
