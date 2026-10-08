package kasireddymahendrareddy.com.mahendrareddyhandson2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var input: EditText
    lateinit var output: TextView
    lateinit var process: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input = findViewById(R.id.etInput)
        output = findViewById(R.id.tvOutput)
        process = findViewById(R.id.btnProcess)

        process.setOnClickListener {

            val userInput = input.text.toString().lowercase()

            val response = aiAgent(userInput)

            output.text = response
        }
    }

    private fun aiAgent(text: String): String {

        return when {

            text.contains("hello") ->
                "Perception: Greeting detected\nReasoning: User greeted\nAction: Hello! How can I help you?"

            text.contains("hi") ->
                "Perception: Greeting detected\nReasoning: Friendly response\nAction: Hi! Welcome."

            text.contains("weather") ->
                "Perception: Weather keyword found\nReasoning: Weather request detected\nAction: Today is sunny."

            text.contains("time") ->
                "Perception: Time keyword detected\nReasoning: User wants current time\nAction: Please check your device clock."

            text.contains("name") ->
                "Perception: Name requested\nReasoning: Identity question\nAction: I am a Rule-Based AI Agent."

            text.contains("bye") ->
                "Perception: Goodbye detected\nReasoning: Conversation ending\nAction: Goodbye! Have a nice day."

            else ->
                "Perception: Unknown input\nReasoning: No matching rule\nAction: Sorry, I don't understand."
        }
    }
}