package com.dickie.mwangai.model

import androidx.compose.ui.graphics.vector.ImageVector

data class DashboardStat(
    val tittle:String,
    val value:String,
    val icon:ImageVector,
    val background: androidx.compose.ui.graphics.Color
)
data class QuickAction(
    val tittle: String,
    val icon: ImageVector
)