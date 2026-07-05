package com.example.saucha.services

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import com.example.saucha.detectors.AppDetector

class FocusShieldAccessibilityService : AccessibilityService() {

    companion object {
        private const val TAG = "FocusShield"
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {

        if (event == null) return

        val packageName = event.packageName?.toString() ?: return

        val app = AppDetector.getAppName(packageName)

        if (app != null) {
            Log.d(TAG, "$app detected")
        }
    }

    override fun onInterrupt() {
        Log.d(TAG, "Service interrupted")
    }
}