package com.mythri.game_app.controller;

// package com.mtd.gaming_club_app.controller;

import com.mythri.game_app.entity.Collection;
import com.mythri.game_app.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
// ...existing code...
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;


// ...existing code...
import java.util.List;

@RestController
@RequestMapping("/collections")
public class CollectionController {

    @Autowired
    private CollectionService collectionService;

    @GetMapping
    public List<Collection> getAllCollections() {
        return collectionService.getAllCollections();
    }

    @GetMapping("/{date}")
    public Collection getCollectionByDate(@PathVariable String date) {
        return collectionService.getCollectionByDate(date);
    }

    @PostMapping
    public Collection createCollection(@RequestBody Collection collection) {
        return collectionService.createCollection(collection);
    }
}

