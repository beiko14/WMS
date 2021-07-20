package com.example.wmsspring.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "part_number")
    private int partNumber;

    @Column(name = "product_label")
    private String productLabel;

    @Column(name = "starting_inventory")
    private int startingInventory;

    @Column(name = "inventory_received")
    private int inventoryReceived;

    @Column(name = "inventory_shipped")
    private int inventoryShipped;

    @Column(name = "inventory_on_hand")
    private int inventoryOnHand;

    @Column(name = "minimum_required")
    private int minimumRequired;

    @OneToMany(mappedBy = "product")
    private Set<Purchase> purchases;

    @OneToMany(mappedBy = "product")
    private Set<Order> orders;

    public Product(String productName, int partNumber, String productLabel, int startingInventory, int inventoryReceived, int inventoryShipped, int inventoryOnHand, int minimumRequired) {
        this.productName = productName;
        this.partNumber = partNumber;
        this.productLabel = productLabel;
        this.startingInventory = startingInventory;
        this.inventoryReceived = inventoryReceived;
        this.inventoryShipped = inventoryShipped;
        this.inventoryOnHand = inventoryOnHand;
        this.minimumRequired = minimumRequired;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getProductLabel() {
        return productLabel;
    }

    public void setProductLabel(String productLabel) {
        this.productLabel = productLabel;
    }

    public int getStartingInventory() {
        return startingInventory;
    }

    public void setStartingInventory(int startingInventory) {
        this.startingInventory = startingInventory;
    }

    public int getInventoryReceived() {
        return inventoryReceived;
    }

    public void setInventoryReceived(int inventoryReceived) {
        this.inventoryReceived = inventoryReceived;
    }

    public int getInventoryShipped() {
        return inventoryShipped;
    }

    public void setInventoryShipped(int inventoryShipped) {
        this.inventoryShipped = inventoryShipped;
    }

    public int getInventoryOnHand() {
        return inventoryOnHand;
    }

    public void setInventoryOnHand(int inventoryOnHand) {
        this.inventoryOnHand = inventoryOnHand;
    }

    public int getMinimumRequired() {
        return minimumRequired;
    }

    public void setMinimumRequired(int minimumRequired) {
        this.minimumRequired = minimumRequired;
    }

    public Set<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(Set<Purchase> purchases) {
        this.purchases = purchases;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
