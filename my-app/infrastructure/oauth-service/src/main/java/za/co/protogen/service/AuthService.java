package za.co.protogen.service;

import lombok.extern.slf4j.Slf4j;
import za.co.protogen.entity.UserCredential;
import za.co.protogen.repository.UserCredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class AuthService {

    @Autowired
    private UserCredentialRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    public String saveUser(UserCredential authRequest) {
        UserCredential userCredential = UserCredential.builder()
                        .name(authRequest.getName())
                                .password(authRequest.getPassword())
                                        .build();

        authRequest.setPassword(passwordEncoder.encode(authRequest.getPassword()));

        repository.save(userCredential);
        log.info("User added to the system");
        return "user added to the system";
    }

    public String generateToken(String username) {
        return jwtService.generateToken(username);
    }

    public void validateToken(String token) {
        jwtService.validateToken(token);
    }


}