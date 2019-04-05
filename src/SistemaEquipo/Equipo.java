package SistemaEquipo;

import java.util.List;

public abstract class Equipo {
	private Jugador entrenador;
	protected List<Jugador> jugadores;
	
	public boolean adicionarJugador(Jugador jugador) {
		return jugadores.add(jugador);
	}
}
