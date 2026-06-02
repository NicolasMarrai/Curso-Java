package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.InvoiceStatus;

public class Invoice {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date issueDate;
	private InvoiceStatus status;
	private Double discount;

	private Company company;
	private List<InvoiceItem> items = new ArrayList<>();

	public Invoice() {
	}

	public Invoice(Date issueDate, InvoiceStatus status, Double discount, Company company) {
		super();
		this.issueDate = issueDate;
		this.status = status;
		this.discount = discount;
		this.company = company;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public InvoiceStatus getStatus() {
		return status;
	}

	public void setStatus(InvoiceStatus status) {
		this.status = status;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void addItem(InvoiceItem i) {
		items.add(i);
	}

	public void removeItem(InvoiceItem i) {
		items.remove(i);
	}

	public double subTotal() {
		double sum = 0.0;

		for (InvoiceItem ii : items) {
			sum += ii.subTotal();
		}

		return sum;
	}

	public double discountValue() {
		return subTotal() * discount / 100.0;
	}

	public double total() {
		return subTotal() - discountValue();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Issue date: ");
		sb.append(sdf.format(issueDate));
		sb.append("\n");

		sb.append("Status: ");
		sb.append(status);
		sb.append("\n");

		sb.append(company);
		sb.append("\n");

		sb.append("Items:\n");
		for (InvoiceItem ii : items) {
			sb.append(ii);
			sb.append("\n");
		}

		sb.append("Subtotal: $");
		sb.append(String.format("%.2f", subTotal()));
		sb.append(" | Discount: ");
		sb.append(String.format("%.1f", discount));
		sb.append("% (-$");
		sb.append(String.format("%.2f", discountValue()));
		sb.append(")\n");

		sb.append("Total: $");
		sb.append(String.format("%.2f", total()));

		return sb.toString();
	}
}
