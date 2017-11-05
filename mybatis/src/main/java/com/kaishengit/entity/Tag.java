package com.kaishengit.entity;

/**
 * @author zh
 * Created by Administrator on 2017/11/5.
 */
public class Tag {
    private int id;
    private String tagName;

    public Tag() {
    }

    public Tag(int id, String tagName) {
        this.id = id;
        this.tagName = tagName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", tagName='" + tagName + '\'' +
                '}';
    }
}
