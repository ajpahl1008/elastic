package com.elksoft.ws;

import javax.xml.ws.Endpoint;

public class ProductPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9002/ws/product", new ProductServiceImpl());
    }
}
