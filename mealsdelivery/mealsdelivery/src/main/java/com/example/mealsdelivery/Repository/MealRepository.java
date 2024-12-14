package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.Meal;


    public interface MealRepository extends MongoRepository<Meal, String> {
}
    
