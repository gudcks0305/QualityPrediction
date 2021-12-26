package Dare.Blog.controller.api;

import Dare.Blog.Config.auth.PrincipalDetail;
import Dare.Blog.controller.dto.ResponseDto;
import Dare.Blog.domain.Board;
import Dare.Blog.domain.User;
import Dare.Blog.service.BoardService;
import Dare.Blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardApiController {

    @Autowired
    private BoardService boardService;

    @PostMapping("/api/board")
    public ResponseDto<Integer> save(@RequestBody Board board, @AuthenticationPrincipal PrincipalDetail principalDetail){

        boardService.글쓰기(board,principalDetail.getUser());
        return new ResponseDto<Integer>(HttpStatus.OK,1);
    }
    @DeleteMapping("/api/board/{id}")
    public ResponseDto<Integer> deleteById(@PathVariable int id){
        boardService.글삭제하기(id);
        return new ResponseDto<Integer>(HttpStatus.OK,1);
    }

    @PutMapping("/api/board/{id}")
    public ResponseDto<Integer> update(@PathVariable int id,@RequestBody Board board){
        System.out.println(id);
        boardService.글수정하기(id,board);

        return new ResponseDto<Integer>(HttpStatus.OK,1);
    }
}
