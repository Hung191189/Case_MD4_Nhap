package com.example.case_md4_nhap.service.impl;

import com.example.case_md4_nhap.model.Role;
import com.example.case_md4_nhap.repository.IRoleRepository;
import com.example.case_md4_nhap.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository iRoleRepository;
    @Override
    public Iterable<Role> findAll() {
        return iRoleRepository.findAll();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return iRoleRepository.findById(id);
    }

    @Override
    public Optional<Role> findByName(String name) {
        return findByName(name);
    }

    @Override
    public Role save(Role role) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
