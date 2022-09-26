package com.compose.composetestapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.compose.composetestapp.ui.cards.*
import com.compose.composetestapp.ui.screen.FirstScreenUi
import com.compose.composetestapp.ui.theme.ComposeTestAppTheme
import com.compose.composetestapp.viewmodel.RstRepoViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: RstRepoViewModel by lazy {
        ViewModelProvider(this).get(RstRepoViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.refreshMainScreenData()
        viewModel.refreshFoodData()

        viewModel.allLiveData.observe(this) { response ->
            if (response == null) {
                Toast.makeText(this, "пустой ответ от сервера", Toast.LENGTH_SHORT)
                    .show()
                return@observe
            }

            setContent {
                ComposeTestAppTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        FirstScreenUi(response).FirstScreen()
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestAppTheme {
        Column {
            SmallCardUi().SmallCard()
            MiddleCardUi().MiddleCard()
        }

    }
}