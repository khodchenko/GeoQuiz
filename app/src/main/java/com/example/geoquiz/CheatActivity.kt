package com.example.geoquiz

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class CheatActivity : AppCompatActivity() {

    val EXTRA_ANSWER_IS_TRUE = "com.example.geoquiz.answer_is_true"

//    fun newIntent(packageContext: Context?, answerIsTrue: Boolean): Intent {
//        val intent = Intent(packageContext, CheatActivity::class.java)
//        intent.putExtra(EXTRA_ANSWER_IS_TRUE, answerIsTrue)
//        return intent }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cheat)

        var answerTextView: TextView =  findViewById(R.id.answer_text_view);
        var showAnswerButton : Button  = findViewById(R.id.show_answer_button)



        var mAnswerIsTrue = intent.getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false)



        showAnswerButton.setOnClickListener {
            if (mAnswerIsTrue) {
                answerTextView.setText(R.string.true_button)
            } else {
                answerTextView.setText(R.string.false_button) }


        }
    }
}