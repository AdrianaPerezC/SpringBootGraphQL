package com.uptc.frw.graphql.jpa.repository;

import com.uptc.frw.graphql.jpa.entity.JournalistNews;
import com.uptc.frw.graphql.jpa.key.JournalistNewsKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalistNewsRepository extends JpaRepository <JournalistNews, JournalistNewsKey>
{
}
