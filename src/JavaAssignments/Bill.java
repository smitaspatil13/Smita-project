package JavaAssignments;

public class Bill {
    public static void main(String[] args) {
        double units = 250;
        double totalBill = 0;

        if (units <= 100) {
            totalBill = units * 1.50;
        }
        else if (units <= 200) {
            // First 100 at 1.50 + remaining units at 2.50
            totalBill = (100 * 1.50) + (units - 100) * 2.50;
        }
        else if (units <= 300) {
            // First 100 at 1.50 + next 100 at 2.50 + remaining units at 4.00
            totalBill = (100 * 1.50) + (100 * 2.50) + (units - 200) * 4.00;
        }
        else {
            // Above 300 units
            totalBill = (100 * 1.50) + (100 * 2.50) + (100 * 4.00) + (units - 300) * 6.00;
        }

        System.out.println("Total Units Consumed: " + units);
        System.out.println("Total Bill: ₹" + totalBill);
    }
}
