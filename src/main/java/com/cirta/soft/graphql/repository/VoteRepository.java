package com.cirta.soft.graphql.repository;

import com.cirta.soft.graphql.entity.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Integer> {
}
