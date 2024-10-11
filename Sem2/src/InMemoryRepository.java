import java.util.HashMap;
import java.util.Map;

public class InMemoryRepository<ID,E extends Entity<ID>> implements Repository<ID,E> {
    private final Map<ID ,E> entities;
    public InMemoryRepository() {
        entities = new HashMap<>();
    }


    @Override
    public E findOne(ID id) {
        return null;
    }

    @Override
    public Iterable<E> findAll() {
        return null;
    }

    @Override
    public E save(E entity) {
        ID id = entity.getId();
        if(!entities.containsKey(id)) {
            entities.put(id,entity);
            return null;
        } else {
            return entity;
    }
    }

    @Override
    public E delete(ID id) {
        return null;
    }

    @Override
    public E update(E entity) {
        return null;
    }
}
