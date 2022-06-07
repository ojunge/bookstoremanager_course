package com.mobtag.bookstoremanager.repository;

import com.mobtag.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Adronilson Junge
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}

