package com.example.crud.Topic;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    public List<Topic> getTopics(){
        return List.of(
                new Topic("Wolves", "Wolves Description"),
                new Topic("Wolves", "Wolves Description")

        );
    }
}
