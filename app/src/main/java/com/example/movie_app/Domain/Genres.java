
package com.example.movie_app.Domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Genres {

    private List<GenresItem>genres;

    public List <GenresItem> getGenres() {
        return genres;
    }
}
