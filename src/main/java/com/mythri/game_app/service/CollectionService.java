package com.mythri.game_app.service;

import com.mythri.game_app.entity.Collection;
import com.mythri.game_app.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class CollectionService {

	@Autowired
	private CollectionRepository collectionRepository;

	public List<Collection> getAllCollections() {
		return collectionRepository.findAll();
	}

	public Collection getCollectionByDate(String date) {
		LocalDate localDate = LocalDate.parse(date);
		return collectionRepository.findByDate(localDate);
	}

	public Collection createCollection(Collection collection) {
		return collectionRepository.save(collection);
	}
}
