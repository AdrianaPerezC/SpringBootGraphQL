package com.uptc.frw.graphql.jpa.repository;

import com.uptc.frw.graphql.jpa.entity.NewsAgencyNews;
import com.uptc.frw.graphql.jpa.key.NewsAgencyNewsKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsAgencyNewsRepository extends JpaRepository<NewsAgencyNews, NewsAgencyNewsKey> {
}
