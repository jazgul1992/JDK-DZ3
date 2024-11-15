public class Main {
    public static void main(String[] args) {
        Database<String> db = new DatabaseImpl<>();

        db.save("Первый элемент");
        db.save("Второй элемент");

        System.out.println("Получение элемента с ID 1: " + db.get(1));

        db.delete(1);

        System.out.println("Все элементы в базе данных: " + db.getAll());
    }
}