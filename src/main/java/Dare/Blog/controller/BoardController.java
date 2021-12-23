package Dare.Blog.controller;

import Dare.Blog.Config.auth.PrincipalDetail;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    @GetMapping({"","/"})
    public String index(){
        //System.out.println("로그인 사용자 아이디 : " + principalDetail.getUsername());
        return "index";
    }

}
