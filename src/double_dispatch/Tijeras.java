package double_dispatch;

public class Tijeras implements Mano {

	@Override
	public int jugarCon(Mano otraMano) {
		return otraMano.jugarConTijeras(this);
	}

	@Override
	public int jugarConPiedra(Piedra piedra) {
		return 1;
	}

	@Override
	public int jugarConPapel(Papel papel) {
		return -1;
	}

	@Override
	public int jugarConTijeras(Tijeras tijeras) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Tijeras";
	}

}
