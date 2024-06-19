package java_practice_problems;

public class reverse {

    public static void main(String[] args) {
        int num = 1500;
        int rem, rev = 0;
        int originalNum = num;

        // First reversal
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        System.out.println("Number: " + originalNum);
        System.out.println("Number after 1st reversal: " + rev);

        // Second reversal
        int tempRev = rev;
        int finalRev = 0;
        int count = 0; // Counting number of digits
        while (tempRev > 0) {
            tempRev /= 10;
            count++;
        }
        num = originalNum;
        while (num > 0) {
            rem = rev % 10; // Extract last digit from reversed number
            finalRev += rem * Math.pow(10, --count); // Adjust place value based on original number
            rev /= 10; // Move to next digit in reversed number
            num /= 10; // Remove last digit from original number
        }

        System.out.println("Number after 2nd reversal: " + finalRev);
    }
}
