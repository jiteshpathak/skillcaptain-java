// You are tasked with creating a Java program called "GroceryListManager" that allows a user to manage their grocery list.
// The program should provide the following functionalities:
//  1. Add Items to the Grocery List: Users should be able to add items to their grocery list. Each item has a name and an optional quantity.
//  2. Remove Items from the Grocery List: Users should be able to remove items from their grocery list based on the item name.
//  3. Print the Current Grocery List: Users should be able to view the current list of items on their grocery list.
//  4. Check if a Specific Item is on the Grocery List: Users should be able to check if a specific item is already on their grocery list.
//  5. Clear the Entire Grocery List: Users should be able to clear the entire grocery list, removing all items.

// Explanation: :
// Example Data for Grocery List:
// Initial Grocery List: []
// After Adding "Apples" (Quantity: 5): ["Apples (Quantity: 5)"]
// After Adding "Bananas" (Quantity: 2): ["Apples (Quantity: 5)", "Bananas (Quantity: 2)"]
// After Removing "Apples": ["Bananas (Quantity: 2)"] After Clearing the List: []

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListManager{
    public static void main(String args[]){
        ArrayList<String> groceryList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\n Grocery List Manager");
            System.out.println("\n 1 Add Item");
            System.out.println("\n 2 Remove Items");
            System.out.println("\n 3 Print Items");
            System.out.println("\n 4 Check Presence");
            System.out.println("\n 5 Clear List");
            System.out.println("\n 6 Exit");
            System.out.println("\n Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    addItem(groceryList, sc);
                    break;
                case 2:
                    removeItem(groceryList, sc);
                    break;
                case 3:
                    printList(groceryList);
                    break;
                case 4:
                    checkItem(groceryList, sc);
                    break;
                case 5:
                    clearList(groceryList);
                    break;
                case 6:
                    System.out.println("Exiting");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    private static void addItem(ArrayList<String> groceryList, Scanner sc) {
        System.out.print("Enter the item name: ");
        String itemName = sc.nextLine();
        groceryList.add(itemName);
        System.out.println("Item added to the grocery list.");
    }

    private static void removeItem(ArrayList<String> groceryList, Scanner sc) {
        System.out.print("Enter the item name to remove: ");
        String itemName = sc.nextLine();
        boolean removed = groceryList.remove(itemName);

        if (removed) {
            System.out.println("Item removed from the grocery list.");
        } else {
            System.out.println("Item not found in the grocery list.");
        }
    }

    private static void printList(ArrayList<String> groceryList) {
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            System.out.println("Current Grocery List:");
            for (String item : groceryList) {
                System.out.println("- " + item);
            }
        }
    }
    private static void checkItem(ArrayList<String> groceryList, Scanner sc) {
        System.out.print("Enter the item name to check: ");
        String itemName = sc.nextLine();
        boolean found = groceryList.contains(itemName);

        if (found) {
            System.out.println(itemName + " is on the grocery list.");
        } else {
            System.out.println(itemName + " is not on the grocery list.");
        }
    }
    private static void clearList(ArrayList<String> groceryList) {
        groceryList.clear();
        System.out.println("Grocery list cleared.");
    }
}