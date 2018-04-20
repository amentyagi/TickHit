package com.anuntah.tickhit;

import java.util.ArrayList;

public class videos {
    private ArrayList<com.anuntah.tickhit.Trailers> results;

    public videos(ArrayList<com.anuntah.tickhit.Trailers> results) {
        this.results = results;
    }

    public ArrayList<com.anuntah.tickhit.Trailers> getResults() {
        return results;
    }

    public void setResults(ArrayList<com.anuntah.tickhit.Trailers> results) {
        this.results = results;
    }
}
