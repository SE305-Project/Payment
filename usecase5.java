
import java.util.Scanner;

public class usecase5 {
   public usecase5() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter payment amount: $");
      double amount = scanner.nextDouble();
      System.out.print("Enter payment method: ");
      scanner.nextLine();
      String method = scanner.nextLine();
      boolean isPaymentSuccessful = paymentmethod(amount, method);
      if (isPaymentSuccessful) {
         System.out.println("Payment successful. Thank you!");
      } else {
         System.out.println("Payment failed. Please try again.");
      }

      scanner.close();
   }

   public static boolean paymentmethod(double amount, String method) {
      if (method.equalsIgnoreCase("credit card")) {
         return true;
      } else {
         return method.equalsIgnoreCase("benefitPay");
      }
   }
}
