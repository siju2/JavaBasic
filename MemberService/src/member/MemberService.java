package member;

import java.util.LinkedList;

public class MemberService {
   
 
   private LinkedList<Member> memberList = new LinkedList<>();

   public boolean registMember(String id, String password, String username) {
      return true;
   }
   
   public LinkedList<Member> listMembers() {
	    return new LinkedList<>(memberList);   // 방어적 복사본 반환
	}
   public Member detailMemberInfo(int memberNo) {
      return null;
   }
   
   
   public boolean updateMemberInfo(int memberNo, String password) {
      
      return true;
   }
   
   public boolean removeMember(int memberNo) {
      
      return true;
   }
}
