package com.learning.library.Book.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaBookCrudRepository extends JpaRepository<BookEntity, UUID> {
}
