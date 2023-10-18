package com.uptc.frw.graphql.repository;

import com.uptc.frw.graphql.jpa.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
