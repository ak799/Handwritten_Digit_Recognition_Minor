package com.three_muskeeters.tflite.mnist.classifier

data class Recognition(
    val label: Int,
    val confidence: Float,
    val timeCost: Long
)
