package com.example.listviewactivity.bean;

import java.io.Serializable;

public class ListBean implements Serializable {
    private String title;
    private String content;
    private int img;
    private int contentImg;
    private String contentCenter;
    private String contentTitle;

    public ListBean(String title, String content, int img, int contentImg, String contentCenter, String contentTitle) {
        this.title = title;
        this.content = content;
        this.img = img;
        this.contentImg = contentImg;
        this.contentCenter = contentCenter;
        this.contentTitle = contentTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getContentImg() {
        return contentImg;
    }

    public void setContentImg(int contentImg) {
        this.contentImg = contentImg;
    }

    public String getContentCenter() {
        return contentCenter;
    }

    public void setContentCenter(String contentCenter) {
        this.contentCenter = contentCenter;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }
}
