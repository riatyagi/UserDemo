package com.xpan.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xpan.entity.User;

/**
 * @author rtyagi
 * Spring Data repository for the User entity.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}