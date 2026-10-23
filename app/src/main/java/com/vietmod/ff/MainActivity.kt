package com.vietmod.ff

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
                    val tv = TextView(this)
                            tv.text = "Xin chào! App đang chạy."
                                    tv.textSize = 20f
                                            setContentView(tv)
                                                }
                                                }