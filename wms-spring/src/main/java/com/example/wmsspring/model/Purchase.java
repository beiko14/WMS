package com.example.wmsspring.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_received")
    private int numberReceived;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @OneToOne(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    private Product product;

    @OneToOne(targetEntity = Supplier.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "supplier_id", referencedColumnName = "id", nullable = false)
    private Supplier supplier;

    public Purchase(int numberReceived, LocalDate purchaseDate, Product product, Supplier supplier) {
        this.numberReceived = numberReceived;
        this.purchaseDate = purchaseDate;
        this.product = product;
        this.supplier = supplier;
    }

    public Purchase() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberReceived() {
        return numberReceived;
    }

    public void setNumberReceived(int numberReceived) {
        this.numberReceived = numberReceived;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
