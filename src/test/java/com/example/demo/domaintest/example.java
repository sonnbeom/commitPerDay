package com.example.demo.domaintest;

import com.example.demo.domain.Member;
import com.example.demo.domain.Team;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.TeamRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class example {
    @Autowired
    TeamRepository teamRepo;
    @Autowired
    MemberRepository memberRepo;

    @Autowired
    EntityManager entityManager;



//    void sampleSave(){
//        List<Member> members = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Member member = Member.builder().userName("MEMBER"+i).build();
//            members.add(member);
//        }
//        memberRepo.saveAll(members);
//
//        List<Team> teams = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Team team = Team.builder().teamName("TEAM"+i).build();
//            team.setMembers(members);
//            teams.add(team);
//        }
//        teamRepo.saveAll(teams);
//        entityManager.flush();
//        entityManager.clear();
//    }

    void sampleSave(){
        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Team team = Team.builder().teamName("TEAM"+i).build();
            teams.add(team);
        }
        teamRepo.saveAll(teams);

        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Member member = Member.builder().userName("MEMBER"+i).build();
            member.setTeam(teams.get(i)); // 각 Member에 대응하는 Team을 설정
            members.add(member);
        }
        memberRepo.saveAll(members);

        entityManager.flush();
        entityManager.clear();
    }

    @Test
    @Transactional
    void nPlusOne_테스트(){
        sampleSave();

        List<Team> teams = teamRepo.findAll();
        for (Team team: teams){
            team.getMembers().size();
        }
    }

    @Test
    @Transactional
    void nPlusOne_테스트_패치조인(){
        sampleSave();

        List<Team> teams = teamRepo.findAllTeamsWithMembers();
        for (Team team: teams){
            team.getMembers().size();
        }
    }

    @Test
    @Transactional
    void nPlusOne_테스트_EntityGraph(){
        sampleSave();

        List<Team> teams = teamRepo.findAllTeamsEntityGraph();
        for (Team team: teams){
            team.getMembers().size();
        }
    }

    @Test
    @Transactional
    void nPlusOne_테스트_BatchSize(){
        sampleSave();

        List<Team> teams = teamRepo.findAllTeamsEntityGraph();
        for (Team team: teams){
            team.getMembers().size();
        }
    }


}
