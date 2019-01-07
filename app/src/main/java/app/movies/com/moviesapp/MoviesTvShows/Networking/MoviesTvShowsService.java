package app.movies.com.moviesapp.MoviesTvShows.Networking;

import app.movies.com.moviesapp.MoviesTvShows.Models.MoviesResponse;
import io.reactivex.Maybe;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MoviesTvShowsService {

    @GET(Constants.API_MOVIES_TOP_RATED)
    Maybe<MoviesResponse> getMovies(@Query(Constants.API_KEY_PARAM) String apiKey, @Query(Constants.API_PAGE_PARAM) String page);
}
