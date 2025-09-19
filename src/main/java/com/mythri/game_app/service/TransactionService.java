package com.mythri.game_app.service;

import com.mythri.game_app.entity.Transaction;
// import com.mythri.game_app.entity.Member; // Removed unused import
import com.mythri.game_app.repository.TransactionRepository;
// import com.mythri.game_app.repository.MemberRepository; // Removed unused import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
// import java.util.Optional; // Removed unused import

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	// @Autowired
	// private MemberRepository memberRepository; // Removed unused field

	public List<Transaction> getAllTransactions() {
		return transactionRepository.findAll();
	}

	public Transaction createTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	public List<Transaction> getTransactionsByMember(String memberId) {
		return transactionRepository.findByMemberId(memberId);
	}
}
