package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.Order;



public interface OrderRepository extends MongoRepository<Order, String> {
}
