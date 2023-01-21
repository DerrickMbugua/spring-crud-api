package com.example.crud.Topic;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    private final TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public List<Topic> getTopics(){
        return topicRepository.findAll();
    }


    public void addTopics(Topic topic) {
        topicRepository.save(topic);
    }

    public Optional<Topic> getTopic(Long topicId) {
        return topicRepository.findById(topicId);
    }
}
