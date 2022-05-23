package org.example;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    double initialBalance;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        setBalance();
    }

    public String history(){

    }



}
