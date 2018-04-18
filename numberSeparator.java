import java.util.Scanner;

public class numberSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to count: ");
        int number = scanner.nextInt();

        int tram = number / 100;
        int du = number % 100;
        if (number == 10) {
            System.out.println("ten");
        }
        if (number > 100 && number < 1000 && number != 100 && number != 200 && number != 300 && number != 400 && number != 500 && number != 600 && number != 700 && number != 800 && number != 900) {
            switch (tram) {
                case 0:
                    System.out.println("zero ");
                    break;
                case 1:
                    System.out.println("one ");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
//
            int donvi = du / 10;
            switch (donvi) {
                case 0:
                    System.out.println("zero ");
                    break;
                case 1:
                    System.out.println("one ");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
            int chuc = du % 10;
            switch (chuc) {
                case 1:
                    System.out.println("one ");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else {
            if (number < 100 || number == 100 || number == 200 || number == 300 || number == 400 || number == 500 || number == 600 || number == 700 || number == 800 || number == 900) {
                int donvi = number / 10;
                switch (donvi) {
                    case 0:
                        System.out.println("zero ");
                        break;
                    case 1:
                        System.out.println("one ");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
                int chuc = number % 10;
                switch (chuc) {
                    case 0:
                        System.out.println("zero ");
                        break;
                    case 1:
                        System.out.println("one ");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
                if (number == 100) System.out.println("one hundred");
                if (number == 200) System.out.println("two hundred");
                if (number == 300) System.out.println("three hundred");
                if (number == 400) System.out.println("four hundred");
                if (number == 500) System.out.println("five hundred");
                if (number == 600) System.out.println("six hundred");
                if (number == 700) System.out.println("seven hundred");
                if (number == 800) System.out.println("eight hundred");
                if (number == 900) System.out.println("nine hundred");
            } else {
                System.out.println("Please Enter Again!");
            }
        }
    }
}

