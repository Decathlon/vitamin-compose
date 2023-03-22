package com.decathlon.vitamin.compose.vitaminassets.payments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.Oney4x: ImageVector
    get() {
        if (_oney4x != null) {
            return _oney4x!!
        }
        _oney4x = Builder(name = "Oney4x", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF3F3F3)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 0.5f)
                lineTo(54.0f, 0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 57.5f, 4.0f)
                lineTo(57.5f, 36.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 54.0f, 39.5f)
                lineTo(4.0f, 39.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.5f, 36.0f)
                lineTo(0.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF87BC2B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(40.8644f, 13.5366f)
                curveTo(43.5955f, 13.5366f, 45.8271f, 15.7849f, 45.8438f, 18.5494f)
                curveTo(45.8438f, 18.8149f, 45.8219f, 19.1994f, 45.8041f, 19.3912f)
                horizontalLineTo(37.7472f)
                curveTo(38.1573f, 21.2508f, 39.6548f, 22.0737f, 40.9036f, 22.0737f)
                curveTo(41.8869f, 22.0737f, 42.9194f, 21.6322f, 43.4665f, 20.977f)
                lineTo(43.4785f, 20.9634f)
                horizontalLineTo(45.5152f)
                curveTo(45.5152f, 20.9634f, 45.5105f, 20.9853f, 45.4891f, 21.0292f)
                curveTo(44.477f, 23.0983f, 42.3488f, 23.8277f, 40.8299f, 23.8277f)
                curveTo(39.4996f, 23.8277f, 38.2488f, 23.2812f, 37.301f, 22.289f)
                curveTo(36.3699f, 21.3093f, 35.8516f, 20.025f, 35.8516f, 18.6727f)
                curveTo(35.8516f, 15.7927f, 38.0549f, 13.5366f, 40.8644f, 13.5366f)
                close()
                moveTo(40.8487f, 15.288f)
                curveTo(39.2462f, 15.288f, 38.0549f, 16.5049f, 37.8073f, 17.75f)
                horizontalLineTo(43.885f)
                curveTo(43.6405f, 16.5049f, 42.4492f, 15.288f, 40.8487f, 15.288f)
                close()
                moveTo(27.4633f, 18.1288f)
                curveTo(27.4633f, 16.2029f, 28.3861f, 15.2295f, 30.2018f, 15.2295f)
                curveTo(32.0169f, 15.2295f, 32.9339f, 16.2029f, 32.9339f, 18.1288f)
                verticalLineTo(23.8319f)
                horizontalLineTo(34.7966f)
                verticalLineTo(17.9951f)
                curveTo(34.7857f, 16.9715f, 34.5986f, 16.2478f, 34.1848f, 15.5686f)
                curveTo(33.691f, 14.8057f, 32.5149f, 13.5225f, 30.2018f, 13.5225f)
                curveTo(27.8824f, 13.5225f, 26.7099f, 14.8057f, 26.2156f, 15.5686f)
                curveTo(25.7981f, 16.2478f, 25.6168f, 16.9715f, 25.5991f, 17.9951f)
                verticalLineTo(23.8319f)
                horizontalLineTo(27.4633f)
                verticalLineTo(18.1288f)
                close()
                moveTo(51.606f, 23.1124f)
                lineTo(55.5357f, 13.5246f)
                horizontalLineTo(53.5826f)
                lineTo(50.6357f, 20.734f)
                lineTo(47.6956f, 13.5246f)
                horizontalLineTo(45.6479f)
                lineTo(49.6644f, 23.1145f)
                lineTo(48.1611f, 26.7971f)
                horizontalLineTo(50.0986f)
                lineTo(50.6346f, 25.4851f)
                lineTo(51.606f, 23.1124f)
                close()
                moveTo(16.064f, 18.6858f)
                curveTo(16.064f, 20.5877f, 17.5567f, 22.0794f, 19.3902f, 22.0794f)
                curveTo(21.2111f, 22.0794f, 22.7112f, 20.5877f, 22.7112f, 18.6858f)
                curveTo(22.7112f, 16.7829f, 21.2111f, 15.288f, 19.3902f, 15.288f)
                curveTo(17.5567f, 15.288f, 16.064f, 16.7829f, 16.064f, 18.6858f)
                close()
                moveTo(14.2467f, 18.6848f)
                curveTo(14.2467f, 15.7896f, 16.5055f, 13.5246f, 19.3897f, 13.5246f)
                curveTo(22.2671f, 13.5246f, 24.5248f, 15.7896f, 24.5248f, 18.6848f)
                curveTo(24.5248f, 21.5778f, 22.2671f, 23.846f, 19.3897f, 23.846f)
                curveTo(16.5055f, 23.846f, 14.2467f, 21.5778f, 14.2467f, 18.6848f)
                close()
                moveTo(9.9043f, 19.6478f)
                lineTo(10.3567f, 20.4499f)
                horizontalLineTo(11.3704f)
                lineTo(10.4252f, 19.0579f)
                lineTo(11.3531f, 17.6895f)
                horizontalLineTo(10.3395f)
                lineTo(9.9043f, 18.4686f)
                lineTo(9.469f, 17.6895f)
                horizontalLineTo(8.4554f)
                lineTo(9.3891f, 19.0579f)
                lineTo(8.4381f, 20.4499f)
                horizontalLineTo(9.4523f)
                lineTo(9.9043f, 19.6478f)
                close()
                moveTo(7.7855f, 19.3448f)
                horizontalLineTo(8.272f)
                verticalLineTo(18.56f)
                horizontalLineTo(7.7855f)
                verticalLineTo(17.4549f)
                horizontalLineTo(6.8633f)
                verticalLineTo(18.56f)
                horizontalLineTo(6.1877f)
                verticalLineTo(16.4413f)
                horizontalLineTo(5.2597f)
                verticalLineTo(19.3448f)
                horizontalLineTo(6.8633f)
                verticalLineTo(20.4499f)
                horizontalLineTo(7.7855f)
                verticalLineTo(19.3448f)
                close()
                moveTo(2.9999f, 18.6765f)
                curveTo(2.9999f, 15.7892f, 5.253f, 13.5294f, 8.1298f, 13.5294f)
                curveTo(10.9999f, 13.5294f, 13.2524f, 15.7892f, 13.2524f, 18.6765f)
                curveTo(13.2524f, 21.5623f, 10.9999f, 23.8247f, 8.1298f, 23.8247f)
                curveTo(5.253f, 23.8247f, 2.9999f, 21.5623f, 2.9999f, 18.6765f)
                close()
            }
        }
        .build()
        return _oney4x!!
    }

private var _oney4x: ImageVector? = null
