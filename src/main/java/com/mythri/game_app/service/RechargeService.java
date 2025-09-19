package com.mythri.game_app.service;

import com.mythri.game_app.entity.Recharge;
// import com.mythri.game_app.entity.Member; // Removed unused import
import com.mythri.game_app.repository.RechargeRepository;
// import com.mythri.game_app.repository.MemberRepository; // Removed unused import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
// import java.util.Optional; // Removed unused import

@Service
public class RechargeService {

	@Autowired
	private RechargeRepository rechargeRepository;

	@Autowired
	// private MemberRepository memberRepository; // Removed unused field

	public List<Recharge> getAllRecharges() {
		return rechargeRepository.findAll();
	}

	public Recharge createRecharge(Recharge recharge) {
		return rechargeRepository.save(recharge);
	}

	public List<Recharge> getRechargesByMember(String memberId) {
		return rechargeRepository.findByMemberId(memberId);
	}
}
