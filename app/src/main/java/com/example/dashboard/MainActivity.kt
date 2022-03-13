package com.example.dashboard

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import com.example.dashboard.R
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar.max=1000
        val currentProgress=300
            ObjectAnimator.ofInt(progressBar,"Usage",currentProgress)
                .setDuration(2000)
                .start()
       // run("https://api.mocklets.com/mock68182/screentime")

    }

}