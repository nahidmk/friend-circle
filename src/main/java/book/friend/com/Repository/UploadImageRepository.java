package book.friend.com.Repository;

import book.friend.com.Model.UploadImage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Created 9/18/2021
 * @Project Friend Cricle
 * @Time 11:22 PM
 * @Author Nahid
 */
@Repository
public interface UploadImageRepository extends MongoRepository<UploadImage, String> {


}
