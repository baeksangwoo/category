package com.chuno.category.dao;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor  //생성
public class category {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY) //자동 증가 auto increasement
private  Long category_id;

private String category_name;

//날짜
@Builder
    public category(String category_name){
    this.category_name = category_name;
}

}
