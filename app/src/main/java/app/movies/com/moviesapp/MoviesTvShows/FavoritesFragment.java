package app.movies.com.moviesapp.MoviesTvShows;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.movies.com.moviesapp.R;
import app.movies.com.moviesapp.databinding.FavoritesFragmentBinding;
import app.movies.com.moviesapp.databinding.TopRatedFragmentBinding;

public class FavoritesFragment extends Fragment {
    private FavoritesFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.favorites_fragment, container, false);
        return binding.getRoot();
    }
}
