package qxdp.project.dao;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import java.util.Date;

@Entity(name="sys_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //设置自动增长
    @Column(name = "uid")
    private Integer uid;

    @NotEmpty(message = "名称不可为空")
    @Column(name = "name") //设置数据库字段名
    @Length(min=6,max=64)
    private  String name;

    @NotNull
    @Column(name = "role")
    private String role;

    @Column(name="date")
    private Date date;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User() {
    }

    public User(String name, String role, Date date) {
        this.name = name;
        this.role = role;
        this.date = date;
    }
}
