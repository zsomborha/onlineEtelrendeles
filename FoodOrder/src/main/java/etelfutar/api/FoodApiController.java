package etelfutar.api;

import etelfutar.logic.model.Food;
import etelfutar.logic.model.Order;
import etelfutar.logic.service.FoodService;
import etelfutar.logic.service.OrderService;
import etelfutar.logic.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/course")
public class FoodApiController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private OrderService orderService;

    /*@GetMapping
    //@PreAuthorize("hasAnyAuthority('FOOD_LIST')")
    public ResponseEntity<Iterable<Food>> list() {
            return ResponseEntity.ok( foodService.findAll());
            }




    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ORDER_LIST')")
        public ResponseEntity<Iterable<Order>> list(){
            return ResponseEntity.ok( orderService.findAll());
        }*/

    @PostMapping("/create")
    //@PreAuthorize("hasAuthority('STAFF_NEW_FOOD')")
    public ResponseEntity create(@RequestBody Food food){
            foodService.save(food);
            return ResponseEntity.ok().build();
    }






}
