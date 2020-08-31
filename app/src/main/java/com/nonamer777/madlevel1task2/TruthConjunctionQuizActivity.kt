package com.nonamer777.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nonamer777.madlevel1task2.databinding.ActivityTruthConjunctionQuizBinding

class TruthConjunctionQuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTruthConjunctionQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTruthConjunctionQuizBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}