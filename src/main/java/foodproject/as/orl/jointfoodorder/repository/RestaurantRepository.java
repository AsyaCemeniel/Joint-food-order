package foodproject.as.orl.jointfoodorder.repository;

import foodproject.as.orl.jointfoodorder.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
