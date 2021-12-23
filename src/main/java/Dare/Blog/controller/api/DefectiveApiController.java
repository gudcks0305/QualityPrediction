package Dare.Blog.controller.api;

import Dare.Blog.controller.dto.ResponseDto;
import Dare.Blog.domain.DefectiveData;
import Dare.Blog.domain.User;
import Dare.Blog.model.RoleType;
import Dare.Blog.service.DefectiveService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.cj.xdevapi.JsonArray;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DefectiveApiController {
    @Autowired
    DefectiveService defectiveService;
    @PostMapping("/api/defective1")
    public String test(@RequestBody DefectiveData defectiveData) {

        String[] command = new String[7];
        command[0] = "python";
        //command[1] = "\\workspace\\java-call-python\\src\\main\\resources\\test.py";
        command[1] = "C:\\JavaSpring\\DareBlog\\src\\main\\java\\Dare\\Blog\\python\\decisionTree.py";
        command[2] = String.valueOf(defectiveData.getMeanTemp());
        command[3] = String.valueOf(defectiveData.getCjOutC1());
        command[4] = String.valueOf(defectiveData.getCjOutC2());
        command[5] = String.valueOf(defectiveData.getCjOutD3());
        command[6] = String.valueOf(defectiveData.getInD3());
        System.out.println(String.valueOf(defectiveData.getMeanTemp()) + String.valueOf(defectiveData.getCjOutC1())
                + String.valueOf(defectiveData.getCjOutD3()) + String.valueOf(defectiveData.getInD3()));
        String val = "실패";
        String result = "2";
        try {
            result = execPython(command);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return result;
    }

    public static String execPython(String[] command) throws IOException, InterruptedException {
        CommandLine commandLine = CommandLine.parse(command[0]);
        for (int i = 1, n = command.length; i < n; i++) {
            commandLine.addArgument(command[i]);
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PumpStreamHandler pumpStreamHandler = new PumpStreamHandler(outputStream);
        DefaultExecutor executor = new DefaultExecutor();
        executor.setStreamHandler(pumpStreamHandler);
        int result = executor.execute(commandLine);
        System.out.println("result: " + result);
        System.out.println("output: " + outputStream.toString());

        return Character.toString(outputStream.toString().charAt(outputStream.toString().length() - 4));

    }

    @PostMapping("/api/defective")
    public ResponseEntity<String> callAPI(@RequestBody DefectiveData defectiveData) throws JsonProcessingException {


        String jsonInString = "";

        String url = "http://localhost:8000/api";
        // api url //get parameter 담아주기 UriComponentsBuilder
        UriComponents builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("MeanTemp", defectiveData.getMeanTemp())
                .queryParam("CjOutC1", defectiveData.getCjOutC1())
                .queryParam("CjOutC2", defectiveData.getCjOutC1())
                .queryParam("CjOutD3", defectiveData.getCjOutD3())
                .queryParam("inD3", defectiveData.getInD3()).build(false);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setConnectTimeout(5000); // api 호출 타임아웃
        factory.setReadTimeout(5000);   // api 읽기 타임아웃
        RestTemplate template = new RestTemplate(factory);

// 방법 1
        ResponseEntity<String> response = template.getForEntity(builder.toUriString(), String.class);
        System.out.println(response.getBody());
        HashMap<String, Object> result = new HashMap<String, Object>();

        return response;


    }
    @PostMapping("/api/defective/{id}")
    public ResponseDto<Integer> update(@PathVariable int id,@RequestBody DefectiveData defectiveData){

        defectiveService.제품수정하기(id , defectiveData);
        return new ResponseDto<Integer>(HttpStatus.OK,1);
    }

    @PostMapping("/api/defective/insert")
    public ResponseDto<Integer> insert(@RequestBody DefectiveData defectiveData){

        defectiveService.제품저장하기(defectiveData);
        return new ResponseDto<Integer>(HttpStatus.OK,1);
    }


}
