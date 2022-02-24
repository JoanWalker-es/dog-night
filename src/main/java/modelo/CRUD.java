package modelo;

import java.util.List;

public interface CRUD<T> {

	void save(T t);
	List<T> findAll();
	T findOneById(long id);
	void update(T t);
	void delete(T t);
}
