package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Va: ImageVector
    get() {
        if (_va != null) {
            return _va!!
        }
        _va = Builder(name = "Va", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0003f,0.0f), end = Offset(14.0003f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0003f, 0.0f)
                    horizontalLineTo(3.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0003f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFDE048), 1.0f to Color(0xFFFFDF32),
                        start = Offset(14.0003f,0.0f), end = Offset(14.0003f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0003f, 0.0f)
                    horizontalLineTo(3.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0003f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(20.6668f,0.0f), end = Offset(20.6668f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, 0.0f)
                    horizontalLineTo(13.3335f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFCDCCCC), 1.0f to Color(0xFFE4E4E4),
                        start = Offset(21.1952f,14.9428f), end = Offset(21.1952f,7.28594f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(24.9092f, 11.5286f)
                    curveTo(25.6903f, 12.3096f, 25.6903f, 13.576f, 24.9092f, 14.357f)
                    curveTo(24.1282f, 15.1381f, 22.8618f, 15.1381f, 22.0808f, 14.357f)
                    curveTo(21.465f, 13.7413f, 21.3347f, 12.8239f, 21.6898f, 12.0805f)
                    lineTo(18.7809f, 9.1716f)
                    lineTo(18.3095f, 9.643f)
                    lineTo(17.8381f, 10.1144f)
                    lineTo(16.8953f, 9.1716f)
                    lineTo(17.3667f, 8.7001f)
                    lineTo(18.3095f, 7.7573f)
                    lineTo(18.7809f, 7.2859f)
                    lineTo(19.2523f, 7.7573f)
                    lineTo(22.6327f, 11.1376f)
                    curveTo(23.3761f, 10.7825f, 24.2934f, 10.9128f, 24.9092f, 11.5286f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFCD9D25), 1.0f to Color(0xFFEBB93A),
                        start = Offset(20.1385f,14.9428f), end = Offset(20.1385f,7.28594f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(18.701f, 11.1376f)
                    curveTo(17.9576f, 10.7825f, 17.0402f, 10.9128f, 16.4245f, 11.5286f)
                    curveTo(15.6434f, 12.3096f, 15.6434f, 13.576f, 16.4245f, 14.357f)
                    curveTo(17.2055f, 15.1381f, 18.4718f, 15.1381f, 19.2529f, 14.357f)
                    curveTo(19.8687f, 13.7413f, 19.999f, 12.8239f, 19.6438f, 12.0805f)
                    lineTo(22.5527f, 9.1716f)
                    lineTo(23.0241f, 9.643f)
                    lineTo(23.4955f, 10.1144f)
                    lineTo(24.4383f, 9.1716f)
                    lineTo(23.9669f, 8.7001f)
                    lineTo(23.0241f, 7.7573f)
                    lineTo(22.5527f, 7.2859f)
                    lineTo(22.0813f, 7.7573f)
                    lineTo(18.701f, 11.1376f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFCD9D25), 1.0f to Color(0xFFEBB93A),
                        start = Offset(20.6668f,2.66667f), end = Offset(20.6668f,6.66667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(20.6668f, 6.6667f)
                    curveTo(19.5622f, 6.6667f, 18.6668f, 6.3682f, 18.6668f, 6.0f)
                    curveTo(18.6668f, 5.6318f, 19.5622f, 5.3333f, 20.6668f, 5.3333f)
                    curveTo(21.7714f, 5.3333f, 22.6668f, 5.6318f, 22.6668f, 6.0f)
                    curveTo(22.6668f, 6.3682f, 21.7714f, 6.6667f, 20.6668f, 6.6667f)
                    close()
                    moveTo(20.6668f, 3.3333f)
                    curveTo(20.1145f, 3.3333f, 19.6668f, 3.1841f, 19.6668f, 3.0f)
                    curveTo(19.6668f, 2.8159f, 20.1145f, 2.6667f, 20.6668f, 2.6667f)
                    curveTo(21.2191f, 2.6667f, 21.6668f, 2.8159f, 21.6668f, 3.0f)
                    curveTo(21.6668f, 3.1841f, 21.2191f, 3.3333f, 20.6668f, 3.3333f)
                    close()
                    moveTo(20.6668f, 4.8889f)
                    curveTo(19.9304f, 4.8889f, 19.3335f, 4.6899f, 19.3335f, 4.4444f)
                    curveTo(19.3335f, 4.199f, 19.9304f, 4.0f, 20.6668f, 4.0f)
                    curveTo(21.4032f, 4.0f, 22.0001f, 4.199f, 22.0001f, 4.4444f)
                    curveTo(22.0001f, 4.6899f, 21.4032f, 4.8889f, 20.6668f, 4.8889f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF5252C), 1.0f to Color(0xFFF6151C),
                        start = Offset(20.667f,13.3332f), end = Offset(20.667f,16.6667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(17.3679f, 14.2108f)
                    curveTo(17.4753f, 14.5331f, 17.6981f, 14.9787f, 18.0715f, 15.4268f)
                    curveTo(18.7109f, 16.194f, 19.5774f, 16.6667f, 20.667f, 16.6667f)
                    curveTo(21.7566f, 16.6667f, 22.6231f, 16.194f, 23.2625f, 15.4268f)
                    curveTo(23.6359f, 14.9787f, 23.8587f, 14.5331f, 23.9661f, 14.2108f)
                    curveTo(24.0826f, 13.8615f, 23.8938f, 13.484f, 23.5445f, 13.3676f)
                    curveTo(23.1952f, 13.2511f, 22.8177f, 13.4399f, 22.7012f, 13.7892f)
                    curveTo(22.642f, 13.967f, 22.4898f, 14.2713f, 22.2382f, 14.5732f)
                    curveTo(21.8359f, 15.056f, 21.3274f, 15.3334f, 20.667f, 15.3334f)
                    curveTo(20.0066f, 15.3334f, 19.4981f, 15.056f, 19.0958f, 14.5732f)
                    curveTo(18.8442f, 14.2713f, 18.692f, 13.967f, 18.6328f, 13.7892f)
                    curveTo(18.5164f, 13.4399f, 18.1388f, 13.2511f, 17.7895f, 13.3676f)
                    curveTo(17.4402f, 13.484f, 17.2515f, 13.8615f, 17.3679f, 14.2108f)
                    close()
                }
            }
        }
        .build()
        return _va!!
    }

private var _va: ImageVector? = null
