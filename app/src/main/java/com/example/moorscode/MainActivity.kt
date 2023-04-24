package com.example.moorscode

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val convert= findViewById<Button>(R.id.button)
        val toMoors = findViewById<RadioButton>(R.id.radioButton)
        val toEnglish = findViewById<RadioButton>(R.id.radioButton2)
        var resultText =findViewById<TextView>(R.id.textView3)
        var inputText =findViewById<TextInputEditText>(R.id.textInputEditText)

        convert.setOnClickListener {
            if (toEnglish.isChecked)
            {
                val text = inputText.text.toString()
                val s = text.split(" ").toTypedArray()
                var word = ""
                for (i in 0 until s.size) {
                    word += toLanguage(s[i])
                }
                resultText.text=word
            }
            if (toMoors.isChecked)
            {
                val text = inputText.text.toString()
                val c: CharArray = text.toCharArray()
                var word: String? = ""
                for (i in c.indices) {
                    word += toMoors(c[i])
                }
                resultText.text=word
            }
        }
    }


    private fun toMoors(s: Char): String? {
        return when (s) {
            'A', 'a' -> ".-"
            'B', 'b' -> "-..."
            'C', 'c' -> "-.-."
            'D', 'd' -> "-.."
            'E', 'e' -> "."
            'F', 'f' -> "..-."
            'G', 'g' -> "--."
            'H', 'h' -> "...."
            'I', 'i' -> ".."
            'J', 'j' -> ".---"
            'K', 'k' -> "-.-"
            'L', 'l' -> ".-.."
            'M', 'm' -> "--"
            'N', 'n' -> "-."
            'O', 'o' -> "---"
            'P', 'p' -> ".--."
            'Q', 'q' -> "--.-"
            'R', 'r' -> ".-."
            'S', 's' -> "..."
            'T', 't' -> "-"
            'U', 'u' -> "..-"
            'V', 'v' -> "...-"
            'W', 'w' -> ".--"
            'X', 'x' -> "-..-"
            'Y', 'y' -> "-.--"
            'Z', 'z' -> "--.."
            '0' -> "-----"
            '1' -> ".----"
            '2' -> "..---"
            '3' -> "...--"
            '4' -> "....-"
            '5' -> "....."
            '6' -> "-...."
            '7' -> "--..."
            '8' -> "---.."
            '9' -> "----."
            '.' -> ".-.-.-"
            ',' -> "--..--"
            '?' -> "..--.."
            '\'' -> ".----."
            '!' -> "-.-.--"
            '/' -> "-..-."
            '(' -> "-.--."
            ')' -> "-.--.-"
            '&' -> ".-..."
            ':' -> "---..."
            ';' -> "-.-.-."
            '=' -> "-...-"
            '+' -> ".-.-."
            '-' -> "-....-"
            '_' -> "..--.-"
            '"' -> ".-..-."
            '$' -> "...-..-"
            '@' -> ".--.-."
            ' ' -> " "
            else -> null
        }
    }


    private fun toLanguage(s: String): Char {
        return when (s) {
            ".-" -> 'A'
            "-..." -> 'B'
            "-.-." -> 'C'
            "-.." -> 'D'
            "." -> 'E'
            "..-." -> 'F'
            "--." -> 'G'
            "...." -> 'H'
            ".." -> 'I'
            ".---" -> 'J'
            "-.-" -> 'K'
            ".-.." -> 'L'
            "--" -> 'M'
            "-." -> 'N'
            "---" -> 'O'
            ".--." -> 'P'
            "--.-" -> 'Q'
            ".-." -> 'R'
            "..." -> 'S'
            "-" -> 'T'
            "..-" -> 'U'
            "...-" -> 'V'
            ".--" -> 'W'
            "-..-" -> 'X'
            "-.--" -> 'Y'
            "--.." -> 'Z'
            "-----" -> '0'
            ".----" -> '1'
            "..---" -> '2'
            "...--" -> '3'
            "....-" -> '4'
            "....." -> '5'
            "-...." -> '6'
            "--..." -> '7'
            "---.." -> '8'
            "----." -> '9'
            ".-.-.-" -> '.'
            "--..--" -> ','
            "..--.." -> '?'
            ".----." -> '\''
            "-.-.--" -> '!'
            "-..-." -> '/'
            "-.--." -> '('
            "-.--.-" -> ')'
            ".-..." -> '&'
            "---..." -> ':'
            "-.-.-." -> ';'
            "-...-" -> '='
            ".-.-." -> '+'
            "-....-" -> '-'
            "..--.-" -> '_'
            ".-..-." -> '"'
            "...-..-" -> '$'
            ".--.-." -> '@'
            else -> 0.toChar()
        }
    }

}