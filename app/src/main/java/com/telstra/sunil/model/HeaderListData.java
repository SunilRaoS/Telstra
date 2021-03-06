package com.telstra.sunil.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * POJO model class to hold the JSON response from the server
 * This holds the entire data response
 */
public class HeaderListData {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("rows")
    @Expose
    private List<RowItem> rows = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<RowItem> getRows() {
        return rows;
    }

    public void setRows(List<RowItem> rows) {
        this.rows = rows;
    }

}