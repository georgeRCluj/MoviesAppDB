package app.movies.com.moviesapp.MoviesTvShows.Models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TvShowsResponse {

    @SerializedName(Constants.TV_SHOWS_PAGE)
    private String page;

    @SerializedName(Constants.TV_SHOWS_TOTAL_RESULTS)
    private String totalResults;

    @SerializedName(Constants.TV_SHOWS_TOTAL_PAGES)
    private String totalPages;

    @SerializedName(Constants.TV_SHOWS_LIST)
    private ArrayList<Movie> tvShowsList;

    public String getPage() {
        return page;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public ArrayList<Movie> getTvShowsList() {
        return tvShowsList;
    }
}
