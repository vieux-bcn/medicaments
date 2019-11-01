package com.example.medicamentsBoot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Table;

@Entity

public class Medicament {
  @Id
  @Column(name = "medicamentid")
  private String medicamentid;
  
  @NotBlank(message = "Name is mandatory")
  @Column(name = "name")
  private String name;
  
  @Column(name = "description")
  private String description;
  
  @Column(name = "category")
  private String category;
  
  @Column(name = "producer")
  private String producer;
  
  @Column(name = "price")
  private double price;
  
  @Column(name = "stockquantity")
  private long stockQuantity;
  
  @Column(name = "stockinorder")
  private long stockInOrder;
  
  @Column(name = "active")
  private boolean active;
  
  public String getId() {
      return medicamentid;
  }
  public void setId(String id) {
      this.medicamentid = id;
  }
  public String getName() {
      return name;
  }
  public void setName(String name) {
      this.name= name;
  }
  public double getPrice() {
      return price;
  }
  public void setPrice(double price) {
      this.price = price;
  }
  public String getDescription() {
      return description;
  }
  public void setDescription(String description) {
      this.description= description;
  }
  public String getCategory() {
      return category;
  }
  public void setCategory(String category) {
      this.category= category;
  }
  public String getProducer() {
      return producer;
  }
  public void setProducer(String producer) {
      this.producer= producer;
  }
  public long getStockQuantity() {
      return stockQuantity;
  }
  public void setStockQuantity(long stockQuantity) {
      this.stockQuantity = stockQuantity;
  }
  public long getStockInOrder() {
      return stockInOrder;
  }
  public void setStockInOrder(long stockInOrder) {
      this.stockInOrder = stockInOrder;
  }
  public boolean getActive() {
      return active;
  }
  public void setActive(boolean active) {
      this.active = active;
  }
  
  public Medicament(String id, String name, double price) {
      super();
      this.medicamentid = id;
      this.name = name;
      this.price = price;
  }
  




    public Medicament(String id) {
      super();
      this.medicamentid = id;
      
  }

   protected Medicament() {
      super();
  }    

}