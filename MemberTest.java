package homework;

class Member {
	
	private String Name, Id, Password;
	private int age;
	
	public Member(String Name, String Id, String Password, int age) {
		this.Name = Name;
		this.Id = Id;
		this.Password = Password;
		this.age = age;
		
	}
	
	void setMember(String Name, String Id, String Password, int age) {
		this.Name = Name;
		this.Id = Id;
		this.Password = Password;
		this.age = age;
		
	}
	
	String getName() {
		return Name;
	}
	String getId() {
		return Id;
	}
	
	String getPassword() {
		return Password;
	}
	
	int getAge() {
		return age;
	}
	
	
	
	
}

public class MemberTest {
	
	public static void main(String[]args) {
		
		Member sMember = new Member("이동현","대학생","2025",25);
		
		System.out.println(sMember.getName()+ sMember.getId()+ sMember.getPassword()+ sMember.getAge());
		
		sMember.setMember("이동 동이" , "대학 학생","202555",10000);
		
		System.out.println(sMember.getName()+ sMember.getId()+sMember.getPassword()+sMember.getAge());
		
		
		
		
		
		
	}

}
