package book.friend.com.Repository;

import book.friend.com.Model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Created 9/18/2021
 * @Project Friend Cricle
 * @Time 11:20 PM
 * @Author Nahid
 */
@Repository
public interface RoleRepository extends MongoRepository<Role,String> {
}
