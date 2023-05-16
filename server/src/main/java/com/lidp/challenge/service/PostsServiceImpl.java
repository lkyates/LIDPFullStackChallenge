package com.lidp.challenge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lidp.challenge.domain.Post;
import com.lidp.challenge.persistence.dao.PostsRepository;
import com.lidp.challenge.persistence.mapper.PostRecordMapper;
import com.lidp.challenge.persistence.model.PostsRecordTable;
import com.lidp.challenge.service.inf.PostsService;

@Service
public class PostsServiceImpl implements PostsService
{
   private final PostsRepository postsRepository;

   @Autowired
   public PostsServiceImpl(PostsRepository postsRepository)
   {
      this.postsRepository = postsRepository;
   }

   @Override
   public List<Post> getPosts()
   {
      List<Post> posts = new ArrayList<>();
      Iterable<PostsRecordTable> postsRecords = this.postsRepository.findAll();

      postsRecords.forEach(postRecord -> posts.add(PostRecordMapper.map(postRecord)));

      return posts;
   }

}
