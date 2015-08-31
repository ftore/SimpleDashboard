package com.example.dashboard.domain;

import java.io.Serializable;

public class Content implements Serializable {
	private long boardId;
	private String title;
	private String contents;
	private String created;
	private String creator;
	private int published;
	private long hits;
	
	public long getBoardId() {
		return boardId;
	}
	public void setBoardId(long boardId) {
		this.boardId = boardId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getPublished() {
		return published;
	}
	public void setPublished(int published) {
		this.published = published;
	}
	public long getHits() {
		return hits;
	}
	public void setHits(long hits) {
		this.hits = hits;
	}
	
	@Override
	public String toString() {
		return "Content [boardId=" + boardId + ", title=" + title
				+ ", contents=" + contents + ", created=" + created
				+ ", creator=" + creator + ", published=" + published
				+ ", hits=" + hits + "]";
	}
	
	
}
