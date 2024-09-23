//package com.Spot.the.Sphere.colorfnd.presentation.view
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.ArcadeGameFly.SkyCrystallRush.R
//import com.ArcadeGameFly.SkyCrystallRush.data.SoundManager
//
//import com.Spot.the.Sphere.colorfnd.presentation.navigation.OutlinedText
//
//
//@Composable
//fun PolicyScreen(onBackClicked: () -> Unit) {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//    ) {
//        // Фоновое изображение (если нужно)
//        Image(
//            painter = painterResource(id = R.drawable.background), // Замените на ваше фоновое изображение
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            modifier = Modifier.fillMaxSize()
//        )
//
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp)
//        ) {
//            // Пространство между верхом экрана и `main_rec`
//
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 16.dp)// Заполняет всю ширину
//                , // Высота будет определяться на основе минимального размера содержимого
//                contentAlignment = Alignment.Center
//            ) {
//                // Изображение `rec_p` растягивается на всю ширину `Column`
//
//
//                // Оставляем `policy` изображение как есть, если необходимо
//                OutlinedText(
//                    text = "Policy",
//                    outlineColor = Color.Black,
//                    fillColor = Color.White,
//                    fontSize = 35.sp
//                )
//            }
//            Spacer(modifier = Modifier.weight(1f))
//            // `main_rec` с фиксированным заголовком "Policy" и прокручиваемым текстом
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .weight(8f)
//                    .padding(bottom = 16.dp) // Добавление отступа снизу для "Back"
//            ) {
//                // Изображение `main_rec` как фон
//                Image(
//                    painter = painterResource(id = R.drawable.big_rec), // Замените на ваше изображение
//                    contentDescription = null,
//                    contentScale = ContentScale.FillBounds, // Заполните весь Box
//                    modifier = Modifier
//                        .fillMaxSize()
//                )
//
//
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(start = 0.dp, end = 0.dp, top = 0.dp, bottom = 16.dp)
//                ) {
//                    // Заголовок "Policy"
//
//
//
//                    // Прокручиваемый текст под заголовком
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .verticalScroll(rememberScrollState())
//                            .padding(start = 16.dp, end = 16.dp, top = 10.dp, bottom = 20.dp)
//                    ) {
//                        Text(
//                            text = """
//                Privacy Policy
//                This privacy policy applies to the Spot the Sphere app (hereby referred to as “Application”) for mobile devices that was created by (hereby referred to as “Service Provider”) as a Free service. This service is intended for use “AS IS”.
//
//                Information Collection and Use
//                The Application collects information when you download and use it. This information may include information such as:
//
//                - Your device's Internet Protocol address (e.g. IP address)
//                - The pages of the Application that you visit, the time and date of your visit, the time spent on those pages
//                - The time spent on the Application
//                - The operating system you use on your mobile device
//
//                The Application does not gather precise information about the location of your mobile device.
//            """.trimIndent(),
//                            fontSize = 20.sp,
//                            color = Color.Gray
//                        )
//
//                        Spacer(modifier = Modifier.height(16.dp))
//
//                        // Часть 2: Третьи лица и права отказа
//                        Text(
//                            text = """
//                Third Party Access
//                Only aggregated, anonymized data is periodically transmitted to external services to aid the Service Provider in improving the Application and their service. The Service Provider may share your information with third parties in the ways that are described in this privacy statement.
//
//                Please note that the Application utilizes third-party services that have their own Privacy Policy about handling data. Below are the links to the Privacy Policy of the third-party service providers used by the Application:
//
//                - Google Play Services
//
//                The Service Provider may disclose User Provided and Automatically Collected Information:
//
//                - as required by law, such as to comply with a subpoena, or similar legal process;
//                - when they believe in good faith that disclosure is necessary to protect their rights, protect your safety or the safety of others, investigate fraud, or respond to a government request;
//                - with their trusted services providers who work on their behalf, do not have an independent use of the information we disclose to them, and have agreed to adhere to the rules set forth in this privacy statement.
//
//                Opt-Out Rights
//                You can stop all collection of information by the Application easily by uninstalling it. You may use the standard uninstall processes as may be available as part of your mobile device or via the mobile application marketplace or network.
//            """.trimIndent(),
//                            fontSize = 20.sp,
//                            color = Color.Gray
//                        )
//
//                        Spacer(modifier = Modifier.height(16.dp))
//
//                        // Часть 3: Политика хранения данных и дети
//                        Text(
//                            text = """
//                Data Retention Policy
//                The Service Provider will retain User Provided data for as long as you use the Application and for a reasonable time thereafter. If you'd like them to delete User Provided Data that you have provided via the Application, please contact them at Spot-the-Sphere@develop.net and they will respond in a reasonable time.
//
//                Children
//                The Service Provider does not use the Application to knowingly solicit data from or market to children under the age of 13.
//
//                The Application does not address anyone under the age of 13. The Service Provider does not knowingly collect personally identifiable information from children under 13 years of age. In the case the Service Provider discover that a child under 13 has provided personal information, the Service Provider will immediately delete this from their servers. If you are a parent or guardian and you are aware that your child has provided us with personal information, please contact the Service Provider (Spot-the-Sphere@develop.net) so that they will be able to take the necessary actions.
//            """.trimIndent(),
//                            fontSize = 20.sp,
//                            color = Color.Gray
//                        )
//
//                        Spacer(modifier = Modifier.height(16.dp))
//
//                        // Часть 4: Безопасность, изменения и контактная информация
//                        Text(
//                            text = """
//                Security
//                The Service Provider is concerned about safeguarding the confidentiality of your information. The Service Provider provides physical, electronic, and procedural safeguards to protect information the Service Provider processes and maintains.
//
//                Changes
//                This Privacy Policy may be updated from time to time for any reason. The Service Provider will notify you of any changes to the Privacy Policy by updating this page with the new Privacy Policy. You are advised to consult this Privacy Policy regularly for any changes, as continued use is deemed approval of all changes.
//
//                This privacy policy is effective as of 2024-08-27
//
//                Your Consent
//                By using the Application, you are consenting to the processing of your information as set forth in this Privacy Policy now and as amended by us.
//
//                Contact Us
//                If you have any questions regarding privacy while using the Application, or have questions about the practices, please contact the Service Provider via email at Spot-the-Sphere@develop.net.
//            """.trimIndent(),
//                            fontSize = 20.sp,
//                            color = Color.Gray
//                        )
//
//
//                    }
//                }
//            }
//
//            // Пространство между `main_rec` и кнопкой "Back"
//            Spacer(modifier = Modifier.weight(1f))
//
//            // Кнопка "Back"
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(vertical = 16.dp),
//                contentAlignment = Alignment.Center
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.rec),  // Используем police_rec.xml
//                    contentDescription = null,
//                    contentScale = ContentScale.FillWidth,
//                    modifier = Modifier
//                        .align(Alignment.Center)
//                        .clickable {
//                            SoundManager.playSound()
//                            onBackClicked() }
//                )
//
//                OutlinedText(
//                    text = "Ok",
//                    outlineColor = Color.Black,
//                    fillColor = Color.White,
//                    fontSize = 35.sp
//                )
//            }
//        }
//    }
//}