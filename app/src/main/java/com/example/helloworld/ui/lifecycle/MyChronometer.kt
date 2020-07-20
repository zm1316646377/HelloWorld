package com.example.helloworld.ui.lifecycle

import android.content.Context
import android.os.SystemClock
import android.util.AttributeSet
import android.widget.Chronometer
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyChronometer: Chronometer, LifecycleObserver {

    private var mElapsedTime: Long = 0

    constructor(context: Context) : this(context, null)

    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private fun resumeMeter() {
        base = SystemClock.elapsedRealtime() - mElapsedTime
        start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private fun pauseMeter() {
        mElapsedTime = SystemClock.elapsedRealtime() - base
        stop()
    }

}