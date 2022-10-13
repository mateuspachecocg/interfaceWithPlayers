
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
					this.listaAlbum.get(numberLastAlbum).getListaMusica().get(numberLastMusic).getNome());
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
		this.numberLastMusic += quantidade;
		if(this.listaAlbum.size() > 0) {
			while(numberLastMusic  >= this.listaAlbum.get(numberLastAlbum).getListaMusica().size()) {
				
				numberLastMusic -= this.listaAlbum.get(numberLastAlbum).getListaMusica().size();	
				
				if(numberLastAlbum + 1 >= this.listaAlbum.size() ) {
					numberLastAlbum = 0;
				} else {
					numberLastAlbum++;
				}
			}
			this.start();
		} else {
			System.err.println("No music to play!");
		}
	}

	@Override
	public void back(int quantidade) {
		this.numberLastMusic -= quantidade;
		if(this.listaAlbum.size() > 0) {
			while(true) {
				break;
			}
			this.start();
		} else {
			System.err.println("No music to play!");
		}
		
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
