package com.yhjoo.app_boilerplate.utils

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion

object BindUtil {
    @BindingConversion
    @JvmStatic
    fun visibleBoolToInt(visible: Boolean): Int {
        return if (visible) View.VISIBLE else View.GONE
    }

    @BindingAdapter("floatText")
    @JvmStatic
    fun floatToText(
        view: AppCompatTextView,
        float: Float
    ) {
        view.text = String.format("%.1f", float)
    }
}