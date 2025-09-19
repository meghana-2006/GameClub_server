package com.mythri.game_app.service;

import com.mythri.game_app.entity.Member;
import com.mythri.game_app.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;

	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}

	public Member getMemberById(String id) {
		Optional<Member> member = memberRepository.findById(id);
		return member.orElse(null);
	}

	public Member createMember(Member member) {
		return memberRepository.save(member);
	}

	public Member updateMember(String id, Member member) {
		Optional<Member> existingMember = memberRepository.findById(id);
		if (existingMember.isPresent()) {
			Member m = existingMember.get();
			m.setName(member.getName());
			m.setPhoneNumber(member.getPhoneNumber());
			m.setBalance(member.getBalance());
			return memberRepository.save(m);
		} else {
			return null;
		}
	}

	public void deleteMember(String id) {
		memberRepository.deleteById(id);
	}
}
