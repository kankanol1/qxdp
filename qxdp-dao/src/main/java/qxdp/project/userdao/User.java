package qxdp.project.userdao;

import javax.persistence.*;

@Entity(name="sys_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //设置自动增长
    @Column(name = "id")
    private Integer id;

    @Column(name = "name") //设置数据库字段名
    private String name;

    @Column(name = "role")
    private String role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public User() {
    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
