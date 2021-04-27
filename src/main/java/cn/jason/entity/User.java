package cn.jason.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * @author jason
 * @date 2021/2/16-23:40
 */
@Component
public class User {
    private Integer id;
    private String uid;
    private String loginname;
    private String username;
    @JsonIgnore
    private String password;
    private String sex;
    private Integer age;
    private Double high;
    private String address;
    private String phoneNumber;
    private String email;
    private String graduation;
    private Date registerDate;
    private String classname;
    private String carte;

    public User() {
    }

    public User(Integer id, String uid, String loginname, String username, String password, String sex, Integer age, Double high, String address, String phoneNumber, String email, String graduation, Date registerDate, String classname, String carte) {
        this.id = id;
        this.uid = uid;
        this.loginname = loginname;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.high = high;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.graduation = graduation;
        this.registerDate = registerDate;
        this.classname = classname;
        this.carte = carte;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", loginname='" + loginname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", high=" + high +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", graduation='" + graduation + '\'' +
                ", registerDate=" + registerDate +
                ", classname='" + classname + '\'' +
                ", carte='" + carte + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getCarte() {
        return carte;
    }

    public void setCarte(String carte) {
        this.carte = carte;
    }
}
