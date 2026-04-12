package dk.entities;

public class CupcakeOrders {
    private int id;
    private int cupcakeId;
    private int orderId;
    private int quantity;
    private double unitPrice;

    public CupcakeOrders(int id, int cupcakeId, int orderId, int quantity, double unitPrice) {
        this.id = id;
        this.cupcakeId = cupcakeId;
        this.orderId = orderId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
}