
public class B5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		int w = 0;
		int z = 0;
		
		x = 4;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);
		
		w = 20;
		x = 10;
		y= -5;
		z = 0;
		
		System.out.println(w == x && y != z);
		System.out.println(w == x || y != z);
		System.out.println(!(w == (x+z)));
		
	}

}
