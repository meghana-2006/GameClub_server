package com.mythri.game_app.repository;

import com.mythri.game_app.entity.Recharge;
// ...existing code...
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RechargeRepository extends MongoRepository<Recharge, String> {
	List<Recharge> findByMemberId(String memberId);
}
