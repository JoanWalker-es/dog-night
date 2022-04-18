package modeloRepository;

import java.util.List;

public interface Repository<T> {

	void save(T t);
	List<T> findAll();
	T findOneById(long id);
	void update(T t);
	void delete(T t);
}
