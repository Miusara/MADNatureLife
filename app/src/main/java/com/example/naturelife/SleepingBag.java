package com.example.naturelife;

public class SleepingBag {
    private String code;
    private String price;
    private String title;
    private String description;

    public SleepingBag(){}


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SleepingBag(String code, String price, String title, String description) {
        this.code = code;
        this.price = price;
        this.title = title;
        this.description = description;
    }


}
