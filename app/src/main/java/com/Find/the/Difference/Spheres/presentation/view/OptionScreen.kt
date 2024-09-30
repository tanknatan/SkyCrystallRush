package com.Find.the.Difference.Spheres.presentation.view

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Find.the.Difference.Spheres.R
import com.Find.the.Difference.Spheres.data.Prefs
import com.Find.the.Difference.Spheres.data.SoundManager
import com.Find.the.Difference.Spheres.presentation.navigation.OutlinedText


@Composable
fun OptionsScreen(onBackClicked: () -> Unit) {
    val context = LocalContext.current
    val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("settings", Context.MODE_PRIVATE)

    var musicVolume by remember { mutableFloatStateOf(Prefs.music) }
    var soundVolume by remember { mutableFloatStateOf(Prefs.sound) }

    // Обновление значений громкости при изменении
    LaunchedEffect(musicVolume) {
        Prefs.music = musicVolume
        SoundManager.setVolumeMusic()
    }

    LaunchedEffect(soundVolume) {
        Prefs.sound = soundVolume
        SoundManager.setVolumeSound()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB6C1)) // Используйте нужный цвет или фон
    ) {
        Image(
            painter = painterResource(id = R.drawable.background), // Замените на ваше фоновое изображение
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 16.dp, end = 16.dp, top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Основной контейнер с фоном main_rec для заголовка и слайдеров
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.main_rec), // Используйте ваше изображение main_rec
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp) // Уменьшаем высоту main_rec
                )

                Column(
                    modifier = Modifier
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Заголовок "Settings" на фоне main_rec
                    OutlinedText(
                        text = "Settings",
                        outlineColor = Color.Black,
                        fillColor = Color.White,
                        fontSize = 40.sp
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Sound Volume настройка с текстом слева от слайдера
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                    ) {
                        OutlinedText(
                            text = "Sound:",
                            outlineColor = Color.Black,
                            fillColor = Color.White,
                            fontSize = 24.sp,
                            modifier = Modifier.weight(1f) // Равное распределение
                        )
                        Slider(
                            value = soundVolume,
                            onValueChange = { newValue ->
                                soundVolume = newValue
                                sharedPreferences.edit().putFloat("soundVolume", newValue).apply()
                            },
                            colors = SliderDefaults.colors(
                                thumbColor = Color(0xFF87FF7A), // Цвет ползунка
                                activeTrackColor = Color(0xFF87FF7A), // Цвет активного трека
                                inactiveTrackColor = Color.White, // Цвет неактивного трека
                            ),
                            modifier = Modifier.weight(2f), // Делаем слайдер шире
                            valueRange = 0f..1f,
                            steps = 10 // Количество шагов
                        )
                    }

                    // Music Volume настройка с текстом слева от слайдера
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                    ) {
                        OutlinedText(
                            text = "Music:",
                            outlineColor = Color.Black,
                            fillColor = Color.White,
                            fontSize = 24.sp,
                            modifier = Modifier.weight(1f) // Равное распределение
                        )
                        Slider(
                            value = musicVolume,
                            onValueChange = { newValue ->
                                musicVolume = newValue
                                sharedPreferences.edit().putFloat("musicVolume", newValue).apply()
                            },
                            colors = SliderDefaults.colors(
                                thumbColor = Color(0xFFEB4A70), // Цвет ползунка
                                activeTrackColor = Color(0xFFEB4A70), // Цвет активного трека
                                inactiveTrackColor = Color.White, // Цвет неактивного трека
                            ),
                            modifier = Modifier.weight(2f), // Делаем слайдер шире
                            valueRange = 0f..1f,
                            steps = 10 // Количество шагов
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Back Button
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 40.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rec), // Фон для кнопки "Back"
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(onClick = onBackClicked)
                )
                OutlinedText(
                    text = "Back",
                    outlineColor = Color.Black,
                    fillColor = Color.White,
                    fontSize = 50.sp
                )
            }
        }
    }
}
