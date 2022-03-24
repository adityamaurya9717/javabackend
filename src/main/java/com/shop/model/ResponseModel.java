package com.shop.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseModel<T> {
    boolean status;
    int code;
    T data;

    public ResponseModel(boolean status, int code, T data) {
        this.status = status;
        this.code = code;
        this.data = data;
    }

    public ResponseModel() {
    }


    public ResponseModel(String res) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        mapper.readValue(res,ResponseModel.class);

    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseModel{" +
                "status=" + status +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
