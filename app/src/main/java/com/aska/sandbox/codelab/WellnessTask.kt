package com.aska.sandbox.codelab

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

fun getWellnessTasks(): List<WellnessTask> = List(30) { i -> WellnessTask(i, "Task # $i", initialChecked = false) }

class WellnessTask(
    val id: Int,
    val label: String,
    initialChecked: Boolean,
) {
    var isChecked by mutableStateOf(initialChecked)
}