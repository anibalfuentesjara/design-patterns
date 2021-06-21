package double_dispatch;

public interface Mano {
	
	public int jugarCon(Mano otraMano);
	public int jugarConPiedra(Piedra piedra);
	public int jugarConPapel(Papel papel);
	public int jugarConTijeras(Tijeras tijeras);

}