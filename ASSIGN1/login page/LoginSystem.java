import java.io.*;

public class LoginSystem {
    public static void main(String[] args) {
        final String CORRECT_USERNAME = "sophii";
        final String CORRECT_PASSWORD = "malii";
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int attempts = 3;
        
        while (attempts > 0) {
            try {
                System.out.print("Enter username: ");
                String username = reader.readLine();
                
                System.out.print("Enter password: ");
                
                // TURN OFF terminal echo - THIS IS THE KEY!
                Runtime.getRuntime().exec(new String[]{"sh", "-c", "stty -echo </dev/tty"}).waitFor();
                
                StringBuilder password = new StringBuilder();
                while (true) {
                    int c = reader.read();
                    if (c == '\n' || c == '\r') {
                        break;
                    } else if (c == 127 || c == 8) { // Backspace
                        if (password.length() > 0) {
                            password.setLength(password.length() - 1);
                            System.out.print("\b \b"); // Erase last asterisk
                        }
                    } else {
                        password.append((char) c);
                        System.out.print('*'); // Show only asterisk
                    }
                }
                
                // TURN echo BACK ON
                Runtime.getRuntime().exec(new String[]{"sh", "-c", "stty echo </dev/tty"}).waitFor();
                
                System.out.println(); // New line
                
                if (username.equals(CORRECT_USERNAME) && password.toString().equals(CORRECT_PASSWORD)) {
                    System.out.println("✓ Login successful!");
                    return;
                } else {
                    attempts--;
                    System.out.println("✗ Invalid! Attempts left: " + attempts);
                }
                
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }
        
        System.out.println("Account locked!");
    }
}
