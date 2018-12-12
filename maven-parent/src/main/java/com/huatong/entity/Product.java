package com.huatong.entity;


import com.huatong.utils.TransSqlDateTime;

import java.sql.Timestamp;

public class Product {
    private String product_id;       //产品id
    private String product_no;       //产品批次号
    private String product_name;     //产品名称
    private String status;          //产品状态
    private Integer num;            //产品数量
    private String insert_time;  //产品入库时间
    private String modify_time;   //产品数据修改时间

    public String getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(Timestamp insert_time) {
        this.insert_time = TransSqlDateTime.getSqlDatetime(insert_time);
    }

    public String getModify_time() {
        return modify_time;
    }

    public void setModify_time(Timestamp modify_time) {
        this.modify_time = TransSqlDateTime.getSqlDatetime(modify_time);
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_no() {
        return product_no;
    }

    public void setProduct_no(String product_no) {
        this.product_no = product_no;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

}
