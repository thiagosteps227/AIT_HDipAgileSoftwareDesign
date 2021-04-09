package ait.hdip.codeassessment2oop2;

import java.util.Scanner;

public class CodeAssessment2P {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ENUMS = 1, ANIMALS = 2, STRINGBUILDER = 3, EXIT = 99;
		String userContinue = "y";
		
		while (userContinue.equalsIgnoreCase("y")) {
            switch (userChoice()) {
                case ENUMS:
                    enums();
                    break;
                case ANIMALS:
                    petCare();
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
        // Create 2 computer enumerations and call the method reviewPC
		//INSERT CODE HERE	
		Computer hp = Computer.HP;
		Computer dell = Computer.DELL;
              

        // Print each computer object
		//INSERT CODE HERE	
		reviewPC(hp);
		//System.out.println(dell);
        
    }
	// The reviewPC method just prints the enumeration
	public static void reviewPC(Computer c) {
		//INSERT CODE HERE	
		System.out.println(c.toString());
	}
	
	
	// 2 - Pet Care
	public static void petCare() {
		// 1 - Create an animal object, call sound method and print the object
		Animals animal = new Animals();
		animal.sound();
		System.out.println(animal);
		// 2 - Create a dog object, call sound method and print the object
		Dog dog = new Dog();
		dog.sound();
		System.out.println(dog);
		// 3 - Create a cat object, call sound method and print the object
		Cat cat = new Cat();
		cat.sound();
		System.out.println(cat);
		// 4 - Create a Bulldog object,call sound method and print the object
		Bulldog bulldog = new Bulldog();
		bulldog.sound();
		System.out.println(bulldog);
		// 5 - Create a Poodle object,call sound method and print the object
		Poodle poodle = new Poodle();
		poodle.sound();
		System.out.println(poodle);
		// 6 - Cast a Animals object into a Bulldog object and call the sound method and print the object
		Animals a = new Animals();
		Bulldog b = (Bulldog) a;
		b.sound();
		System.out.println(b);
		
		
		//INSERT CODE HERE	
		
	}
	
	public static void stringBuilder() {
        StringBuilder sb = new StringBuilder();

        // 1 - Given the following subjects, insert the name of your lecturers
        // 2 - Fix the typo in the word "Testyng" to Testing
        // 3 - Print the StringBuilder
        
        //Timetable Lecturer and Subject
        sb.append("Object Oriented Programming 2\n");
        sb.append("Web Technologies\n");
        sb.append("Team Project\n");
        sb.append("Agile Design and Testyng 2\n");
        
        //Lecturers
        for(int i=0; i<sb.length();i++) {
        	if(sb.charAt(i) == '\n' && sb.charAt(i-1) == 2) {
        		sb.insert(i, ": Thiago");
        	} else if (sb.charAt(i) == '\n' && sb.charAt(i-1) == 's')  {
        		sb.insert(i, ": Mary");
        	} else if (sb.charAt(i) == '\n' && sb.charAt(i-1) == 't')  {
        		sb.insert(i, ": Martina");
        	} else if (sb.charAt(i) == '\n' && sb.charAt(i-3) == 'g')  {
        		sb.insert(i, ": Thiago");
        	}
        }
        System.out.println(sb);
        
        // Fix typo
        for(int i=0; i<sb.length();i++) {
        	if(sb.charAt(i) == 'y' && sb.charAt(i-1) == 't') {
        		sb.replace(i,i+1, "i");
        	}
        }
        System.out.println(sb);	
	}
	
	
	
	public static int userChoice() {
		System.out.println("What do you want to do ?");
        System.out.println("1. Enumerations");
        System.out.println("2. Inheritance - Animals");
        System.out.println("3. String Builder");
        System.out.println("4. File I/O");
        System.out.println("99. Exit");
        System.out.print("Enter choice --> ");
        return sc.nextInt();
    }

}
