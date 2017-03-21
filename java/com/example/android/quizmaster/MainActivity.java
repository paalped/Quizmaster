package com.example.android.quizmaster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Global score, used as gloabl variable to be able to modify it submit and reset
     */
    private int score = 0;

    public void submit(View view) {

        /**
         * Hard Collecting checkboxes from question 1.
         */
        RadioButton firstAnswer1 = (RadioButton) findViewById(R.id.first_answer_q1);
        boolean isCheckedFirstAnswer1 =firstAnswer1.isChecked();
        RadioButton secondAnswer1 = (RadioButton) findViewById(R.id.second_answer_q1);
        boolean isCheckedSecondAnswer1 =secondAnswer1.isChecked();
        RadioButton thirdAnswer1 = (RadioButton) findViewById(R.id.third_answer_q1);
        boolean isCheckedThirdAnswer1 =thirdAnswer1.isChecked();
        RadioButton correctAnswer1 = (RadioButton) findViewById(R.id.correct_answer_q1);
        boolean isCheckedCorrectAnswer1 =correctAnswer1.isChecked();
        /**
         * Hard Collecting checkboxes from question 2.
         */
        RadioButton firstAnswer2 = (RadioButton) findViewById(R.id.first_answer_q2);
        boolean isCheckedFirstAnswer2 =firstAnswer2.isChecked();
        RadioButton secondAnswer2 = (RadioButton) findViewById(R.id.second_answer_q2);
        boolean isCheckedSecondAnswer2 =secondAnswer2.isChecked();
        RadioButton thirdAnswer2 = (RadioButton) findViewById(R.id.third_answer_q2);
        boolean isCheckedThirdAnswer2 =thirdAnswer2.isChecked();
        RadioButton correctAnswer2 = (RadioButton) findViewById(R.id.correct_answer_q2);
        boolean isCheckedCorrectAnswer2 =correctAnswer2.isChecked();
        /**
         * Hard Collecting checkboxes from question 3.
         */
        RadioButton firstAnswer3 = (RadioButton) findViewById(R.id.first_answer_q3);
        boolean isCheckedFirstAnswer3 =firstAnswer3.isChecked();
        RadioButton secondAnswer3 = (RadioButton) findViewById(R.id.second_answer_q3);
        boolean isCheckedSecondAnswer3 =secondAnswer3.isChecked();
        RadioButton thirdAnswer3 = (RadioButton) findViewById(R.id.third_answer_q3);
        boolean isCheckedThirdAnswer3 =thirdAnswer3.isChecked();
        RadioButton correctAnswer3 = (RadioButton) findViewById(R.id.correct_answer_q3);
        boolean isCheckedCorrectAnswer3 =correctAnswer3.isChecked();
        /**
         * Hard Collecting checkboxes from question 4.
         */
        RadioButton firstAnswer4 = (RadioButton) findViewById(R.id.first_answer_q4);
        boolean isCheckedFirstAnswer4 =firstAnswer4.isChecked();
        RadioButton secondAnswer4 = (RadioButton) findViewById(R.id.second_answer_q4);
        boolean isCheckedSecondAnswer4 =secondAnswer4.isChecked();
        RadioButton thirdAnswer4 = (RadioButton) findViewById(R.id.third_answer_q4);
        boolean isCheckedThirdAnswer4 =thirdAnswer4.isChecked();
        RadioButton correctAnswer4 = (RadioButton) findViewById(R.id.correct_answer_q4);
        boolean isCheckedCorrectAnswer4 =correctAnswer4.isChecked();
        /**
         * Hard Collecting checkboxes from question 5.
         */
        RadioButton firstAnswer5 = (RadioButton) findViewById(R.id.first_answer_q5);
        boolean isCheckedFirstAnswer5 =firstAnswer5.isChecked();
        RadioButton secondAnswer5 = (RadioButton) findViewById(R.id.second_answer_q5);
        boolean isCheckedSecondAnswer5 =secondAnswer5.isChecked();
        RadioButton thirdAnswer5 = (RadioButton) findViewById(R.id.third_answer_q5);
        boolean isCheckedThirdAnswer5 =thirdAnswer5.isChecked();
        RadioButton correctAnswer5 = (RadioButton) findViewById(R.id.correct_answer_q5);
        boolean isCheckedCorrectAnswer5 =correctAnswer5.isChecked();

        score=0;
        answerQuestions(isCheckedFirstAnswer1,isCheckedSecondAnswer1,isCheckedThirdAnswer1,isCheckedCorrectAnswer1);
        answerQuestions(isCheckedFirstAnswer2,isCheckedSecondAnswer2,isCheckedThirdAnswer2,isCheckedCorrectAnswer2);
        answerQuestions(isCheckedFirstAnswer3,isCheckedSecondAnswer3,isCheckedThirdAnswer3,isCheckedCorrectAnswer3);
        answerQuestions(isCheckedFirstAnswer4,isCheckedSecondAnswer4,isCheckedThirdAnswer4,isCheckedCorrectAnswer4);
        answerQuestions(isCheckedFirstAnswer5,isCheckedSecondAnswer5,isCheckedThirdAnswer5,isCheckedCorrectAnswer5);

        displayScore(score);

    }

    private void answerQuestions(boolean wrong1,boolean wrong2,boolean wrong3,boolean correct){
        if(!wrong1&&!wrong2&&!wrong3&&correct){
            score+=1;
        }
    }

    /**
     * Reset the button and score, prints reset score to view.
     * @param view must include view, to be able to use this public function
     */

    public void reset(View view){
        /**
         * Collection RadioGroups and uncheck their checked value.
         */
        RadioGroup radioGroup1   = (RadioGroup) findViewById(R.id.radio_group1);
        RadioGroup radioGroup2   = (RadioGroup) findViewById(R.id.radio_group2);
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radio_group3);
        RadioGroup radioGroup4  = (RadioGroup) findViewById(R.id.radio_group4);
        RadioGroup radioGroup5  = (RadioGroup) findViewById(R.id.radio_group5);
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        //reset score to 0
        score = 0;
        //display score, or else old value is still shown in the view
        displayScore(score);
    }

    private void displayScore(int number){
        TextView scoreTextView = (TextView) findViewById(R.id.scoreView);
        scoreTextView.setText(getString(R.string.score) + " " + String.valueOf(number));
    }


}
