package up.mi.jgm.td01;

public class Main {

	public static void main(String[] args) {
		double[] tab = {18.2, 2.3, 5, 42, 23.7 };
		UtilTab.affichageTableau(tab, false);
		System.out.println(UtilTab.appartient(0, tab));
		System.out.println(UtilTab.appartient(2.3, tab));
		System.out.println(UtilTab.max(tab));
		System.out.println(UtilTab.min(tab));
		System.out.println(UtilTab.somme(tab));
		UtilTab.triParSelection(tab);
		UtilTab.affichageTableau(tab, true);
	}


}
