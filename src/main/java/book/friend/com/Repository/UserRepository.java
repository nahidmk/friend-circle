package book.friend.com.Repository;

import book.friend.com.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Created 9/18/2021
 * @Project Friend Cricle
 * @Time 11:13 PM
 * @Author Nahid
 */

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    boolean findByEmail(String email);
    boolean findByPhone(String phone);
}
