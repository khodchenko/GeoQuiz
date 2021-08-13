package com.example.geoquiz

class Question(private var textResId: Int,private var answerTrue: Boolean) {


    fun getTextResId(): Int {
        return textResId
    }

    fun setTextResId(textResId: Int){
        this.textResId = textResId
    }

    fun getAnswerTrue(): Boolean{
        return answerTrue
    }

    fun setAnswerTrue(answerTrue: Boolean){
        this.answerTrue = answerTrue
    }


}