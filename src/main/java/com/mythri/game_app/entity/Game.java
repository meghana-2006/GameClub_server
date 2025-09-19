package com.mythri.game_app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.mythri.game_app.enums.GameStatus;

// ...existing code...
@Document(collection = "games")
public class Game {

    @Id
    private String id;

    private String name;
    private Double price;
    private String description;

    private GameStatus status;   // ACTIVE / INACTIVE

    private Integer duration;              // minutes
    private Integer minimumPlayerCount;
    private Integer maximumPlayerCount;
    private Boolean playersCountMultiple;

    public Game() {}

    public Game(String id, String name, Double price, String description, GameStatus status, Integer duration, Integer minimumPlayerCount, Integer maximumPlayerCount, Boolean playersCountMultiple) {
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

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public GameStatus getStatus() { return status; }
    public void setStatus(GameStatus status) { this.status = status; }

    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }

    public Integer getMinimumPlayerCount() { return minimumPlayerCount; }
    public void setMinimumPlayerCount(Integer minimumPlayerCount) { this.minimumPlayerCount = minimumPlayerCount; }

    public Integer getMaximumPlayerCount() { return maximumPlayerCount; }
    public void setMaximumPlayerCount(Integer maximumPlayerCount) { this.maximumPlayerCount = maximumPlayerCount; }

    public Boolean getPlayersCountMultiple() { return playersCountMultiple; }
    public void setPlayersCountMultiple(Boolean playersCountMultiple) { this.playersCountMultiple = playersCountMultiple; }
}
