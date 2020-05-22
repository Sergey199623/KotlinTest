package com.example.testing.kotlintesting.screens.home

import com.example.rumpilstilstkin.kotlintesting.R

enum class HomeScreens(val itemId: Int) {
    FIRST(R.id.action_first),
    SECOND(R.id.action_second),
    THIRD(R.id.action_third);
    companion object {
        val DEFAULT_SCREEN = FIRST
    }
}
