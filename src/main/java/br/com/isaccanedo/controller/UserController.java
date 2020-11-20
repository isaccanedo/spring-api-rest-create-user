package br.com.isaccanedo.controller;

import br.com.isaccanedo.model.UserModel;
import br.com.isaccanedo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Isac Canedo
 */

@RestController
@RequestMapping("/api")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     *
     * @param userModel
     * @return
     */

    @PostMapping("/user/add")
    public UserModel createUser(@RequestBody UserModel userModel){
        return userService.save(userModel);
    }
}


