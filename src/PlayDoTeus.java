
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
		if(this.listaAlbum.size() > 0) {
			this.numberLastMusic += quantidade;
			
			while(true) {
				if (numberLastMusic > this.listaAlbum.get(numberLastAlbum).getListaMusica().size() ) {
					//Atualizando número do Album;
					if (this.numberLastAlbum + 1 > this.listaAlbum.size()) {
						this.numberLastAlbum = 0;
					} else {
						this.numberLastAlbum++;
					}
					
					// Atualizando número da música
					numberLastMusic = this.numberLastMusic -  this.listaAlbum.get(numberLastAlbum-1).getListaMusica().size();
				} else {
					break;
				}
			}
			System.out.println("Tocando a música " + 
					this.listaAlbum.get(numberLastAlbum).getListaMusica().get(numberLastMusic).getNome());
		} else {
			System.err.println("No music to play!");
		}
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
