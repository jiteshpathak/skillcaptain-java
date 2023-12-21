public class loops {
    public static void main(String[] args) {
        System.out.print("1. ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("2. ");
        int j = 2;  // Change the variable name to j
        while (j <= 20) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();

        int userNumber = 3;
        do {
            if (userNumber >= 1 && userNumber <= 10) {
                System.out.println("You entered " + userNumber + ".");
            } else {
                System.out.println("Invalid Input. Please enter a number between 1 and 10.");
            }
            userNumber = 3;

        } while (userNumber < 1 || userNumber > 10);
    }
}