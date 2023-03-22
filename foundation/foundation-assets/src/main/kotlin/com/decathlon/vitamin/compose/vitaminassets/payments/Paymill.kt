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

public val PaymentsGroup.Paymill: ImageVector
    get() {
        if (_paymill != null) {
            return _paymill!!
        }
        _paymill = Builder(name = "Paymill", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFFF05000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.8197f, 19.2641f)
                curveTo(12.8349f, 19.298f, 12.8432f, 19.3356f, 12.8432f, 19.375f)
                curveTo(12.8432f, 19.4144f, 12.8349f, 19.452f, 12.8197f, 19.4859f)
                verticalLineTo(19.4862f)
                lineTo(11.4378f, 22.3708f)
                lineTo(11.437f, 22.3715f)
                curveTo(11.3294f, 22.5821f, 11.1423f, 22.7501f, 10.8877f, 22.7501f)
                lineTo(9.4049f, 22.7499f)
                curveTo(9.2442f, 22.7499f, 9.1141f, 22.6241f, 9.1141f, 22.4688f)
                curveTo(9.1141f, 22.4285f, 9.1231f, 22.3907f, 9.1389f, 22.356f)
                lineTo(10.5327f, 19.5102f)
                lineTo(10.5325f, 19.5079f)
                curveTo(10.5546f, 19.4683f, 10.5685f, 19.4234f, 10.5685f, 19.3751f)
                curveTo(10.5685f, 19.3267f, 10.5327f, 19.2397f, 10.5327f, 19.2397f)
                lineTo(9.1386f, 16.3943f)
                lineTo(9.1389f, 16.3941f)
                curveTo(9.1231f, 16.3595f, 9.1141f, 16.3214f, 9.1141f, 16.2812f)
                curveTo(9.1141f, 16.126f, 9.2443f, 16.0001f, 9.4049f, 16.0001f)
                lineTo(10.8877f, 16.0f)
                curveTo(11.1423f, 16.0f, 11.3403f, 16.1681f, 11.437f, 16.3785f)
                lineTo(11.4378f, 16.3791f)
                lineTo(12.8197f, 19.2638f)
                verticalLineTo(19.2641f)
                close()
                moveTo(17.6675f, 21.3784f)
                horizontalLineTo(16.8973f)
                verticalLineTo(24.0873f)
                horizontalLineTo(15.6358f)
                verticalLineTo(16.8999f)
                horizontalLineTo(17.8125f)
                curveTo(19.3752f, 16.8999f, 20.5584f, 17.6122f, 20.5584f, 19.0798f)
                curveTo(20.5583f, 20.5799f, 19.4645f, 21.3784f, 17.6675f, 21.3784f)
                close()
                moveTo(17.7121f, 17.8603f)
                horizontalLineTo(16.8973f)
                verticalLineTo(20.4181f)
                horizontalLineTo(17.6786f)
                curveTo(18.806f, 20.4181f, 19.286f, 19.9755f, 19.286f, 19.1122f)
                curveTo(19.2859f, 18.3352f, 18.8393f, 17.8603f, 17.7121f, 17.8603f)
                close()
                moveTo(21.5095f, 24.0873f)
                horizontalLineTo(20.2484f)
                lineTo(23.0836f, 16.8999f)
                horizontalLineTo(24.3f)
                lineTo(27.1912f, 24.0873f)
                horizontalLineTo(25.8182f)
                lineTo(25.2378f, 22.5441f)
                horizontalLineTo(22.0901f)
                lineTo(21.5095f, 24.0873f)
                close()
                moveTo(24.0878f, 19.5008f)
                curveTo(23.8646f, 18.8963f, 23.6639f, 18.2598f, 23.6639f, 18.2598f)
                horizontalLineTo(23.6414f)
                curveTo(23.6414f, 18.2598f, 23.4517f, 18.9073f, 23.2173f, 19.5008f)
                curveTo(23.2173f, 19.5008f, 22.4583f, 21.5512f, 22.4472f, 21.5512f)
                horizontalLineTo(24.8581f)
                lineTo(24.0878f, 19.5008f)
                close()
                moveTo(29.6036f, 24.0873f)
                verticalLineTo(21.3678f)
                lineTo(32.0146f, 16.8999f)
                horizontalLineTo(30.7868f)
                lineTo(29.0345f, 20.2346f)
                horizontalLineTo(29.0232f)
                lineTo(27.2708f, 16.8999f)
                horizontalLineTo(25.8645f)
                lineTo(28.3424f, 21.3678f)
                verticalLineTo(24.0873f)
                horizontalLineTo(29.6036f)
                close()
                moveTo(35.7016f, 24.0999f)
                lineTo(34.1947f, 19.9342f)
                curveTo(34.0273f, 19.4488f, 33.8598f, 18.9199f, 33.8598f, 18.9199f)
                horizontalLineTo(33.8375f)
                curveTo(33.8375f, 18.9199f, 33.7928f, 19.481f, 33.7373f, 19.9668f)
                lineTo(33.2125f, 24.0999f)
                horizontalLineTo(32.0628f)
                lineTo(33.0786f, 16.9126f)
                horizontalLineTo(34.2953f)
                lineTo(35.947f, 21.5532f)
                curveTo(36.1591f, 22.1249f, 36.3601f, 22.8265f, 36.3601f, 22.8265f)
                horizontalLineTo(36.3825f)
                curveTo(36.3825f, 22.8265f, 36.5944f, 22.1249f, 36.8066f, 21.5532f)
                lineTo(38.4809f, 16.9126f)
                horizontalLineTo(39.6975f)
                lineTo(40.7133f, 24.0999f)
                horizontalLineTo(39.4295f)
                lineTo(38.8827f, 19.9451f)
                curveTo(38.8156f, 19.4488f, 38.7599f, 18.9199f, 38.7599f, 18.9199f)
                horizontalLineTo(38.7376f)
                curveTo(38.7376f, 18.9199f, 38.5812f, 19.4488f, 38.4138f, 19.9342f)
                lineTo(36.9293f, 24.0999f)
                horizontalLineTo(35.7016f)
                close()
                moveTo(41.8656f, 16.9127f)
                verticalLineTo(24.0999f)
                verticalLineTo(24.1f)
                horizontalLineTo(43.1268f)
                verticalLineTo(16.9127f)
                horizontalLineTo(41.8656f)
                close()
                moveTo(44.4838f, 24.0999f)
                verticalLineTo(16.9127f)
                horizontalLineTo(45.7449f)
                verticalLineTo(23.1072f)
                horizontalLineTo(48.5801f)
                verticalLineTo(24.1f)
                horizontalLineTo(44.4838f)
                verticalLineTo(24.0999f)
                close()
                moveTo(49.9037f, 16.9127f)
                verticalLineTo(24.0999f)
                verticalLineTo(24.1f)
                horizontalLineTo(54.0f)
                verticalLineTo(23.1072f)
                horizontalLineTo(51.1651f)
                verticalLineTo(16.9127f)
                horizontalLineTo(49.9037f)
                close()
                moveTo(9.2935f, 18.5313f)
                curveTo(9.2935f, 18.3759f, 9.1631f, 18.2501f, 9.0025f, 18.2501f)
                lineTo(7.5198f, 18.2499f)
                curveTo(7.3046f, 18.2499f, 7.1101f, 18.3601f, 7.0164f, 18.5312f)
                lineTo(4.0248f, 24.606f)
                curveTo(4.0089f, 24.6405f, 4.0f, 24.6787f, 4.0f, 24.7187f)
                curveTo(4.0f, 24.874f, 4.1302f, 24.9997f, 4.2909f, 24.9997f)
                lineTo(5.7735f, 25.0f)
                curveTo(6.0282f, 25.0f, 6.2406f, 24.7896f, 6.3237f, 24.621f)
                lineTo(9.2692f, 18.6439f)
                horizontalLineTo(9.2688f)
                curveTo(9.2844f, 18.6092f, 9.2935f, 18.5714f, 9.2935f, 18.5313f)
                close()
            }
        }
        .build()
        return _paymill!!
    }

private var _paymill: ImageVector? = null
