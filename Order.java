public class Order {
    private int orderId;
    private String customerName;
    private String product;
    private int units;
    private double price;
    private String status;
    private double totalAmount;


    public Order(int orderId, String customerName, String product, int units, double price, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.product = product;
        this.units = units;
        this.price = price;
        this.status = status;
        this.totalAmount=0.0;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProduct() {
        return product;
    }

    public int getUnits() {
        return units;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    public void calculateTotalAmount() {
        this.totalAmount = this.units * this.price;
    }


    @Override
    public String toString() {
        return "Order ID: " + orderId + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Product: " + product + "\n" +
                "Units: " + units + "\n" +
                "Price: " + String.format("%.2f", price) + "\n" +
                "Total Amount: $" + String.format("%.2f", totalAmount) + "\n" +
                "Status: " + status + "\n";
    }
}
