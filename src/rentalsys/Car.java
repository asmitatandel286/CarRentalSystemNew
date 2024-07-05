package rentalsys;

public class Car {
	private String carId;
	private String model;
	private String brand;
	private double pricePerDay;
	private boolean isAvalibale;

	public Car(String carId, String model, String brand, double pricePerDay) {
		this.carId = carId;
		this.model = model;
		this.brand = brand;
		this.pricePerDay = pricePerDay;
		this.isAvalibale = true;
	}

	public String getCarId() {
		return carId;
	}

	public String getModel() {
		return model;
	}

	public String getBrand() {
		return brand;
	}

	public double calculatePrice(int rentalDays) {
		return pricePerDay * rentalDays;
	}

	public boolean isAvalibale() {
		return isAvalibale;
	}

	public void rent() {
		isAvalibale = false;
	}

	public void returnCar() {
		isAvalibale = true;
	}

}
