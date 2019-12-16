package com.elksoft.ws;


import com.elksoft.ws.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductServiceController {

	@GetMapping("/product/{name}")
	@ResponseBody
	public Product getProduct(@PathVariable String name) {
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