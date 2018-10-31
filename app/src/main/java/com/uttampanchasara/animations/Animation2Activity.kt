package com.uttampanchasara.animations

import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.v7.app.AppCompatActivity
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.View
import android.view.animation.AnticipateOvershootInterpolator
import kotlinx.android.synthetic.main.activity_animation2.*

/**
 *
 * @author <a href="https://github.com/UttamPanchasara">Uttam Panchasara</a>
 * @since 10/31/2018
 */
class Animation2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation2)

        txtTapToView.setOnClickListener(View.OnClickListener {
            startTransition()
        })

        btnClose.setOnClickListener(View.OnClickListener {
            reverceTransition()
        })
    }

    private fun startTransition() {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, R.layout.layout_anim_animation2)

        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 600
        TransitionManager.beginDelayedTransition(rootRecipe, transition)
        constraintSet.applyTo(rootRecipe)
    }

    private fun reverceTransition() {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, R.layout.activity_animation2)

        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 600
        TransitionManager.beginDelayedTransition(rootRecipe, transition)
        constraintSet.applyTo(rootRecipe)
    }
}