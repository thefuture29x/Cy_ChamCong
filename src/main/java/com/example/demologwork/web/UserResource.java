package com.example.demologwork.web;

import com.example.demologwork.dto.ResponseDTO;
import com.example.demologwork.dto.UserDto;
import com.example.demologwork.entity.RoleEntity;
import com.example.demologwork.entity.UserEntity;
import com.example.demologwork.jwt.JwtTokenProvider;
import com.example.demologwork.jwt.payload.request.LoginRequest;
import com.example.demologwork.jwt.payload.request.RegisterRequest;
import com.example.demologwork.jwt.payload.response.LoginResponse;
import com.example.demologwork.repository.IRoleRepository;
import com.example.demologwork.repository.IUserRepository;
import com.example.demologwork.service.IUserService;
import com.example.demologwork.service.impl.UserDetailsImpl;
import com.example.demologwork.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/user")
public class UserResource {
    @Autowired
    IUserService iUserService;


    @Transactional
    @GetMapping("/get-all")
    public Object getAllUser(Pageable pageable){
        Page<UserDto> listUser = iUserService.findAll(pageable).map(us -> UserDto.toDto((UserEntity) us));
        return ResponseDTO.of(listUser,"Find all user");
    }

    @GetMapping("/get-user-by-id/{id}")
    public Object getUserByID(@PathVariable Long id){
        UserDto userDto = UserDto.toDto((UserEntity) iUserService.findById(id));
        return ResponseDTO.of(userDto,"Find user by Id");
    }


    public Object test(){
        return null;
    }



}
