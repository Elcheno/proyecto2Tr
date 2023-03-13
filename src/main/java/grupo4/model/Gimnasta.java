package grupo4.model;

import grupo4.interfaces.iGimnasta;

public class Gimnasta implements iGimnasta {

	private String categoria;
	
	private String club;
	
	
	
	public Gimnasta() {
		this(null, "");
	}

	public Gimnasta(String categoria, String club) {
		super();
		this.categoria = categoria;
		this.club = club;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "Gimnasta [categoria=" + categoria + ", club=" + club + "]";
	}
	
	
}
