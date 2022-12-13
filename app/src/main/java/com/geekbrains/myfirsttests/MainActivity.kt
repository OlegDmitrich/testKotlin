package com.geekbrains.myfirsttests

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.geekbrains.myfirsttests.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val emailValidator = EmailValidator()
    private val testClass = NewClassForTest()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            emailInput.addTextChangedListener(emailValidator)

            saveButton.setOnClickListener {
                if (emailValidator.isValid) {
                    Toast.makeText(this@MainActivity, getString(R.string.valid_email), Toast.LENGTH_SHORT).show()
                } else {
                    val errorEmail = getString(R.string.invalid_email)
                    emailInput.error = errorEmail
                    Toast.makeText(this@MainActivity, errorEmail, Toast.LENGTH_SHORT).show()
                }
            }
            numButton.setOnClickListener{

                val numNull = numInput.text.toString()
                val num = Integer.parseInt(numInput.text.toString())
                testClass.funNull(numNull)
              if(testClass.sumN(num) == 8){
                  Toast.makeText(this@MainActivity, getString(R.string.valid_email), Toast.LENGTH_SHORT).show()
              }else{
                  val errorEmail = getString(R.string.num)
                  emailInput.error = errorEmail
                  Toast.makeText(this@MainActivity, errorEmail, Toast.LENGTH_SHORT).show()
              }


            }
        }
    }
}
