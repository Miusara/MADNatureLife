package com.example.naturelife;

public class Tent {
    private String itemcode;
    private String itemprices;
    private String tenttitle;
    private String tentdescription;

    public Tent(){}

    public String getCode() {
        return itemcode;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemprices() {
        return itemprices;
    }

    public void setItemprices(String itemprices) {
        this.itemprices = itemprices;
    }

    public String getTenttitle() {
        return tenttitle;
    }

    public void setTenttitle(String tenttitle) {
        this.tenttitle = tenttitle;
    }

    public String getTentdescription() {
        return tentdescription;
    }

    public void setTentdescription(String tentdescription) {
        this.tentdescription = tentdescription;
    }



    public Tent(String code, String price, String title, String description) {
        this.itemcode = code;
        this.itemprices = price;
        this.tenttitle = title;
        this.tentdescription = description;
    }


}

