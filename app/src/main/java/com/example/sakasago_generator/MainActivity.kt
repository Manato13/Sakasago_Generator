package com.example.sakasago_generator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.Manifest
import android.view.View
import android.content.pm.PackageManager
import android.media.MediaPlayer
import android.media.MediaRecorder
import java.io.IOException
import android.util.Log
import android.widget.Button
import androidx.core.app.ActivityCompat

import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}