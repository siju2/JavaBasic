package member;

import java.util.HashMap;
import java.util.Map;
import java.util.Date;

public class HashMapMemberDAO implements MemberDAO {

    private final Map<String, MemberVO> memberDB = new HashMap<>();
    private int memberSeq = 1;

    @Override
    public boolean insertMember(MemberVO member) {
        if (memberDB.containsKey(member.getId())) {
            return false; // 중복 ID
        }
        member.setMemberNo(memberSeq++);
        member.setRegDate(new Date());
        memberDB.put(member.getId(), member);
        return true; // 등록 성공
    }

    @Override
    public MemberVO selectMember(String id) {
        return memberDB.get(id);
    }

    @Override
    public boolean updateMember(MemberVO member) {
        if (!memberDB.containsKey(member.getId())) {
            return false;
        }
        memberDB.put(member.getId(), member);
        return true;
    }

    @Override
    public boolean deleteMember(String id) {
        return memberDB.remove(id) != null;
    }

    @Override
    public java.util.List<MemberVO> selectAllMembers() {
        return new java.util.ArrayList<>(memberDB.values());
    }
} 
