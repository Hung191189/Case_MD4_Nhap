package com.example.case_md4_nhap.service.impl;

import com.example.case_md4_nhap.model.Address;
import com.example.case_md4_nhap.repository.IAddressRepository;
import com.example.case_md4_nhap.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AddressService implements IAddressService {
    @Autowired
    IAddressRepository iAddressRepository;
    @Override
    public Iterable<Address> findAll() {
        return iAddressRepository.findAll();
    }

    @Override
    public Optional<Address> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Address save(Address address) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
