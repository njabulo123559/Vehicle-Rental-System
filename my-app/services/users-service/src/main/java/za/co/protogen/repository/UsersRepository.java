package za.co.protogen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.protogen.model.User;

public interface UsersRepository extends JpaRepository<User, Long > {
}
