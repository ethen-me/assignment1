public class RentalAgencyTest {
public static void main(String[] args) {
RentalAgency agency = new RentalAgency();


Car car = new Car("C1", "Audi", 80);
Customer customer = new Customer("U1", "Alex");


agency.addCar(car);
agency.addCustomer(customer);


RentalTransaction transaction = agency.rentCar("C1", "U1", 2);
assert transaction != null;
assert !car.isAvailable();
assert transaction.getTotalCost() == 160;


System.out.println("RentalAgency tests passed");
}
}