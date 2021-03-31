package com.heymeowcat.springbootteamwork.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Products") 
public class Products implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int productid;
    String productname;
    String productdescription;
    double sellprice;
    double buyprice;
    int qty;
    @ManyToOne
    @JoinColumn(name = "categoryid")
    Categories category;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public double getSellprice() {
        return sellprice;
    }

    public void setSellprice(double sellprice) {
        this.sellprice = sellprice;
    }

    public double getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(double buyprice) {
        this.buyprice = buyprice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public Products(int productid, String productname, String productdescription, double sellprice, double buyprice,
            int qty, Categories category) {
        this.productid = productid;
        this.productname = productname;
        this.productdescription = productdescription;
        this.sellprice = sellprice;
        this.buyprice = buyprice;
        this.qty = qty;
        this.category = category;
    }

    public Products() {
    }

    
}
