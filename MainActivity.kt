package com.example.assignment_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment_2.ui.theme.Assignment_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment_2Theme {
                // A surface container using the 'background' color from the theme

                //NextScreen()
               backgroundScreen()

            }
        }
    }
}

@Composable
fun backgroundScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(2f)
        ) {
            // Display your image here
            Image(
                painter = painterResource(id = R.drawable.meow),
                contentDescription = "Background",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize(),

            )
        // Top Row with icons and text
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp, start = 18.dp, end = 18.dp)
                .background(Color.Transparent)
            ,
            horizontalArrangement = Arrangement.SpaceBetween,

            ) {
            // Left side of the row (Navigation icon and "Mumbai" text)
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Back",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = "Mumbai",
                    color = Color.White,
                    modifier = Modifier.padding(start = 8.dp),
                    fontSize = 24.sp,
                )
            }

            // Right side of the row (Settings and Search icons)
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    tint = Color.White,
                    modifier = Modifier
                        .size(30.dp)
                        .padding(end = 8.dp)
                )
                Icon(
                    imageVector = Icons.Default.Build,
                    contentDescription = "Settings",
                    tint = Color.White,
                    modifier = Modifier
                        .size(28.dp)
                        .padding(start = 8.dp)
                )
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color.Transparent)
            ,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 70.dp),
            ) {
                Text(
                    text = "28",
                    color = Color.White,
                    modifier = Modifier.padding(start = 1.dp),
                    fontSize = 70.sp,
                )

                Column() {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "C",
                            color = Color.White,
                            modifier = Modifier.padding(start = 3.dp, top = 2.dp),
                            fontSize = 20.sp,
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "SUNNY",
                            color = Color.White,
                            modifier = Modifier.padding(start = 3.dp, top = 8.dp),
                            fontSize = 20.sp,
                        )
                    }
                }
            }
            Column(
                modifier = Modifier.padding(top = 90.dp),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "13TH FEB, SAT",
                        color = Color.White,
                        modifier = Modifier.padding(start = 18.dp, top = 8.dp),
                        fontSize = 18.sp,
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "02:00PM",
                        color = Color.White,
                        modifier = Modifier.padding(start = 65.dp, top = 3.dp),
                        fontSize = 18.sp,
                    )
                }
            }
        }

        // Image and white background

        }

        //Bottom Box
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .weight(0.5f)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, start = 25.dp, end = 25.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    // First Column
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "SAT",
                            color = Color(0xFFC6297F),
                            fontSize = 18.sp,
                            modifier = Modifier.padding(bottom = 8.dp, start = 3.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.cloud),
                            contentDescription = "Background",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .size(38.dp)
                                .padding(bottom = 8.dp)
                        )

                        Text(
                            text = "28",
                            color = Color(0xFFC6297F),
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 6.dp)
                        )
                    }

                    // Second Column
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "SAT",
                            color = Color.Black,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(bottom = 8.dp, start = 3.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.sun),
                            contentDescription = "Background",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .size(38.dp)
                                .padding(bottom = 8.dp)
                        )
                        Text(
                            text = "28",
                            color = Color.Black,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 6.dp)
                        )
                    }

                    // Third Column
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "SAT",
                            color = Color.Black,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(bottom = 8.dp, start = 3.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.partlycloudy),
                            contentDescription = "Background",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .size(38.dp)
                                .padding(bottom = 8.dp)
                        )
                        Text(
                            text = "28",
                            color = Color.Black,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 6.dp)
                        )
                    }

                    // Fourth Column
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "SAT",
                            color = Color.Black,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(bottom = 8.dp, start = 3.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.sun),
                            contentDescription = "Background",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .size(38.dp)
                                .padding(bottom = 8.dp)
                        )
                        Text(
                            text = "28",
                            color = Color.Black,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 6.dp)
                        )
                    }

                    // Fifth Column
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "SAT",
                            color = Color.Black,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(bottom = 8.dp, start = 3.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.clouddd),
                            contentDescription = "Background",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .size(38.dp)
                                .padding(bottom = 8.dp)
                        )
                        Text(
                            text = "28",
                            color = Color.Black,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(start = 6.dp)
                        )
                    }
                }
            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NextScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Row 1
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .background(Color.White)
        ) {
            // Column 1
            Box(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxHeight()
                    .background(Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(10.dp)
                ) {
                    // Back arrow and text "Location"
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier.padding(top = 13.dp, bottom = 30.dp)

                    ) {
                        Row() {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = null,
                                tint = Color(0xFFb6b5c4),
                                modifier = Modifier.padding(top = 3.dp)
                            )
                            Text(
                                text = "LOCATIONS",
                                fontSize = 20.sp,
                                color = Color(0xFF7c7c9d),
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 13.dp, bottom = 15.dp)
                            )
                        }
                        Row() {


                            Icon(
                                imageVector = Icons.Default.MoreVert,
                                contentDescription = null,
                                tint = Color(0xFFb6b5c4),
                                modifier = Modifier.padding(start = 78.dp)
                            )
                        }
                    }

                    // Description
                    val paragraph = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontSize = 19.sp, color = Color(0xFF7c7c9d))) {
                            append("You are currently getting results for popular places \nfrom ")
                        }
                        withStyle(style = SpanStyle(fontSize = 19.sp, color = Color(0xFFf996c4), fontWeight = FontWeight.Bold)) {
                            append("India")
                        }
                    }
                    Text(text = paragraph,
                        Modifier.padding(bottom = 23.dp).padding(start = 8.dp))


                    // Choose Place Button
                    Button(
                        onClick = { /* Handle button click here */ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 90.dp, top = 8.dp, bottom = 8.dp)
                            .height(50.dp)
                            .width(100.dp),
                        shape = RoundedCornerShape(25.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFFf0f0f9))
                    ) {
                        Text(
                            text = "Choose place",
                            color = Color(0xFF555ac8),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }
            }

            // Column 2
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFf0f0f9)),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("+",  color = Color(0xFF7c7c9d), fontSize = 30.sp,
                        modifier = Modifier.padding(bottom = 5.dp))
                    Text("ADD PLACE", color = Color(0xFF7c7c9d), fontSize = 18.sp
                    , fontWeight = FontWeight.Bold)
                }
            }
        }

        // Row 2 - Mumbai
        CustomRowWithText("Mumbai",Color.White, "Humidity: 51%", "28, Sunny", Color(0xFF555ac8), Color(0xFFf996c4))

        // Row 3 - Indore
        CustomRowWithText("Indore", Color(0xFF7c7c9d), "Humidity: 35%", "24, Smoke", Color.White, Color(0xFF555ac8))

        // Row 4 - Bhopal
        CustomRowWithText("Bhopal",Color(0xFF7c7c9d), "Humidity: 35%", "21, Clear", Color.White, Color(0xFF555ac8))

        // Row 5 (Empty Row)
        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Composable
fun CustomRowWithText(city: String, backgroundColor1: Color, line1: String, line2: String, backgroundColor: Color, weatherColor: Color) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .background(backgroundColor),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Column(
            modifier = Modifier.padding(28.dp)
        ) {
            Text(city, fontSize = 23.sp, color = backgroundColor1,
                modifier = Modifier.padding(bottom = 10.dp))
            Text(line1, fontSize = 20.sp, color = Color(0xFFb6b5c4))
        }
        Column(
            modifier = Modifier.padding(top = 40.dp, end = 30.dp)
        ) {
            Text(line2, fontSize = 20.sp, color = weatherColor,
                fontWeight = FontWeight.Bold )
        }

        }
    }

@Preview(showBackground = true)
@Composable
fun DemoScreen(){
   backgroundScreen()
   // NextScreen()
}
