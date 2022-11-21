package com.dy.demo.exception;

import com.dy.demo.common.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanglianyong
 * 2022/11/21 9:55
 */
@ControllerAdvice(annotations ={RestController.class, Controller.class})
@Slf4j
@ResponseBody
public class ExceptionHandler {

    /**
     * 捕获异常信息，业务异常
     *
     * @author zhanglianyong
     * @date 2022/8/5 0:00
     * @param ex CustomException
     * @return 是否成功
     **/
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public Response<String> exceptionHandler(Exception ex){
        log.error(ex.getMessage());
        return  Response.error(ex.getMessage());
    }
}
