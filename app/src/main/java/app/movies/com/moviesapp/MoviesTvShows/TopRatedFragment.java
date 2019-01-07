package app.movies.com.moviesapp.MoviesTvShows;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.movies.com.moviesapp.R;
import app.movies.com.moviesapp.databinding.TopRatedFragmentBinding;

public class TopRatedFragment extends Fragment {
    private TopRatedFragmentBinding binding;
    public ObservableBoolean isTopMoviesTabSelected = new ObservableBoolean();

    private MoviesTvShowsViewModel moviesTvShowsViewModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.top_rated_fragment, container, false);
        binding.setTopRatedFragment(this);
        isTopMoviesTabSelected.set(true);
        setActionOnTabsClick();
        initializeData();
        return binding.getRoot();
    }

    private void setActionOnTabsClick() {
        binding.topRatedMoviesTab.setOnClickListener(view -> isTopMoviesTabSelected.set(true));
        binding.topRatedTvShowsTab.setOnClickListener(view -> isTopMoviesTabSelected.set(false));
    }

    private void initializeData() {
        moviesTvShowsViewModel = ViewModelProviders.of(this).get(MoviesTvShowsViewModel.class);

    }
}
