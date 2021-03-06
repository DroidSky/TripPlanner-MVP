package com.hlabexamples.commonmvp.data;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by H.T. on 05/12/17.
 */

@IgnoreExtraProperties
public class TripModel {
    private String id;
    private String title;
    private String startDate;
    private String endDate;
    private int imageId;
    private int isFavourite;

    public TripModel() {
    }

    public TripModel(String title, String startDate, String endDate) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("title", title);
        result.put("startDate", startDate);
        result.put("endDate", endDate);
        result.put("imageId", imageId);
        result.put("isFavourite", isFavourite);

        return result;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int isFavourite() {
        return isFavourite;
    }

    public void setFavourite(int favourite) {
        isFavourite = favourite;
    }
}
