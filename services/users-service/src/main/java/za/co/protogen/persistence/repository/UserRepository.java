package za.co.protogen.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.co.protogen.domain.User;

import java.util.List;

public interface UserRepository  extends JpaRepository<User, Long>{
    List<User> findUsersByFirstNameAndLastNameAndRsaId(String firstName, String lastName, String rsaId);
    User findByUsername(String username);



}
