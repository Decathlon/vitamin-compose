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

public val PaymentsGroup.ApplePay: ImageVector
    get() {
        if (_applePay != null) {
            return _applePay!!
        }
        _applePay = Builder(name = "ApplePay", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFFF3F3F3)),
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.5771f, 14.9265f)
                curveTo(17.1553f, 15.4313f, 16.4803f, 15.8294f, 15.8053f, 15.7725f)
                curveTo(15.7209f, 15.09f, 16.0513f, 14.3649f, 16.4381f, 13.9171f)
                curveTo(16.8599f, 13.3981f, 17.5982f, 13.0284f, 18.1959f, 13.0f)
                curveTo(18.2662f, 13.7109f, 17.992f, 14.4076f, 17.5771f, 14.9265f)
                close()
                moveTo(18.1888f, 15.9076f)
                curveTo(17.5942f, 15.873f, 17.0516f, 16.0884f, 16.6133f, 16.2624f)
                curveTo(16.3313f, 16.3744f, 16.0924f, 16.4692f, 15.9107f, 16.4692f)
                curveTo(15.7068f, 16.4692f, 15.4581f, 16.3693f, 15.1789f, 16.2571f)
                curveTo(14.813f, 16.1102f, 14.3947f, 15.9422f, 13.956f, 15.9502f)
                curveTo(12.9506f, 15.9645f, 12.0154f, 16.5403f, 11.5021f, 17.4573f)
                curveTo(10.4474f, 19.2915f, 11.2279f, 22.0071f, 12.2474f, 23.5f)
                curveTo(12.7467f, 24.2393f, 13.3443f, 25.0498f, 14.1318f, 25.0213f)
                curveTo(14.4783f, 25.0081f, 14.7275f, 24.9012f, 14.9854f, 24.7905f)
                curveTo(15.2823f, 24.6631f, 15.5908f, 24.5308f, 16.0724f, 24.5308f)
                curveTo(16.5374f, 24.5308f, 16.8324f, 24.6597f, 17.1155f, 24.7834f)
                curveTo(17.3847f, 24.9011f, 17.6433f, 25.014f, 18.0271f, 25.0071f)
                curveTo(18.8428f, 24.9929f, 19.356f, 24.2678f, 19.8553f, 23.5284f)
                curveTo(20.394f, 22.7349f, 20.6307f, 21.9605f, 20.6667f, 21.843f)
                lineTo(20.6709f, 21.8294f)
                curveTo(20.67f, 21.8285f, 20.6634f, 21.8254f, 20.6516f, 21.82f)
                curveTo(20.4715f, 21.7366f, 19.095f, 21.0995f, 19.0818f, 19.391f)
                curveTo(19.0686f, 17.957f, 20.1736f, 17.2304f, 20.3476f, 17.116f)
                curveTo(20.3582f, 17.109f, 20.3653f, 17.1043f, 20.3685f, 17.1019f)
                curveTo(19.6654f, 16.0498f, 18.5685f, 15.936f, 18.1888f, 15.9076f)
                close()
                moveTo(23.8349f, 24.9289f)
                verticalLineTo(13.846f)
                horizontalLineTo(27.9482f)
                curveTo(30.0717f, 13.846f, 31.5553f, 15.3246f, 31.5553f, 17.4858f)
                curveTo(31.5553f, 19.6469f, 30.0435f, 21.1398f, 27.892f, 21.1398f)
                horizontalLineTo(25.5365f)
                verticalLineTo(24.9289f)
                horizontalLineTo(23.8349f)
                close()
                moveTo(25.5365f, 15.2962f)
                horizontalLineTo(27.4982f)
                curveTo(28.9748f, 15.2962f, 29.8185f, 16.0924f, 29.8185f, 17.4929f)
                curveTo(29.8185f, 18.8934f, 28.9748f, 19.6967f, 27.4912f, 19.6967f)
                horizontalLineTo(25.5365f)
                verticalLineTo(15.2962f)
                close()
                moveTo(37.1732f, 23.5995f)
                curveTo(36.7232f, 24.4668f, 35.7318f, 25.0142f, 34.6631f, 25.0142f)
                curveTo(33.081f, 25.0142f, 31.9771f, 24.0616f, 31.9771f, 22.6256f)
                curveTo(31.9771f, 21.2038f, 33.0459f, 20.3863f, 35.0217f, 20.2654f)
                lineTo(37.1451f, 20.1374f)
                verticalLineTo(19.5261f)
                curveTo(37.1451f, 18.6232f, 36.5615f, 18.1327f, 35.5209f, 18.1327f)
                curveTo(34.6631f, 18.1327f, 34.0373f, 18.5806f, 33.9107f, 19.263f)
                horizontalLineTo(32.3779f)
                curveTo(32.4271f, 17.827f, 33.7631f, 16.782f, 35.5701f, 16.782f)
                curveTo(37.5177f, 16.782f, 38.7834f, 17.8128f, 38.7834f, 19.4123f)
                verticalLineTo(24.9289f)
                horizontalLineTo(37.2084f)
                verticalLineTo(23.5995f)
                horizontalLineTo(37.1732f)
                close()
                moveTo(35.1201f, 23.6991f)
                curveTo(34.2131f, 23.6991f, 33.6365f, 23.2583f, 33.6365f, 22.5829f)
                curveTo(33.6365f, 21.8863f, 34.192f, 21.481f, 35.2537f, 21.4171f)
                lineTo(37.1451f, 21.2962f)
                verticalLineTo(21.9218f)
                curveTo(37.1451f, 22.9597f, 36.2732f, 23.6991f, 35.1201f, 23.6991f)
                close()
                moveTo(44.0076f, 25.3626f)
                curveTo(43.3256f, 27.3033f, 42.5451f, 27.9431f, 40.8857f, 27.9431f)
                curveTo(40.7592f, 27.9431f, 40.3373f, 27.9289f, 40.2388f, 27.9005f)
                verticalLineTo(26.5711f)
                curveTo(40.3443f, 26.5853f, 40.6045f, 26.5995f, 40.7381f, 26.5995f)
                curveTo(41.4904f, 26.5995f, 41.9123f, 26.2796f, 42.1724f, 25.4479f)
                lineTo(42.3271f, 24.9573f)
                lineTo(39.4443f, 16.8886f)
                horizontalLineTo(41.2232f)
                lineTo(43.2271f, 23.436f)
                horizontalLineTo(43.2623f)
                lineTo(45.2662f, 16.8886f)
                horizontalLineTo(46.9959f)
                lineTo(44.0076f, 25.3626f)
                close()
            }
        }
        .build()
        return _applePay!!
    }

private var _applePay: ImageVector? = null
