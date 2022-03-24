package com.shop.request;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shop.model.ResponseModel;

public class CatalogRequest {
    String id;
    String productName;
    String json;
    String res;
    ResponseModel model;

    public CatalogRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getRes() {
        return res;
    }

    public ResponseModel setRes(String res) throws JsonProcessingException {
        System.out.println("called="+res);
       ObjectMapper mapper=new ObjectMapper();
        this.model= mapper.readValue(res.toString(),ResponseModel.class);
        System.out.println(this.model);
        this.res = res;
        return this.model;
    }

    @Override
    public String toString() {
        return "CatalogRequest{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", json='" + json + '\'' +
                ", res='" + res + '\'' +
                ", model=" + model +
                '}';
    }
}
