package Dare.Blog.repository;

import Dare.Blog.controller.dto.MonthDefectiveDto;
import Dare.Blog.domain.DefectiveData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DefectiveRepository extends JpaRepository<DefectiveData ,Integer> {
   /* @Query(value = "SELECT  COUNT(DefectiveData.defective) as count , function('DATE_FORMAT' ,'%Y-%m') as date FROM DefectiveData df where DefectiveData.defective = 0 GROUP BY date")
    public List<MonthDefectiveDto> findMonthDefectiveData();*/
}
