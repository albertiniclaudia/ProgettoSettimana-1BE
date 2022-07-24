package it.epicode.player;

public abstract class Astratta {
	String player;

	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	
	public Astratta (String player) {
		this.player = player;
	}
}


