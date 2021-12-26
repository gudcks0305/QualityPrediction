package Dare.Blog.domain;

import Dare.Blog.model.RoleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


//@DynamicInsert insert시에 널값무시
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // user 클래스가 mysql에 테이블 생성
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false ,length = 30)
    private String username;
    @Column(nullable = false , length = 100)
    private String password;
    @Column(nullable = false, length = 50)
    private String email;
    //@ColumnDefault("'user'")
    @Enumerated(EnumType.STRING)
    private RoleType role;
    @CreationTimestamp // 시간이 자동입력
    private Timestamp createDate;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RoleType getRole() {
        return role;
    }

    public void setRole(RoleType role) {
        this.role = role;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }




}
