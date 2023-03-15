package com.zemoso.factory;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OrderProcessingFactory> factories= Arrays.asList(new FoodOrderProcessinfFactory(),new ClothingOrderProcessingFactory(),new AccessoriesOrderProcessingFactory());

        factories.forEach(Main::process);
    }

    public static void process(OrderProcessingFactory orderProcessingFactory){
        Order order=orderProcessingFactory.createOrder();
        order.processOrder();
    }
}
