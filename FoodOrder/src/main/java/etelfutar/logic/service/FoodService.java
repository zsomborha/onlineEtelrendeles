package etelfutar.logic.service;

import etelfutar.logic.model.Food;

public interface FoodService {


    Iterable<Food> findAll();

    Food findOne(int id);

    void save(Food food);
}
