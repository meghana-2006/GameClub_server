package com.mythri.game_app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
// ...existing code...
// ...existing code...

// ...existing code...
@Document(collection = "members")
public class Member {

    @Id
    private String id;

    private String name;

    private String phoneNumber;

    private Double balance = 0.0;

    // For MongoDB, relationships are typically handled by storing related IDs or using DBRefs if needed.
    // You can add List<String> rechargeIds; and List<String> transactionIds; if you want to reference related documents.

    public Member() {}

    public Member(String id, String name, String phoneNumber, Double balance) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }

    // ...existing code...
}
