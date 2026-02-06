public class CarTest {
public static void main(String[] args) {
Car car = new Car("C1", "BMW", 100);
assert car.isAvailable();
car.rentCar();
assert !car.isAvailable();
car.returnCar();
assert car.isAvailable();
System.out.println("Car tests passed");
}
}