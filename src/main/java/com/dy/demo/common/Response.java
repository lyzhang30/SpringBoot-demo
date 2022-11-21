package com.dy.demo.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回对象
 *
 *@author zhanglianyong
 *@date 2022/8/5
 */
@Data
@ApiModel("统一返回类")
public class Response<T>  implements Serializable {

    /**
     * 编码：1成功，0和其它数字为失败
     */
    @ApiModelProperty("状态码，统一200为成功")
    private Integer code;
    /**
     * 错误信息
     */
    @ApiModelProperty("返回信息，错误信息")
    private String message;
    /**
     * 数据
     */
    @ApiModelProperty("返回数据")
    private T data;
    /**
     * 动态数据
     */
    @ApiModelProperty("动态数据")
    private Map<String, Object> map = new HashMap<>();

    public Response() {
    }

    public static <T> Response<T> successWithMessage(String message) {
        Response<T> r = new Response<>();
        r.message = message;
        r.data = null;
        r.code = HttpStatus.OK.value();
        return r;
    }

    public static <T> Response<T> success(T object) {
        Response<T> r = new Response<>();
        r.data = object;
        r.code = HttpStatus.OK.value();
        return r;
    }

    public static Response<String> buildJsonString(Object object) throws JsonProcessingException {
        String jsonString = toJsonString(object);
        return Response.success(jsonString);
    }

    private static String toJsonString(Object object) throws JsonProcessingException {

            ObjectMapper mapper = new ObjectMapper();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            mapper.setDateFormat(df);
            return mapper.writeValueAsString(object);
    }

    public static <T> Response<T> error(String message, int code) {
        Response<T> r = new Response<>();
        r.message = message;
        r.code = code;
        return r;
    }

    public static <T> Response<T> error(String message) {
        Response<T> r = new Response<>();
        r.message = message;
        r.code = HttpStatus.BAD_REQUEST.value();
        return r;
    }
    public static <T> Response<T> common(int code, String message) {
        Response<T> result = new Response<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Response(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}



