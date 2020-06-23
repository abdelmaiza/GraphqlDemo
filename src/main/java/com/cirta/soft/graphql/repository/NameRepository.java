package com.cirta.soft.graphql.repository;

import com.cirta.soft.graphql.entity.Name;
import org.springframework.data.repository.CrudRepository;

public interface NameRepository extends CrudRepository<Name, Integer> {
}
