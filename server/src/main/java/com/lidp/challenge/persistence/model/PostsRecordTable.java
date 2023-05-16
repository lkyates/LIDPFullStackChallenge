package com.lidp.challenge.persistence.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class PostsRecordTable
{
   @Id
   @Column(name = "identification")
   private UUID identification;

   @Column(name = "title")
   private String title;

   @Column(name = "sub_title")
   private String subTitle;

   @Column(name = "body")
   private String body;

   @Column(name = "link")
   private String link;

   @Column(name = "image")
   private String image;

   public UUID getIdentification()
   {
      return identification;
   }
   
   public void setIdentification(UUID identification)
   {
      this.identification = identification;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public void setTitle(String firstName)
   {
      this.title = firstName;
   }
   
   public String getSubTitle()
   {
      return subTitle;
   }
   
   public void setSubTitle(String lastName)
   {
      this.subTitle = lastName;
   }
   
   public String getBody()
   {
      return body;
   }
   
   public void setBody(String biography)
   {
      this.body = biography;
   }
   
   public String getLink()
   {
      return link;
   }
   
   public void setLink(String email)
   {
      this.link = email;
   }
   
   public String getImage()
   {
      return image;
   }
   
   public void setImage(String image)
   {
      this.image = image;
   }
}
