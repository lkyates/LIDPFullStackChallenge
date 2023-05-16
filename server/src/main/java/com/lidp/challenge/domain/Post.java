package com.lidp.challenge.domain;

import java.util.UUID;

public class Post
{
   private UUID identification;
   private String title;
   private String subTitle;
   private String body;
   private String link;
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

   public void setTitle(String title)
   {
      this.title = title;
   }

   public String getSubTitle()
   {
      return subTitle;
   }

   public void setSubTitle(String subTitle)
   {
      this.subTitle = subTitle;
   }

   public String getBody()
   {
      return body;
   }

   public void setBody(String body)
   {
      this.body = body;
   }

   public String getLink()
   {
      return link;
   }

   public void setLink(String link)
   {
      this.link = link;
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