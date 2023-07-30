package com.test.paparazziwithdatabinding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import com.test.paparazziwithdatabinding.databinding.FragmentDashboardBinding
import com.test.paparazziwithdatabinding.ui.HelloPaparazzi
import org.junit.Rule
import org.junit.Test

class PaparazziDataBindingTest {

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5,
        theme = "android:Theme.Material.Light.NoActionBar"
    )

    @Test
    fun dataBindingTest() {
        val view = FragmentDashboardBinding.inflate(paparazzi.layoutInflater)
        paparazzi.snapshot(view.root)
    }

    @Test
    fun compose() {
        paparazzi.snapshot { HelloPaparazzi() }
    }
}