package com.kosa.myapp.member.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosa.myapp.member.dao.IMemberRepository;
import com.kosa.myapp.member.model.Member;
import com.kosa.myapp.member.service.IMemberService;

@Service
public class MemberService implements IMemberService{

	@Autowired
	IMemberRepository memberDao;

	@Override
	public void insertMember(Member member) {
		memberDao.insertMember(member);
	}

	@Override
	public Member selectMember(Member member) {
		return memberDao.selectMember(userid);
	}

	@Override
	public List<Member> selectAllMembers() {
		return memberDao.selectAllMembers();
	}

	@Override
	public void updateMember(Member member) {
		memberDao.updateMember(member);
	}

	@Override
	public void deleteMember(Member member) {
		memberDao.deleteMember(member);
	}

	@Override
	public String getPassword(String userid) {
		return memberDao.getPassword(userid);
	}
}




