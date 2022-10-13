public class Navegador {

	
	public void testeDoTocador(IPlay tocador) {
		
		tocador.start();
//		tocador.stop();
//		tocador.next(2);
//		tocador.back(2);
//		tocador.pause();
	
	}
	
public void testeDoTocadorNext(IPlay tocador, int quantidade) {

		tocador.next(quantidade);
//		tocador.back(2);
//		tocador.pause();
	
	}
}
