package com.example.demologwork.utils;

import com.example.demologwork.entity.RoleEntity;
import com.example.demologwork.entity.UserEntity;
import com.example.demologwork.repository.IRoleRepository;
import com.example.demologwork.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DefaultData implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    IRoleRepository iRoleRepository;
    @Autowired
    IUserRepository iUserRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (iRoleRepository.findByRole("ROLE_ADMIN") == null) {
            iRoleRepository.save(new RoleEntity(1L, "ROLE_ADMIN", null));
        }
        if (iRoleRepository.findByRole("ROLE_LEADER") == null) {
            iRoleRepository.save(new RoleEntity(2L, "ROLE_LEADER", null));
        }
        if (iRoleRepository.findByRole("ROLE_USER") == null) {
            iRoleRepository.save(new RoleEntity(3L, "ROLE_USER", null));
        }
        RoleEntity roleAdmin = iRoleRepository.findByRole("ROLE_ADMIN");
        RoleEntity roleLeader = iRoleRepository.findByRole("ROLE_LEADER");
        RoleEntity roleUser = iRoleRepository.findByRole("ROLE_USER");

        List<RoleEntity> listRoleAdmin = new ArrayList<>();
        listRoleAdmin.add(roleAdmin);
        listRoleAdmin.add(roleLeader);
        listRoleAdmin.add(roleUser);

        List<RoleEntity> listRoleLeader = new ArrayList<>();
        listRoleLeader.add(roleLeader);
        listRoleLeader.add(roleUser);

        List<RoleEntity> listRoleUser = new ArrayList<>();
        listRoleUser.add(roleUser);

        if (iUserRepository.findByUsername("ADMIN") == null) {
            iUserRepository.save(new UserEntity(
                    1L,
                    "ADMIN",
                    passwordEncoder.encode("123456"),
                    null,
                    listRoleAdmin,
                    null
            ));
        }
        if (iUserRepository.findByUsername("LEADER") == null) {
            iUserRepository.save(new UserEntity(
                    2L,
                    "LEADER",
                    passwordEncoder.encode("123456"),
                    null,
                    listRoleLeader,
                    null
            ));
        }
        if (iUserRepository.findByUsername("USER1") == null) {
            iUserRepository.save(new UserEntity(
                    3L,
                    "USER1",
                    passwordEncoder.encode("123456"),
                    5L,
                    listRoleUser,
                    null
            ));
        }
        if (iUserRepository.findByUsername("USER2") == null) {
            iUserRepository.save(new UserEntity(
                    4L,
                    "USER2",
                    passwordEncoder.encode("123456"),
                    5L,
                    listRoleUser,
                    null
            ));
        }
        if (iUserRepository.findByUsername("USER3") == null) {
            iUserRepository.save(new UserEntity(
                    5L,
                    "USER3",
                    passwordEncoder.encode("123456"),
                    5L,
                    listRoleUser,
                    null
            ));
        }
    }
}
