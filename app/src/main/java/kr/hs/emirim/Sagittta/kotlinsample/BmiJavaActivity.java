package kr.hs.emirim.Sagittta.kotlinsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    //전역변수로 정의
    EditText etTall;
    EditText etWeight;
    TextView txResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        //findViewById()는 성능이 좋지 않음. 한 번만 호출하도록 하는 것이 좋음. (onClick -> onCreate)
        //객체를 찾아주는 명령어는 onCreate 안에 있어야 함. 객체 생성 전에는 레이아웃이 없어서 에러 발생함.
        //ButterKnife, Android Annotations 라이브러리가 인기.
        etTall = findViewById(R.id.tallField);
        etWeight = findViewById(R.id.weightField);
        txResult = findViewById(R.id.resultLabel);

        findViewById(R.id.bmiButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double tall = Double.parseDouble(etTall.getText().toString());      //getText() -> 텍스트 불러옴.(String x), toString() -> 문자열 변환, Double.parseDouble() -> double로 변화
                double weight = Double.parseDouble(etWeight.getText().toString());

                //business logic
                double bmi = weight / Math.pow((tall / 100.0), 2);
                txResult.setText("키 : " + tall + "cm 체중 : " + weight + "kg BMI 지수 : " + (((int)(bmi * 10))/10));

            }
        });
    }
}
