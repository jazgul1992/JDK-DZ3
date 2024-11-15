import java.util.List;

// Интерфейс для работы с базой данных
public interface Database<T> {
    void save(T item);           // Метод для сохранения данных
    void delete(int id);          // Метод для удаления данных по ID
    T get(int id);                // Метод для получения данных по ID
    List<T> getAll();             // Метод для получения всех данных
}