package com.lidp.challenge.persistence.dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lidp.challenge.persistence.model.PostsRecordTable;

@Repository
public interface PostsRepository extends CrudRepository<PostsRecordTable, UUID>
{
}
