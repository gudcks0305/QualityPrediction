package Dare.Blog.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExeptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String handleArgumentExcection(Exception e){
        return "h1"+e.getMessage()+"</h1>";

    }
}
