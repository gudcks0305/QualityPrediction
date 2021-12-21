package Dare.Blog.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity // user 클래스가 mysql에 테이블 생성
@Setter
@Getter
public class DefectiveData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Timestamp date;
    @Column(nullable = false ,length = 30)
    private double meanTemp;
    @Column
    private double lowTemp;
    @Column
    private double highTemp;
    @Column
    private int spring;
    @Column
    private int summer;
    @Column
    private int fall;
    @Column
    private int winter;
    @Column
    private int defective;
    @Column
    private String label;
    @Column(nullable = false ,length = 10)
    private double cjC1F;
    @Column(nullable = false ,length = 10)
    private double cjC2F;
    @Column(nullable = false ,length = 10)
    private double cjD3F;
    @Column(nullable = false ,length = 10)
    private double cjC1S;
    @Column(nullable = false ,length = 10)
    private double cjC2S;
    @Column(nullable = false ,length = 10)
    private double cjD3S;
    @Column(nullable = false ,length = 10)
    private double cjMoterRpm;
    @Column(nullable = false ,length = 10)
    private double cjOutC1;
    @Column(nullable = false ,length = 10)
    private double cjOutC2;
    @Column(nullable = false ,length = 10)
    private double cjOutD3;
    @Column(nullable = false ,length = 10)
    private double OutMoterRpm;
    @Column(nullable = false ,length = 10)
    private double inC1;
    @Column(nullable = false ,length = 10)
    private double inC2;
    @Column(nullable = false ,length = 10)
    private double inD3;
    @Column(nullable = false ,length = 10)
    private double inMoterRpm;
    @Column(nullable = false ,length = 10)
    private double toSpeed;
    @Column(nullable = false ,length = 10)
    private double waterTemp;

}
