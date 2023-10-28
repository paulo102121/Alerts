package alertas.utils;

import android.content.Context;

import com.paulo102121.sample.alerts.R;

import alertas.alerts.MacAlert;


public class Alertas {


    public static void sucesso(Context c, String msg, String title){
        new MacAlert(c, MacAlert.SUCCESS_TYPE)
                .setConfirmText("Ok")
                .confirmButtonColor(R.color.AzulCeleste)

                .cancelButtonColor(R.color.colorLaranja)
                .setTitleText("<h2>"+title+"</h2>")
                .setContentTextSize(20)
                .setContentText("<p>"+msg+"</p>")

                .show();

    }

    public static MacAlert sucessoretorno(Context c, String msg, String title){
        return   new MacAlert(c, MacAlert.NORMAL_TYPE)
                .setConfirmText("Ok")
                .confirmButtonColor(R.color.AzulCeleste)

                .cancelButtonColor(R.color.colorLaranja)
                .setTitleText("<h2>"+title+"</h2>")
                .setContentTextSize(20)
                .setContentText("<p>"+msg+"</p>");


    }

    public static void alerta(Context c, String msg, String title){
        new MacAlert(c, MacAlert.NORMAL_TYPE)
                .setConfirmText("Ok")
                .confirmButtonColor(R.color.ouro)
                .cancelButtonColor(R.color.primaryDark)
                .setTitleText("<h2>"+title+"</h2>")
                .setContentTextSize(20)
                .setContentText("<p>"+msg+"</p>")
                .show();

    }







}
