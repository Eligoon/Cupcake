package dk.entities;

public class Cupcake {
    private int cupcakeId;
    private int bottomId;
    private int toppingId;

    public Cupcake(int cupcakeId, int bottomId, int toppingId) {
        this.cupcakeId = cupcakeId;
        this.bottomId = bottomId;
        this.toppingId = toppingId;
    }
}