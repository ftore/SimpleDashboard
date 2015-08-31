package com.example.dashboard.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dashboard.domain.Content;
import com.example.dashboard.mappers.ContentMapper;

@Service("contentService")
public class ContentServiceImpl implements ContentService {

	@Autowired
	private ContentMapper contentMapper;
	
	@Override
	public List<Content> getContentList() {
		return contentMapper.getContentList();
	}
	
	@Override
	public int insertContent(Content content) {
		return contentMapper.insertContent(content);
	}

	@Override
	public int updatePublished(Content content) {
		return contentMapper.updatePublished(content);
	}

	@Override
	public int deleteContent(Content content) {
		return contentMapper.deleteContent(content);
	}

	@Override
	public Content getContentById(int id) {
		return contentMapper.getContentById(id);
	}

	@Override
	public int updateContentById(Content content) {
		return contentMapper.updateContentById(content);
	}

	@Override
	public int updateContentHit(Content content) {
		return contentMapper.updateContentHit(content);
	}

	
}