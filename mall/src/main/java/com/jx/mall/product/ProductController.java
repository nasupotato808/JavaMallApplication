package com.jx.mall.product;

import com.jx.mall.common.ApiResponse;
import com.jx.mall.product.dto.CreateProductRequest;
import com.jx.mall.product.dto.ProductResponse;
import com.jx.mall.product.dto.UpdateProductRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ApiResponse<ProductResponse> createProduct(@Valid @RequestBody CreateProductRequest request){
        return ApiResponse.ok(productService.createProduct(request));
    }

    @GetMapping
    public ApiResponse<List<ProductResponse>> getAllProducts(){
        return ApiResponse.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ApiResponse<ProductResponse> getProductById(@PathVariable Long id){
        return ApiResponse.ok(productService.getProductById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<ProductResponse> updateProduct(
            @PathVariable Long id,
            @Valid @RequestBody UpdateProductRequest request
    ){
        return ApiResponse.ok(productService.updateProduct(id,request));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return ApiResponse.ok(null);
    }

}
