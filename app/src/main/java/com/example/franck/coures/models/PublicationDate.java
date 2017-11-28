
package com.example.franck.coures.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PublicationDate {

    @SerializedName("milliseconds")
    @Expose
    private Integer milliseconds;

    public Integer getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

}
