package exceptions;

public class LowStockException extends StockException {
	private static final long serialVersionUID = 1L;

	public LowStockException(String msg) {
		super(msg);
	}
}
