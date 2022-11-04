package com.aska.sandbox.codelab

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {

    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun onRemove(task: WellnessTask) {
        _tasks.remove(task)
    }

    fun onCheckStateChanged(task: WellnessTask, state: Boolean) {
        tasks.find { it.id == task.id }?.let { task ->
            task.isChecked = state
        }
    }
}