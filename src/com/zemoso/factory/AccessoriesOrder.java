package com.zemoso.factory;

public class AccessoriesOrder implements Order{
    @Override
    public void processOrder() {
        System.out.println("processing accessories order...");
    }
}
