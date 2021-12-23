package Dare.Blog.repository;

import Dare.Blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


//자동 빈등록
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
// jpa naming 전략
//User findByUsernameAndPassword(String username, String password);
/*
    @Query(value = "SELECT * from user where username =?1 and password = ?2", nativeQuery = true)
    User login(String name , String password);*/