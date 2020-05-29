package pers.huidong.springbootstudy.bean;

/**
 * @program: springboot-study
 * @auther: HuiDong
 * @date: 2020/5/29 15:38
 * @description:
 */
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer dId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDid() {
        return dId;
    }

    public void setDid(Integer did) {
        this.dId = did;
    }
}
