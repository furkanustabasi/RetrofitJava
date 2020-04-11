package com.furkanustabasi.retrofitjava.model;

import com.google.gson.annotations.SerializedName;

import java.util.Currency;

public class CryptoModel {

    @SerializedName("currency") //Jsondaki istenen ismin aynısı
    public String currency;

    @SerializedName("price")
    public String price;

}
