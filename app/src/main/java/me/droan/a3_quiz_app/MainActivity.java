package me.droan.a3_quiz_app;

import android.os.Bundle;
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

    @Bind(R.id.checkbox1)
    CheckBox checkbox1;
    @Bind(R.id.checkbox2)
    CheckBox checkbox2;
    @Bind(R.id.checkbox3)
    CheckBox checkbox3;
    @Bind(R.id.checkbox4)
    CheckBox checkbox4;

    @Bind(R.id.obama4)
    RadioButton obama4;

    @Bind(R.id.mathEditText)
    EditText mathEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /**
     * calculate the totalScore and display it via toast
     *
     * @param view
     */
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
        if (totalScore == 4) {
            Toast.makeText(this, "Awesome!!! Your score is: " + totalScore, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Your score is: " + totalScore, Toast.LENGTH_SHORT).show();
        }
    }
}
