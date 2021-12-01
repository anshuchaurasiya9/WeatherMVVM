package com.anshu.weathermvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import androidx.activity.viewModels
import com.anshu.weathermvvm.databinding.ActivityMainBinding
import com.anshu.weathermvvm.model.Clouds
import com.anshu.weathermvvm.model.Main
import com.anshu.weathermvvm.model.Weather
import com.anshu.weathermvvm.model.WeatherX
import com.anshu.weathermvvm.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers.Main
import java.text.DecimalFormat


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding

private val ViewModel : WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        ViewModel.weatherResponse.observe(this, { weather ->

            binding.apply {

                tvCity.text = weather.name
                tvTemperature.text = ((weather.main.temp.toString().toDouble()-32)*5/9).toString()
                //f = c - 9/5 * 32
                
            }

        })
    }
}