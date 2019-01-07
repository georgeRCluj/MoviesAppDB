package app.movies.com.moviesapp.MoviesTvShows.Models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GenresResponse {

    @SerializedName(Constants.GENRES_LIST_PARAM)
    private ArrayList<Genre> genresListParam;
}
