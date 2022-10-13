
public class PlayDoTeus extends Play {

	private int currentMusic;
	private int currentAlbum;
	public PlayDoTeus() {
		super();
		this.currentMusic = 0;
		this.currentAlbum = 0;
	}
	
	
	@Override
	public void start() {
		if(this.listaAlbum.size() > 0) {
			System.out.println("Tocando a música " + 
					this.listaAlbum.get(currentAlbum).getListaMusica().get(currentMusic).getNome());
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
			
			for(;quantidade > 0;quantidade--) {
				if(currentMusic + 1 >= this.listaAlbum.get(currentAlbum).getListaMusica().size()) {
					
					if (currentAlbum == 0) {
						currentAlbum = this.listaAlbum.size() - 1;
					} else {
						currentAlbum--;
					}
					
					currentAlbum = 0;;
				} else {
					currentMusic++;
				}
			}
			
			this.start();
		} else {
			System.err.println("No music to play!");
		}
	}

	@Override
	public void back(int quantidade) {
		
		if(this.listaAlbum.size() > 0) {
			
			for(;quantidade > 0;quantidade--) {
				if(currentMusic - 1 < 0) {
					
					if (currentAlbum == 0) {
						currentAlbum = this.listaAlbum.size() - 1;
					} else {
						currentAlbum--;
					}
					
					currentMusic = this.listaAlbum.get(currentAlbum).getListaMusica().size() - 1;
				} else {
					currentMusic--;
				}
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
