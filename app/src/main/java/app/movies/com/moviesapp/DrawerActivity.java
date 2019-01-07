package app.movies.com.moviesapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import app.movies.com.moviesapp.databinding.DrawerActivityBinding;

public class DrawerActivity extends AppCompatActivity {
    private DrawerActivityBinding binding;
    private Fragment topRatedFragment, favoritesFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.drawer_activity);
        binding.navView.getMenu().getItem(0).setChecked(true);

        setActionBar();
        setListenerOnNavigationItems();

        topRatedFragment = new TopRatedFragment();
        favoritesFragment = new FavoritesFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.content_frame, topRatedFragment).commit();
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
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, topRatedFragment).commit();
                    break;
                }
                case R.id.nav_favorites: {
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, favoritesFragment).commit();
                    break;
                }
            }
            return true;
        });
    }

}
