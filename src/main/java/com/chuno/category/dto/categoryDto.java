package com.chuno.category.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.chuno.category.dao.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
public class categoryDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동 증가 auto increasement
    private  Long category_id;

    private String category_name;

    public category toEntity(){
     return category.builder()
             .category_name(category_name)
             .build(); //생성자 대신 이렇게 쓴다? chaining
    }

}
