package com.trkmn.gifanim

import android.graphics.drawable.Drawable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.vectordrawable.graphics.drawable.Animatable2Compat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.gif.GifDrawable
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget

@Composable
fun GifPlayer(
    gifResId: Int,
    modifier: Modifier = Modifier,
    width: Int = 200,
    height: Int = 200,
    loopCount: Int = Int.MAX_VALUE,
    onStart: (() -> Unit)? = null,
    onStop: (() -> Unit)? = null
) {
    val context = LocalContext.current

    AndroidView(
        factory = {
            val imageView = android.widget.ImageView(context)

            Glide.with(context)
                .asGif()
                .load(gifResId)
                .apply(RequestOptions().override(width, height))
                .into(object : CustomTarget<GifDrawable>() {
                    override fun onResourceReady(
                        resource: GifDrawable,
                        transition: com.bumptech.glide.request.transition.Transition<in GifDrawable>?
                    ) {
                        onStart?.invoke()

                        resource.setLoopCount(loopCount)
                        resource.registerAnimationCallback(object : Animatable2Compat.AnimationCallback() {
                            override fun onAnimationEnd(drawable: Drawable?) {
                                onStop?.invoke()
                            }
                        })
                        resource.start()
                        imageView.setImageDrawable(resource)
                    }

                    override fun onLoadCleared(placeholder: Drawable?) {
                        imageView.setImageDrawable(placeholder)
                    }
                })

            imageView
        },
        modifier = modifier.size(width.dp, height.dp)
    )
}

