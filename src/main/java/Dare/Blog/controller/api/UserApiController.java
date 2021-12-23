package Dare.Blog.controller.api;

import Dare.Blog.controller.dto.ResponseDto;
import Dare.Blog.domain.User;
import Dare.Blog.model.RoleType;
import Dare.Blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserApiController {
    @Autowired
    private UserService userService;
    @PostMapping("/auth/api/user")
    public ResponseDto<Integer> save(@RequestBody User user){
        user.setRole(RoleType.USER);
        int result = userService.회원가입(user);
        return new ResponseDto<Integer>(HttpStatus.OK,result);
    }


}
