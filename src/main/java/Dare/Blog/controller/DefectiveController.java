package Dare.Blog.controller;

import Dare.Blog.domain.DefectiveData;
import Dare.Blog.service.DefectiveService;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
public class DefectiveController {
    @Autowired
    private DefectiveService defectiveService;
    @GetMapping("/defective/predict")
    public String defectivePredict(){
        return "/defective/defectivePlay";
    }
    @GetMapping("/defective/defectiveChart")
    public String defectiveChart(Model model){
        //model.addAttribute("defective", defectiveService.월별불량데이터());
        //System.out.println(defectiveService.월별불량데이터());
        return "/defective/defectiveChart";
    }
    @GetMapping("/defective/defectiveTable")
    public String defectiveTable(Model model){
        model.addAttribute("defective", defectiveService.불량데이터목록());
        return "/defective/defectiveTable";
    }

    @GetMapping("/defective/Detail")
    public String defectiveDetail(@RequestParam int id , Model model) {
        model.addAttribute("detail" , defectiveService.데이터정보상세보기(id).get());

        return "/defective/defectiveDetail";
    }

}
