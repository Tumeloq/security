package za.co.discovery.security.security;

import com.kasidev.users.api.UserService;
import com.kasidev.users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyUserService implements UserService {
   @Autowired
    private UserRepo userRepo;
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public Optional<User> findUserById(Long id) {
        Optional<UserModel>  optional =  userRepo.findById(id);
        if (optional.isPresent()) {
            UserModel userModel = optional.get();
            User user = new User();
            user.setUserName(userModel.getUserName());
            return Optional.of(user);
        }
        return Optional.empty();
    }

    @Override
    public User changeUserName(Long aLong, String s) {
        return null;
    }
}
