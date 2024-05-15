// MainActivity.kt

package com.example.fyyl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taskTextView: TextView = findViewById(R.id.taskTextView)
        val completeButton: Button = findViewById(R.id.completeButton)

        // Load the daily task from a data source (e.g., local database, API)
        val dailyTask = loadDailyTask()
        taskTextView.text = dailyTask

        completeButton.setOnClickListener {
            // Handle task completion logic
            onTaskCompleted()
        }
    }

    private fun loadDailyTask(): String {
        // Implement logic to load the daily task based on user preferences and goals
        // You can use a local database (e.g., Room) or fetch data from an API
        // For simplicity, we'll return a hardcoded task here
        return "Take a 20-minute nature walk and observe your surroundings"
    }

    private fun onTaskCompleted() {
        // Implement logic to handle task completion
        // Update user progress, give rewards, show congratulations message, etc.
        // For simplicity, we'll just show a toast message here
        Toast.makeText(this, "Task completed!", Toast.LENGTH_SHORT).show()
    }
}