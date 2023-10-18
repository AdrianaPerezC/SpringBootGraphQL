package com.uptc.frw.graphql.jpa.repository;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalistRepository extends JpaRepository <Journalist, Long> {
}
