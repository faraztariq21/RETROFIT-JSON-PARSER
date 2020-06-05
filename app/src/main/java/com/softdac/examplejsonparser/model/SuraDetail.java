
package com.softdac.examplejsonparser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SuraDetail {

    @SerializedName("index")
    @Expose
    private String index;
    @SerializedName("ayas")
    @Expose
    private String ayas;
    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("end")
    @Expose
    private Object end;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tname")
    @Expose
    private String tname;
    @SerializedName("ename")
    @Expose
    private String ename;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("order")
    @Expose
    private String order;
    @SerializedName("orderalphabet")
    @Expose
    private Object orderalphabet;
    @SerializedName("orderquran")
    @Expose
    private Object orderquran;
    @SerializedName("word")
    @Expose
    private String word;
    @SerializedName("theletter")
    @Expose
    private String theletter;
    @SerializedName("startjuz")
    @Expose
    private String startjuz;
    @SerializedName("endjuz")
    @Expose
    private String endjuz;
    @SerializedName("startpage")
    @Expose
    private String startpage;
    @SerializedName("endpage")
    @Expose
    private String endpage;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getAyas() {
        return ayas;
    }

    public void setAyas(String ayas) {
        this.ayas = ayas;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public Object getEnd() {
        return end;
    }

    public void setEnd(Object end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Object getOrderalphabet() {
        return orderalphabet;
    }

    public void setOrderalphabet(Object orderalphabet) {
        this.orderalphabet = orderalphabet;
    }

    public Object getOrderquran() {
        return orderquran;
    }

    public void setOrderquran(Object orderquran) {
        this.orderquran = orderquran;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTheletter() {
        return theletter;
    }

    public void setTheletter(String theletter) {
        this.theletter = theletter;
    }

    public String getStartjuz() {
        return startjuz;
    }

    public void setStartjuz(String startjuz) {
        this.startjuz = startjuz;
    }

    public String getEndjuz() {
        return endjuz;
    }

    public void setEndjuz(String endjuz) {
        this.endjuz = endjuz;
    }

    public String getStartpage() {
        return startpage;
    }

    public void setStartpage(String startpage) {
        this.startpage = startpage;
    }

    public String getEndpage() {
        return endpage;
    }

    public void setEndpage(String endpage) {
        this.endpage = endpage;
    }

}
