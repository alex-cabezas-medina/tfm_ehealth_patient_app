package com.acabezas.ehealth_patient_app.Tools;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.util.Patterns;

import com.acabezas.ehealth_patient_app.R;

/**
 * Created by alexandercabezas on 2/5/18.
 */

public class Tools {

    public static AlertDialog createAlertDialog(Activity activity, String title, String message,final AlertDialogCallback callback) {

        AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.MyDialogTheme);

        builder.setMessage(message)
                .setTitle(title)
                .setPositiveButton(R.string.text_accept, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                        callback.accept();
                    }
                })
                ;

        AlertDialog dialog = builder.create();

        return dialog;
    }

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
}
