package com.example.crud.Topic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TopicController {

    @GetMapping("/topics")
    public List<Topic> getTopics(){
        return List.of(
          new Topic("Wolves", "Wolves Description"),
                new Topic("Wolves", "Wolves Description")

                );
    }
}
