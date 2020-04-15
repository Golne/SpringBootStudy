package com.example.demo.vo;

import com.example.demo.enums.StatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class UserVo implements Serializable {
    private static final long serialVersionUID = 1069403935532325254L;
    /**
     * 唯一标示
     */
    @ApiModelProperty(value = "唯一标识", dataType = "int", name = "ID", example = "12")
    private int id;
    /**
     * 编码
     */
    @ApiModelProperty(value = "编码", dataType = "String", name = "code", example = "12")
    @NotBlank(message = "编码不能为空")
    private String code;
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称", dataType = "String", name = "name", example = "asdf")
    @NotBlank(message = "名称不能为空")
    private String name;
    /**
     * 状态 1启用 0 停用
     */
    @ApiModelProperty(value = "状态", dataType = "StatusEnum", name = "status", example = "1")
    private StatusEnum status;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间", dataType = "Date", name = "gmtModified", example = "1586899796000")
    private Date gmtModified;
}
