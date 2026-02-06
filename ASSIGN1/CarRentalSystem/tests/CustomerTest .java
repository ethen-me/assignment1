public class CustomerTest {
public static void main(String[] args) {
Customer customer = new Customer("U1", "Ethen");
assert customer.getCustomerId().equals("U1");
assert customer.getName().equals("Ethen");
System.out.println("Customer tests passed");
}
}