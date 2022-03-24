package com.shop.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "brands")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String brandName;
    String brandCountry;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false,nullable = false)
    Date date=new Date();

    public Brand() {
    }

    public Brand(int id, String brandName, String brandCountry) {
        this.id = id;
        this.brandName = brandName;
        this.brandCountry = brandCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandCountry() {
        return brandCountry;
    }

    public void setBrandCountry(String brandCountry) {
        this.brandCountry = brandCountry;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", brandCountry='" + brandCountry + '\'' +
                '}';
    }
}
