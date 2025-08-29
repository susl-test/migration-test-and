package com.migration.test;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;

public class MIGRATION {
    public static void helloWorld(Context context) {
        new AlertDialog.Builder(context)
                .setMessage("Hello World")
                .setPositiveButton("OK", (dialog, which) -> {
                    dialog.dismiss();
                })
                .show();
    }
}