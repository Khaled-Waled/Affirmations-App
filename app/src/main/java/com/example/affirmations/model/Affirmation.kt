package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//data class must have at least one item
data class Affirmation(@StringRes val stringResourceId:Int, @DrawableRes val imageResourceId:Int)
{

}