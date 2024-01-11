package com.example.demo.repository;

import com.example.demo.domain.Team;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    @Query("SELECT t FROM Team t LEFT JOIN FETCH t.members")
    List<Team> findAllTeamsWithMembers();

    @EntityGraph(attributePaths = "members")
    @Query("SELECT t FROM Team t")
    List<Team> findAllTeamsEntityGraph();
}
