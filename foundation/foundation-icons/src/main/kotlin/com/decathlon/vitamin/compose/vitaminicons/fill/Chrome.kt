package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Chrome: ImageVector
    get() {
        if (_chrome != null) {
            return _chrome!!
        }
        _chrome = Builder(name = "Chrome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(9.1981f, 1.9968f, 6.524f, 3.1723f, 4.632f, 5.239f)
                lineTo(7.401f, 10.035f)
                curveTo(8.1882f, 8.1939f, 9.9977f, 6.9998f, 12.0f, 7.0f)
                horizontalLineTo(20.662f)
                curveTo(18.876f, 3.9049f, 15.5735f, 1.9986f, 12.0f, 2.0f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 16.777f, 5.35f, 20.771f, 9.827f, 21.763f)
                lineTo(12.598f, 16.965f)
                curveTo(10.5751f, 17.2092f, 8.6064f, 16.2011f, 7.622f, 14.417f)
                lineTo(3.339f, 6.998f)
                curveTo(2.487f, 8.47f, 2.0f, 10.178f, 2.0f, 12.0f)
                close()
                moveTo(16.287f, 14.575f)
                lineTo(12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 10.955f, 21.84f, 9.947f, 21.542f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(16.6505f, 9.8647f, 17.0016f, 10.9179f, 17.0f, 12.0f)
                curveTo(17.0015f, 12.9073f, 16.7549f, 13.7977f, 16.287f, 14.575f)
                close()
                moveTo(14.572f, 13.545f)
                curveTo(14.0253f, 14.4564f, 13.0369f, 15.0104f, 11.9741f, 15.0012f)
                curveTo(10.9113f, 14.9919f, 9.9328f, 14.4208f, 9.402f, 13.5f)
                lineTo(9.373f, 13.45f)
                curveTo(8.6732f, 12.1818f, 8.9794f, 10.5946f, 10.1009f, 9.6779f)
                curveTo(11.2224f, 8.7611f, 12.8387f, 8.7766f, 13.9424f, 9.7146f)
                curveTo(15.0462f, 10.6527f, 15.322f, 12.2454f, 14.598f, 13.5f)
                lineTo(14.572f, 13.545f)
                close()
            }
        }
        .build()
        return _chrome!!
    }

private var _chrome: ImageVector? = null
