package com.example.saucha.detectors

object AppDetector {

    const val INSTAGRAM = "com.instagram.android"
    const val X = "com.twitter.android"
    const val YOUTUBE = "com.google.android.youtube"
    const val CHROME = "com.android.chrome"

    fun getAppName(packageName: String): String? {

        return when (packageName) {

            INSTAGRAM -> "Instagram"

            X -> "X"

            YOUTUBE -> "YouTube"

            CHROME -> "Chrome"

            else -> null
        }
    }
}