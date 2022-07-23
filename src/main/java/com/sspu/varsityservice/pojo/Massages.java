package com.sspu.varsityservice.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Massages {

    private int id;
    private String massagesContent;
    private String massagesTime;
    private String[] massagesImages;
    private int likeCount;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMassagesContent() {
        return massagesContent;
    }

    public void setMassagesContent(String massagesContent) {
        this.massagesContent = massagesContent;
    }

    public String getMassagesTime() {
        return massagesTime;
    }

    public void setMassagesTime(String massagesTime) {
        this.massagesTime = massagesTime;
    }

    public String[] getMassagesImages() {
        return massagesImages;
    }

    public void setMassagesImages(String massagesImages) {
        String[] split = massagesImages.split(";");
        for (int i = 0; i < split.length; i++) {
            if(!split[i].isEmpty()){
                split[i]="http://localhost:8888/images/"+split[i];
            }
        }
        this.massagesImages = split;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
