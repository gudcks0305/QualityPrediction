package Dare.Blog.service;

import Dare.Blog.domain.Board;
import Dare.Blog.domain.User;
import Dare.Blog.model.RoleType;
import Dare.Blog.repository.BoardRepository;
import Dare.Blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Transactional
    public void 글쓰기(Board board ,User user){
        board.setUser(user);
        board.setCount(0);
        boardRepository.save(board);

    }
    @Transactional(readOnly = true)
    public Page<Board> 글목록(Pageable pageable) {
        return boardRepository.findAll(pageable);
    }
    @Transactional(readOnly = true)
    public Board 글상세보기(int id) {
        return boardRepository.findById(id)
                .orElseThrow(()->{
                    return new IllegalArgumentException("글 상세보기 실패 : 아이드를 찾을 수없음");
                });
    }
    @Transactional
    public void 글삭제하기(int id) {
        boardRepository.deleteById(id);
    }
    @Transactional
    public void 글수정하기(int id,Board requestBoard) {
        Board board = boardRepository.findById(id)
                .orElseThrow(()->{
                    return new IllegalArgumentException("글 찾기 실패 : 아이드를 찾을 수없음");
                });
        board.setTitle(requestBoard.getTitle());
        board.setContent(requestBoard.getContent());
    }



}
