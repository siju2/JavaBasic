package member;

import java.util.LinkedList;

public class MemberService {

	private LinkedList<Member> memberList = new LinkedList<>();
	private int memberSeqNo = 1;
	
	public boolean registMember(String id, String password, String username) {
		memberList.add(new Member(memberSeqNo++, id, password, username));
		return true;
	}
	
	public boolean isIdValid(String id) {
		for (Member member : memberList) {
			if (member.getId().equals(id)) return false;
		}
		return true;
	}
	
	public LinkedList<Member> listMembers() {
		return memberList;
	}
	
	public Member detailMemberInfo(int memberNo) {
		return getMember(memberNo);
	}
	
	private Member getMember(int memberNo) {
		for (Member member : memberList) {
			if (member.getMemberNo() == memberNo) return member;
		}
		return null;
	}
	
	public boolean updateMemberInfo(int memberNo, String oldPassword, String newPassword) {
		Member member = getMember(memberNo);
		if (member == null) return false;
		if (member.getPassword().equals(oldPassword)) {
			member.setPassword(newPassword);
			return true;
		}
		return false;
	}
	
	public boolean removeMember(int memberNo) {
		Member member = getMember(memberNo);
		if (member == null) return false;
		memberList.remove(member);
		return true;
	}
}
