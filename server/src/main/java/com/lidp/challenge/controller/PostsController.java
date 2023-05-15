package com.lidp.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lidp.challenge.domain.Post;
import com.lidp.challenge.service.inf.PostsService;

@RestController
@RequestMapping("/posts")
public class PostsController
{
   private final PostsService postsService;

   @Autowired
   public PostsController(PostsService postsService)
   {
      this.postsService = postsService;
   }

   @GetMapping()
   public List<Post> getPosts()
   {
      return this.postsService.getPosts();
   }

}
