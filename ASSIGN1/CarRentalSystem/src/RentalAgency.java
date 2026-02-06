import java.util.ArrayList;
import java.util.List;

public class RentalAgency {

    private List<Car> cars = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public RentalTransaction rentCar(String carId, String customerId, int days) {
        Car selectedCar = null;
        Customer selectedCustomer = null;

        for (Car car : cars) {
            if (car.getCarId().equals(carId) && car.isAvailable()) {
                selectedCar = car;
                break;
            }
        }

        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                selectedCustomer = customer;
                break;
            }
        }

        if (selectedCar != null && selectedCustomer != null) {
            selectedCar.rentCar();
            return new RentalTransaction(selectedCar, selectedCustomer, days);
        }

        return null;
    }
}

