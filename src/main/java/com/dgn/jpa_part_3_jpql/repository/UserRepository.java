package com.dgn.jpa_part_3_jpql.repository;

import com.dgn.jpa_part_3_jpql.dto.UserCountDto;
import com.dgn.jpa_part_3_jpql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("""
        select new com.dgn.jpa_part_3_jpql.dto.UserCountDto(count(*),U.name)
        from T_USER as U
        group by U.name
        """)
    List<UserCountDto> getUserNameCount();


}
