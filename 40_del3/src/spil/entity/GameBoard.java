package spil.entity;

import desktop_fields.Street;
import desktop_resources.GUI;
import spil.boundary.FieldBoundary;
import spil.boundary.TextBoundary;
import spil.entity.field.Fleet;
import spil.entity.field.LaborCamp;
import spil.entity.field.Refugee;
import spil.entity.field.Tax;
import spil.entity.field.Territory;

public class GameBoard {

	private final desktop_fields.Field[] guiFields = {
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[0][0]).setFgColor(FieldBoundary.fieldColors[0][1])
					.setTitle(TextBoundary.fieldText[0][0]).setSubText(TextBoundary.fieldText[0][1])
					.setDescription(TextBoundary.fieldText[0][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[1][0]).setFgColor(FieldBoundary.fieldColors[1][1])
					.setTitle(TextBoundary.fieldText[1][0]).setSubText(TextBoundary.fieldText[1][1])
					.setDescription(TextBoundary.fieldText[1][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[2][0]).setFgColor(FieldBoundary.fieldColors[2][1])
					.setTitle(TextBoundary.fieldText[2][0]).setSubText(TextBoundary.fieldText[2][1])
					.setDescription(TextBoundary.fieldText[2][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[3][0]).setFgColor(FieldBoundary.fieldColors[3][1])
					.setTitle(TextBoundary.fieldText[3][0]).setSubText(TextBoundary.fieldText[3][1])
					.setDescription(TextBoundary.fieldText[3][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[4][0]).setFgColor(FieldBoundary.fieldColors[4][1])
					.setTitle(TextBoundary.fieldText[4][0]).setSubText(TextBoundary.fieldText[4][1])
					.setDescription(TextBoundary.fieldText[4][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[5][0]).setFgColor(FieldBoundary.fieldColors[5][1])
					.setTitle(TextBoundary.fieldText[5][0]).setSubText(TextBoundary.fieldText[5][1])
					.setDescription(TextBoundary.fieldText[5][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[6][0]).setFgColor(FieldBoundary.fieldColors[6][1])
					.setTitle(TextBoundary.fieldText[6][0]).setSubText(TextBoundary.fieldText[6][1])
					.setDescription(TextBoundary.fieldText[6][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[7][0]).setFgColor(FieldBoundary.fieldColors[7][1])
					.setTitle(TextBoundary.fieldText[7][0]).setSubText(TextBoundary.fieldText[7][1])
					.setDescription(TextBoundary.fieldText[7][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[8][0]).setFgColor(FieldBoundary.fieldColors[8][1])
					.setTitle(TextBoundary.fieldText[8][0]).setSubText(TextBoundary.fieldText[8][1])
					.setDescription(TextBoundary.fieldText[8][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[9][0]).setFgColor(FieldBoundary.fieldColors[9][1])
					.setTitle(TextBoundary.fieldText[9][0]).setSubText(TextBoundary.fieldText[9][1])
					.setDescription(TextBoundary.fieldText[9][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[10][0])
					.setFgColor(FieldBoundary.fieldColors[10][1]).setTitle(TextBoundary.fieldText[10][0])
					.setSubText(TextBoundary.fieldText[10][1]).setDescription(TextBoundary.fieldText[10][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[11][0])
					.setFgColor(FieldBoundary.fieldColors[11][1]).setTitle(TextBoundary.fieldText[11][0])
					.setSubText(TextBoundary.fieldText[11][1]).setDescription(TextBoundary.fieldText[11][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[12][0])
					.setFgColor(FieldBoundary.fieldColors[12][1]).setTitle(TextBoundary.fieldText[12][0])
					.setSubText(TextBoundary.fieldText[12][1]).setDescription(TextBoundary.fieldText[12][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[13][0])
					.setFgColor(FieldBoundary.fieldColors[13][1]).setTitle(TextBoundary.fieldText[13][0])
					.setSubText(TextBoundary.fieldText[13][1]).setDescription(TextBoundary.fieldText[13][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[14][0])
					.setFgColor(FieldBoundary.fieldColors[14][1]).setTitle(TextBoundary.fieldText[14][0])
					.setSubText(TextBoundary.fieldText[14][1]).setDescription(TextBoundary.fieldText[14][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[15][0])
					.setFgColor(FieldBoundary.fieldColors[15][1]).setTitle(TextBoundary.fieldText[15][0])
					.setSubText(TextBoundary.fieldText[15][1]).setDescription(TextBoundary.fieldText[15][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[16][0])
					.setFgColor(FieldBoundary.fieldColors[16][1]).setTitle(TextBoundary.fieldText[16][0])
					.setSubText(TextBoundary.fieldText[16][1]).setDescription(TextBoundary.fieldText[16][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[17][0])
					.setFgColor(FieldBoundary.fieldColors[17][1]).setTitle(TextBoundary.fieldText[17][0])
					.setSubText(TextBoundary.fieldText[17][1]).setDescription(TextBoundary.fieldText[17][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[18][0])
					.setFgColor(FieldBoundary.fieldColors[18][1]).setTitle(TextBoundary.fieldText[18][0])
					.setSubText(TextBoundary.fieldText[18][1]).setDescription(TextBoundary.fieldText[18][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[19][0])
					.setFgColor(FieldBoundary.fieldColors[19][1]).setTitle(TextBoundary.fieldText[19][0])
					.setSubText(TextBoundary.fieldText[19][1]).setDescription(TextBoundary.fieldText[19][2]).build(),
			new Street.Builder().setBgColor(FieldBoundary.fieldColors[20][0])
					.setFgColor(FieldBoundary.fieldColors[20][1]).setTitle(TextBoundary.fieldText[20][0])
					.setSubText(TextBoundary.fieldText[20][1]).setDescription(TextBoundary.fieldText[20][2]).build(), };

	private final spil.entity.field.Field[][] fields = { { new Territory(1000, 100), new Territory(1500, 300),
			new Territory(2000, 500), new Territory(3000, 700), new Territory(4000, 1000), new Territory(4300, 1300),
			new Territory(4750, 1600), new Territory(5000, 2000), new Territory(5500, 2600), new Territory(6000, 3200),
			new Territory(8000, 4000), new Refugee(5000), new Refugee(500), new LaborCamp(00), new LaborCamp(00),
			new Tax(2000), new Tax(4000), new Fleet(00), new Fleet(00), new Fleet(00), new Fleet(00) } };

	public GameBoard() {
		// test
		GUI.create(guiFields);
		GUI.showMessage("HEJ");
	}

}