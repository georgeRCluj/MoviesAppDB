package app.movies.com.moviesapp.MoviesTvShows.Networking;

public class Constants {
    public final static String API_BASE_URL_MOVIES_TV = "https://api.themoviedb.org/3/";

    final static String API_MOVIES_TOP_RATED = "movie/top_rated";
    final static String API_MOVIE_GENRES = "genre/movie/list?api_key={apiKey}";

    final static String API_TV_SHOWS_TOP_RATED = "tv/top_rated?api_key={apiKey}&page={page}";
    final static String API_TV_GENRES = "genre/tv/list?api_key={apiKey}";

    final static String API_KEY_PARAM = "apiKey";
    final static String API_PAGE_PARAM = "page";

    final static String API_BASE_URL_POSTERS = "http://image.tmdb.org/t/p/w185"; // https://www.themoviedb.org/talk/568e3711c3a36858fc002384 for base urls for posters
    //"w92", "w154", "w185", "w342", "w500", "w780", or "original" are supported

    public final static String API_KEY = "d34b703c1b948da28c1c4eed006b1256";


}
