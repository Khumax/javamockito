package org.khumax;

public class PosterManager {
    private String[] posters = new String[0];
    private final int limitQuality;

    public PosterManager() {
        this.limitQuality = 5;
    }

    public PosterManager(int limitQuality) {
        this.limitQuality = limitQuality;
    }

    public void addPoster(String poster) {
        String[] tmp = new String[posters.length + 1];
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public String[] findAll() {
        return posters;
    }

    public String[] findLast() {
        int resultLength = Math.min(posters.length, limitQuality);
        String[] rez = new String[resultLength];
        for (int i = 0; i < rez.length; i++) {
            rez[i] = posters[posters.length - 1 - i];
        }
        return rez;
    }
}