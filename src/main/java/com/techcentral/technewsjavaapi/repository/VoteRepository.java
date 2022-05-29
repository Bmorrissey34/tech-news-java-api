package com.techcentral.technewsjavaapi.repository;

import com.techcentral.technewsjavaapi.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface VoteRepository extends JpaRepository<Vote, Integer> {

    @Query("SELECT count(*) FROM Vote v where v.postId= :id")
    List<Vote> countVotesByPostId(@Param("id") Integer id);
}
