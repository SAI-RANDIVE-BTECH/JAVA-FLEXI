import java.util.Scanner;

class PaymentProcessor {
    void processPayment(String cardNumber, String cvv) {
        System.out.println("Processing Credit Card Payment");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("CVV: " + cvv);
    }

    void processPayment(String accountNumber, String ifscCode, boolean isBankTransfer) {
        System.out.println("Processing Bank Transfer Payment");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("IFSC Code: " + ifscCode);
    }

    void processPayment(String upiId) {
        System.out.println("Processing UPI Payment");
        System.out.println("UPI ID: " + upiId);
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        System.out.println("SAI RANDIVE 25070122509");
        Scanner sc = new Scanner(System.in);
        PaymentProcessor processor = new PaymentProcessor();
        System.out.println("There are three Payment methods available\n Please enter valid values as asked");

        System.out.println("Enter Card Number:");
        String cardNumber = sc.nextLine();
        if (cardNumber.length() > 12) {
            cardNumber = cardNumber.substring(0, 12);
        }
        String formattedCard = "";
        for (int i = 0; i < cardNumber.length(); i += 4) {
            int end = Math.min(i + 4, cardNumber.length());
            formattedCard += cardNumber.substring(i, end) + " ";
        }
        formattedCard = formattedCard.trim();

        System.out.println("Enter CVV:");
        String cvv = sc.nextLine();
        processor.processPayment(formattedCard, cvv);

        System.out.println("Enter Account Number:");
        String accountNumber = sc.nextLine();
        System.out.println("Enter IFSC Code:");
        String ifscCode = sc.nextLine();
        processor.processPayment(accountNumber, ifscCode, true);

        System.out.println("Enter UPI ID:");
        String upiId = sc.nextLine();
        processor.processPayment(upiId);

        sc.close();
    }
}