package com.hc.parampassback.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author hechao
 */
@Data
@ApiModel(value = "User",description = "用户类")
public class User {
    @ApiModelProperty("名字")
    public String name;
    @ApiModelProperty("年龄")
    public String age;

}
