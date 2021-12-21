package Dare.Blog.repository;

import Dare.Blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;



//자동 빈등록
public interface UserRepository extends JpaRepository<User,Integer> {

}
