public class Order{
    private int orderId;
    private String customerName;
    private String customerAddress;
    private String productName;
    private int productQuantity;
    private double productPrice;
    private double totalPrice;
    
    public Order(int orderId, String customerName, String customerAddress, String productName, int productQuantity, double productPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.totalPrice = calculateTotalPrice(productQuantity, productPrice);
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getCustomerAddress() {
        return customerAddress;
    }
    
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public int getProductQuantity() {
        return productQuantity;
    }
    
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    
    public double getProductPrice() {
        return productPrice;
    }
    
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public double calculateTotalPrice(int quantity, double price) {
        double total = quantity * price;
        if (quantity >= 10) {
            total = total * 0.9;
        }
        if (total >= 100) {
            total = total * 0.95;
        }
        return total;
    }
}
