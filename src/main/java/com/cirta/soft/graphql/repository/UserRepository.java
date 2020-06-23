package com.cirta.soft.graphql.repository;

import com.cirta.soft.graphql.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
