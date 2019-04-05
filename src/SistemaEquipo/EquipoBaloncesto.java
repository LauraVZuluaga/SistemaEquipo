package SistemaEquipo;

public class EquipoBaloncesto extends Equipo {
	public static final int maximo = 10;
	
	@Override
	public boolean adicionarJugador(Jugador jugador) {
		if (jugadores.size() < maximo) {
			return super.adicionarJugador(jugador);
		}
		else {
			return false;
		}
	}
}
