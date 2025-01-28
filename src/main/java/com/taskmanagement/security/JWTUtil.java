package com.taskmanagement.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtil {
    private static final String SECRET_KEY = "your_secret_key";
    private static final long EXPIRATION_TIME = 60 * 60 * 1000; // 1 hour

    public String generateToken(String username) {
        long expiryTime = System.currentTimeMillis() + EXPIRATION_TIME;
        System.out.println("JWT Expiry Time: " + new Date(expiryTime));
        return JWT.create()
                .withSubject(username)
                .withExpiresAt(new Date(expiryTime))
                .sign(Algorithm.HMAC256(SECRET_KEY));
    }

    public String validateToken(String token) {
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET_KEY)).build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println("Token Expiry: " + jwt.getExpiresAt());
            return jwt.getSubject();
        } catch (JWTVerificationException e) {
            System.out.println("Invalid or Expired Token!");
            return null; // Invalid token
        }
    }
}
