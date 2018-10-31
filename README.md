# ConsraintLayout-Animations
This is a sample project for animations which is created using constraint layout.

| Animation-1 | Animation-2 |
| ------------------ | --------------------------- |
| <img src="https://i.imgur.com/tFuTq75.gif" height="400" alt="Screenshot"/>  | <img src="https://i.imgur.com/ONOfkT9.gif" height="400" alt="Screenshot"/> |


## Quick Start of Animations :

### 1. Required two layout to animate
First layout, In which will show the initial views with initial position and In Second layout will add the views with end position which we want to animation.

### 2. Animation Logic
First, we need to create a new instance of `ConstraintSet`, Now clone the constraints of the second layout (second_layout.xml) by calling the clone() method:

```kotlin
val constraintSet = ConstraintSet()
constraintSet.clone(this, R.layout.second_layout)
```

Now, let’s create the transition object used to set the interpolator and the duration of animation:
```kotlin
val transition = ChangeBounds()
transition.interpolator = AnticipateOvershootInterpolator(1.0f)
transition.duration = 1200
```

And, In the last, we need to call the `TransitionManager.beginDelayedTransition()` used to create a new scene and to run the transition on the next rendering frame. Lastly, we call `applyTo()` to finally start the animation.
```kotlin
TransitionManager.beginDelayedTransition(constraint, transition)

constraintSet.applyTo(constraint)
```

### Final Animation Code :
```kotlin
private fun startAnimation(){
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, R.layout.second_layout)

        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 1200

        TransitionManager.beginDelayedTransition(constraint, transition) // where `constraint` is : root element of layout
        constraintSet.applyTo(constraint)
    }
```

### Done! Enjoy creating awesome animations using ConstraintLayout

## References 

- https://android.jlelse.eu/build-awesome-animations-with-7-lines-of-code-using-constraintlayout-854e8fd3ad93

## Inspired by this animation

- https://www.uplabs.com/posts/success-page-for-vyapar

## Questions?
 
 **Ping-Me on :** 
 
 ![alt text][1.1] : https://twitter.com/utm_panchasara
 
 ![alt text][2.2] : https://www.facebook.com/UttamPanchasara94
 
 [1.1]: http://i.imgur.com/wWzX9uB.png (twitter icon with padding)
 [2.2]: http://i.imgur.com/fep1WsG.png (facebook icon without padding)
