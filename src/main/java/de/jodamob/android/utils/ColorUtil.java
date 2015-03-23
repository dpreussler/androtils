package de.jodamob.android.utils;

import android.widget.TextView;

public class ColorUtil {

    public static void setTextColor(int color, TextView... views) {
        for (TextView view : views) {
            view.setTextColor(view.getResources().getColor(color));
        }
    }
}
