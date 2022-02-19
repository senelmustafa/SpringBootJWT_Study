package com.techproed.SpringBootJWT_Study;

public class AuthenticationResponse {//App gelen token'a saklayacak class

    //bu class'tan cretae edilen obj app den gelen token bulunduracak
 private final   String jwt;


    public AuthenticationResponse(String jwt) {//final jwt initial etmek için cons create edildi
        this.jwt = jwt;
    }

    public String getJwt() {//app'd'en gelen token validate metodunda onaylanması için okunması lazım bunun içiçn getter method create edildi
        return jwt;
    }
}
