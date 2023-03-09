package grupo4.interfaces;

import java.time.LocalDate;

public interface Participaciones<T> {
	int getDorsal();
	T getParticipaciones();
	LocalDate getFecha();
	int getPuntos();
	void setDorsal(int dorsal);
	void setParticiones(T p);
	void setFecha(LocalDate fecha);
	void setPuntos(int puntos);
}
