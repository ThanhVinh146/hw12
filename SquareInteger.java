import java.util.Scanner;

class SquareRootFinder {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please input a number: ");
        int userNumber = inputScanner.nextInt();

        System.out.println("The square root of the number is: " + calculateSquareRoot(userNumber));
    }

    // Computational complexity: O(logN)
    public static double calculateSquareRoot(int number) {
        if (number == 0 || number == 1) {
            return (double) number;
        }

        double lowRange = 0;
        double highRange = number;
        double acceptableError = 0.01;

        while (true) {
            double middle = (lowRange + highRange) / 2;
            double square = middle * middle;

            if (Math.abs(square - number) < acceptableError) {
                return middle;
            }

            if (square < number) {
                lowRange = middle;
            } else {
                highRange = middle;
            }
        }
    }
}

