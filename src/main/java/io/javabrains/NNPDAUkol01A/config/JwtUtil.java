package io.javabrains.NNPDAUkol01A.config;

import io.javabrains.NNPDAUkol01A.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtUtil {

    private static final long ACCESS_TOKEN_VALIDITY_SECONDS = 60 * 60; // 1 hodina
    private static final String SIGNING_KEY = "secretkey";

    // extract userName from token
    public String extractUserName(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    // extract expiration time from token
    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    // for retrieving any information from token we will need the secret key
    private Claims extractAllClaims(String token) {
        return Jwts.parser()
                .setSigningKey(SIGNING_KEY)
                .parseClaimsJws(token)
                .getBody();
    }

    // check if the token has expired
    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    // generate token for user
    public String generateToken(User user) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, user.getUserName());
    }

    private String createToken(Map<String, Object> claims, String subject) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + ACCESS_TOKEN_VALIDITY_SECONDS * 1000)) // 1000 (milisekund) = 1 sekunda
                .signWith(SignatureAlgorithm.HS256, SIGNING_KEY)
                .compact();
    }

    // validate token
    public Boolean validateToken(String token, UserDetails user) {
        final String userName = extractUserName(token);
        return (userName.equals(user.getUsername()) && !isTokenExpired(token));
    }
}
