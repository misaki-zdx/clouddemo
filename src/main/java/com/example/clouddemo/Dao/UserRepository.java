package com.example.clouddemo.Dao;

import com.example.clouddemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Miskai
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
