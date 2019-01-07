package app.movies.com.moviesapp.MoviesTvShows.Models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MoviesResponse {

    @SerializedName(Constants.MOVIES_PAGE)
    private String page;

    @SerializedName(Constants.MOVIES_TOTAL_RESULTS)
    private String totalResults;

    @SerializedName(Constants.MOVIES_TOTAL_PAGES)
    private String totalPages;

    @SerializedName(Constants.MOVIES_LIST)
    private ArrayList<Movie> moviesList;

    public String getPage() {
        return page;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public ArrayList<Movie> getMoviesList() {
        return moviesList;
    }
}
