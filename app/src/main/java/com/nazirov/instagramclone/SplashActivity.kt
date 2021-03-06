package com.nazirov.instagramclone

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)
        initViews()
    }

    private fun initViews() {

//        val fontFamily = ResourcesCompat.getFont(this, R.font.chilanka)
//        font_textview.typeface = fontFamily
        countDownTimer()
    }

    private fun countDownTimer() {
        object : CountDownTimer(1000, 2000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                openSigInActivity()
            }
        }.start()
    }
    fun openSigInActivity(){
        var intent = Intent(this,SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
}