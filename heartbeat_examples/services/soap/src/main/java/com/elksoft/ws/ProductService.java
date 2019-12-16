package com.elksoft.ws;

import com.elksoft.ws.model.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use= SOAPBinding.Use.LITERAL)
public interface ProductService{
    @WebMethod
    Product getProduct(String name);
}