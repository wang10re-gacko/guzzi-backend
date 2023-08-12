package guzzi.project.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestControllerAdvice // 각 컨트롤러에 advice 역할을 하는 어노테이션, 빈 등록 포함
public class CustomExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ErrorResponse handleException(
            CustomException e,
            HttpServletRequest request
    ){
        log.error("errorCode : {}, url {}, message:{}",
                e.getCustomErrorCode(), request.getRequestURI(), e.getDetailMessage());

        return ErrorResponse.builder()
                .status(e.getCustomErrorCode())
                .statusMessage(e.getDetailMessage())
                .build();
    }
}