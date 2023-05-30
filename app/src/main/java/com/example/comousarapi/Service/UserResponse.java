package com.example.comousarapi.Service;

import com.example.comousarapi.Models.User;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class UserResponse {
    @SerializedName("name")
    public String name= "";
    @SerializedName("per_page")
    public int per_page=0;
    @SerializedName("total")
    public int total=0;
    @SerializedName("total_pages")
    public int total_pages=0;
    @SerializedName("data")
    public List<User> data= new ArrayList();

    public List<User> getUser() {
        return data;
    }
}