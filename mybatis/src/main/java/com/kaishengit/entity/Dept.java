package com.kaishengit.entity;

/**
 * @author zh
 * Created by Administrator on 2017/11/4.
 */
public class Dept {
    private Integer id;
    private  String deptDepartment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptDepartment() {
        return deptDepartment;
    }

    public void setDeptDepartment(String deptDepartment) {
        this.deptDepartment = deptDepartment;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptDepartment='" + deptDepartment + '\'' +
                '}';
    }

}
