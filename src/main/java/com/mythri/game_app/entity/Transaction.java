package com.mythri.game_app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
// ...existing code...
import java.time.LocalDate;

// ...existing code...
@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;

    private Double amount;

    private LocalDate date = LocalDate.now();

    private String memberId;
    private String gameId;

    public Transaction() {}

    public Transaction(String id, Double amount, LocalDate date, String memberId, String gameId) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.memberId = memberId;
        this.gameId = gameId;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getGameId() { return gameId; }
    public void setGameId(String gameId) { this.gameId = gameId; }
}
