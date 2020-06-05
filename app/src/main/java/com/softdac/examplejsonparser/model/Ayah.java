
package com.softdac.examplejsonparser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ayah {

    @SerializedName("ok")
    @Expose
    private Boolean ok;
    @SerializedName("result")
    @Expose
    private Result result;

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

}
