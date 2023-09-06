package com.example.springboot.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultData<T> {

    public final static int SUCCESS_CODE = 0;
    public final static String SUCCESS_MESSAGE = "操作成功";

    public final static ResultData SUCCESS = success().build();

    private Integer code;
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer totalCount;

    public static <M> ResultDataBuilder<M> success() {
        return ResultData.<M>builder().code(SUCCESS_CODE).message(SUCCESS_MESSAGE);
    }

}