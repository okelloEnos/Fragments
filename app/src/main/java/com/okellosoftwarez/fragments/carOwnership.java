package com.okellosoftwarez.fragments;

//public class carOwnership {
//    private String name;
//    private String phoneNo;
//    private String carModel;
//    private String carModelVersion;
public class carOwnership{
    private String name;
    private String phoneNo;
    private  String carModel;
    private String carModelVersion;


    public carOwnership(String name, String phoneNo, String carModel, String carModelVersion) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.carModel = carModel;
        this.carModelVersion = carModelVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModelVersion() {
        return carModelVersion;
    }

    public void setCarModelVersion(String carModelVersion) {
        this.carModelVersion = carModelVersion;
    }
}

