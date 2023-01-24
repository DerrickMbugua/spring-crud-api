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

        Optional<Topic> optionalTopic = topicRepository.findById(topicId);
        return optionalTopic;
    }

    public void deleteTopic(Long topicId) {
        Optional<Topic> topic = topicRepository.findById(topicId);

        if(topic.isEmpty()){
            throw new IllegalStateException("Topic with id of "+topicId + "does not exist");
        }

        topicRepository.deleteById(topicId);
    }

    public void updateTopic(Long topicId, Topic topic) {
        Topic optionalTopic = topicRepository.findById(topicId).get();
        optionalTopic.setName(topic.getName());
        optionalTopic.setDescription(topic.getDescription());
        topicRepository.save(optionalTopic);
    }
}
