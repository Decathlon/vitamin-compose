package com.decathlon.vitamin.compose.vitaminassets.payments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val PaymentsGroup.MaestroSubtext: ImageVector
    get() {
        if (_maestroSubtext != null) {
            return _maestroSubtext!!
        }
        _maestroSubtext = Builder(name = "MaestroSubtext", defaultWidth = 58.0.dp, defaultHeight =
                40.0.dp, viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
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
            path(fill = SolidColor(Color(0xFF6C6BBD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.2935f, 26.0848f)
                horizontalLineTo(24.3776f)
                verticalLineTo(8.4038f)
                horizontalLineTo(34.2935f)
                verticalLineTo(26.0848f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEB001B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.007f, 17.2448f)
                curveTo(25.007f, 13.6581f, 26.6996f, 10.4632f, 29.3352f, 8.4043f)
                curveTo(27.4078f, 6.8987f, 24.9753f, 6.0001f, 22.3317f, 6.0001f)
                curveTo(16.0732f, 6.0001f, 11.0f, 11.0344f, 11.0f, 17.2448f)
                curveTo(11.0f, 23.4551f, 16.0732f, 28.4895f, 22.3317f, 28.4895f)
                curveTo(24.9753f, 28.4895f, 27.4078f, 27.5909f, 29.3352f, 26.0853f)
                curveTo(26.6996f, 24.0264f, 25.007f, 20.8314f, 25.007f, 17.2448f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0099DF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(47.6711f, 17.2448f)
                curveTo(47.6711f, 23.4551f, 42.5979f, 28.4895f, 36.3394f, 28.4895f)
                curveTo(33.6958f, 28.4895f, 31.2633f, 27.5909f, 29.3352f, 26.0853f)
                curveTo(31.9716f, 24.0264f, 33.6641f, 20.8314f, 33.6641f, 17.2448f)
                curveTo(33.6641f, 13.6581f, 31.9716f, 10.4632f, 29.3352f, 8.4043f)
                curveTo(31.2633f, 6.8987f, 33.6958f, 6.0001f, 36.3394f, 6.0001f)
                curveTo(42.5979f, 6.0001f, 47.6711f, 11.0344f, 47.6711f, 17.2448f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231F20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(37.6485f, 31.081f)
                curveTo(37.7804f, 31.081f, 37.9699f, 31.106f, 38.1147f, 31.1625f)
                lineTo(37.913f, 31.7744f)
                curveTo(37.7746f, 31.718f, 37.6363f, 31.6994f, 37.5037f, 31.6994f)
                curveTo(37.0757f, 31.6994f, 36.8617f, 31.9739f, 36.8617f, 32.4672f)
                verticalLineTo(34.1415f)
                horizontalLineTo(36.2068f)
                verticalLineTo(31.156f)
                horizontalLineTo(36.8552f)
                verticalLineTo(31.5185f)
                curveTo(37.0253f, 31.2561f, 37.271f, 31.081f, 37.6485f, 31.081f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231F20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.229f, 31.7494f)
                horizontalLineTo(34.159f)
                verticalLineTo(33.0984f)
                curveTo(34.159f, 33.398f, 34.2657f, 33.5982f, 34.5935f, 33.5982f)
                curveTo(34.7636f, 33.5982f, 34.9775f, 33.5417f, 35.1721f, 33.4294f)
                lineTo(35.3609f, 33.9849f)
                curveTo(35.1534f, 34.1286f, 34.8262f, 34.2166f, 34.5431f, 34.2166f)
                curveTo(33.7685f, 34.2166f, 33.4983f, 33.8041f, 33.4983f, 33.1106f)
                verticalLineTo(31.7494f)
                horizontalLineTo(32.8873f)
                verticalLineTo(31.156f)
                horizontalLineTo(33.4983f)
                verticalLineTo(30.2503f)
                horizontalLineTo(34.159f)
                verticalLineTo(31.156f)
                horizontalLineTo(35.229f)
                verticalLineTo(31.7494f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231F20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.662f, 31.0809f)
                curveTo(28.5058f, 31.0809f, 29.0851f, 31.7179f, 29.0916f, 32.6487f)
                curveTo(29.0916f, 32.7352f, 29.0852f, 32.8154f, 29.0788f, 32.8962f)
                lineTo(29.0786f, 32.8982f)
                horizontalLineTo(26.8442f)
                curveTo(26.9386f, 33.4351f, 27.3227f, 33.6289f, 27.7442f, 33.6289f)
                curveTo(28.0461f, 33.6289f, 28.3674f, 33.5166f, 28.6189f, 33.3164f)
                lineTo(28.9403f, 33.7976f)
                curveTo(28.5749f, 34.1035f, 28.1599f, 34.2158f, 27.7067f, 34.2158f)
                curveTo(26.8061f, 34.2158f, 26.1641f, 33.5974f, 26.1641f, 32.6487f)
                curveTo(26.1641f, 31.7179f, 26.7808f, 31.0809f, 27.662f, 31.0809f)
                close()
                moveTo(27.6498f, 31.6614f)
                curveTo(27.1836f, 31.6614f, 26.9199f, 31.9553f, 26.85f, 32.3863f)
                horizontalLineTo(28.4114f)
                curveTo(28.3422f, 31.9238f, 28.0713f, 31.6614f, 27.6498f, 31.6614f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231F20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.9679f, 31.9181f)
                curveTo(31.7856f, 31.8052f, 31.4145f, 31.6615f, 31.0305f, 31.6615f)
                curveTo(30.6717f, 31.6615f, 30.4577f, 31.793f, 30.4577f, 32.0118f)
                curveTo(30.4577f, 32.2112f, 30.6839f, 32.2677f, 30.9671f, 32.3049f)
                lineTo(31.2755f, 32.3485f)
                curveTo(31.9304f, 32.4429f, 32.3267f, 32.7174f, 32.3267f, 33.2421f)
                curveTo(32.3267f, 33.8105f, 31.8231f, 34.2166f, 30.9548f, 34.2166f)
                curveTo(30.4634f, 34.2166f, 30.0102f, 34.0914f, 29.6514f, 33.8291f)
                lineTo(29.9598f, 33.3229f)
                curveTo(30.1803f, 33.4916f, 30.5081f, 33.6353f, 30.9613f, 33.6353f)
                curveTo(31.4081f, 33.6353f, 31.6473f, 33.5045f, 31.6473f, 33.2729f)
                curveTo(31.6473f, 33.1049f, 31.4772f, 33.0105f, 31.1184f, 32.9612f)
                lineTo(30.81f, 32.9176f)
                curveTo(30.1363f, 32.8232f, 29.771f, 32.5237f, 29.771f, 32.0368f)
                curveTo(29.771f, 31.4434f, 30.2624f, 31.081f, 31.024f, 31.081f)
                curveTo(31.5024f, 31.081f, 31.9369f, 31.1875f, 32.2511f, 31.3934f)
                lineTo(31.9679f, 31.9181f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231F20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(40.6899f, 31.2018f)
                curveTo(40.491f, 31.121f, 40.2749f, 31.0809f, 40.0414f, 31.0809f)
                curveTo(39.808f, 31.0809f, 39.5918f, 31.121f, 39.3929f, 31.2018f)
                curveTo(39.1941f, 31.2818f, 39.0233f, 31.3926f, 38.8792f, 31.5335f)
                curveTo(38.7351f, 31.6743f, 38.622f, 31.8409f, 38.5398f, 32.0325f)
                curveTo(38.4577f, 32.2248f, 38.4166f, 32.4335f, 38.4166f, 32.6587f)
                curveTo(38.4166f, 32.8839f, 38.4577f, 33.0927f, 38.5398f, 33.285f)
                curveTo(38.622f, 33.4766f, 38.7351f, 33.6439f, 38.8792f, 33.7847f)
                curveTo(39.0233f, 33.9255f, 39.1941f, 34.0356f, 39.3929f, 34.1164f)
                curveTo(39.5918f, 34.1965f, 39.808f, 34.2365f, 40.0414f, 34.2365f)
                curveTo(40.2749f, 34.2365f, 40.491f, 34.1965f, 40.6899f, 34.1164f)
                curveTo(40.8888f, 34.0356f, 41.061f, 33.9255f, 41.2058f, 33.7847f)
                curveTo(41.3513f, 33.6439f, 41.4645f, 33.4766f, 41.5466f, 33.285f)
                curveTo(41.6287f, 33.0927f, 41.6698f, 32.8839f, 41.6698f, 32.6587f)
                curveTo(41.6698f, 32.4335f, 41.6287f, 32.2248f, 41.5466f, 32.0325f)
                curveTo(41.4645f, 31.8409f, 41.3513f, 31.6743f, 41.2058f, 31.5335f)
                curveTo(41.061f, 31.3926f, 40.8888f, 31.2818f, 40.6899f, 31.2018f)
                close()
                moveTo(39.666f, 31.768f)
                curveTo(39.782f, 31.7215f, 39.9067f, 31.6979f, 40.0414f, 31.6979f)
                curveTo(40.1762f, 31.6979f, 40.3015f, 31.7215f, 40.4168f, 31.768f)
                curveTo(40.5328f, 31.8151f, 40.6337f, 31.8809f, 40.718f, 31.9653f)
                curveTo(40.8037f, 32.0496f, 40.87f, 32.1511f, 40.919f, 32.2691f)
                curveTo(40.9673f, 32.3871f, 40.9911f, 32.5172f, 40.9911f, 32.6587f)
                curveTo(40.9911f, 32.801f, 40.9673f, 32.9304f, 40.919f, 33.0483f)
                curveTo(40.87f, 33.1663f, 40.8037f, 33.2678f, 40.718f, 33.3522f)
                curveTo(40.6337f, 33.4365f, 40.5328f, 33.5023f, 40.4168f, 33.5495f)
                curveTo(40.3015f, 33.5967f, 40.1762f, 33.6196f, 40.0414f, 33.6196f)
                curveTo(39.9067f, 33.6196f, 39.782f, 33.5967f, 39.666f, 33.5495f)
                curveTo(39.5507f, 33.5023f, 39.4506f, 33.4365f, 39.3663f, 33.3522f)
                curveTo(39.282f, 33.2678f, 39.2157f, 33.1663f, 39.1674f, 33.0483f)
                curveTo(39.1191f, 32.9304f, 39.0954f, 32.801f, 39.0954f, 32.6587f)
                curveTo(39.0954f, 32.5172f, 39.1191f, 32.3871f, 39.1674f, 32.2691f)
                curveTo(39.2157f, 32.1511f, 39.282f, 32.0496f, 39.3663f, 31.9653f)
                curveTo(39.4506f, 31.8809f, 39.5507f, 31.8151f, 39.666f, 31.768f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231F20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.4616f, 31.156f)
                verticalLineTo(32.6487f)
                verticalLineTo(34.1414f)
                horizontalLineTo(24.8073f)
                verticalLineTo(33.779f)
                curveTo(24.5991f, 34.0478f, 24.2849f, 34.2165f, 23.8569f, 34.2165f)
                curveTo(23.0132f, 34.2165f, 22.3525f, 33.5602f, 22.3525f, 32.6487f)
                curveTo(22.3525f, 31.7365f, 23.0132f, 31.0809f, 23.8569f, 31.0809f)
                curveTo(24.2849f, 31.0809f, 24.5991f, 31.2496f, 24.8073f, 31.5185f)
                verticalLineTo(31.156f)
                horizontalLineTo(25.4616f)
                close()
                moveTo(23.9384f, 31.6929f)
                curveTo(23.372f, 31.6929f, 23.0255f, 32.124f, 23.0255f, 32.6487f)
                curveTo(23.0255f, 33.1735f, 23.372f, 33.6038f, 23.9384f, 33.6038f)
                curveTo(24.4795f, 33.6038f, 24.8448f, 33.192f, 24.8448f, 32.6487f)
                curveTo(24.8448f, 32.1054f, 24.4795f, 31.6929f, 23.9384f, 31.6929f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231F20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7732f, 34.1415f)
                verticalLineTo(32.2677f)
                curveTo(21.7732f, 31.5621f, 21.32f, 31.0874f, 20.5901f, 31.081f)
                curveTo(20.206f, 31.0745f, 19.809f, 31.1932f, 19.5323f, 31.6121f)
                curveTo(19.3248f, 31.2811f, 18.997f, 31.081f, 18.5373f, 31.081f)
                curveTo(18.2167f, 31.081f, 17.9018f, 31.1746f, 17.6561f, 31.5242f)
                verticalLineTo(31.156f)
                horizontalLineTo(17.0018f)
                verticalLineTo(34.1415f)
                horizontalLineTo(17.6626f)
                verticalLineTo(32.4865f)
                curveTo(17.6626f, 31.9682f, 17.9522f, 31.6929f, 18.3989f, 31.6929f)
                curveTo(18.8334f, 31.6929f, 19.0539f, 31.9739f, 19.0539f, 32.48f)
                verticalLineTo(34.1415f)
                horizontalLineTo(19.7146f)
                verticalLineTo(32.4865f)
                curveTo(19.7146f, 31.9682f, 20.0173f, 31.6929f, 20.451f, 31.6929f)
                curveTo(20.8985f, 31.6929f, 21.1125f, 31.9739f, 21.1125f, 32.48f)
                verticalLineTo(34.1415f)
                horizontalLineTo(21.7732f)
                verticalLineTo(34.1415f)
                close()
            }
        }
        .build()
        return _maestroSubtext!!
    }

private var _maestroSubtext: ImageVector? = null
