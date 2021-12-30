package com.mycompany.user;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "users_test")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, name = "firstName")
    private String firstName;

    @Column(length = 45, nullable = false, name = "price")
    private String price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPrice(){return price;}

    public void setPrice(String price){this.price = price;}


    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +

                ", firstName='" + getFirstName() + '\'' +

                ", price='" + getPrice() + '\'' +
                '}';
    }

}
