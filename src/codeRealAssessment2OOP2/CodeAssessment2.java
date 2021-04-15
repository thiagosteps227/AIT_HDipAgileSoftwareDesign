package ie.ait.codeRealAssessment2OOP2;

import java.util.Scanner;

public class CodeAssessment2 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ENUMS = 1, MUSIC = 2, STRINGBUILDER = 3, EXIT = 99;
		String userContinue = "y";

		while (userContinue.equalsIgnoreCase("y")) {
			switch (userChoice()) {
			case ENUMS:
				enums();
				break;
			case MUSIC:
				instruments();
				break;
			case STRINGBUILDER:
				stringBuilder();
				break;
			case EXIT:
				System.out.println("Exiting...");
				userContinue = "n";
				break;
			default:
				System.out.println("Unknown entry : ");
				break;
			}
		}

	}

	// 1 Enumerations
	public static void enums() {
		// Create 3 Color enumerations and call the method toString to output the corresponding hex and rgb of each color
		// (e.g Hex value: #FFFFFF RGB value: 255,255,255 )
		Color red = Color.RED;
		Color black = Color.BLACK;
		Color grey = Color.GREY;
		
		System.out.println(red);
		System.out.println(black);
		System.out.println(grey);

	}


	public static void instruments() {	
		
		// 1 - Create a Flutes object, a Trumpets object, and a Violins object and invoke the play() method
		Flutes f = new Flutes();
		Trumpets t = new Trumpets();
		Violins v = new Violins();
		f.play();
		t.play();
		v.play();
		
		// 2 - Create an array of Instruments called orchestra.
		Instruments [] orchestra = new Instruments[3];
		
		// 3 - Insert a Woodwind, Brass, and String object into the array
		orchestra[0] = new Woodwinds();
		orchestra[1] = new Brass();
		orchestra[2] = new Strings();
		
		// 4 - Invoke he tuneAll() method and check output
		 tuneAll(orchestra);

		
	}
	
	public static void tune(Instruments i){
		System.out.print("This is the " + i.what() + " section and it needs adjustment --> ");
		i.adjust();		
	}
	
	public static void tuneAll(Instruments[] e){

		for(int i=0; i<e.length;i++) {
			tune(e[i]);
		}
	}

	public static void stringBuilder() {
		StringBuilder sb = new StringBuilder();

		// 1 - Given the following ITs, insert the title "Institutes of Technology in Ireland" at the first line
		// 2 - Insert each IT Abbreviation (e.g. AIT: Athlone Institute of Technology)
		// 2 - Fix the two typos at the words "Tecnology" to Technology and "Insttute" to Institute
		// 3 - Print the final StringBuilder	

		//ITS
		sb.append("Athlone Institute of Tecnology\n");
		sb.append("Cork Institute of Technology\n");
		sb.append("Letterkenny Institute of Technology\n");
		sb.append("Waterford Insttute of Technology\n");
		
		sb.insert(sb.indexOf("Athlone Institute of Tecnology\n"), "Institutes of Technology in Ireland:\n" );
		sb.insert(sb.indexOf("Athlone Institute of Tecnology\n"), "AIT: " );
		sb.insert(sb.indexOf("Cork Institute of Technology\n"), "CIT: " );
		sb.insert(sb.indexOf("Letterkenny Institute of Technology\n"), "LIT: " );
		sb.insert(sb.indexOf("Waterford Insttute of Technology\n"), "WIT: " );
		sb.replace(sb.indexOf("Tecnology"), sb.indexOf("Tecnology") + "Tecnology".length(), "Technology");
		sb.replace(sb.indexOf("Insttute"), sb.indexOf("Insttute") + "Insttute".length(), "Institute");
		System.out.println(sb);
	}



	public static int userChoice() {
		System.out.println("What do you want to do ?");
		System.out.println("1. Enumerations");
		System.out.println("2. Inheritance - Music");
		System.out.println("3. String Builder");		
		System.out.println("99. Exit");
		System.out.print("Enter choice --> ");
		return sc.nextInt();
	}

}
