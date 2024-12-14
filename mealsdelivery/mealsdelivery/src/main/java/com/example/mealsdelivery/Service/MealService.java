package Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.MealRepository;
import models.Meal;

@Service
public class MealService {
    private final MealRepository mealRepository;

    @Autowired
    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    public Optional<Meal> getMealById(String id) {
        return mealRepository.findById(id);
            
    }
        
            
    public Meal saveMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public Meal updateMeal(String id, Meal meal) {
        meal.setId(id);
        return mealRepository.save(meal);
    }

    public void deleteMeal(String id) {
        mealRepository.deleteById(id);
    }

    public List<Meal> getAvailableMeals() {
        return mealRepository.findByIsAvailable(true); // Custom query for available meals
    }
}
    

