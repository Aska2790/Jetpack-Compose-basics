package com.aska.sandbox.codelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier



@Composable
fun WellnessTaskList(
    tasks: List<WellnessTask>,
    onCloseTask: (WellnessTask) -> Unit,
    onCheckStateChanged: (WellnessTask, Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
        state = rememberLazyListState()
    ) {
        items(tasks, key = { task -> task.id }) { task ->
            WellnessTaskItem(
                taskName = task.label,
                checked = task.isChecked,
                onClose = { onCloseTask(task) },
                onCheckStateChanged = { onCheckStateChanged(task, it) }
            )
        }
    }
}
