import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CinemaManagerTest {

    CinemaClass cinema1 = new CinemaClass("Бладшот", "Боевик");
    CinemaClass cinema2 = new CinemaClass("Вперед", "Мультфильм");
    CinemaClass cinema3 = new CinemaClass("Отель Белград", "Комедия");
    CinemaClass cinema4 = new CinemaClass("Джентельмены", "Боевик");
    CinemaClass cinema5 = new CinemaClass("Человек-невидимка", "Ужасы");
    CinemaClass cinema6 = new CinemaClass("Номер один", "Комедия");


    @Test
    public void addCinemaTest() {

        CinemaManager cinemas = new CinemaManager();

        cinemas.addCinema(cinema1);
        cinemas.addCinema(cinema2);
        cinemas.addCinema(cinema3);

        CinemaClass[] expected = {cinema1, cinema2, cinema3};
        CinemaClass[] actual = cinemas.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFindLastEmptyTest() {

        CinemaManager cinemas = new CinemaManager();

        cinemas.addCinema(cinema1);
        cinemas.addCinema(cinema2);
        cinemas.addCinema(cinema3);
        cinemas.addCinema(cinema4);
        cinemas.addCinema(cinema5);
        cinemas.addCinema(cinema6);

        CinemaClass[] expected = {cinema6, cinema5, cinema4, cinema3, cinema2};
        CinemaClass[] actual = cinemas.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFindLastNotEmptyTest() {

        CinemaManager cinemas = new CinemaManager(3);

        cinemas.addCinema(cinema1);
        cinemas.addCinema(cinema2);
        cinemas.addCinema(cinema3);
        cinemas.addCinema(cinema4);
        cinemas.addCinema(cinema5);
        cinemas.addCinema(cinema6);

        CinemaClass[] expected = {cinema6, cinema5, cinema4};
        CinemaClass[] actual = cinemas.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFindLastOutOfArrayTest() {

        CinemaManager cinemas = new CinemaManager(6);

        cinemas.addCinema(cinema1);
        cinemas.addCinema(cinema2);
        cinemas.addCinema(cinema3);
        cinemas.addCinema(cinema4);

        CinemaClass[] expected = {cinema4, cinema3, cinema2, cinema1};
        CinemaClass[] actual = cinemas.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
