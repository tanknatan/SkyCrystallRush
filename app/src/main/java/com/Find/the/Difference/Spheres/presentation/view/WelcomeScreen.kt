//package com.Spot.the.Sphere.colorfnd.presentation.view
//
//import android.app.Activity
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.ArcadeGameFly.SkyCrystallRush.R
//import com.ArcadeGameFly.SkyCrystallRush.data.SoundManager
//
//import com.Spot.the.Sphere.colorfnd.presentation.navigation.OutlinedText
//
//@Composable
//fun WelcomeScreen(onOkClicked: () -> Unit, onPolicyClicked: () -> Unit) {
//
//
//    Box(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        // Background image
//        Image(
//            painter = painterResource(id = R.drawable.background),  // Make sure you have background in resources
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            modifier = Modifier.fillMaxSize()
//        )
//
//        // Content overlay
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            // Main content box with text and buttons
//            Box(
//                modifier = Modifier
//                    .padding(16.dp)
//                    .fillMaxWidth(),
//                contentAlignment = Alignment.Center
//            ) {
//                // Background for the content box
//                Image(
//                    painter = painterResource(id = R.drawable.main_rec),  // Assuming main_rec is your background
//                    contentDescription = null,
//                    contentScale = ContentScale.FillWidth,
//                    modifier = Modifier.fillMaxWidth()
//                )
//
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center,
//                    modifier = Modifier.padding(0.dp)
//                ) {
//                    // Text block "App is free and securely protected. Click 'Ok' to accept our Privacy Policy."
//                    OutlinedText(
//                        text = "App is free\n" +
//                                "\n and securely\n" +
//                                "\n protected.\n" +
//                                "\n Click 'Ok' to \n" +
//                                "\naccept our\n" +
//                                "\n Privacy \n" +
//                                "\nPolicy.",
//                        outlineColor = Color.Black,
//                        fillColor = Color.White,
//                        fontSize = 50.sp
//                    )
//
//                    Spacer(modifier = Modifier.height(16.dp))
//
//
//                }
//            }
//            Box(
//                contentAlignment = Alignment.Center
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.rec),  // Используем police_rec.xml
//                    contentDescription = null,
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .align(Alignment.Center)
//                        .clickable {
//                            SoundManager.playSound()
//                            onPolicyClicked() }
//                )
//
//                OutlinedText(
//                    text = "Policy",
//                    outlineColor = Color.Black,
//                    fillColor = Color.White,
//                    fontSize = 50.sp
//                )
//            }
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            // Ok button
//            Box(
//                contentAlignment = Alignment.Center
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.rec),  // Используем police_rec.xml
//                    contentDescription = null,
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .align(Alignment.Center)
//                        .clickable {
//                            SoundManager.playSound()
//                            onOkClicked() }
//                )
//
//                OutlinedText(
//                    text = "Ok",
//                    outlineColor = Color.Black,
//                    fillColor = Color.White,
//                    fontSize = 50.sp
//                )
//            }
//        }
//    }
//}
