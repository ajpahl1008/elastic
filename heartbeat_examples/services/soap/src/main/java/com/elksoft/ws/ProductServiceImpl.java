package com.elksoft.ws;

import com.elksoft.ws.model.Product;

import javax.jws.WebService;

    @WebService(endpointInterface = "com.elksoft.ws.ProductService")
    public class ProductServiceImpl implements ProductService{

        @Override
        public Product getProduct(String name) {

            Product product = new Product();

            if (name.contains("kibana")) {
                product.setName("kibana");
                product.setQty(12);
            }

            if (name.contains("logstash")) {
                product.setName("Logstash");
                product.setQty(900);
            }

            if (name.contains("beats")) {
                product.setName("Beats");
                product.setQty(0);
            }


            return product;
        }
    }
