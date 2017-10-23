package com.jameswong.opengldemo

import android.content.Context
import android.opengl.GLSurfaceView

/**
 * ****************************************************
 * @author jameswong
 * created on: 17/10/23 下午3:26
 * e-mail: PassionateWsj@outlook.com
 * name:
 * desc:
 * ****************************************************
 */
class MyGLSurfaceView(context: Context) : GLSurfaceView(context) {
    init {
        setEGLContextClientVersion(2)
        val mRenderer = MyGLRenderer()
        setRenderer(mRenderer)
        // Render the view only when there is a change in the drawing data
        renderMode = GLSurfaceView.RENDERMODE_WHEN_DIRTY
    }
}