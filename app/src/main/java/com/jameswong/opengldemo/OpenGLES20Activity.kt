package com.jameswong.opengldemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class OpenGLES20Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_open_gles20)
        val mGLView = MyGLSurfaceView(this)
        setContentView(mGLView)
    }
}
