package app.movies.com.moviesapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import app.movies.com.moviesapp.databinding.DrawerActivityBinding;

public class DrawerActivity extends AppCompatActivity {
    private DrawerActivityBinding binding;
    private Fragment topRatedFragment, favoritesFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.drawer_activity);
        setActionBar();
        setListenerOnNavigationItems();
        initializeFragments();
        addFragmentsToFragmentManager();
        showTopRatedFragment();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                binding.drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBar() {
        setSupportActionBar(binding.toolbar);
        binding.toolbar.setTitleTextColor(getResources().getColor(R.color.toolbar_text_color));

        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setHomeAsUpIndicator(R.drawable.nav_menu);
        }
    }

    private void setListenerOnNavigationItems() {
        binding.navView.setNavigationItemSelectedListener(menuItem -> {
            menuItem.setChecked(true);
            binding.drawerLayout.closeDrawers();

            switch (menuItem.getItemId()) {
                case R.id.nav_top_rated: {
                    showFragment(topRatedFragment);
                    break;
                }
                case R.id.nav_favorites: {
                    showFragment(favoritesFragment);
                    break;
                }
            }
            return true;
        });
    }

    private void initializeFragments() {
        topRatedFragment = new TopRatedFragment();
        favoritesFragment = new FavoritesFragment();
    }

    private void addFragmentsToFragmentManager() {
        getSupportFragmentManager().beginTransaction().add(R.id.content_frame, topRatedFragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.content_frame, favoritesFragment).commit();
    }

    private void showFragment(Fragment fragment) {
        if (fragment instanceof TopRatedFragment) {
            getSupportFragmentManager().beginTransaction().show(topRatedFragment).commit();
            getSupportFragmentManager().beginTransaction().hide(favoritesFragment).commit();
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle(getResources().getString(R.string.nav_drawer_top_rated_title));
            }
        } else {
            getSupportFragmentManager().beginTransaction().show(favoritesFragment).commit();
            getSupportFragmentManager().beginTransaction().hide(topRatedFragment).commit();
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle(getResources().getString(R.string.nav_drawer_favorites_title));
            }
        }
    }

    private void showTopRatedFragment() {
        final int TOP_RATED_FRAGMENT_INDEX = 0;
        binding.navView.getMenu().getItem(TOP_RATED_FRAGMENT_INDEX).setChecked(true);
        showFragment(topRatedFragment);
    }
}
