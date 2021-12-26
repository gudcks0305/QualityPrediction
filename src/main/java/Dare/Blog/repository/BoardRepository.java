package Dare.Blog.repository;

import Dare.Blog.domain.Board;
import Dare.Blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


//자동 빈등록
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
