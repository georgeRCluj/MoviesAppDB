package app.movies.com.moviesapp.MoviesTvShows.Models;

import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName(Constants.MOVIE_ID)
    private String id;

    @SerializedName(Constants.MOVIE_RATING)
    private String rating;

    @SerializedName(Constants.MOVIE_TITLE)
    private String title;

    @SerializedName(Constants.MOVIE_POSTER_PATH)
    private String posterPath;

    @SerializedName(Constants.MOVIE_OVERVIEW)
    private String overView;

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
}
