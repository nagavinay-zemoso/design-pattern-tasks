package com.zemoso.factory;

public class FoodOrderProcessinfFactory implements OrderProcessingFactory {
    @Override
    public Order createOrder() {
        return new FoodOrder();
    }
}
