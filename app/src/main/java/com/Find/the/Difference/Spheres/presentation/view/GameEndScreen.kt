package com.Find.the.Difference.Spheres.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ArcadeGameFly.SkyCrystallRush.R
import com.Find.the.Difference.Spheres.data.SoundManager
import com.Find.the.Difference.Spheres.presentation.navigation.OutlinedText


@Composable
fun GameEndScreen(isWin: Boolean, time: String, points: String, onMenuClicked: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.background), // Замените на ваше фоновое изображение
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp)
        ) {
            // Текст "Level complete" или "Level failed"
            OutlinedText(
                text = if (isWin) {
                    "Level complete"
                } else {
                    "Level failed"
                },
                outlineColor = Color.Black,
                fillColor = Color.White,
                fontSize = 35.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Панель с результатами времени и очков
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .size(250.dp, 120.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.main_rec),  // Используем main_rec.xml
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedText(
                        text = "Time: $time",
                        outlineColor = Color.Black,
                        fillColor = Color.White,
                        fontSize = 30.sp
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedText(
                        text = "Points: $points",
                        outlineColor = Color.Black,
                        fillColor = Color.White,
                        fontSize = 30.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Кнопка "Menu"
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .size(150.dp, 50.dp)
                    .clickable {
                        SoundManager.playSound()
                        onMenuClicked()
                    },
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rec),  // Используем rec.xml
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
                OutlinedText(
                    text = "Menu",
                    outlineColor = Color.Black,
                    fillColor = Color.White,
                    fontSize = 30.sp
                )

            }
        }
    }
}

