package com.oct.sb_mvc_websocket_2.controllers;


public class ChatMessage {
	private String context;
	private String sender;
	private MessageType type;
	
	public  enum MessageType{
		CHAT,
		JOIN,
		LEAVE
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}
	
	

}
