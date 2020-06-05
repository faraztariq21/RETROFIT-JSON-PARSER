
package com.softdac.examplejsonparser.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

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
    @SerializedName("simple")
    @Expose
    private String simple;
    @SerializedName("juz")
    @Expose
    private String juz;
    @SerializedName("hizb")
    @Expose
    private String hizb;
    @SerializedName("page")
    @Expose
    private String page;
    @SerializedName("word")
    @Expose
    private String word;
    @SerializedName("sajdah")
    @Expose
    private Object sajdah;
    @SerializedName("sajdah_number")
    @Expose
    private Object sajdahNumber;
    @SerializedName("rub")
    @Expose
    private String rub;
    @SerializedName("verse_key")
    @Expose
    private String verseKey;
    @SerializedName("theletter")
    @Expose
    private Object theletter;
    @SerializedName("sortnozol")
    @Expose
    private Object sortnozol;
    @SerializedName("sortalphabet")
    @Expose
    private Object sortalphabet;
    @SerializedName("type")
    @Expose
    private Object type;
    @SerializedName("nim")
    @Expose
    private String nim;
    @SerializedName("sura_detail")
    @Expose
    private SuraDetail suraDetail;
    @SerializedName("words")
    @Expose
    private List<Word> words = null;
    @SerializedName("translate")
    @Expose
    private Translate translate;
    @SerializedName("date")
    @Expose
    private String date;

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

    public String getSimple() {
        return simple;
    }

    public void setSimple(String simple) {
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

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Object getSajdah() {
        return sajdah;
    }

    public void setSajdah(Object sajdah) {
        this.sajdah = sajdah;
    }

    public Object getSajdahNumber() {
        return sajdahNumber;
    }

    public void setSajdahNumber(Object sajdahNumber) {
        this.sajdahNumber = sajdahNumber;
    }

    public String getRub() {
        return rub;
    }

    public void setRub(String rub) {
        this.rub = rub;
    }

    public String getVerseKey() {
        return verseKey;
    }

    public void setVerseKey(String verseKey) {
        this.verseKey = verseKey;
    }

    public Object getTheletter() {
        return theletter;
    }

    public void setTheletter(Object theletter) {
        this.theletter = theletter;
    }

    public Object getSortnozol() {
        return sortnozol;
    }

    public void setSortnozol(Object sortnozol) {
        this.sortnozol = sortnozol;
    }

    public Object getSortalphabet() {
        return sortalphabet;
    }

    public void setSortalphabet(Object sortalphabet) {
        this.sortalphabet = sortalphabet;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public SuraDetail getSuraDetail() {
        return suraDetail;
    }

    public void setSuraDetail(SuraDetail suraDetail) {
        this.suraDetail = suraDetail;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public Translate getTranslate() {
        return translate;
    }

    public void setTranslate(Translate translate) {
        this.translate = translate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
