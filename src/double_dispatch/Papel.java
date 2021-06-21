package double_dispatch;

public class Papel implements Mano {

	@Override
	public int jugarCon(Mano otraMano) {
		return otraMano.jugarConPapel(this);
	}

	@Override
	public int jugarConPiedra(Piedra piedra) {
		return -1;
	}

	@Override
	public int jugarConPapel(Papel papel) {
		return 0;
	}

	@Override
	public int jugarConTijeras(Tijeras tijeras) {
		return 1;
	}
	
	@Override
	public String toString() {
		return "Papel";
	}

}
