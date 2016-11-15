package spil.entity;

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

	private final desktop_fields.Field[] guiFields = {
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[0][0]).setFgColor(FieldBoundary.fieldColors[0][1])
					.setTitle(TextBoundary.fieldText[0][0]).setSubText(TextBoundary.fieldText[0][1]).setDescription(TextBoundary.fieldText[0][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[1][0]).setFgColor(FieldBoundary.fieldColors[1][1])
					.setTitle(TextBoundary.fieldText[1][0]).setSubText(TextBoundary.fieldText[1][1]).setDescription(TextBoundary.fieldText[1][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[2][0]).setFgColor(FieldBoundary.fieldColors[2][1])
					.setTitle(TextBoundary.fieldText[2][0]).setSubText(TextBoundary.fieldText[2][1]).setDescription(TextBoundary.fieldText[2][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[3][0]).setFgColor(FieldBoundary.fieldColors[3][1])
					.setTitle(TextBoundary.fieldText[3][0]).setSubText(TextBoundary.fieldText[3][1]).setDescription(TextBoundary.fieldText[3][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[4][0]).setFgColor(FieldBoundary.fieldColors[4][1])
					.setTitle(TextBoundary.fieldText[4][0]).setSubText(TextBoundary.fieldText[4][1]).setDescription(TextBoundary.fieldText[4][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[5][0]).setFgColor(FieldBoundary.fieldColors[5][1])
					.setTitle(TextBoundary.fieldText[5][0]).setSubText(TextBoundary.fieldText[5][1]).setDescription(TextBoundary.fieldText[5][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[6][0]).setFgColor(FieldBoundary.fieldColors[6][1])
					.setTitle(TextBoundary.fieldText[6][0]).setSubText(TextBoundary.fieldText[6][1]).setDescription(TextBoundary.fieldText[6][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[7][0]).setFgColor(FieldBoundary.fieldColors[7][1])
					.setTitle(TextBoundary.fieldText[7][0]).setSubText(TextBoundary.fieldText[7][1]).setDescription(TextBoundary.fieldText[7][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[8][0]).setFgColor(FieldBoundary.fieldColors[8][1])
					.setTitle(TextBoundary.fieldText[8][0]).setSubText(TextBoundary.fieldText[8][1]).setDescription(TextBoundary.fieldText[8][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[9][0]).setFgColor(FieldBoundary.fieldColors[9][1])
					.setTitle(TextBoundary.fieldText[9][0]).setSubText(TextBoundary.fieldText[9][1]).setDescription(TextBoundary.fieldText[9][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[10][0]).setFgColor(FieldBoundary.fieldColors[10][1])
					.setTitle(TextBoundary.fieldText[10][0]).setSubText(TextBoundary.fieldText[10][1]).setDescription(TextBoundary.fieldText[10][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[11][0]).setFgColor(FieldBoundary.fieldColors[11][1])
					.setTitle(TextBoundary.fieldText[11][0]).setSubText(TextBoundary.fieldText[11][1]).setDescription(TextBoundary.fieldText[11][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[12][0]).setFgColor(FieldBoundary.fieldColors[12][1])
					.setTitle(TextBoundary.fieldText[12][0]).setSubText(TextBoundary.fieldText[12][1]).setDescription(TextBoundary.fieldText[12][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[13][0]).setFgColor(FieldBoundary.fieldColors[13][1])
					.setTitle(TextBoundary.fieldText[13][0]).setSubText(TextBoundary.fieldText[13][1]).setDescription(TextBoundary.fieldText[13][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[14][0]).setFgColor(FieldBoundary.fieldColors[14][1])
					.setTitle(TextBoundary.fieldText[14][0]).setSubText(TextBoundary.fieldText[14][1]).setDescription(TextBoundary.fieldText[14][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[15][0]).setFgColor(FieldBoundary.fieldColors[15][1])
					.setTitle(TextBoundary.fieldText[15][0]).setSubText(TextBoundary.fieldText[15][1]).setDescription(TextBoundary.fieldText[15][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[16][0]).setFgColor(FieldBoundary.fieldColors[16][1])
					.setTitle(TextBoundary.fieldText[16][0]).setSubText(TextBoundary.fieldText[16][1]).setDescription(TextBoundary.fieldText[16][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[17][0]).setFgColor(FieldBoundary.fieldColors[17][1])
					.setTitle(TextBoundary.fieldText[17][0]).setSubText(TextBoundary.fieldText[17][1]).setDescription(TextBoundary.fieldText[17][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[18][0]).setFgColor(FieldBoundary.fieldColors[18][1])
					.setTitle(TextBoundary.fieldText[18][0]).setSubText(TextBoundary.fieldText[18][1]).setDescription(TextBoundary.fieldText[18][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[19][0]).setFgColor(FieldBoundary.fieldColors[19][1])
					.setTitle(TextBoundary.fieldText[19][0]).setSubText(TextBoundary.fieldText[19][1]).setDescription(TextBoundary.fieldText[19][2])
					.build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[20][0]).setFgColor(FieldBoundary.fieldColors[20][1])
					.setTitle(TextBoundary.fieldText[20][0]).setSubText(TextBoundary.fieldText[20][1]).setDescription(TextBoundary.fieldText[20][2])
					.build(), };

	private final spil.entity.field.Field[] fields = { new Territory(FieldBoundary.territoryPrices[0], FieldBoundary.territoryRents[0]),
			new Territory(FieldBoundary.territoryPrices[1], FieldBoundary.territoryRents[1]),
			new Territory(FieldBoundary.territoryPrices[2], FieldBoundary.territoryRents[2]),
			new Territory(FieldBoundary.territoryPrices[3], FieldBoundary.territoryRents[3]),
			new Territory(FieldBoundary.territoryPrices[4], FieldBoundary.territoryRents[4]),
			new Territory(FieldBoundary.territoryPrices[5], FieldBoundary.territoryRents[5]),
			new Territory(FieldBoundary.territoryPrices[6], FieldBoundary.territoryRents[6]),
			new Territory(FieldBoundary.territoryPrices[7], FieldBoundary.territoryRents[7]),
			new Territory(FieldBoundary.territoryPrices[8], FieldBoundary.territoryRents[8]),
			new Territory(FieldBoundary.territoryPrices[9], FieldBoundary.territoryRents[9]),
			new Territory(FieldBoundary.territoryPrices[10], FieldBoundary.territoryRents[10]), new Refugee(FieldBoundary.refugeeReceive[0]),
			new Refugee(FieldBoundary.refugeeReceive[1]), new LaborCamp(FieldBoundary.laborCampPrices[0]),
			new LaborCamp(FieldBoundary.laborCampPrices[1]), new Tax(FieldBoundary.taxRents[0]), new Tax(FieldBoundary.taxRents[1]),
			new Fleet(FieldBoundary.fleetPrices[0]), new Fleet(FieldBoundary.fleetPrices[1]), new Fleet(FieldBoundary.fleetPrices[2]),
			new Fleet(FieldBoundary.fleetPrices[3]) };

	public GameBoard() {

	}

	public void initFields() {
		GUIBoundary.initFields(guiFields);
	}

}