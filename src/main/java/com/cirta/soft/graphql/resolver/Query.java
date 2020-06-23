package com.cirta.soft.graphql.resolver;


import com.cirta.soft.graphql.entity.Contest;
import com.cirta.soft.graphql.entity.Name;
import com.cirta.soft.graphql.entity.User;
import com.cirta.soft.graphql.entity.Vote;
import com.cirta.soft.graphql.repository.ContestRepository;
import com.cirta.soft.graphql.repository.NameRepository;
import com.cirta.soft.graphql.repository.UserRepository;
import com.cirta.soft.graphql.repository.VoteRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    private ContestRepository contestRepository;
    private NameRepository nameRepository;
    private UserRepository userRepository;
    private VoteRepository voteRepository;


    public Query(ContestRepository contestRepository, NameRepository nameRepository, UserRepository userRepository ,VoteRepository voteRepository) {
        this.contestRepository = contestRepository;
        this.nameRepository = nameRepository;
        this.userRepository = userRepository;
        this.voteRepository = voteRepository;
    }

    public Iterable<Contest> findAllContests() {
        return contestRepository.findAll();
    }

    public Iterable<Name> findAllNames() {
        return nameRepository.findAll();
    }

    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Iterable<Vote> findAllVotes() {
        return voteRepository.findAll();
    }


    public long countContests() {
        return contestRepository.count();
    }

    public long countNames() {
        return nameRepository.count();
    }

    public long countUsers() {
        return userRepository.count();
    }

    public long countVotes() {
        return voteRepository.count();
    }
}
