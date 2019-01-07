package app.movies.com.moviesapp.MoviesTvShows.Models;

import com.google.gson.annotations.SerializedName;

public class Genre {

    @SerializedName(Constants.GENRE_ID)
    private String id;

    @SerializedName(Constants.GENRE_NAME)
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
