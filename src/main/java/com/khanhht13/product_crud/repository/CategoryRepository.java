package com.khanhht13.product_crud.repository;

import com.khanhht13.product_crud.models.entity.CategoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    @Override
    Page<CategoryEntity> findAll(Pageable pageable);
}
