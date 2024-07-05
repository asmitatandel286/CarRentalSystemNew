package rentalsys;

public class Customer {
	private String customerId;
	private String name;
	private double adharCard;

	public Customer(String customerId, String name, double adharCard) {
		this.customerId = customerId;
		this.name = name;
		this.adharCard = adharCard;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public double getAdharCard() {
		return adharCard;
	}
}
