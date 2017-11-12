package etelfutar.logic.service;

import etelfutar.logic.model.Food;
import etelfutar.repository.FoodRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
@Data
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

   public Iterable<Food> findAll() {
       return foodRepository.findAll();
   }


        public void save(Food food){
            if (food.getName().length()!=0
                    && food.getPrice()>0
                    && food.getCategory().length()>0
                )
        {
            foodRepository.save(food);
        }
    }


}
