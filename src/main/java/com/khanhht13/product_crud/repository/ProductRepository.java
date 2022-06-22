package com.khanhht13.product_crud.repository;

import com.khanhht13.product_crud.models.entity.ProductEntity;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    @Query("Select p from ProductEntity p where p.name LIKE %:name%  AND p.price > 50000")
    List<ProductEntity> findByNameAndPrice(@Param("name") String name);

}
