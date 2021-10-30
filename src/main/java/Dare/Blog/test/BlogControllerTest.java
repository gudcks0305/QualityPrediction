package Dare.Blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 패키지 이하 스캔 모든 파일 메모리에 뉴안함 특정 어노테이션이 붙어있는 클래스 파일 뉴에서 컨테이너에 관리

@RestController
public class BlogControllerTest {
    @GetMapping("/test/hello")
    public String hello(){
        return "<h1>hello</h1>";
    }
}
