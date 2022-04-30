package modeloRepository;

import java.util.List;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Interfaz que define los métodos para guardar, actualizar,
 * eliminar y buscar en la base de datos.
 */
public interface Repository<T> {

	void save(T t);
	List<T> findAll();
	T findOneById(long id);
	void update(T t);
	void delete(T t);
}
