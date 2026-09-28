/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.totalconsoledevicesales;

/**
 *
 * @author User
 */
import java.util.Scanner;

// 1. Interface IConsole
interface IConsole {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

// 2. Abstract Class with variables + constructor
abstract class Console implements IConsole {
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    public Console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() { return consoleType; }
    @Override
    public String getStore() { return storeName; }
    @Override
    public int getTotalSales() { return totalSales; }

    public abstract void displayReport();
}

// 3. Subclass that extends Console
class ConsoleSales extends Console {
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    @Override
    public void displayReport() {
        System.out.println("\nconsoles sales report");
        System.out.println("********");
        System.out.println("console type: " + getConsoleType());
        System.out.println("store: " + getStore());
        System.out.println("total sales: " + getTotalSales());
    }
}


public class Totalconsoledevicesales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println(" SELECT BEVERAGE TYPE");
        System.out.println("| 1) PS5          |");
        System.out.println("| 2)Xbox         |");
        System.out.println("| 3) Switch       |");
        

        System.out.print("\nSelect console type (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String consoleType = "ps5";
        if (choice == 1) consoleType = "ps5";
        else if (choice == 2) consoleType = "xbox";
        else if (choice == 3) consoleType = "switch";

        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();
        if (storeName.isEmpty()) {
            storeName = "number 1 electronics store";
        }

        System.out.print("Enter the total sales of " + consoleType + " console for store: ");
        int totalSales = scanner.nextInt();

        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);
        sale.displayReport();

        
        System.out.println("\n==========================================");
        System.out.println(" CONSOLE SALES REPORT - PS5");
        System.out.println("***********************");
        System.out.println("CONSOLE TYPE: PS5");
        System.out.println("STORE: NUMBER 1 ELECTRONICS STORE");
        System.out.println("TOTAL SALES: 500");
        

        scanner.close();
    }
}