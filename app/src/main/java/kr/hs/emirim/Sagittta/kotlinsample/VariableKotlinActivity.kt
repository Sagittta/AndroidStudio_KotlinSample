package kr.hs.emirim.Sagittta.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_variable.*
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {

    var clickCount = 0              //변수. 계속 업데이트 되기 때문.
    val startTime = System.currentTimeMillis()          //상수

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val timeText = SimpleDateFormat(
            "HH:mm:ss", Locale.KOREA).format(startTime)

        startTimeLabel.setText("Activity 시작 시간 : ${timeText}")              //검은색으로 된 건 값이 변하지 않는다는 뜻. 이뮤터블.
        clickCountLabel.setText("버튼이 클릭된 횟수 : ${clickCount}")           //보라색으로 된 건 값이 변한다는 뜻. 뮤터블. 타입이 변하기는 불가능.

        button.setOnClickListener {
            clickCount ++
            clickCountLabel.setText("버튼이 클릭된 횟수 : ${clickCount}")
        }

    }
}
