package com.uptc.frw.graphql.jpa.repository;

import com.uptc.frw.graphql.jpa.entity.NewsAgency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsAgencyRepository extends JpaRepository<NewsAgency,Long> {
}
