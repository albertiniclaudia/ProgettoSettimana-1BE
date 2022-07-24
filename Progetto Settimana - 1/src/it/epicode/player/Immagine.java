package it.epicode.player;

public class Immagine extends Astratta implements Luminosità{
	int luminosità;

	public Immagine(String player, int luminosità) {
		super(player);
		this.luminosità = luminosità;
	}
	
	
	@Override
	public void alzaLuminosità() {
		this.luminosità++;
		show();
	}
	@Override
	public void abbassaLuminosità() {
		this.luminosità--;
		show();
	}

	public void show() {
		String intensità = " ";
		for (int i=0; i<this.luminosità; i++) {
			intensità += "*";
		}
		System.out.println(getPlayer() + "Luminosità: " + intensità);
	}
	
	
}
