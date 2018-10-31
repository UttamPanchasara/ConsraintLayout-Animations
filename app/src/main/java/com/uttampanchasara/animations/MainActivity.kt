package com.uttampanchasara.animations

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 * @author <a href="https://github.com/UttamPanchasara">Uttam Panchasara</a>
 * @since 10/31/2018
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.txtAnimation1 -> startAnimation1()
            R.id.txtAnimation2 -> startAnimation2()
        }
    }

    fun startAnimation1() {
        startActivity(Intent(this, Animation1Activity::class.java))
    }

    fun startAnimation2() {
        startActivity(Intent(this, Animation2Activity::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtAnimation1.setOnClickListener(this)
        txtAnimation2.setOnClickListener(this)
    }
}