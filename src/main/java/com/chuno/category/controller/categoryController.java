package com.chuno.category.controller;

import com.chuno.category.dto.categoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import com.chuno.category.dao.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class categoryController {
    @Autowired
    private categoryRepository categoryRepository;

    //저장하는 것 하나

    @PostMapping("/post")
    public String category_save(@RequestBody categoryDto dto){
        this.categoryRepository.save(dto.toEntity());
        return "Success";
    }
    //전체 목록 가져오는 것 하나
    @GetMapping("/get")
    public List<category> category_get(){
        return this.categoryRepository.findAll();
    }


}
