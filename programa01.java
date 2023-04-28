public class programa01 {
    public static void main(String[] args) {
        Order order1 = new Order(1, "John Doe", "123 Main St.", "Widget", 5, 10.0);
        Order order2 = new Order(2, "Jane Smith", "456 Elm St.", "Gadget", 15, 20.0);
        Order order3 = new Order(3, "Bob Johnson", "789 Oak St.", "Thingamajig", 2, 30.0);
        
        System.out.println("Order 1:");
        System.out.println("ID: " + order1.getOrderId());
        System.out.println("Customer: " + order1.getCustomerName());
        System.out.println("Address: " + order1.getCustomerAddress());
        System.out.println("Product: " + order1.getProductName());
        System.out.println("Quantity: " + order1.getProductQuantity());
        System.out.println("Price: " + order1.getProductPrice());
        System.out.println("Total Price: " + order1.getTotalPrice());
        System.out.println();
        
        System.out.println("Order 2:");
        System.out.println("ID: " + order2.getOrderId());
        System.out.println("Customer: " + order2.getCustomerName());
        System.out.println("Address: " + order2.getCustomerAddress());
        System.out.println("Product: " + order2.getProductName());
        System.out.println("Quantity: " + order2.getProductQuantity());
        System.out.println("Price: " + order2.getProductPrice());
        System.out.println("Total Price: " + order2.getTotalPrice());
        System.out.println();

        System.out.println("Order 3:");
        System.out.println("ID: " + order3.getOrderId());
        System.out.println("Customer: " + order3.getCustomerName());
        System.out.println("Address: " + order3.getCustomerAddress());
        System.out.println("Product: " + order3.getProductName());
        System.out.println("Quantity: " + order3.getProductQuantity());
        System.out.println("Price: " + order3.getProductPrice());
        System.out.println("Total Price: " + order3.getTotalPrice());
        System.out.println();
    }
}
