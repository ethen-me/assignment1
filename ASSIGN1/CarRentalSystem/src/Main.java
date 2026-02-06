public class Main {
public static void main(String[] args) {
RentalAgency agency = new RentalAgency();


Car car1 = new Car("C1", "Toyota Corolla", 50);
Customer customer1 = new Customer("U1", "Ethen");


agency.addCar(car1);
agency.addCustomer(customer1);


RentalTransaction transaction = agency.rentCar("C1", "U1", 3);


if (transaction != null) {
System.out.println("Rental successful. Total cost: $" + transaction.getTotalCost());
} else {
System.out.println("Rental failed.");
}
}
}