package com.mobtag.bookstoremanager.repository;

import com.mobtag.bookstoremanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Adronilson Junge
 */
public interface UserRepository  extends JpaRepository<User, Long> {
}

