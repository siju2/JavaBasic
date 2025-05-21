package member;

import java.util.Date;

public class MemberVO {

    private String id;
    private String password;
    private String username;
    private String mobile;
    private String email;
    private String address;
    private int memberNo;
    private Date regDate;
    private int templateNo = 1; // 기본값: 템플릿 1번

    public MemberVO(String id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getTemplateNo() {
        return templateNo;
    }

    public void setTemplateNo(int templateNo) {
        this.templateNo = templateNo;
    }

    @Override
    public String toString() {
        return "회원번호: " + memberNo + ", 아이디: " + id + ", 이름: " + username + ", 가입일: " + regDate;
    }
} 