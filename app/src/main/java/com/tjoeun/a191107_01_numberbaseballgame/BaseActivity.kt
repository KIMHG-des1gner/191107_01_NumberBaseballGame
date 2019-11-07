package com.tjoeun.a191107_01_numberbaseballgame

import androidx.appcompat.app.AppCompatActivity

abstract  class BaseActivity : AppCompatActivity(){

    abstract val questionNumArray: Any

    abstract fun setupEvents()
    abstract fun setValues()



}