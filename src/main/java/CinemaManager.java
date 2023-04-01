public class CinemaManager {

    private CinemaClass[] cinemas = new CinemaClass[0];
    private int cinemasCountToShow = 5;

    public CinemaManager() {

    }

    public CinemaManager(int cinemasCountToShow) {
        this.cinemasCountToShow = cinemasCountToShow;
    }


    public void addCinema(CinemaClass newCinema) {
        CinemaClass[] tmp = new CinemaClass[cinemas.length + 1];
        for (int i = 0; i < cinemas.length; i++) {
            tmp[i] = cinemas[i];
        }
        tmp[tmp.length - 1] = newCinema;
        cinemas = tmp;
    }

    public CinemaClass[] findAll() {
        return cinemas;
    }

    public CinemaClass[] findLast() {
        CinemaClass[] tmp = findAll();

        if (cinemasCountToShow < tmp.length) {
            CinemaClass[] reversed = new CinemaClass[cinemasCountToShow];
            for (int i = 0; i < cinemasCountToShow; i++) {
                reversed[i] = tmp[tmp.length - 1 - i];
            }
            return reversed;
        } else {
            cinemasCountToShow = tmp.length;
            CinemaClass[] reversed = new CinemaClass[cinemasCountToShow];
            for (int i = 0; i < cinemasCountToShow; i++) {
                reversed[i] = tmp[tmp.length - 1 - i];
            }
            return reversed;
        }
    }
}
