package ait.hdip.polymorphism;

public class MusicExample {

	public static void tune(Instrument i) {
		i.play();
	}
	
	public static void tuneAll(Instrument [] e) {
		for (int i=0; i<e.length;i++) {
			e[i].play();
		}
	}
	public static void main(String[] args) {
		
		Instrument[] orchestra = new Instrument[5];
		/**for(int i=0; i<orchestra.length;i++) {
			orchestra[i]= new Instrument();
		}*/
		orchestra[0]= new Wind();
		orchestra[1]= new Percussion();
		orchestra[2]= new Stringed();
		orchestra[3]= new Brass();
		orchestra[4]= new Woodwind();
		
		tuneAll(orchestra);
	}

}

 class Instrument {
	 
	 public void play(){
		 System.out.println("Instrument::play()");
	 }
	 public String what(){
		 return "Instrument::what()";
	 }
	 public void adjust() {
		 System.out.println("Instrument::adjust()");
	 }
 }
 
 class Stringed extends Instrument {
	 @Override
	public void play(){
		 System.out.println("Stringed::play()");
	 }
	 @Override
	public String what(){
		 return "Stringed::what()";
	 }
	 @Override
	public void adjust() {
		 System.out.println("Stringed::adjust()");
	 }
 }
 
 class Wind extends Instrument {
	 @Override
	public void play(){
		 System.out.println("Wind::play()");
	 }
	 @Override
	public String what(){
		 return "Wind::what()";
	 }
	 @Override
	public void adjust() {
		 System.out.println("Wind::adjust()");
	 }
 }
 
 class Percussion extends Instrument {
	 	
	 	@Override
		public void play(){
			 System.out.println("Percussion::play()");
		 }
		
		@Override
		public String what(){
			 return "Percussion::what()";
		 }
		@Override
		public void adjust() {
			 System.out.println("Percussion::adjust()");
		 }
 }
 
 class Woodwind extends Wind {
	 
	 	@Override
		public void play(){
			 System.out.println("Woodwind::play()");
		 }
		@Override
		public String what(){
			 return "Woodwind::what()";
		 }
	
}
 
 class Brass extends Wind {
	 
	 	@Override
		public void play(){
			 System.out.println("Brass::play()");
		 }
	 	
	 	@Override
		public void adjust(){
			System.out.println("Brass::adjust()");
		 }
	
}
 