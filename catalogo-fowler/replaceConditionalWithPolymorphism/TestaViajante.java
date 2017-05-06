package replaceConditionalWithPolymorphism;

public class TestaViajante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ViajantePrincipal viajante = new ViajanteBrasileiro();
		System.out.println(viajante.getBebida());
		
	}

}
