package quiz4;

import java.util.ArrayList;
import java.util.Comparator;

public class juegos {
	
	public static void main(String[] args) {
		Participante Player1 = new Participante(10, 23,"Max");
		Participante Player2 = new Participante(11, 20,"Alberth");
		Participante Player3 = new Participante(10, 22,"Jonny");
		Participante Player4 = new Participante(12, 33,"Ronald");
		Participante Player5 = new Participante(9, 21,"Walter");
		Participante Player6 = new Participante(9, 20,"Roberth");
		Participante Player7 = new Participante(2, 20,"Justin");

		ArrayList<Participante> listaP = new ArrayList<Participante>();

		listaP.add(Player1);
		listaP.add(Player2);
		listaP.add(Player3);
		listaP.add(Player4);
		listaP.add(Player5);
		listaP.add(Player6);
		listaP.add(Player7);

		listaP.sort(Comparator.naturalOrder());

		System.out.println("nombre"+" juegos"+"	puntos\n"
			+ "---------------------------");
		for (Participante participante : listaP) {
			System.out.println(participante.toString());
		}
	}
}
