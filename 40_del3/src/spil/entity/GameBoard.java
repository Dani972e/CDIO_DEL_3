package spil.entity;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_fields.Street;
import spil.boundary.FieldBoundary;
import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.field.Fleet;
import spil.entity.field.LaborCamp;
import spil.entity.field.Refugee;
import spil.entity.field.Tax;
import spil.entity.field.Territory;

public class GameBoard {

	private final desktop_fields.Field[] guiFields;

	private final spil.entity.field.Field[] fields = {
			// DO THIS IN A FOR LOOP FOR EFFICIENY!!!!!!!!!!!!!!!!
			new Territory(FieldBoundary.territoryPrices[0], FieldBoundary.territoryRents[0]),
			new Territory(FieldBoundary.territoryPrices[1], FieldBoundary.territoryRents[1]),
			new Territory(FieldBoundary.territoryPrices[2], FieldBoundary.territoryRents[2]),
			new Territory(FieldBoundary.territoryPrices[3], FieldBoundary.territoryRents[3]),
			new Territory(FieldBoundary.territoryPrices[4], FieldBoundary.territoryRents[4]),
			new Territory(FieldBoundary.territoryPrices[5], FieldBoundary.territoryRents[5]),
			new Territory(FieldBoundary.territoryPrices[6], FieldBoundary.territoryRents[6]),
			new Territory(FieldBoundary.territoryPrices[7], FieldBoundary.territoryRents[7]),
			new Territory(FieldBoundary.territoryPrices[8], FieldBoundary.territoryRents[8]),
			new Territory(FieldBoundary.territoryPrices[9], FieldBoundary.territoryRents[9]),
			new Territory(FieldBoundary.territoryPrices[10], FieldBoundary.territoryRents[10]),
			new Refugee(FieldBoundary.refugeeReceive[0]), new Refugee(FieldBoundary.refugeeReceive[1]),
			new LaborCamp(FieldBoundary.laborCampPrices[0]), new LaborCamp(FieldBoundary.laborCampPrices[1]),
			new Tax(FieldBoundary.taxRents[0]), new Tax(FieldBoundary.taxRents[1]),
			new Fleet(FieldBoundary.fleetPrices[0]), new Fleet(FieldBoundary.fleetPrices[1]),
			new Fleet(FieldBoundary.fleetPrices[2]), new Fleet(FieldBoundary.fleetPrices[3]) };

	private final Car[] playerCars = {
			new Car.Builder().patternHorizontalGradiant().typeRacecar().primaryColor(new Color(0x000000))
					.secondaryColor(new Color(0xFF0010)).build(),
			new Car.Builder().patternZebra().typeRacecar().primaryColor(new Color(0x0400FF))
					.secondaryColor(new Color(0xFF00E1)).build(),
			new Car.Builder().patternHorizontalGradiant().typeUfo().primaryColor(new Color(0xAF4342))
					.secondaryColor(new Color(0xFF0910)).build(),
			new Car.Builder().patternZebra().typeUfo().primaryColor(new Color(0xFA4039))
					.secondaryColor(new Color(0xF023E1)).build(),
			new Car.Builder().patternHorizontalDualColor().typeTractor().primaryColor(new Color(0xABC423))
					.secondaryColor(new Color(0xAB0FA0)).build(),
			new Car.Builder().patternZebra().typeTractor().primaryColor(new Color(0xABC423))
					.secondaryColor(new Color(0xAB0FA0)).build() };

	private final boolean[] carTaken = { false, false, false, false, false, false };

	public GameBoard() {
		guiFields = new desktop_fields.Field[FieldBoundary.FIELD_COUNT];

		for (int i = 0; i < FieldBoundary.FIELD_COUNT; i++) {
			guiFields[i] = new Street.Builder().setBgColor(FieldBoundary.fieldColors[i][0])
					.setFgColor(FieldBoundary.fieldColors[i][1]).setTitle(TextBoundary.fieldText[i][0])
					.setSubText(TextBoundary.fieldText[i][1]).setDescription(TextBoundary.fieldText[i][2]).build();
		}
	}

	public void initFields() {
		GUIBoundary.initFields(guiFields);
	}

	public void landOnField(Player player) {
		fields[player.getPosition() - 2].landOnField(player);
		GUIBoundary.updatePlayer(player);
	}

	public void placePlayer(Player player) {
		GUIBoundary.placePlayerCar(player);
	}

	public Car getRandomCar() {
		int index = (int) ((Math.random() * playerCars.length));
		if (!carTaken[index]) {
			carTaken[index] = true;
			return playerCars[index];
		}
		return getRandomCar();
	}

}