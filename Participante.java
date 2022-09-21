package quiz4;

public class Participante implements Comparable<Participante>{
	int juegos;
	int puntos;
	String nombre;
	
	public Participante(int juegos, int puntos, String nombre) {
		this.juegos=juegos;
		this.puntos=puntos;
		this.nombre=nombre;
	}
	@Override
	public int compareTo(Participante player) {
		
		
		
		return 0;
	}
	public int getJuegos() {
		return juegos;
	}
	public void setJuegos(int juegos) {
		this.juegos = juegos;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	@Override
	public String toString() {
		return "Participante [juegos=" + juegos + ", puntos=" + puntos + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
