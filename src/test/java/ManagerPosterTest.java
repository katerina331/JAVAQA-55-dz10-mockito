import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerPosterTest {
    ManagerPosters manager = new ManagerPosters();
    Poster item1 = new Poster(1, "Бладшот", "#", "<Боевик", false);
    Poster item2 = new Poster(2, "Вперёд", "#", "Мультфильм", false);
    Poster item3 = new Poster(3, "Отель Белград", "#", "Комедия", false);
    Poster item4 = new Poster(4, "Джентельмены", "#", "Боевик", false);
    Poster item5 = new Poster(5, "Человек-неведимка", "#", "Ужасы", false);
    Poster item6 = new Poster(6, "Тролли. Мировой тур", "#", "Мультфильм", true);
    Poster item7 = new Poster(7, "Номер один", "#", "Комедия", true);
    Poster item8 = new Poster(8, "Мира", "#", "Фантастика", false);
    Poster item9 = new Poster(9, "На краю", "#", "Триллер", false);
    Poster item10 = new Poster(10, "Троль", "#", "Боевик", false);
    Poster item11 = new Poster(11, "Время для себя", "#", "Комедия", false);
    Poster item12 = new Poster(12, "Одна", "#", "Катастрофа", true);
    Poster item13 = new Poster(13, "Чебурашка", "#", "Комедия", true);

    @BeforeEach
    public void setup() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
    }

    @Test
    public void addFirstFilmTest() {
        ManagerPosters manager = new ManagerPosters();

        Poster[] expected = {item5};
        manager.add(item5);
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewFilmTest() {
        Poster[] expected = {item1, item2, item3, item4, item5, item6, item7};
        manager.add(item7);
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findFilmTest() {
        Poster[] expected = {item1, item2, item3, item4, item5, item6};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastToTenFilmTest() {
        Poster[] expected = {item6, item5, item4, item3, item2, item1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTenFilmTest() {
        Poster[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoreFilmTest() {
        Poster[] expected = {item13, item12, item11, item10, item9, item8, item7, item6, item5, item4};
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);
        manager.add(item13);
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmTest() {
        ManagerPosters manager = new ManagerPosters(4);
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);

        Poster[] expected = {item6, item5, item4, item3};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
