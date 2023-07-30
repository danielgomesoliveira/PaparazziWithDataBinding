package com.test.paparazziwithdatabinding

import androidx.compose.ui.unit.dp
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.ide.common.rendering.api.SessionParams
import com.test.paparazziwithdatabinding.ui.AvatarGlideImage
import org.junit.Rule
import org.junit.Test

class PaparazziGlideImageTest {

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_5,
        renderingMode = SessionParams.RenderingMode.SHRINK
    )

    @Test
    fun avatarOne() {
        paparazzi.snapshot {
            AvatarGlideImage(size = 40.dp)
        }
    }

    @Test
    fun avatarTwo() {
        paparazzi.snapshot {
            AvatarGlideImage(size = 40.dp)
        }
    }
}