package com.uptc.frw.graphql.jpa.repository;

import com.uptc.frw.graphql.jpa.entity.JournalistInterviewPerson;
import com.uptc.frw.graphql.jpa.key.JournalistInterviewPersonKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalistInterviewPersonRepository extends JpaRepository<JournalistInterviewPerson, JournalistInterviewPersonKey> {
}
