package in.vini.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vini.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
