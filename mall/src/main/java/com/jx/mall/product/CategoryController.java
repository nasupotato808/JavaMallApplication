package com.jx.mall.product;

import com.jx.mall.common.ApiResponse;
import com.jx.mall.product.dto.CreateCategoryRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public ApiResponse<Category> createCategory(@Valid @RequestBody CreateCategoryRequest request){
        return ApiResponse.ok(categoryService.createCategory(request));
    }

    @GetMapping
    public ApiResponse<List<Category>> getAllCategories(){
        return ApiResponse.ok(categoryService.getAllCategories());
    }

}
