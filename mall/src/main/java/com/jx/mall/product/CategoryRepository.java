package com.jx.mall.product;
import org.springframework.data.jpa.repository.JpaRepository;

/*
JpaRepository ald given
save()
findById()
findAll()
deleteById()
existsById()
 */
public interface CategoryRepository extends JpaRepository<Category, Long>{
}
