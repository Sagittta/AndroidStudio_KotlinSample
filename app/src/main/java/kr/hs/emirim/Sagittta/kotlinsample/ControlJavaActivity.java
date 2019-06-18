package kr.hs.emirim.Sagittta.kotlinsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ControlJavaActivity extends AppCompatActivity {

    EditText numberField;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_control);

        numberField = findViewById(R.id.numberField);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(
                        numberField.getText().toString());

                if (number % 2 == 0) {
                    Toast.makeText(getApplicationContext(),         //this가 안 되는 경우도 많기 때문에
                            "2의 배수 : " + number,
                            Toast.LENGTH_SHORT).show();             //show 메소드가 있어야 화면에 나오게 됨.
                } else if (number % 3 == 0) {
                    Toast.makeText(getApplicationContext(),
                            "3의 배수 : " + number,
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "" + number,
                            Toast.LENGTH_SHORT).show();
                }

                switch (number) {
                    case 4 :
                        button.setText("실행 - 4");
                        break;
                    case 9 :
                        button.setText("실행 - 9");
                        break;
                    default :
                        button.setText("실행");
                        break;
                }

            }
        });

    }
}
