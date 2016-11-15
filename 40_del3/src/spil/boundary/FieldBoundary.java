package spil.boundary;

import java.awt.Color;

public class FieldBoundary {

	private FieldBoundary() {

	}

	public static final Color[][] fieldColors = { { Color.DARK_GRAY, Color.WHITE }, { Color.DARK_GRAY, Color.WHITE },
			{ Color.DARK_GRAY, Color.WHITE }, { Color.DARK_GRAY, Color.WHITE }, { Color.DARK_GRAY, Color.WHITE },
			{ Color.DARK_GRAY, Color.WHITE }, { Color.DARK_GRAY, Color.WHITE }, { Color.DARK_GRAY, Color.WHITE },
			{ Color.DARK_GRAY, Color.WHITE }, { Color.DARK_GRAY, Color.WHITE }, { Color.DARK_GRAY, Color.WHITE },
			{ Color.YELLOW, Color.BLACK }, { Color.YELLOW, Color.BLACK }, { Color.RED, Color.WHITE },
			{ Color.RED, Color.WHITE }, { Color.BLUE, Color.WHITE }, { Color.BLUE, Color.WHITE },
			{ Color.CYAN, Color.BLACK }, { Color.CYAN, Color.BLACK }, { Color.CYAN, Color.BLACK },
			{ Color.CYAN, Color.BLACK }, };

	public static final int[] territoryPrices = { 1000, 1500, 2000, 3000, 4000, 4300, 4750, 5000, 5500, 6000, 8000 };

	public static final int[] territoryRents = { 100, 300, 500, 700, 1000, 1300, 1600, 2000, 2600, 3200, 4000 };

	public static final int[] fleetPrices = { 4000, 4000, 4000, 4000 };

	public static final int[] fleetRents = { 500, 1000, 2000, 4000 };

	public static final int[] refugeeReceive = { 5000, 500 };

	public static final int[] laborCampPrices = { 2500, 2500 };

	public static final int[] taxRents = { 2000, 4000 };
}