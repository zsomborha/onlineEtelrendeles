package etelfutar.repository;

import etelfutar.logic.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends
        JpaRepository<Food, Integer> {
}

