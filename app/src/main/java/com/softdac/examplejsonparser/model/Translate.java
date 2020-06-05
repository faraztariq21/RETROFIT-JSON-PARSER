
package com.softdac.examplejsonparser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Translate {

    @SerializedName("index")
    @Expose
    private String index;
    @SerializedName("sura")
    @Expose
    private String sura;
    @SerializedName("aya")
    @Expose
    private String aya;
    @SerializedName("text")
    @Expose
    private String text;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getSura() {
        return sura;
    }

    public void setSura(String sura) {
        this.sura = sura;
    }

    public String getAya() {
        return aya;
    }

    public void setAya(String aya) {
        this.aya = aya;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
