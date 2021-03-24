package com.exercise.entity;

import java.util.Date;
import java.util.List;

public class SysUser {
    private String id;

    private String nickname;

    private String phone;

    private String email;

    private String password;

    private String salt;

    private Date gmtCreate;

    private Date gmtUpdate;

    private List<SciNews> sciNews;

    public List<SciNews> getSciNews() {
        return sciNews;
    }

    public void setSciNews(List<SciNews> sciNews) {
        this.sciNews = sciNews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

}