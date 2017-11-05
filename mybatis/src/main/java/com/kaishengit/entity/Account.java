package com.kaishengit.entity;

import java.util.List;

/**
 * @author zh
 * Created by Administrator on 2017/11/4.
 */
public class Account {
    private int id;
    private String userName;
    private String password;
    private String address;
    private int deptId;
    private Dept dept;
    private List<Tag> tagList;

    public Account() {}

    public Account(int id, String userName, String password, String address, int deptId, Dept dept) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.deptId = deptId;
        this.dept = dept;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", deptId=" + deptId +
                ", dept=" + dept +
                '}';
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }


}
