package dk.entities;

import java.time.LocalDateTime;

public class Order {
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
}
