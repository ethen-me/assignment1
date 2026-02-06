public class RentalTransaction {
private Car car;
private Customer customer;
private int days;
private double totalCost;


public RentalTransaction(Car car, Customer customer, int days) {
this.car = car;
this.customer = customer;
this.days = days;
this.totalCost = car.getPricePerDay() * days;
}


public double getTotalCost() {
return totalCost;
}
}