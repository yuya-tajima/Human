package jp.techacademy.yuya.tajima.human

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bob = Human("Bob", 25, "映画")
        bob.say()
        bob.think()

        val alice = Human("Alice", 18, "料理")
        alice.say()
        alice.think()
    }
}