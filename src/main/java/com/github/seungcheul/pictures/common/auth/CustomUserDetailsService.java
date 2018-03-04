package com.github.seungcheul.pictures.common.auth;

import com.github.seungcheul.pictures.vo.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = new User();
        user.setUserId(username);
        CustomUserDetails userDetails = new CustomUserDetails(user);
        return userDetails;
    }
}
