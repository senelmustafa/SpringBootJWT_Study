package com.techproed.SpringBootJWT_Study;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
//JWT için MyUserDetailsService class mutlaka createe edilmeli.loadUserByUsername() method ile App'e user upload edilemeli

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //bu method App'e user'in username password ve authorizes tanımladı-->cubuk adam tum vasıflarıyla create edildi

        return new User("admin","nimda",new ArrayList<>());//new ArrayList<>()-->collection type authorızes birden fazla ve sabit
        // oldg için depolayacak bit bos array create edildi
    }
}
