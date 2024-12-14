package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.Review;

public interface ReviewRepository extends MongoRepository<Review, String> {
    
}
