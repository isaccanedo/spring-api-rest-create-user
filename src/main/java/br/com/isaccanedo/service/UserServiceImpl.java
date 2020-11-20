package br.com.isaccanedo.service;

import br.com.isaccanedo.model.UserModel;
import br.com.isaccanedo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Isac Canedo
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     *
     * @param userModel
     * @return
     */

    @Override
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }
}
