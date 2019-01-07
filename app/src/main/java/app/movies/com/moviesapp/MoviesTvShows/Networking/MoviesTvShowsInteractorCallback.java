package app.movies.com.moviesapp.MoviesTvShows.Networking;

import app.movies.com.moviesapp.MoviesTvShows.Models.MoviesResponse;

public interface MoviesTvShowsInteractorCallback {

    // Get Movies reports
    void getMoviesSuccessfully(MoviesResponse moviesResponse);

    void getMoviesFailure(String error);


}
