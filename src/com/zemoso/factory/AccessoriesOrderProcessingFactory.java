package com.zemoso.factory;

public class AccessoriesOrderProcessingFactory implements OrderProcessingFactory {
    @Override
    public Order createOrder() {
        return new AccessoriesOrder();
    }
}
