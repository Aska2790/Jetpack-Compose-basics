package com.aska.sandbox.codelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    viewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTaskList(
            tasks = viewModel.tasks,
            onCloseTask = { task ->
                viewModel.onRemove(task)
            },
            onCheckStateChanged = { task, state->
                viewModel.onCheckStateChanged(task, state)
            }
        )
    }
}

