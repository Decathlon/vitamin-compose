package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Visa: ImageVector
    get() {
        if (_visa != null) {
            return _visa!!
        }
        _visa = Builder(name = "Visa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.6681f, 5.6433f)
                curveTo(11.3894f, 5.5333f, 10.9047f, 5.4133f, 10.5201f, 5.4133f)
                curveTo(9.2087f, 5.4133f, 8.286f, 6.0673f, 8.2747f, 7.042f)
                curveTo(8.2654f, 7.7983f, 8.9522f, 8.1776f, 9.4475f, 8.4512f)
                lineTo(9.4574f, 8.4567f)
                curveTo(9.9534f, 8.73f, 10.0894f, 8.84f, 10.0867f, 9.0613f)
                curveTo(10.0834f, 9.3727f, 9.7041f, 9.5513f, 9.262f, 9.5513f)
                curveTo(8.7794f, 9.5513f, 8.54f, 9.476f, 7.9754f, 9.2393f)
                lineTo(7.7407f, 10.3227f)
                curveTo(8.2954f, 10.5193f, 8.5407f, 10.5767f, 9.2207f, 10.5867f)
                curveTo(10.7114f, 10.5867f, 11.4181f, 9.7607f, 11.4267f, 8.9233f)
                curveTo(11.4347f, 8.52f, 11.3507f, 8.1487f, 10.7114f, 7.7353f)
                curveTo(10.5511f, 7.6315f, 10.3921f, 7.5437f, 10.2469f, 7.4635f)
                curveTo(9.8846f, 7.2634f, 9.6074f, 7.1103f, 9.6074f, 6.8733f)
                curveTo(9.6074f, 6.6693f, 9.9207f, 6.4567f, 10.4274f, 6.448f)
                curveTo(10.7761f, 6.4433f, 11.1907f, 6.58f, 11.4427f, 6.6813f)
                lineTo(11.6681f, 5.6433f)
                close()
                moveTo(6.0573f, 5.506f)
                lineTo(4.7067f, 5.5047f)
                lineTo(3.3527f, 8.894f)
                lineTo(3.223f, 8.2034f)
                curveTo(3.0129f, 7.0845f, 2.8786f, 6.3694f, 2.8193f, 6.058f)
                curveTo(2.7493f, 5.6873f, 2.5313f, 5.5067f, 2.158f, 5.5067f)
                horizontalLineTo(0.0f)
                verticalLineTo(5.6433f)
                curveTo(0.528f, 5.8067f, 0.9047f, 5.9267f, 1.1307f, 6.0047f)
                curveTo(1.3847f, 6.092f, 1.5167f, 6.2767f, 1.5833f, 6.5407f)
                curveTo(1.9186f, 7.8653f, 2.2582f, 9.1889f, 2.602f, 10.5113f)
                lineTo(3.9693f, 10.5127f)
                lineTo(6.0573f, 5.506f)
                close()
                moveTo(14.8147f, 10.512f)
                lineTo(14.6647f, 9.762f)
                horizontalLineTo(12.9887f)
                lineTo(12.722f, 10.5067f)
                lineTo(11.3787f, 10.5093f)
                curveTo(12.0182f, 8.9714f, 12.6591f, 7.4341f, 13.3014f, 5.8973f)
                curveTo(13.4107f, 5.6367f, 13.6047f, 5.504f, 13.8907f, 5.5053f)
                curveTo(14.1094f, 5.5073f, 14.466f, 5.5073f, 14.9614f, 5.506f)
                lineTo(16.0f, 10.51f)
                lineTo(14.8147f, 10.512f)
                close()
                moveTo(13.3661f, 8.7347f)
                horizontalLineTo(14.4461f)
                lineTo(14.0427f, 6.8547f)
                lineTo(13.3661f, 8.7347f)
                close()
                moveTo(7.9134f, 5.506f)
                lineTo(6.8454f, 10.5113f)
                lineTo(5.5601f, 10.51f)
                lineTo(6.6267f, 5.5047f)
                lineTo(7.9134f, 5.506f)
                close()
            }
        }
        .build()
        return _visa!!
    }

private var _visa: ImageVector? = null
