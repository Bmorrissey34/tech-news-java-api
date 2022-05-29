package com.techcentral.technewsjavaapi.repository;

import com.techcentral.technewsjavaapi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findAllPostsByUserId(Integer id) throws Exception;
}
