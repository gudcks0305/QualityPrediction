package Dare.Blog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 100)
    private String title;
    @Lob //대용량데이터
    private String content; // 섬머노트 라이브러리 ( html 태그가 섞여서 디자인됨 데이터큼
    @ColumnDefault("0")
    private int count;
    //db 는 오브젝트 저장이안됭 fk이용함 자바는 오브젝트 저장 할 수 있는데 알아서 JPA가 디비 자료형맞춰서 넣어줘
    @ManyToOne // many board , one user
    @JoinColumn(name = "userId")
    private User user;
    @CreationTimestamp
    private Timestamp createDate;

}
