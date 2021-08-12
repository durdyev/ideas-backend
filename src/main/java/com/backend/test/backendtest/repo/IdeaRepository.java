package com.backend.test.backendtest.repo;

import com.backend.test.backendtest.entity.Idea;
import org.springframework.data.repository.CrudRepository;

public interface IdeaRepository extends CrudRepository<Idea, Long> {
}
