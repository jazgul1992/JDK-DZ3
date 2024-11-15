import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Реализация интерфейса Database
public class DatabaseImpl<T> implements Database<T> {
    private Map<Integer, T> storage = new HashMap<>();
    private int currentId = 1;

    @Override
    public void save(T item) {
        storage.put(currentId++, item);
        System.out.println("Сохранен элемент с ID: " + (currentId - 1));
    }

    @Override
    public void delete(int id) {
        if (storage.remove(id) != null) {
            System.out.println("Удален элемент с ID: " + id);
        } else {
            System.out.println("Элемент с ID " + id + " не найден");
        }
    }

    @Override
    public T get(int id) {
        return storage.get(id);
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(storage.values());
    }
}