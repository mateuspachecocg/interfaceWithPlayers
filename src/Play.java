import java.util.ArrayList;

public class Play  implements IPlay{

	public ArrayList<Album> listaAlbum;
	
	public Play() {
		this.listaAlbum= new ArrayList<Album>();
	}
	
	public void addAlbum(Album a) {
		listaAlbum.add(a);
	}
	
	public ArrayList<Album> getListaAlbum(){
		return listaAlbum;
	}
	public void start() {
		
		for (Album album : listaAlbum) {
			for (Musica m : album.getListaMusica()) {
				System.out.println(m.getNome());
			}
		}
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next(int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void back(int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String fabricante() {
		
		return "Fischer exemplo.";
	}

	
	
}