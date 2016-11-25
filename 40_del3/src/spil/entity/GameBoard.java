package spil.entity;

import java.util.Arrays;
import java.util.Collections;

import desktop_codebehind.Car;
import desktop_fields.Street;
import spil.boundary.FieldBoundary;
import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.field.Field;
import spil.entity.field.Fleet;
import spil.entity.field.LaborCamp;
import spil.entity.field.Refugee;
import spil.entity.field.Tax;
import spil.entity.field.Territory;

public class GameBoard {

	/*
	 * Array that holds all the graphical fields. 
	 */
	private final desktop_fields.Field[] guiFields;
	/*
	 * Array that holds all the functional fields. 
	 */
	private final spil.entity.field.Field[] fields = {
			// Debug code do not delete.  
			new Refugee(0), new Refugee(0),
			
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

	/*
	 * Array that holds all the car figures. 
	 */
	private final Car[] playerCars = {
			new Car.Builder().patternHorizontalGradiant().typeRacecar().primaryColor(FieldBoundary.carColors[0][0])
					.secondaryColor(FieldBoundary.carColors[0][1]).build(),
			new Car.Builder().patternZebra().typeCar().primaryColor(FieldBoundary.carColors[1][0])
					.secondaryColor(FieldBoundary.carColors[1][1]).build(),
			new Car.Builder().patternDotted().typeTractor().primaryColor(FieldBoundary.carColors[2][0])
					.secondaryColor(FieldBoundary.carColors[2][1]).build(),
			new Car.Builder().patternHorizontalGradiant().typeTractor().primaryColor(FieldBoundary.carColors[3][0])
					.secondaryColor(FieldBoundary.carColors[3][1]).build(),
			new Car.Builder().patternZebra().typeRacecar().primaryColor(FieldBoundary.carColors[4][0])
					.secondaryColor(FieldBoundary.carColors[4][1]).build(),
			new Car.Builder().patternDotted().typeCar().primaryColor(FieldBoundary.carColors[5][0])
					.secondaryColor(FieldBoundary.carColors[5][1]).build(), };

	/*c
	 * GameBoard constructor that initializes the graphical fields.
	 */
	public GameBoard() {
		guiFields = new desktop_fields.Field[FieldBoundary.FIELD_COUNT];

		for (int i = 0; i < FieldBoundary.FIELD_COUNT; i++) {
			guiFields[i] = new Street.Builder().setBgColor(FieldBoundary.fieldColors[i][0])
					.setFgColor(FieldBoundary.fieldColors[i][1]).setTitle(TextBoundary.fieldText[i][0])
					.setSubText(TextBoundary.fieldText[i][1]).setDescription(TextBoundary.fieldText[i][2]).build();
		}
	}

	/*
	 * Method that shows all the graphical fields. 
	 */
	public void initFields() {
		GUIBoundary.initFields(guiFields);
	}

	/*
	 * Method that moves a player across the graphical fields.
	 */
	public void movePlayer(Player player, int amount) {
		int newPosition = player.getPosition() + amount;
		int numberOfFields = FieldBoundary.FIELD_COUNT;

		while (newPosition > numberOfFields) {
			newPosition -= numberOfFields;
		}
		player.setPosition(newPosition);
	}

	/*
	 *  landOnField method that puts a player on a field. 
	 */
	public void landOnField(Player player) {
		int pos = player.getPosition();
		if (pos > 1) {
			fields[pos].landOnField(player);
		} else {
			GUIBoundary.print(TextBoundary.homeMessage(player));
		}
	}

	/*
	 * Method that places a player on the GUI. 
	 */
	public void placePlayer(Player player) {
		GUIBoundary.placePlayerCar(player);
	}

	/*
	 * Method that returns a shuffled array of player car figures.  
	 */
	public Car[] getRandomUniqueCars() {
		Collections.shuffle(Arrays.asList(playerCars));
		return playerCars;
	}

	/*
	 * Deletes every field that the Player owns.
	 */
	public void deleteFieldOwners(Player player) {
		for (Field field : fields) {
			if (field.getOwner() != null)
				if (field.getOwner().equals(player))
					field.deleteOwner();
		}
	}

}