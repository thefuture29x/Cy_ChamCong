package com.example.demologwork.web;


import com.example.demologwork.dto.ResponseDTO;
import com.example.demologwork.jwt.JwtTokenProvider;
import com.example.demologwork.jwt.payload.request.LoginRequest;
import com.example.demologwork.jwt.payload.response.LoginResponse;
import com.example.demologwork.repository.IRoleRepository;
import com.example.demologwork.repository.IUserRepository;
import com.example.demologwork.service.impl.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LoginResource {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    JwtTokenProvider jwtTokenProvider;
    @Autowired
    IUserRepository iUserRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    IRoleRepository iRoleRepository;


    @PostMapping("/login")
    public Object getResponseAfterLogin(@RequestBody LoginRequest loginRequest) throws Exception {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        if (userDetails == null) throw new Exception("User not found !");
        String jwtToken = jwtTokenProvider.generateTokenFormUsername(userDetails.getUsername());
        List<Long> listId = new ArrayList<>();
        List<SimpleGrantedAuthority> roleEntities = (List<SimpleGrantedAuthority>) authentication.getAuthorities();
        for (SimpleGrantedAuthority simple : roleEntities) {
            if (simple.getAuthority().equals("ROLE_ADMIN")) {
                listId.add(1L);
            }else if (simple.getAuthority().equals("ROLE_LEADER")){
                listId.add(2L);
            }else{
                listId.add(3L);
            }
        }
        return ResponseDTO.of(LoginResponse.builder()
                .id(userDetails.getUserEntity().getId())
                .username(userDetails.getUsername())
                .accessToken(jwtToken)
                .tokenType(new LoginResponse().getTokenType())
                .role(Collections.min(listId))
                .build(),"Login");

    }


//    @PostMapping("/register")
//    public Object register(@RequestBody RegisterRequest request) throws Exception {
//        UserEntity userEntity = iUserRepository.findByUsername(request.getUsername());
//        if (iUserRepository.findByUsername(request.getUsername()) != null
//                || iUserRepository.findByUsername(request.getEmail()) != null){
//            throw new Exception("User already exists");
//        } else {
//            RoleEntity roleUser = iRoleRepository.getById(3L);
//            List<RoleEntity> listRoleUser = new ArrayList<>();
//            listRoleUser.add(roleUser);
//            iUserRepository.save(new UserEntity(
//                    null,
//                    request.getUsername(),
//                    passwordEncoder.encode(request.getPassword()),
//                    null,
//                    listRoleUser,
//                    null));
//        }
//        return ResponseDTO.of(new RegisterRequest(request.getUsername(), null,request.getEmail(), request.getFullname()),"Register");
//    }
}
