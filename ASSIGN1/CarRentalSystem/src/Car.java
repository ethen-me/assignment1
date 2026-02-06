public class Car {
private String carId;
private String model;
private double pricePerDay;
private boolean available;


public Car(String carId, String model, double pricePerDay) {
this.carId = carId;
this.model = model;
this.pricePerDay = pricePerDay;
this.available = true;
}


public String getCarId() {
return carId;
}


public String getModel() {
return model;
}


public double getPricePerDay() {
return pricePerDay;
}


public boolean isAvailable() {
return available;
}


public void rentCar() {
if (available) {
available = false;
}
}


public void returnCar() {
available = true;
}
}