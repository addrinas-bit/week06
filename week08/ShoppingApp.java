package week08;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{
    public static void main(String[] args)
    {
      ShoppingCart cart = new ShoppingCart("Organic Tote Bag", 1200.0, 2);
      
      cart.displayCart();
      
      cart.setQuantity(3);
      System.out.println("\nUpdated Quantity: " + cart.getQuantity());
      
      System.out.println("Total Price: " + cart.calculateTotal());
      
      double discount = 10; // 10% discount
      System.out.println("Discounted Total (" + discount + "%): "
                + cart.calculateDiscountedTotal(discount));

      
      
        
     }
}