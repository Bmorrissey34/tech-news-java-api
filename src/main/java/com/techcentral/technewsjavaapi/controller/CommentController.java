package com.techcentral.technewsjavaapi.controller;

import com.techcentral.technewsjavaapi.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {
    @Autowired
    CommentRepository repository;
    @GetMapping("/api/comments")
    public List<Comment> getAllComments() {
        return repository.findAll();
    }
    @GetMapping("/api/comments/{id}")
    public Comment getComment(@PathVariable int id) {
        return repository.getById(id);
    }
    @PostMapping("/api/comments")
    @ResponseStatus(HttpStatus.CREATED)
    public Comment createComment(@RequestBody Comment comment) {
        return repository.save(comment);
    }
    @PutMapping("/api/updateComment")
    public Comment updateComment(@RequestBody Comment comment) {
        return repository.save(comment);
    }
    @DeleteMapping("/api/comments/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteComment(@PathVariable int id) {
        repository.deleteById(id);
    }
}
