package me.droan.a3_quiz_app;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.option1)
    RadioButton option1;
    @Bind(R.id.option2)
    RadioButton option2;
    @Bind(R.id.option3)
    RadioButton option3;
    @Bind(R.id.option4)
    RadioButton option4;
    @Bind(R.id.checkbox1)
    CheckBox checkbox1;
    @Bind(R.id.checkbox2)
    CheckBox checkbox2;
    @Bind(R.id.checkbox3)
    CheckBox checkbox3;
    @Bind(R.id.checkbox4)
    CheckBox checkbox4;
    @Bind(R.id.obama1)
    RadioButton obama1;
    @Bind(R.id.obama2)
    RadioButton obama2;
    @Bind(R.id.obama3)
    RadioButton obama3;
    @Bind(R.id.obama4)
    RadioButton obama4;
    @Bind(R.id.mathEditText)
    EditText mathEditText;
    @Bind(R.id.activity_main)
    NestedScrollView activityMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void grade(View view) {
        int totalScore = 0;
        //ques1
        if (option1.isChecked()) {
            totalScore++;
        }

        //ques2
        if (!checkbox1.isChecked() && !checkbox2.isChecked() && checkbox3.isChecked() && checkbox4.isChecked()) {
            totalScore++;
        }
        //ques3
        if (obama4.isChecked()) {
            totalScore++;
        }
        //ques4
        if (mathEditText.getText().toString().trim().equalsIgnoreCase("990")) {
            totalScore++;
        }
        Toast.makeText(this, "Your score is: " + totalScore, Toast.LENGTH_SHORT).show();
    }
}
