package qxdp.project.dao;

import io.swagger.models.auth.In;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;


@Entity(name="sys_course")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //设置自动增长
    @Column(name = "cid")
    private Integer cid;

    @Column(name = "title") //设置数据库字段名
    private  String title;

    @Column(name = "img") //设置数据库字段名
    private String img;

    @Column(name = "money") //设置数据库字段名
    private Float money;

    @Column(name = "commission") //设置数据库字段名
    private Float commission;

    @Column(name = "owner") //设置数据库字段名
    private String owner;

    @Column(name = "deadline") //设置数据库字段名
    private Long deadline;

    @Column(name = "intro") //设置数据库字段名
    private String intro;

    @Column(name = "bdeadline") //设置数据库字段名
    private Long bdeadline;

    @Column(name = "bmoney") //设置数据库字段名
    private Float bmoney;

    @Column(name = "type") //设置数据库字段名
    private Integer type;

    @Column(name = "src") //设置数据库字段名
    private String src;

    @Column(name = "connect") //设置数据库字段名
    private String connect;

    @Column(name = "way") //设置数据库字段名
    private String way;

    @Column(name = "tel") //设置数据库字段名
    private String tel;

    @Column(name = "checked") //设置数据库字段名
    private Integer checked;

    @Column(name = "resean") //设置数据库字段名
    private String resean;


    /**
     * Gets the value of cid.
     *
     * @return the value of cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * Sets the cid.
     * You can use setCid() to set the value of cid
     *
     * @param cid cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * Gets the value of title.
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * You can use setTitle() to set the value of title
     *
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the value of img.
     *
     * @return the value of img
     */
    public String getImg() {
        return img;
    }

    /**
     * Sets the img.
     * You can use setImg() to set the value of img
     *
     * @param img img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * Gets the value of money.
     *
     * @return the value of money
     */
    public Float getMoney() {
        return money;
    }

    /**
     * Sets the money.
     * You can use setMoney() to set the value of money
     *
     * @param money money
     */
    public void setMoney(Float money) {
        this.money = money;
    }

    /**
     * Gets the value of commission.
     *
     * @return the value of commission
     */
    public Float getCommission() {
        return commission;
    }

    /**
     * Sets the commission.
     * You can use setCommission() to set the value of commission
     *
     * @param commission commission
     */
    public void setCommission(Float commission) {
        this.commission = commission;
    }

    /**
     * Gets the value of owner.
     *
     * @return the value of owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the owner.
     * You can use setOwner() to set the value of owner
     *
     * @param owner owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Gets the value of deadline.
     *
     * @return the value of deadline
     */
    public Long getDeadline() {
        return deadline;
    }

    /**
     * Sets the deadline.
     * You can use setDeadline() to set the value of deadline
     *
     * @param deadline deadline
     */
    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    /**
     * Gets the value of intro.
     *
     * @return the value of intro
     */
    public String getIntro() {
        return intro;
    }

    /**
     * Sets the intro.
     * You can use setIntro() to set the value of intro
     *
     * @param intro intro
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * Gets the value of bdeadline.
     *
     * @return the value of bdeadline
     */
    public Long getBdeadline() {
        return bdeadline;
    }

    /**
     * Sets the bdeadline.
     * You can use setBdeadline() to set the value of bdeadline
     *
     * @param bdeadline bdeadline
     */
    public void setBdeadline(Long bdeadline) {
        this.bdeadline = bdeadline;
    }

    /**
     * Gets the value of bmoney.
     *
     * @return the value of bmoney
     */
    public Float getBmoney() {
        return bmoney;
    }

    /**
     * Sets the bmoney.
     * You can use setBmoney() to set the value of bmoney
     *
     * @param bmoney bmoney
     */
    public void setBmoney(Float bmoney) {
        this.bmoney = bmoney;
    }

    /**
     * Gets the value of type.
     *
     * @return the value of type
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets the type.
     * You can use setType() to set the value of type
     *
     * @param type type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Gets the value of src.
     *
     * @return the value of src
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the src.
     * You can use setSrc() to set the value of src
     *
     * @param src src
     */
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * Gets the value of connect.
     *
     * @return the value of connect
     */
    public String getConnect() {
        return connect;
    }

    /**
     * Sets the connect.
     * You can use setConnect() to set the value of connect
     *
     * @param connect connect
     */
    public void setConnect(String connect) {
        this.connect = connect;
    }

    /**
     * Gets the value of way.
     *
     * @return the value of way
     */
    public String getWay() {
        return way;
    }

    /**
     * Sets the way.
     * You can use setWay() to set the value of way
     *
     * @param way way
     */
    public void setWay(String way) {
        this.way = way;
    }

    /**
     * Gets the value of tel.
     *
     * @return the value of tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the tel.
     * You can use setTel() to set the value of tel
     *
     * @param tel tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * Gets the value of checked.
     *
     * @return the value of checked
     */
    public Integer getChecked() {
        return checked;
    }

    /**
     * Sets the checked.
     * You can use setChecked() to set the value of checked
     *
     * @param checked checked
     */
    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    /**
     * Gets the value of resean.
     *
     * @return the value of resean
     */
    public String getResean() {
        return resean;
    }

    /**
     * Sets the resean.
     * You can use setResean() to set the value of resean
     *
     * @param resean resean
     */
    public void setResean(String resean) {
        this.resean = resean;
    }

    public CourseEntity() {
    }

    public CourseEntity(Integer cid, String title, String img, Float money, Float commission, String owner, Long deadline, String intro, Long bdeadline, Float bmoney, Integer type, String src, String connect, String way, String tel, Integer checked, String resean) {
        this.cid = cid;
        this.title = title;
        this.img = img;
        this.money = money;
        this.commission = commission;
        this.owner = owner;
        this.deadline = deadline;
        this.intro = intro;
        this.bdeadline = bdeadline;
        this.bmoney = bmoney;
        this.type = type;
        this.src = src;
        this.connect = connect;
        this.way = way;
        this.tel = tel;
        this.checked = checked;
        this.resean = resean;
    }
}
