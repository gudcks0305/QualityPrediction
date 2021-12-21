package Dare.Blog.test;


import Dare.Blog.service.DefectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {

  /*  @Autowired
    DefectiveService defectiveService;*/
    @GetMapping("/http/get")
    public String getTest(){
        //System.out.println(defectiveService.불량데이터목록().get(0).getLabel());
        return "get";
    }
    @PostMapping("/http/post")
    public String postTest(){
        return "[post]";
    }
    @PutMapping("/http/put")
    public String putTest(){
        return "put";
    }
    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete";
    }


}
