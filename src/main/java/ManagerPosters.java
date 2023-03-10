public class ManagerPosters {
    private Poster[] items = new Poster[0];
    private int lim;

    public ManagerPosters() {
        this.lim = 10;
    }

    public ManagerPosters(int limit) {
        this.lim = limit;
    }

    public void add(Poster item) {
        Poster[] temp = new Poster[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        temp[temp.length - 1] = item;
        items = temp;
    }

    public Poster[] findAll() {
        return items;
    }


    public Poster[] findLast() {
        int lengthM = Math.min(items.length, lim);
        Poster[] temp = new Poster[lengthM];
        for (int i = 0; i < lengthM; i++) {
            temp[i] = items[items.length - 1 - i];
        }
        return temp;
    }
}
