package sda.dasgarage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sda.dasgarage.entities.ProductEntity;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    //    search bar
    @Query(value = "select * from products p where p.brand like %?1%", nativeQuery = true)
    List<ProductEntity> findByKeyword(@Param("keyword") String keyword);

}
