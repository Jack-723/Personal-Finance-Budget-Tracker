import dao.UserDAO;
import models.User;
import utils.DatabaseSetup;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Personal Finance Budget Tracker ===");
        System.out.println("Testing Database Setup...\n");

        // Step 1: Initialize database
        DatabaseSetup.initializeDatabase();
        System.out.println("✓ Database initialized\n");

        // Step 2: Create a test user
        UserDAO userDAO = new UserDAO();
        User testUser = new User("testuser", "password123", "test@email.com", "Test User");

        System.out.println("Attempting to register test user...");
        boolean registered = userDAO.registerUser(testUser);

        if (registered) {
            System.out.println("✓ User registration successful!\n");
        } else {
            System.out.println("✗ User registration failed\n");
        }

        // Step 3: Test login
        System.out.println("Attempting to login...");
        User loggedInUser = userDAO.loginUser("testuser", "password123");

        if (loggedInUser != null) {
            System.out.println("✓ Login successful!");
            System.out.println("Welcome: " + loggedInUser.getFullName());
            System.out.println("Email: " + loggedInUser.getEmail());
        } else {
            System.out.println("✗ Login failed");
        }

        // Step 4: Test duplicate username
        System.out.println("\nTesting duplicate username...");
        boolean isDuplicate = userDAO.usernameExists("testuser");
        System.out.println("Username exists: " + isDuplicate);

        System.out.println("\n=== All tests completed! ===");
    }
}