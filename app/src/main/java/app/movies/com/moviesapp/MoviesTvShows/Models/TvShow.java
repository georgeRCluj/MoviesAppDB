package app.movies.com.moviesapp.MoviesTvShows.Models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TvShow {

    @SerializedName(Constants.TV_SHOW_ID)
    private String id;

    @SerializedName(Constants.TV_SHOW_RATING)
    private String rating;

    @SerializedName(Constants.TV_SHOW_TITLE)
    private String title;

    @SerializedName(Constants.TV_SHOW_POSTER_PATH)
    private String posterPath;

    @SerializedName(Constants.TV_SHOW_OVERVIEW)
    private String overView;

    @SerializedName(Constants.TV_SHOW_GENRE_IDS)
    private ArrayList<Integer> genreIdsList;

    public String getId() {
        return id;
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOverView() {
        return overView;
    }

    public ArrayList<Integer> getGenreIdsList() {
        return genreIdsList;
    }
}
