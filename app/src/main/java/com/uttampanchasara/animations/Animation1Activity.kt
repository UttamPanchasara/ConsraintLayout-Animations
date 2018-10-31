package com.uttampanchasara.animations

import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.v7.app.AppCompatActivity
import android.transition.ChangeBounds
import android.transition.Transition
import android.transition.TransitionManager
import android.view.View
import android.view.animation.AnticipateOvershootInterpolator
import kotlinx.android.synthetic.main.activity_animation1.*

class Animation1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation1)

        btnClick.setOnClickListener(View.OnClickListener { startTransition() })
    }

    private fun startTransition() {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, R.layout.layout_anim_animation1)

        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 1200
        transition.addListener(object : Transition.TransitionListener {
            override fun onTransitionEnd(transition: Transition?) {
                reverseTransition()
            }

            override fun onTransitionResume(transition: Transition?) {

            }

            override fun onTransitionPause(transition: Transition?) {

            }

            override fun onTransitionCancel(transition: Transition?) {
            }

            override fun onTransitionStart(transition: Transition?) {
            }
        })

        TransitionManager.beginDelayedTransition(rootMain, transition)
        constraintSet.applyTo(rootMain)
    }

    private fun reverseTransition() {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, R.layout.activity_animation1)

        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 100

        TransitionManager.beginDelayedTransition(rootMain, transition)
        constraintSet.applyTo(rootMain)
    }
}