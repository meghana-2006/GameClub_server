package com.mythri.game_app.dto;

// ...existing code...

// ...existing code...
public class MemberDto {
    private Long id;
    private String name;
    private String phoneNumber;
    private Double balance;

    public MemberDto() {}

    public MemberDto(Long id, String name, String phoneNumber, Double balance) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }
}
