package com.mythri.game_app.repository;

import com.mythri.game_app.entity.Collection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;

@Repository
public interface CollectionRepository extends MongoRepository<Collection, String> {
	Collection findByDate(LocalDate date);
}
