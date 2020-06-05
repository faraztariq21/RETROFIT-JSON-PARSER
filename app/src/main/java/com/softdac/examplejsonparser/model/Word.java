
package com.softdac.examplejsonparser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Word {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("index")
    @Expose
    private String index;
    @SerializedName("aya")
    @Expose
    private String aya;
    @SerializedName("sura")
    @Expose
    private String sura;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("verse_key")
    @Expose
    private String verseKey;
    @SerializedName("text")
    @Expose
    private Object text;
    @SerializedName("simple")
    @Expose
    private Object simple;
    @SerializedName("juz")
    @Expose
    private String juz;
    @SerializedName("hizb")
    @Expose
    private String hizb;
    @SerializedName("rub")
    @Expose
    private String rub;
    @SerializedName("page")
    @Expose
    private String page;
    @SerializedName("class_name")
    @Expose
    private String className;
    @SerializedName("line")
    @Expose
    private String line;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("code_v3")
    @Expose
    private String codeV3;
    @SerializedName("char_type")
    @Expose
    private String charType;
    @SerializedName("audio")
    @Expose
    private Object audio;
    @SerializedName("translation")
    @Expose
    private Object translation;
    @SerializedName("nim")
    @Expose
    private String nim;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getAya() {
        return aya;
    }

    public void setAya(String aya) {
        this.aya = aya;
    }

    public String getSura() {
        return sura;
    }

    public void setSura(String sura) {
        this.sura = sura;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getVerseKey() {
        return verseKey;
    }

    public void setVerseKey(String verseKey) {
        this.verseKey = verseKey;
    }

    public Object getText() {
        return text;
    }

    public void setText(Object text) {
        this.text = text;
    }

    public Object getSimple() {
        return simple;
    }

    public void setSimple(Object simple) {
        this.simple = simple;
    }

    public String getJuz() {
        return juz;
    }

    public void setJuz(String juz) {
        this.juz = juz;
    }

    public String getHizb() {
        return hizb;
    }

    public void setHizb(String hizb) {
        this.hizb = hizb;
    }

    public String getRub() {
        return rub;
    }

    public void setRub(String rub) {
        this.rub = rub;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeV3() {
        return codeV3;
    }

    public void setCodeV3(String codeV3) {
        this.codeV3 = codeV3;
    }

    public String getCharType() {
        return charType;
    }

    public void setCharType(String charType) {
        this.charType = charType;
    }

    public Object getAudio() {
        return audio;
    }

    public void setAudio(Object audio) {
        this.audio = audio;
    }

    public Object getTranslation() {
        return translation;
    }

    public void setTranslation(Object translation) {
        this.translation = translation;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

}
