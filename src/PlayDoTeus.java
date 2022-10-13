
public class PlayDoTeus extends Play {

	private int numberLastMusic;
	private int numberLastAlbum;
	public PlayDoTeus() {
		super();
		this.numberLastMusic = 0;
		this.numberLastAlbum = 0;
	}
	
	@Override
	public void start() {
		if(this.listaAlbum.size() > 0) {
			System.out.println("Tocando a música " + 
					this.listaAlbum.get(numberLastAlbum).getListaMusica().get(numberLastMusic));
		} else {
			System.err.println("No music to play!");
		}
	}

	@Override
	public void stop() {
		System.out.println("Reprodução Parada!");
	}

	@Override
	public void next(int quantidade) {
		
		
	}

	@Override
	public void back(int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		System.out.println("Reprodução Pausada!");
		
	}

	@Override
	public String fabricante() {
		return "Pioneer";
	}

}
