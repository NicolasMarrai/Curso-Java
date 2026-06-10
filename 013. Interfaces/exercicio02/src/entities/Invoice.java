package entities;

public class Invoice {
	
	private Double baseAmount;
	private Double extraFee;
	private Double fixedFee;
	private Double totalAmount;
	
	public Invoice(Double baseAmount, Double extraFee, Double fixedFee, Double totalAmount) {
		this.baseAmount = baseAmount;
		this.extraFee = extraFee;
		this.fixedFee = fixedFee;
		this.totalAmount = totalAmount;
	}

	public Double getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(Double baseAmount) {
		this.baseAmount = baseAmount;
	}

	public Double getExtraFee() {
		return extraFee;
	}

	public void setExtraFee(Double extraFee) {
		this.extraFee = extraFee;
	}

	public Double getFixedFee() {
		return fixedFee;
	}

	public void setFixedFee(Double fixedFee) {
		this.fixedFee = fixedFee;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Valor base: ");
		sb.append(String.format("%.2f", baseAmount) + "\n");
		sb.append("Taxa fixa: ");
		sb.append(String.format("%.2f", fixedFee) + "\n");
		sb.append("Adicional: ");
		sb.append(String.format("%.2f", extraFee) + "\n");
		sb.append("Total: ");
		sb.append(String.format("%.2f", totalAmount) + "\n");
		return sb.toString();
	}
	
	
}