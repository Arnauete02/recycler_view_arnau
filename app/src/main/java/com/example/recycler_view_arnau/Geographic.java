package com.example.recycler_view_arnau;

public class Geographic {

    private String text;
    private String url;
    private String desc;

    public Geographic(String text, String url, String desc) {
        this.text = text;
        this.url = url;
        this.desc = desc;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
