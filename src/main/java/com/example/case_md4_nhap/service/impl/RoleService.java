package com.example.case_md4_nhap.service.impl;

import com.example.case_md4_nhap.model.Role;
import com.example.case_md4_nhap.service.IRoleService;

import java.util.Optional;

public class RoleService implements IRoleService {
    @Override
    public Iterable<Role> findAll() {
        return null;
    }

    @Override
    public Optional<Role> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Role save(Role role) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
