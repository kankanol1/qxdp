package qxdp.project.dao;

public class UserReturnEntity {

    private Integer uid;

    private  String name;

    private String role;

    private String date;


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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public UserReturnEntity() {
    }

    public UserReturnEntity(String name, String role, String date) {
        this.name = name;
        this.role = role;
        this.date = date;
    }
}
