package member.exception;

public class NoMemberException extends Exception {
	
 


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoMemberException() {
        super("해당 회원이 존재하지 않습니다.");
    }

    public NoMemberException(String message) {
        super(message);
    }
}
