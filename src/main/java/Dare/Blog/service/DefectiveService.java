package Dare.Blog.service;

import Dare.Blog.controller.dto.MonthDefectiveDto;
import Dare.Blog.domain.DefectiveData;
import Dare.Blog.repository.DefectiveRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DefectiveService {

    @Autowired
    DefectiveRepository defectiveRepository;
    @Autowired
    private ObjectMapper objectMapper;
    @Transactional
    public List<DefectiveData> 불량데이터목록(){

        return defectiveRepository.findAll();
    }
    @Transactional
    public Optional<DefectiveData> 데이터정보상세보기(int id){
        return defectiveRepository.findById(id);
    }

/*    @Transactional
    public List<MonthDefectiveDto> 월별불량데이터() {
        return defectiveRepository.findMonthDefectiveData();

    }*/
    @Transactional
    public void 제품수정하기(int id, DefectiveData requestDefectiveData) {
        DefectiveData defectiveData = defectiveRepository.findById(id)
                .orElseThrow(()->{
                    return new IllegalArgumentException("제품을 찾을 수 없습니다. ");
        });
        defectiveData.setMeanTemp(requestDefectiveData.getMeanTemp());
        defectiveData.setCjC1F(requestDefectiveData.getCjC1F());
        defectiveData.setCjC2F(requestDefectiveData.getCjC2F());
        defectiveData.setCjD3F(requestDefectiveData.getCjD3F());
        defectiveData.setCjC1S(requestDefectiveData.getCjC1S());
        defectiveData.setCjC2S(requestDefectiveData.getCjC2S());
        defectiveData.setCjD3S(requestDefectiveData.getCjD3S());
        defectiveData.setCjMoterRpm(requestDefectiveData.getCjMoterRpm());
        defectiveData.setCjOutC1(requestDefectiveData.getCjOutC1());
        defectiveData.setCjOutC2(requestDefectiveData.getCjOutC2());
        defectiveData.setCjOutD3(requestDefectiveData.getCjOutD3());
        defectiveData.setInC1(requestDefectiveData.getInC1());
        defectiveData.setInC2(requestDefectiveData.getInC2());
        defectiveData.setInD3(requestDefectiveData.getInD3());
        //defectiveData.setOutMoterRpm(requestDefectiveData.getOutMoterRpm());
        defectiveData.setInMoterRpm(requestDefectiveData.getInMoterRpm());
        defectiveData.setToSpeed(requestDefectiveData.getToSpeed());
        defectiveData.setDefective(requestDefectiveData.getDefective());

    }
    @Transactional
    public void 제품저장하기(DefectiveData requestDefectiveData){
        if(requestDefectiveData.getDate() == null) requestDefectiveData.setDate(new Timestamp(System.currentTimeMillis()));
        defectiveRepository.save(requestDefectiveData);
    }


}
