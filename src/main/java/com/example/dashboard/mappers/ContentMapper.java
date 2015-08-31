package com.example.dashboard.mappers;

import java.util.List;

import com.example.dashboard.domain.Content;


public interface ContentMapper {
	
	public List<Content> getContentList();

	public int insertContent(Content content);

	public int updatePublished(Content content);

	public int deleteContent(Content content);

	public Content getContentById(int id);

	public int updateContentById(Content content);

	public int updateContentHit(Content content);
}
