package com.mythri.game_app.dto;

// ...existing code...
import java.time.LocalDate;

// ...existing code...
public class RechargeDto {
    private Long id;
    private Long memberId;
    private Double amount;   // must be >=100 and <1000
    private LocalDate date;

    public RechargeDto() {}

    public RechargeDto(Long id, Long memberId, Double amount, LocalDate date) {
        this.id = id;
        this.memberId = memberId;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getMemberId() { return memberId; }
    public void setMemberId(Long memberId) { this.memberId = memberId; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
