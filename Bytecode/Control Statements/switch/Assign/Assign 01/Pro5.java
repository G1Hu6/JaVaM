import java.util.Scanner;

public class BusinessRuleEnforcer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your role: ");
    String role = scanner.nextLine();
    System.out.print("Enter the feature you want to access: ");
    String feature = scanner.nextLine();

    switch (role) {
      case "admin":
        System.out.println("Access granted.");
        break;
      case "manager":
        switch (feature) {
          case "sales data":
          case "employee data":
            System.out.println("Access granted.");
            break;
          default:
            System.out.println("Access denied.");
            break;
        }
        break;
      case "employee":
        switch (feature) {
          case "time clock":
            System.out.println("Access granted.");
            break;
          default:
            System.out.println("Access denied.");
            break;
        }
        break;
      default:
        System.out.println("Access denied.");
        break;
    }
  }
}

