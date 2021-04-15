package ie.ait.codeRealAssessment2OOP2;

public enum Color {
	
	// This enumeration stores the color in hexadecimal and RGB
	// Information about hex and rgb-> https://www.rapidtables.com/web/color/RGB_Color.html
	 
	RED("#FF0000", "255, 0, 0"),
	BLACK("#000000", "0,0,0"),
	WHITE("#FFFFFF", "255, 255, 255"),
	YELLOW("#FFFF00","255,255,0"),
	GREY("#808080","(128,128,128)");
	
	String  hex, rgb;

	Color(String hex, String rgb) {
	   this.hex = hex;
	   this.rgb = rgb;
	}
	
	@Override
	public String toString() {
		return "HEX value: "+ hex + " RGB value: " + rgb;
	}

}
