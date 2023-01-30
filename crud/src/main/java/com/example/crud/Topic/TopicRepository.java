package com.example.crud.Topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {

    void deleteById(Long topicId);

    Optional<Topic> findByName(String name);
}
