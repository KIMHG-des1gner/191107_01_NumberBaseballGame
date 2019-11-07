package com.tjoeun.a191107_01_numberbaseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random
import kotlin.random.nextUInt

class MainActivity : BaseActivity() {

    var correctNumArray = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun createQuestion() {
        while (true) {
            var number = Random.nextInt(1, 10)

            if (!questionNumArray.contains(number)) {
                questionNumArray.add(number)
            }

            if (questionNumArray.size == 3) {
                break
            }

        }

        for (num in questionNumArray) {
            Log.d("출제숫자", num.toString())
        }

    }
    override fun setupEvents() {

    }

    override fun setValues() {

    }


}
