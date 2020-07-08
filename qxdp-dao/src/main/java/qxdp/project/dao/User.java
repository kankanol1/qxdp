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

    @Column(name="password")
    private String password;


    /**
     * Gets the value of uid.
     *
     * @return the value of uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * Sets the uid.
     * You can use setUid() to set the value of uid
     *
     * @param uid uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * Gets the value of name.
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * You can use setName() to set the value of name
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the value of role.
     *
     * @return the value of role
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the role.
     * You can use setRole() to set the value of role
     *
     * @param role role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets the value of date.
     *
     * @return the value of date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date.
     * You can use setDate() to set the value of date
     *
     * @param date date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets the value of password.
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * You can use setPassword() to set the value of password
     *
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String role, Date date, String password) {
        this.name = name;
        this.role = role;
        this.date = date;
        this.password = password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", date=" + date +
                ", password='" + password + '\'' +
                '}';
    }
}
