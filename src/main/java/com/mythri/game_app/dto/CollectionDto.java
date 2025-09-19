package com.mythri.game_app.dto;

// ...existing code...
import java.time.LocalDate;

// ...existing code...
public class CollectionDto {
    private Long id;
    private Double amount;   // sum of recharges
    private LocalDate date;  // unique per day

    public CollectionDto() {}

    public CollectionDto(Long id, Double amount, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
