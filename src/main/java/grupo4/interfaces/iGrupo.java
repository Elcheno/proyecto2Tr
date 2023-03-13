package grupo4.interfaces;

public interface iGrupo {
	String getNombre();
	iGimnasta[] getPlantilla();
	void setNombre(String nombre);
	void addGimnasta(iGimnasta gimnasta);
	void deleteGimnasta(iGimnasta gimnasta);
}
