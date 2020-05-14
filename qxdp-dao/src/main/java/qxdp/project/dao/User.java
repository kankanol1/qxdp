package qxdp.project.dao;

import javax.persistence.*;
import java.util.Date;

@Entity(name="sys_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //设置自动增长
    @Column(name = "uid")
    private Integer uid;

    @Column(name = "name") //设置数据库字段名
    private String name;

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
