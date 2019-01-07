package app.movies.com.moviesapp.MoviesTvShows;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.util.Log;

import app.movies.com.moviesapp.MoviesTvShows.Models.MoviesResponse;
import app.movies.com.moviesapp.MoviesTvShows.Networking.Constants;
import app.movies.com.moviesapp.MoviesTvShows.Networking.MoviesTvShowsInteractorCallback;
import app.movies.com.moviesapp.MoviesTvShows.Networking.MoviesTvShowsService;
import app.movies.com.moviesapp.Utils.RetrofitFactory;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

class MoviesTvShowsViewModel extends AndroidViewModel implements MoviesTvShowsInteractorCallback {
    private MoviesTvShowsService moviesTvShowsService;
    private Disposable moviesTvShowsDisposable;

    MoviesTvShowsViewModel(@NonNull Application application) {
        super(application);
        moviesTvShowsService = RetrofitFactory.getInstance(Constants.API_BASE_URL_MOVIES_TV).create(MoviesTvShowsService.class);
    }

    void getData() {
        moviesTvShowsDisposable = moviesTvShowsService.getMovies(Constants.API_KEY, "1").subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
                this::getMoviesSuccessfully,
                error ->
                        this.getMoviesFailure(error.toString()));
    }


    @Override
    public void getMoviesSuccessfully(MoviesResponse moviesResponse) {
        Log.d("TEST_API_CALL", "getMoviesSuccessfully: ");
    }

    @Override
    public void getMoviesFailure(String error) {
        Log.d("TEST_API_CALL", "getMoviesFailure: " + error);
    }

    void release() {
        if (moviesTvShowsDisposable != null && !moviesTvShowsDisposable.isDisposed()) {
            moviesTvShowsDisposable.dispose();
        }
    }
}
