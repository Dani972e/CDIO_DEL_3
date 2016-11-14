package spil.entity.field;

import desktop_resources.GUI;
import spil.entity.Player;

public final class Territory extends Ownable {

	private int rent;

	public Territory(int price, int rent) {
		super(price);
		this.rent = rent;
	}

	@Override
	public void landOnField(Player player) {
		if (owner == null) {
			String svar = GUI.getUserButtonPressed("Vil du købe feltet?", "Ja", "Nej");
			if (svar.equals("Ja")) {
				owner = player;
			}
		} else {
			GUI.showMessage("Feltet er allerede købt. Derfor skal du betale en rente til ejeren " + owner.getName());
			owner.addCoins(rent);
			player.addCoins(-rent);
		}
	}

	@Override
	public int getRent() {
		return rent;
	}

}