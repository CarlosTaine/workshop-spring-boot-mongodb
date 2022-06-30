package com.carlostaine.workshopmogo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carlostaine.workshopmogo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
