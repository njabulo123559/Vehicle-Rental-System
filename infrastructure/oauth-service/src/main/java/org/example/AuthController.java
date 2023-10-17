package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.protogen.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private JwtTokenProvider tokenService;

    @Autowired
    private UserDetailsService userDetailsService;



    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        // Authenticate the user (check username and password)
        UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getUsername());


        String accessToken = tokenService.generateToken(userDetails);

        return ResponseEntity.ok(accessToken);
    }


    @PostMapping("/oauth/refresh")
    public ResponseEntity<String> refreshAccessToken(@RequestBody RefreshTokenRequest refreshTokenRequest) {
        String newAccessToken = tokenService.generateToken((UserDetails) userDetailsService);

        if (newAccessToken != null){
            return ResponseEntity.ok(newAccessToken);
        }
        else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Unable to refresh the access token");
        }




    }


}
