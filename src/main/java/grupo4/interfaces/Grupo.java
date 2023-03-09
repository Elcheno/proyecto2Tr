package grupo4.interfaces;

public interface Grupo {
	String getNombre();
	Gimnasta[] getPlantilla();
	void setNombre(String nombre);
	void addGimnasta(Gimnasta gimnasta);
	void deleteGimnasta(Gimnasta gimnasta);
}
