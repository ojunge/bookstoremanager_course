package com.mobtag.bookstoremanager.repository;

import com.mobtag.bookstoremanager.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Adronilson Junge
 */
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
