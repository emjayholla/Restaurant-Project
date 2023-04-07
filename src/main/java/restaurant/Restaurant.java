package restaurant;
import restaurant.Menu;
import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu tgiFridayMenu = new Menu();
        tgiFridayMenu.addItem();
        System.out.println(tgiFridayMenu);
        tgiFridayMenu.printMenu();
        }
}
