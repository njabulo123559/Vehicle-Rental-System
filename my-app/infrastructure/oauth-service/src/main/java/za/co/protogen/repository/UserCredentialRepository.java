package za.co.protogen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.protogen.entity.UserCredential;

import java.util.Optional;

public interface UserCredentialRepository extends JpaRepository<UserCredential, Integer> {
    Optional<UserCredential> findByName(String username);
}
