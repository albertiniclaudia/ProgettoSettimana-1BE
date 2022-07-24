package it.epicode.player;

public class Video extends Astratta implements Volume,Luminosità{
	int durata;
	int volume;
	int luminosità;
	
	public Video(String player, int durata, int volume, int luminosità) {
		super(player);
		this.durata = durata;
		this.volume = volume;
		this.luminosità = luminosità;
	}

	@Override
	public void alzaLuminosità() {
		this.luminosità++;
	}
	@Override
	public void abbassaLuminosità() {
		this.luminosità--;
	}

	@Override
	public void alzaVolume() {
		this.volume++;
	}
	@Override
	public void abbassaVolume() {
		this.volume--;
	}
	
	public void play() {
		String astVol= " ";
		String rigDur= " ";
		String apiIntensità = " ";
		
		for(int i=0; i < this.volume; i++) {
			astVol += "*";
		}
		for(int i=0; i < this.durata; i++) {
			rigDur += "/";
		}
		for (int i=0; i<this.luminosità; i++) {
			apiIntensità += "'";
		}
		
		System.out.println(getPlayer() + "Volume: " + astVol + " " + "Durata: " + rigDur + " " + "Luminosità: " + apiIntensità);
	}
	
}
