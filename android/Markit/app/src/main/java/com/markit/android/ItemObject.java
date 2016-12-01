package com.markit.android;

/**
 * Created by annagotsis on 11/29/16.
 */

public class ItemObject {

    private String price;
    private String title;
    private String uid;
    private String username;
    private String imageUrl;
    private String id;

    public ItemObject() {
//        this.price = "0";
//        this.title = "No Title";
//        this.uid = "None";
//        this.username = "None";
    }

    public ItemObject(String title, String price, String uid, String username, String id) {
        this.title = title;
        this.price = price;
        this.uid = uid;
        this.username = username;
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    //fix path to get username not userID, check firebase for that
    public String getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
