package kr.hs.emirim.Sagittta.kotlinsample

import android.widget.Toast

fun toastShort(message: String) {
    Toast.makeText(MainApplication.getAppContext(),
        message, Toast.LENGTH_SHORT).show()
}

fun toastLong(message: String) {
    Toast.makeText(MainApplication.getAppContext(),
        message, Toast.LENGTH_LONG).show()
}

fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(MainApplication.getAppContext(), message, length).show()
}
// @JVM-- 구문을 많이 사용함.