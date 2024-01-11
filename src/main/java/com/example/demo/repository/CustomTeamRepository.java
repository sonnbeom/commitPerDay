//package com.example.demo.repository;
//
//import com.example.demo.domain.Team;
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import jakarta.persistence.EntityManager;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class CustomTeamRepository {
//
//    private final JPAQueryFactory queryFactory;
//
//
//    public CustomTeamRepository(EntityManager em) {
//        this.queryFactory = new JPAQueryFactory(em);
//    }
//
//    private List<Team> findTeamFetchMember(){
//        QTeam team = QTeam.team
//        return queryFactory
//                .select(T)
//    }
//
//
//}
