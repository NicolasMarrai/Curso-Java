package exceptions;

public class InvalidPriceException extends ProductException {
	private static final long serialVersionUID = 1L;
	
	public InvalidPriceException(String msg) {
		super(msg);
	}

	

}
