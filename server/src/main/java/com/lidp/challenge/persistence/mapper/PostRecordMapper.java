package com.lidp.challenge.persistence.mapper;

import com.lidp.challenge.domain.Post;
import com.lidp.challenge.persistence.model.PostsRecordTable;

public class PostRecordMapper
{
   private PostRecordMapper()
   {
      throw new IllegalStateException("Mapper class should not be initialized");
   }

   public static Post map(PostsRecordTable entry)
   {
      if (entry == null)
         return null;

      Post post = new Post();
      post.setIdentification(entry.getIdentification());
      post.setTitle(entry.getTitle());
      post.setSubTitle(entry.getSubTitle());
      post.setBody(entry.getBody());
      post.setLink(entry.getLink());
      post.setImage(entry.getImage());

      return post;
   }

   public static PostsRecordTable map(Post entry)
   {
      if (entry == null)
         return null;

      PostsRecordTable postsRecordTable = new PostsRecordTable();
      postsRecordTable.setIdentification(entry.getIdentification());
      postsRecordTable.setTitle(entry.getTitle());
      postsRecordTable.setSubTitle(entry.getSubTitle());
      postsRecordTable.setBody(entry.getBody());
      postsRecordTable.setLink(entry.getLink());
      postsRecordTable.setImage(entry.getImage());

      return postsRecordTable;
   }
}