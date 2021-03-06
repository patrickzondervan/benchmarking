package io.github.devrawr.benchmarking

import java.time.temporal.ChronoField

data class BenchmarkResult(
    val globalTime: Long,
    val samples: Long,
    val unit: ChronoField,
    val section: String?
)
{
    val averageTime: Long
        get()
        {
            return globalTime / samples
        }

    override fun toString(): String
    {
        return """
            ---- #${section ?: this.hashCode()} $samples samples ran, results: ----
            [globalTime] = $globalTime
            [average] = $averageTime
            [unit] = $unit
        """.trimIndent()
    }
}