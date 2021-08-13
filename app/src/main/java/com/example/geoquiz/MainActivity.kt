package com.example.geoquiz

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val questionBank: Array<Question> = arrayOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true)
    )

    var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nextButton = findViewById<Button>(R.id.next_button)



        var questionTextView = findViewById<TextView>(R.id.question_name)
        var question = questionBank[currentIndex].getTextResId()
        questionTextView.setText(question)


        var trueButton = findViewById<Button>(R.id.true_button).setOnClickListener{
            checkAnswer(true)
        }

        var falseButton = findViewById<Button>(R.id.false_button).setOnClickListener {
            checkAnswer(false)
        }


        nextButton.setOnClickListener {
            currentIndex += 1 % questionBank.size
            question = questionBank[currentIndex].getTextResId()
            questionTextView.setText(question)
        }

        //TODO

        }

    fun checkAnswer(userPressedTrue:Boolean){
        val answerIsTrue: Boolean = questionBank.get(currentIndex).getAnswerTrue()
        var messageResId = 0
        if (userPressedTrue == answerIsTrue) {
            messageResId = R.string.correct_toast
        } else {
            messageResId = R.string.incorrect_toast
        }
        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show()
    }
}




