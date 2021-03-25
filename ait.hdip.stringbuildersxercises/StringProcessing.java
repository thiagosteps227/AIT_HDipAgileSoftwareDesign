package ait.hdip.stringprocessing;

public class StringProcessing {

	public static void main(String[] args) {
		
		//hamlet();
		//ifPoem();
		//compareStrings();
		//usingString();
		//usingSB();
		interning();

	}
	
	public static void hamlet() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("To be, or not to be--that is the question:\n");
		sb.append("Whether 'tis nobler in the mind to suffer \n");
		sb.append("The slings and arrows of outrageous fortune \n");
		sb.append("Or to take arms against a sea of troubles \n");
		sb.append("And by opposing end them. To die, to sleep--\n");
		sb.append("No more--and by a sleep to say we end \n");
		sb.append("The heartache, and the thousand natural shocks \n");
		sb.append("That flesh is air to.");
		//System.out.println(sb);
		
		//replacing . for !
		sb.replace(sb.length()-1, sb.length(), "!");
		//System.out.println(sb);
		
		//replacing mispelled air for heir
		int index=0;
		for(int i=0; i<sb.length();i++) {
			if(sb.charAt(i) == 'a' && sb.charAt(i+2) == 'r') {
				index = i;
			}
		}
		sb.replace(index, index + 3, "heir");
		//System.out.println(sb);
		
		//extract the third line
		int tIndex=0;
		int lastIndex = 0;
		int spaceCounter=0;
		for(int i=0; i<sb.length();i++) {
			if(sb.charAt(i) == '\n') {
				spaceCounter += 1;
				if(spaceCounter == 2) {
					tIndex = i+1;
				} else if(spaceCounter == 3) {
					lastIndex = i - 1;
				}
			}
		}
		sb.delete(tIndex, lastIndex);
		//System.out.println(sb);
		
	}
	
	public static void ifPoem() {
		
		StringBuilder sb = new StringBuilder();

        sb.append("If you can keep your head when all about you \n");
        sb.append("Are losing theirs and blaming it on you;\n");
        sb.append("If you can trust yourself when all men doubt you,\n");
        sb.append("But make allowance for their doubting too;\n");
        sb.append("If you can wait and not be tired by waiting,\n");
        sb.append("Or, being lied about, don't deal in lies,\n");
        sb.append("Or, being hated, don't give way to hating,\n");
        sb.append("And yet don't look too good, nor talk too wise;\n");
        
        //inserting 1 first line
        sb.insert(0,"1 ");
        //System.out.println(sb);
        
        //inserting all numbers in lines
        int index=0;
        int lineNumber = 2;
        for(int i=0; i<sb.length();i++) {
        	if(sb.charAt(i) == '\n') {
        		index = i + 1;
        		sb.insert(index, lineNumber + " ");
        		lineNumber += 1;
        	} else if (lineNumber == 9) {
        		break;
        	}
        }
        //System.out.println(sb);
        
        //output the 10th character
        //System.out.println(sb.charAt(10));
        
        //repleace trust with TRUST
        for(int i=0;i<sb.length();i++) {
        	if(sb.charAt(i) == 't' && sb.charAt(i+1) == 'r') {
        		index = i;
        	}
        }
        sb.replace(index, index + 5, "TRUST");
        //System.out.println(sb);
        
        //replace don't for do not
        for(int i=0;i<sb.length();i++) {
        	if(sb.charAt(i) == 'd' && sb.charAt(i+2) == 'n') {
        		index = i;
        		sb.replace(index, index + 5, "do not");
        	}
        }
       
        System.out.println(sb);
	}
	
	public static void compareStrings() {
		
		String name = "alan";
		String literal = "sean";
		System.out.println(literal.compareTo(name));
		
		String n = "jack";
		String l = "paul";
		System.out.println(n.compareTo(l));
		
		String tom = "tom";
		String tim = "tim";
		System.out.println(tom.compareTo(tim));
		
	}
	
	public static void usingString() {
		
		String buffer = "The numbers are: ";
		for(int i=0;i<=5;i++) {
			
			String counter = String.valueOf(i);
			buffer = buffer.concat(counter);
			
		}
		
		System.out.println(buffer);
	}
	
	public static void usingSB() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("The numbers are: ");
		for(int i=0;i<=5;i++) {

			String counter = String.valueOf(i);
			buffer = buffer.append(counter);

		}
		System.out.println(buffer);
	}
	
	public static void interning() {
		String a = "abc";
		String b = "abc";
		
		System.out.println(a == b);
		
		String e = new String("abc");
		String f = new String("abc");
		
		System.out.println(e == f);
	}

}
