package com.ozancanguz.coinstats.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ozancanguz.coinstats.R

class Util {

    companion object{
        fun ImageView.loadImage(uri: String?) {
            val options = RequestOptions()

                .error(R.mipmap.ic_launcher)
            Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(uri)
                .into(this)

        }
    }
}