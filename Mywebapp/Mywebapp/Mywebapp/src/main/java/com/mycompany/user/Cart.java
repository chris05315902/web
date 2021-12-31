package com.mycompany.user;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "shoppingcart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, name = "goodsName")
    private String goodsName;

    @Column(length = 45, nullable = false, name = "totalAmount")
    private String totalAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getTotalAmount(){return totalAmount;}

    public void setTotalAmount(String totalAmount){this.totalAmount = totalAmount;}


    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +

                ", firstName='" + getGoodsName() + '\'' +

                ", price='" + getTotalAmount() + '\'' +
                '}';
    }

}
