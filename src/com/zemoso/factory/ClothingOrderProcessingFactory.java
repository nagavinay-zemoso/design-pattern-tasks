package com.zemoso.factory;

public class ClothingOrderProcessingFactory implements OrderProcessingFactory {
    @Override
    public Order createOrder() {
        return new ClothingOrder();
    }
}
