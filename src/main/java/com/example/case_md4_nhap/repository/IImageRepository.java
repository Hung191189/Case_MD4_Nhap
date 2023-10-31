package com.example.case_md4_nhap.repository;

import com.example.case_md4_nhap.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImageRepository extends JpaRepository<Image, Long> {

}
