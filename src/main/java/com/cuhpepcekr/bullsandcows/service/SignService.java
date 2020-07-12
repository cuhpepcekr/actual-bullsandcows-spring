package com.cuhpepcekr.bullsandcows.service;

import com.cuhpepcekr.bullsandcows.config.security.JwtTokenProvider;
import com.cuhpepcekr.bullsandcows.entity.User;
import com.cuhpepcekr.bullsandcows.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class SignService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    JwtTokenProvider jwtTokenProvider;

    public String signIn(User inputUser) {
        User foundUser = userRepository.findByUsername(inputUser.getUsername());
        if (foundUser == null || !passwordEncoder.matches(inputUser.getPassword(), foundUser.getPassword()))
            throw new UsernameNotFoundException(inputUser.getUsername());

        return jwtTokenProvider.createToken(String.valueOf(foundUser.getUsername()), foundUser.getRoles());
    }

    public User signUp(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Collections.singletonList("ROLE_USER"));
        return userRepository.save(user);
    }
}
