package app.movies.com.moviesapp;

import android.graphics.Typeface;
import android.widget.TextView;
import android.databinding.BindingAdapter;

public class BindingAdapters {

    @BindingAdapter("android:typeface")
    public static void setTypeface(TextView v, String style) {
        switch (style) {
            case "bold":
                v.setTypeface(null, Typeface.BOLD);
                break;
            default:
                v.setTypeface(null, Typeface.NORMAL);
                break;
        }
    }
}
