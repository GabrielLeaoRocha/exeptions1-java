package model.exceptions;

public class DomainExcepition extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DomainExcepition(String msg) {
		super(msg);
	}
}
