package com.dgn.jpa_part_3_jpql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCountDto {
    private Long count;
    private String name;
}
