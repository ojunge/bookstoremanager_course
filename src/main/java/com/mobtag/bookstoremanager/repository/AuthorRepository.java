package com.mobtag.bookstoremanager.repository;

import com.mobtag.bookstoremanager.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Adronilson Junge
 */

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
