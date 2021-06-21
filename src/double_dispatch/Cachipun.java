package double_dispatch;

public class Cachipun {
	
	private static Mano papel = new Papel();
	private static Mano tijeras = new Tijeras();
	private static Mano piedra = new Piedra();
	
	public static void main(String[] args) {
		
		Mano mano1 = papel;
		Mano mano2 = piedra;
		
		int result = mano1.jugarCon(mano2);
		
		System.out.println(mano1.toString() + " jugando contra " + mano2.toString() );
		System.out.println(result);
	}

}
