package dk.entities;

import java.time.LocalDateTime;

public class Order {
    private String customerName;
    private double total;
    private int orderId;
    private int userId;
    private LocalDateTime createdAt;
    private String status;

    public Order(int orderId, int userId, LocalDateTime createdAt, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.createdAt = createdAt;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getStatus() {
        return status;
    }
}
