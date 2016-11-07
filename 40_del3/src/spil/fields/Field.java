package spil.fields;

import java.awt.Color;

import spil.models.Player;

public abstract class Field {

	protected Color bgColor;
	protected Color fgColor;
	protected String title;
	protected String subText;
	protected String desc;

	protected Field(Color bgColor, Color fgColor, String title, String subText, String desc) {
		this.bgColor = bgColor;
		this.fgColor = fgColor;
		this.title = title;
		this.subText = subText;
		this.desc = desc;
	}

	public abstract void landOnField(Player player);

	public Color getBgColor() {
		return bgColor;
	}

	public Color getFgColor() {
		return fgColor;
	}

	public String getTitle() {
		return title;
	}

	public String getSubText() {
		return subText;
	}

	public String getDesc() {
		return desc;
	}

}