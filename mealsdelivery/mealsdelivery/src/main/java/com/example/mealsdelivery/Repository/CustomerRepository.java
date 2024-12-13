package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.Customer;

public interface CustomerRepository extends MongoRepository<Customer,String> {
    
}
