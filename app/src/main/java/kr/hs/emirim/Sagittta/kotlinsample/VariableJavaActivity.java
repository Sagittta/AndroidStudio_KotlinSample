package kr.hs.emirim.Sagittta.kotlinsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {

    int clickCount = 0;
    final long startTime = System.currentTimeMillis();    //현재 시간을 받아서 상수 startTime에 저장

    TextView startTimeLabel;            //참조 재활용. findViewById가 용량?을 많이 잡아먹어서
    TextView clickCountLabel;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        startTimeLabel = findViewById(R.id.startTimeLabel);
        clickCountLabel = findViewById(R.id.clickCountLabel);
        button = findViewById(R.id.button);

        String timeText = new SimpleDateFormat(             //시간 포맷 정해서 출력
                "HH:mm:ss", Locale.KOREA).format(startTime);

        startTimeLabel.setText("Activity 시작 시간 : " + timeText);
        clickCountLabel.setText("버튼이 클릭된 횟수 : " + clickCount);          //setText()는 텍스트를 바꾸는 것.

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount ++;
                clickCountLabel.setText("버튼이 클릭된 횟수 : " + clickCount);
            }
        });

    }
}
