import model.User;
import services.AtmCurrency;
import services.Service;
import ui.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user = new User(100, 100, 100);
        int ch;

        Menu.mainMenu();
        ch = scanner.nextInt();

        while (ch != 0) {
            switch (ch) {
                case 1:
                    Service service = Service.INFO;
                    service.info(user);
                    break;
                case 2:
                    Service service1 = Service.CASH_WITHDRAWAL;
                    int ch1;

                    Menu.currency();
                    ch1 = scanner.nextInt();
                    while (ch1 != 0) {

                        switch (ch1) {
                            case 1: // USD
                                System.out.println("Please enter value");
                                service1.cashWithdrawal(AtmCurrency.USD, user, scanner.nextDouble());
                                break;
                            case 2:   // EUR
                                System.out.println("Please enter value");
                                service1.cashWithdrawal(AtmCurrency.EUR, user, scanner.nextDouble());
                                break;
                            case 3: // RUB
                                System.out.println("Please enter value");
                                service1.cashWithdrawal(AtmCurrency.RUB, user, scanner.nextDouble());
                                break;
                            default:
                                System.out.println("Error");
                                break;
                        }

                        Menu.currency();
                        ch1 = scanner.nextInt();
                    }
                    break;
                default:
                    System.out.println("Error");
                    break;
            }


            Menu.mainMenu();
            ch = scanner.nextInt();
        }


    }
}
