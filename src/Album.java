
import java.util.ArrayList;

public class Album {

	private String artista;
	private ArrayList<Musica> listaMusicas;
	
	public Album (Musica m ) {
		listaMusicas = new ArrayList<Musica>();
		listaMusicas.add(m);
	}
	
	public void setArtista(String nome) {
		this.artista = nome;
	}
	public String getArtista() {
		return  artista;
	}
	
	public void addMusica(Musica m) {
		if(m.getDuracao()!= 0)
		    listaMusicas.add(m);
	}
	
	public ArrayList<Musica> getListaMusica(){
		return listaMusicas;
	}


}