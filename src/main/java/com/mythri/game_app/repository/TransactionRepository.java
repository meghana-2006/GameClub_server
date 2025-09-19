package com.mythri.game_app.repository;

import com.mythri.game_app.entity.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
	List<Transaction> findByMemberId(String memberId);

}
