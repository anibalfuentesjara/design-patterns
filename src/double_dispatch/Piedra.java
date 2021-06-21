package double_dispatch;

public class Piedra implements Mano {

	@Override
	public int jugarCon(Mano otraMano) {
		return otraMano.jugarConPiedra(this);
	}

	@Override
	public int jugarConPiedra(Piedra piedra) {
		return 0;
	}

	@Override
	public int jugarConPapel(Papel papel) {
		return 1;
	}

	@Override
	public int jugarConTijeras(Tijeras tijeras) {
		return -1;
	}
	
	@Override
	public String toString() {
		return "Piedra";
	}

}
