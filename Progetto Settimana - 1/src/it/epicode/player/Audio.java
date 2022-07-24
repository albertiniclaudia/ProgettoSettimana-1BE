package it.epicode.player;

public class Audio extends Astratta implements Volume{
	private int durata;
	private int volume;

	public Audio(int durata, int volume, String player) {
		super(player);
		this.durata = durata;
		this.volume = volume;
	}

	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

//Metodi per regolare il volume
	@Override
	public void alzaVolume() {
		this.volume++;
	}
	@Override
	public void abbassaVolume() {
		this.volume--;
	}
	
//Metodo per stampare gli asterischi del volume
	public void play() {
		String astVol= "";
		String rigDur= "";
		for(int i=0; i < this.volume; i++) {
			astVol += "*";
		}
		
		for(int i=0; i < this.durata; i++) {
			rigDur += "/";
		}
		System.out.println(getPlayer() + "Volume: " + astVol + " " + "Durata: " + rigDur);
	}
//
}