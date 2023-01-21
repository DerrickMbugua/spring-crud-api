package com.example.crud.Topic;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class TopicController {

    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getTopics();
    }

    @PostMapping("/topics")
    public void addTopics(@RequestBody Topic topic){
        topicService.addTopics(topic);
    }

    @GetMapping("/topics/{topicId}")
    public Optional<Topic> getTopic(@PathVariable("topicId") Long topicId){
        return  topicService.getTopic(topicId);
    }
}
