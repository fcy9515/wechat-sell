package com.fcy.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-02
 * Time: 19:56
 */
@Getter
@AllArgsConstructor
public enum ProductStatusEnum implements CodeEnums {
    UP(0, "在架"),
    DOWN(1, "下架");
    private Integer code;
    private String message;
}
