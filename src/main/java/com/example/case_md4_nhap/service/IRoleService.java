package com.example.case_md4_nhap.service;

import com.example.case_md4_nhap.model.Role;

import java.util.Optional;

public interface IRoleService extends IGeneralService<Role>{
    Optional<Role> findByName(String name);
}
