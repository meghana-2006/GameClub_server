package com.mythri.game_app.dto;

// ...existing code...

// ...existing code...
public class GameDto {
    private Long id;
    private String name;
    private Double price;
    private String description;

    // extra fields
    private String status;              // ACTIVE / INACTIVE
    private Integer duration;           // in minutes
    private Integer minimumPlayerCount;
    private Integer maximumPlayerCount;
    private Boolean playersCountMultiple; // true if multiple allowed

    public GameDto() {}

    public GameDto(Long id, String name, Double price, String description, String status, Integer duration, Integer minimumPlayerCount, Integer maximumPlayerCount, Boolean playersCountMultiple) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.status = status;
        this.duration = duration;
        this.minimumPlayerCount = minimumPlayerCount;
        this.maximumPlayerCount = maximumPlayerCount;
        this.playersCountMultiple = playersCountMultiple;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }

    public Integer getMinimumPlayerCount() { return minimumPlayerCount; }
    public void setMinimumPlayerCount(Integer minimumPlayerCount) { this.minimumPlayerCount = minimumPlayerCount; }

    public Integer getMaximumPlayerCount() { return maximumPlayerCount; }
    public void setMaximumPlayerCount(Integer maximumPlayerCount) { this.maximumPlayerCount = maximumPlayerCount; }

    public Boolean getPlayersCountMultiple() { return playersCountMultiple; }
    public void setPlayersCountMultiple(Boolean playersCountMultiple) { this.playersCountMultiple = playersCountMultiple; }
}
