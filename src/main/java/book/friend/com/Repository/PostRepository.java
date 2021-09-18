package book.friend.com.Repository;

import book.friend.com.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Created 9/18/2021
 * @Project Friend Cricle
 * @Time 11:15 PM
 * @Author Nahid
 */

@Repository
public interface PostRepository extends MongoRepository<Post,String> {
}
