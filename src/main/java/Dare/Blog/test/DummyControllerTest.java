package Dare.Blog.test;

import Dare.Blog.domain.User;
import Dare.Blog.model.RoleType;
import Dare.Blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.function.Supplier;

@RestController
public class DummyControllerTest {
    @Autowired
    UserRepository userRepository;
    @DeleteMapping("/dummy/user/{id}")
    public String delete(@PathVariable int id){
        try {
            userRepository.deleteById(id);
        }catch (Exception e){
            return "삭제에 실패 했습니다 해당 id가 없습니다.";
        }

        return "삭제완료" + id;
    }



    @Transactional
    @PutMapping("/dummy/user/{id}") // 업데이트
    public User updateUser(@PathVariable int id, @RequestBody User requestUser){
        requestUser.setId(id);
        User user =userRepository.findById(id).orElseThrow(()->{
            return new IllegalArgumentException("수정실패");
        });
        user.setPassword(requestUser.getPassword());
        user.setEmail(requestUser.getEmail());
        return user;
    }

    @GetMapping("/dummy/users")
    public List<User> list(){
        return userRepository.findAll();
    }
    @GetMapping("/dummy/user")
    public List<User> PageList(@PageableDefault(size=2,sort="id",direction = Sort.Direction.DESC)Pageable pageable){
        Page<User> pagingUser =userRepository.findAll(pageable);

        List<User> users = pagingUser.getContent();
        return users;
    }
    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable int id) throws IllegalAccessException {

        User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalAccessException>() {
            @Override
            public IllegalAccessException get() {

                return new IllegalAccessException("해당 유저가 없습니다.");
            }
        });
        return user;
    }
    @PostMapping("dummy/join")
    public String join(User user){
        user.setRole(RoleType.USER);
        userRepository.save(user);
        return "회원가입이 성공";
    }
}
