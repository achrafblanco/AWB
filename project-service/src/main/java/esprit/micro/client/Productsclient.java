package esprit.micro.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "PRODUCTSCATEGORIES", url = "http://localhost:8089/api/prod/products")
public interface Productsclient {
    @GetMapping("/")
    List<Products> getProducts();

    @GetMapping("/{id}")
    Products getProductById(@PathVariable("id") Long id);
}
