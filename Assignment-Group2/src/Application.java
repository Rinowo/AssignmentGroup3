
import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws SQLException {
        ProductList productList = new ProductList();
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();

        while (true) {
            menu.menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> productList.addProduct();
                case 2 -> productList.editProduct();
                case 3 -> productList.deleteProduct();
                case 4 -> productList.viewAll();
                case 5 -> productList.searchById();
                case 6 -> productList.searchByName();
                case 7 -> System.exit(0);
            }
        }
    }



}
