package com.texto.lanckner;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

public class PopupManager {

    public static void showPopup(Activity activity) {
        View popupView = LayoutInflater.from(activity).inflate(R.layout.popup_layout, null);
        PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);
        popupWindow.showAtLocation(popupView, 0, 0, 0);
    }
}
