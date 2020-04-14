package com.example.listview_fragmentactivity.bean;

import java.io.Serializable;

public class News implements Serializable {
    private String title;
    private String content;
    private int titleImage;
    private int contentImage;
    private String contentTitle;

    public News(String title, String content, int titleImage, int contentImage, String contentTitle) {
        this.title = title;
        this.content = content;
        this.titleImage = titleImage;
        this.contentImage = contentImage;
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

    public int getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(int titleImage) {
        this.titleImage = titleImage;
    }

    public int getContentImage() {
        return contentImage;
    }

    public void setContentImage(int contentImage) {
        this.contentImage = contentImage;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }
}
