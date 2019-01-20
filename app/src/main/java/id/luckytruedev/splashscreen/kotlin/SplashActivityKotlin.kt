package id.luckytruedev.splashscreen.kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import id.luckytruedev.splashscreen.R

class SplashActivityKotlin : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.splash_main)

        Handler().postDelayed(object : Runnable {


            override fun run() {
                val i = Intent(this@SplashActivityKotlin, MainActivityKotlin::class.java)
                startActivity(i)


                //selesai Splashscreen
                this.finish()
            }

            private fun finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval.toLong())

    }

    companion object {

        //Set waktu lama splashscreen
        private val splashInterval = 4000
    }

}