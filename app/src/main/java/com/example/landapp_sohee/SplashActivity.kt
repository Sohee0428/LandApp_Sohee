package com.example.landapp_sohee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        각종 데이터 확인 등 => 앱을 실행하기 전에 필요한 사전 작업 수행행

       val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed( {

//            205초 후에 실행할 내용 작성
//            메인화면으로 이동 + 지금 화면 종료

            val myIntent = Intent(this, MainActivity::class.java)

            startActivity(myIntent)

            finish()


        }, 2500 )
    }
}