package com.example.case_md4_nhap.service;

import java.util.Optional;

public interface IGeneralService<L>{
    Iterable<L> findAll();
    Optional<L> findById(Long id);
    L save (L l);
    void delete(Long id);
}
