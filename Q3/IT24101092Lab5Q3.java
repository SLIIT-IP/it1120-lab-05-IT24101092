import java.util.Scanner;

public class IT24101092Lab5Q3 {

    public static void main(String[] args) {
        
         int roomCharge = 48000;
         int discount1 = 10;
         int discount2 = 20;

        Scanner hf = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = hf.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = hf.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int numberOfDays = endDate - startDate;

        int discountRate = 0;
        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discountRate = discount1;
        } else if (numberOfDays >= 5) {
            discountRate = discount2;
        }

        double roomCharge2 = roomCharge * numberOfDays;
        double discountAmount = (roomCharge2 * discountRate) / 100;
        double totalAmount = roomCharge2 - discountAmount;

        System.out.println("Room Charge Per Day: Rs. " + roomCharge + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: Rs. " + totalAmount);
    }
}
