package com.itheima.pojo;

public class Brand {

    public Integer id;
    public String brandName;
    public String componeyName;
    public Integer ordered;
    public String decription;
    public Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getComponeyName() {
        return componeyName;
    }

    public void setComponeyName(String componeyName) {
        this.componeyName = componeyName;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", componeyName='" + componeyName + '\'' +
                ", ordered=" + ordered +
                ", decription='" + decription + '\'' +
                ", status=" + status +
                '}';
    }
}
