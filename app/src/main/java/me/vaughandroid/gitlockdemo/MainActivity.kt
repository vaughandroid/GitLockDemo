package me.vaughandroid.gitlockdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import me.vaughandroid.android_library.AndroidLibrary
import me.vaughandroid.kotlin_library.KotlinLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        setContentView(R.layout.activity_main)

        kotlinLibraryVersion.text = KotlinLibrary.version
        androidLibraryVersion.text = AndroidLibrary.version
    }
}