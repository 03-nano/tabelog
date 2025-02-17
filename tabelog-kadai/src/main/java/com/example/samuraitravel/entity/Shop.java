package com.example.samuraitravel.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Shop")
@Data
public class Shop {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer id;

@Column(name = "category_id")
private Integer categoryId;

@Column(name = "shop_name")
private String shopName;

@Column(name = "image_name")
private String imageName;

@Column(name = "shop_description")
private String shopDescription;

@Column(name = "business_hours")
private Integer businessHours;

@Column(name = "price")
private Integer price;

@Column(name = "postal_code")
private String postalCode;

@Column(name = "address")
private String address;

@Column(name = "phone_number")
private String phoneNumber;

@Column(name = "regular_holiday")
private String regularHoliday;

@Column(name = "created_at", insertable = false, updatable = false)
private Timestamp createdAt;

@Column(name = "updated_at", insertable = false, updatable = false)
private Timestamp updatedAt;

@Column(name = "updated_time")
private Integer updatedTime; 

}