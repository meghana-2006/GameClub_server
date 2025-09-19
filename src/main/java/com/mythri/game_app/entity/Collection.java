package com.mythri.game_app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
// ...existing code...
import java.time.LocalDate;

// ...existing code...
@Document(collection = "collections")
public class Collection {

    @Id
    private String id;

    private Double amount;

    private LocalDate date = LocalDate.now();

    public Collection() {}

    public Collection(String id, Double amount, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
