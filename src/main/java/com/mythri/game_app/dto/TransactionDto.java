package com.mythri.game_app.dto;

// ...existing code...
import java.time.LocalDate;

// ...existing code...
public class TransactionDto {
    private Long id;
    private Long memberId;
    private Long gameId;
    private Double amount;
    private LocalDate date;

    public TransactionDto() {}

    public TransactionDto(Long id, Long memberId, Long gameId, Double amount, LocalDate date) {
        this.id = id;
        this.memberId = memberId;
        this.gameId = gameId;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getMemberId() { return memberId; }
    public void setMemberId(Long memberId) { this.memberId = memberId; }

    public Long getGameId() { return gameId; }
    public void setGameId(Long gameId) { this.gameId = gameId; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
