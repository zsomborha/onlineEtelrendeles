package etelfutar.logic.service;

import etelfutar.logic.model.Food;

public interface FoodService {


    Iterable<Food> findAll();

    void save(Food food);
}
