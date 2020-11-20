package br.com.isaccanedo.service;

import br.com.isaccanedo.model.UserModel;

/**
 * @author Isac Canedo
 */

public interface UserService {

    /**
     *
     * @param userModel
     * @return
     */

    UserModel save(UserModel userModel);

}
