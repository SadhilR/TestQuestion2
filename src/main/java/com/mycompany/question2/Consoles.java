package com.mycompany.question2;

public abstract class Consoles implements IConsole {

    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Return the console type
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    // Return the store name
    @Override
    public String getStore() {
        return store;
    }

    // Return the total sales
    @Override
    public int getTotalSales() {
        return totalSales;
    }
}
