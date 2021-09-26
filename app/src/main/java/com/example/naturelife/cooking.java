package com.example.naturelife;

public class cooking {
    private String Itemcode;
    private String Prize;
    private String title;
    private String Description;
    public cooking(){}

    public String getItemcode() {
        return Itemcode;
    }


    public void setItemcode(String itemcode) {
        Itemcode = itemcode;
    }

    public String getPrize() {
        return Prize;
    }

    public void setPrize(String prize) {
        Prize = prize;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public cooking(String Itemcode, String Prize, String title, String Description) {
        this.Itemcode = Itemcode;
        this.Prize = Prize;
        this.title = title;
        this.Description = Description;
    }

}
