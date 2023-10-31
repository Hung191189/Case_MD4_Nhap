package com.example.case_md4_nhap.controller;

import com.example.case_md4_nhap.model.Image;
import com.example.case_md4_nhap.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    IImageService imageService;
    @GetMapping
    public ResponseEntity<Iterable<Image>> showAllImage() {
        List<Image> imageList = (List<Image>) imageService.findAll();
        if (imageList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(imageList, HttpStatus.OK);
    }

}
