package com.venkatalaxmi.org.VenkataLaxmiApi.repository;

import com.venkatalaxmi.org.VenkataLaxmiApi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
