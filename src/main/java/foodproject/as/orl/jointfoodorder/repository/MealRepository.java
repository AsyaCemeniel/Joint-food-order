package foodproject.as.orl.jointfoodorder.repository;

import foodproject.as.orl.jointfoodorder.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Integer> {
}
