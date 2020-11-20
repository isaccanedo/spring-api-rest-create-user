package br.com.isaccanedo.repository;

import br.com.isaccanedo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Isac Canedo
 */

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
