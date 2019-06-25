package kr.hs.emirim.Sagittta.kotlinsample;

import android.widget.Toast;

public class ToastUtilJava {

    public static void toastLong(String message) {
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_LONG).show();
        //Activity에서 실행되는 getApplicationContext(). java class에서는 실행이 안 됨 -> 에러 발생.
    }

    public static void toastShort(String message) {
        Toast.makeText(MainApplication.getAppContext(), message,Toast.LENGTH_SHORT).show();
    }

    public static void toast(String message, int length) {
        Toast.makeText(MainApplication.getAppContext(), message, length).show();
    }

    //메소드 오버로딩
    public static  void toast(String message) {
        toast(message, Toast.LENGTH_SHORT);
    }

}
