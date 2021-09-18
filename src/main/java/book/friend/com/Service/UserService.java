package book.friend.com.Service;

import book.friend.com.Model.User;
import book.friend.com.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Created 9/18/2021
 * @Project Friend Cricle
 * @Time 11:34 PM
 * @Author Nahid
 */

@Service
@AllArgsConstructor
public class UserService {

    final UserRepository userRepository;

    public User CreateUser(User user) throws Exception {
        if (userRepository.findByEmail(user.getEmail())){
            throw new Exception("This Email is already have Taken");
        }
        if(userRepository.findByPhone(user.getPhone())){
            throw new Exception("This Phone is already have Taken");
        }
        User saveUser = userRepository.save(user);
        return saveUser;
    }


}
