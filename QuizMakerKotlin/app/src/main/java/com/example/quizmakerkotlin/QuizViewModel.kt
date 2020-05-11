package com.example.quizmakerkotlin

import androidx.lifecycle.ViewModel
import java.util.*

class QuizViewModel : ViewModel() {

    var question: String = ""
    var answer: String = ""

    fun isAnswerCorrect(answer: String): Boolean =
        answer.toLowerCase(Locale.getDefault()) == this.answer.toLowerCase(Locale.getDefault())

    fun createQuestion(question: String, answer: String) {
        this.question = question
        this.answer = answer
    }

    fun isQuestionCreated() : Boolean =
        question.isNotBlank() && answer.isNotBlank()

}

