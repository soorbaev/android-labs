package com.example.profilecard // Замените на имя вашего пакета, если отличается

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileListScreen()
                }
            }
        }
    }
}

// 1. Модель данных для пользователя
data class UserProfile(
    val name: String,
    val profession: String,
    val projects: Int,
    val tasks: Int,
    val experienceYears: Int
)

// 2. Компонент одиночной карточки профиля
@Composable
fun ProfileCard(user: UserProfile, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFFF5F5F7))
                .padding(16.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Row 1: Аватар + Имя и профессия
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF2196F3)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = user.name.take(1),
                            color = Color.White,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Column {
                        Text(
                            text = user.name,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1C1B1F)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = user.profession,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    }
                }

                // Row 2: Три блока статистики
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    StatItem(
                        value = "${user.projects}",
                        label = "проектов",
                        modifier = Modifier.weight(1f)
                    )
                    StatItem(
                        value = "${user.tasks}",
                        label = "задач",
                        modifier = Modifier.weight(1f)
                    )
                    StatItem(
                        value = "${user.experienceYears}",
                        label = "лет опыта",
                        modifier = Modifier.weight(1f)
                    )
                }

                // Row 3: Две кнопки
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    OutlinedButton(
                        onClick = { /* Действие для кнопки Написать */ },
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(
                            text = "Написать",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Button(
                        onClick = { /* Действие для кнопки Подписаться */ },
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3))
                    ) {
                        Text(
                            text = "Подписаться",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

// Вспомогательный UI-компонент статистики
@Composable
fun StatItem(value: String, label: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
            .padding(vertical = 10.dp, horizontal = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = value,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1C1B1F)
        )
        Text(
            text = label,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )
    }
}

// 3. Главный экран со списком карточек (Дополнительное задание)
@Composable
fun ProfileListScreen() {
    val users = listOf(
        UserProfile(
            name = "Тилек Абдрахманов",
            profession = "Android-разработчик",
            projects = 12,
            tasks = 48,
            experienceYears = 5
        ),
        UserProfile(
            name = "Айбек Исмаилов",
            profession = "Backend-разработчик",
            projects = 8,
            tasks = 35,
            experienceYears = 3
        ),
        UserProfile(
            name = "Елена Смирнова",
            profession = "UI/UX Designer",
            projects = 15,
            tasks = 62,
            experienceYears = 4
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        users.forEach { user ->
            ProfileCard(user = user)
        }
    }
}

// Предпросмотр в Android Studio
@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    MaterialTheme {
        ProfileListScreen()
    }
}