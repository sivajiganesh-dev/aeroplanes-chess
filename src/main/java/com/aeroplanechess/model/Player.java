package com.aeroplanechess.model;

public class Player {

	String name;
	String sessionId;

	public Player() {
	}

	public Player(String name, String sessionId) {
		this.name = name;
		this.sessionId = sessionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", sessionId=" + sessionId + "]";
	}

}
