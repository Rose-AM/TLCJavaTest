package io.turntabl;

public class Trade {
    String id;
    String symbol;
    Integer quantity;
    Double price;

    public Trade(String id, String symbol, Integer quantity, Double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String id, String symbol, Integer quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Trade {" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price ;
    }
}
