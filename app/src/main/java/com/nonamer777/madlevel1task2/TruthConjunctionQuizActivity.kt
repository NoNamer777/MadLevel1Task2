package com.nonamer777.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nonamer777.madlevel1task2.databinding.ActivityTruthConjunctionQuizBinding

class TruthConjunctionQuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTruthConjunctionQuizBinding

    /** The number of correct answers that were given. */
    private var numberOfCorrectAnswers = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTruthConjunctionQuizBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            checkAnswers()
        }
    }

    /** Determines how many correct answers are given */
    private fun checkAnswers() {
        // Stores the given answers in an array of Strings for processing.
        val answers = arrayOf(
            binding.ptCase1Input.text.toString(),
            binding.ptCase2Input.text.toString(),
            binding.ptCase3Input.text.toString(),
            binding.ptCase4Input.text.toString()
        )

        // Resets the number of correct answers that were given.
        numberOfCorrectAnswers = 4

        /* Loops through the given answers and determines when to decrease
         * the number of correct answers given. */
        for ((index, answer) in answers.withIndex()) {
            when(index) {
                0 -> if (answer != getString(R.string.tv_input_truth)) numberOfCorrectAnswers--
                1, 2, 3 -> if (answer != getString(R.string.tv_input_false)) numberOfCorrectAnswers--
            }
        }
        showResult()
    }

    /** Shows the resulting number of correct answers that were given. */
    private fun showResult() =
        Toast.makeText(
            this,
            getString(R.string.response, numberOfCorrectAnswers),
            Toast.LENGTH_LONG
        ).show()
}
