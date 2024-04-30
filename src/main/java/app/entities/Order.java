package app.entities;

public class Order {
    private static int lastOrderId = 0;
    private int orderId;
    private int userId;
    //private int orderId;
    private String email;
    private String name;
    private String mobile;
    private int balance;
    private String topping;
    private String bottom;
    private int quantity;
    private int orderlinePrice;

    public Order(int userId, String email, String name, String mobile, int balance, String topping, String bottom, int quantity, int orderlinePrice) {
        this.orderId = generateNextOrderId();
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.mobile = mobile;
        this.balance = balance;
        this.topping = topping;
        this.bottom = bottom;
        this.quantity = quantity;
        this.orderlinePrice = orderlinePrice;
    }

    private static synchronized int generateNextOrderId() {
        return ++lastOrderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public int getBalance() {
        return balance;
    }

    public String getTopping() {
        return topping;
    }

    public String getBottom() {
        return bottom;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOrderlinePrice() {
        return orderlinePrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", balance=" + balance +
                ", topping='" + topping + '\'' +
                ", bottom='" + bottom + '\'' +
                ", quantity=" + quantity +
                ", orderlinePrice=" + orderlinePrice +
                '}';
    }
}
