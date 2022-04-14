/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcart02;

/**
 *
 * @author Lenovo
 */
public class ShoppingCart02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity.
        double price = 13;
        double tax = 0.1;
        int qty = 2;

        // Declare and assign a calculated totalPrice
        double totalPrice = price * (1*tax) * qty;

        // Modify message to include quantity
        message = custName+" wants to purchase "+qty+" "+itemDesc;
        System.out.println(message);

        // Print another message with the total cost
        System.out.println("Total cost with tax is: $" + totalPrice);
    }
    
}
