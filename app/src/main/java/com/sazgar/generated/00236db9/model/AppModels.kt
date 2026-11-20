package com.sazgar.generated.00236db9.model

enum class AppPriority(val labelFa: String) {
    HIGH("بالا"),
    MEDIUM("متوسط"),
    NORMAL("عادی")
}

data class AppRecord(
    val id: String,
    val title: String,
    val category: String = "سوپراپ و خدمات",
    val metricValue: Int = 50,
    val priority: AppPriority = AppPriority.MEDIUM,
    val note: String = "",
    val extraFields: Map<String, String> = emptyMap(),
    val completed: Boolean = false
)