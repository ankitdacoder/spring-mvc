package com.luv.spring;

import java.util.LinkedHashMap;

public class CommentModel {

	private Integer userid;
	private Integer feedid;
	
	private String cType;
	
	private String[] languages;

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public CommentModel() {

		commentType = new LinkedHashMap<>();
		commentType.put("p", "Post");
		commentType.put("f", "Feed");
		commentType.put("t", "Thought");
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getFeedid() {
		return feedid;
	}

	public void setFeedid(Integer feedid) {
		this.feedid = feedid;
	}

	public String getcType() {
		return cType;
	}

	public LinkedHashMap<String, String> getCommentType() {
		return commentType;
	}

	public void setCommentType(LinkedHashMap<String, String> commentType) {
		this.commentType = commentType;
	}

	private LinkedHashMap<String, String> commentType;

}
