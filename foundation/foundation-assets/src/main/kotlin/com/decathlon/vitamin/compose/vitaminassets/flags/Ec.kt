package com.decathlon.vitamin.compose.vitaminassets.flags

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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Ec: ImageVector
    get() {
        if (_ec != null) {
            return _ec!!
        }
        _ec = Builder(name = "Ec", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, 0.0f, 18.6667f, -1.0E-4f, 28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -0.0f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0748AE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD935)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.3334f, 10.1335f)
                    curveTo(11.3334f, 9.8547f, 11.3762f, 9.5859f, 11.4555f, 9.3333f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(16.5446f)
                    curveTo(16.6239f, 9.5859f, 16.6667f, 9.8547f, 16.6667f, 10.1335f)
                    curveTo(16.6667f, 11.6062f, 15.4728f, 12.8002f, 14.0f, 12.8002f)
                    curveTo(12.5273f, 12.8002f, 11.3334f, 11.6062f, 11.3334f, 10.1335f)
                    close()
                    moveTo(12.8444f, 9.3333f)
                    lineTo(13.3334f, 10.8002f)
                    horizontalLineTo(14.6667f)
                    lineTo(15.1556f, 9.3333f)
                    horizontalLineTo(12.8444f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDE2035)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF5FC0DC)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 7.3333f)
                    lineTo(14.6667f, 10.6667f)
                    horizontalLineTo(13.3333f)
                    lineTo(14.0f, 7.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF806428)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.5613f, 5.0171f)
                    curveTo(12.681f, 4.9772f, 12.8131f, 5.0083f, 12.9024f, 5.0976f)
                    lineTo(14.0f, 6.1953f)
                    lineTo(15.0976f, 5.0976f)
                    curveTo(15.1869f, 5.0083f, 15.319f, 4.9772f, 15.4387f, 5.0171f)
                    lineTo(17.4387f, 5.6838f)
                    curveTo(17.6134f, 5.742f, 17.7078f, 5.9308f, 17.6496f, 6.1054f)
                    curveTo(17.5913f, 6.2801f, 17.4026f, 6.3744f, 17.2279f, 6.3162f)
                    lineTo(15.4234f, 5.7147f)
                    lineTo(14.2357f, 6.9024f)
                    curveTo(14.1732f, 6.9649f, 14.0884f, 7.0f, 14.0f, 7.0f)
                    curveTo(13.9116f, 7.0f, 13.8268f, 6.9649f, 13.7643f, 6.9024f)
                    lineTo(12.5766f, 5.7147f)
                    lineTo(10.7721f, 6.3162f)
                    curveTo(10.5974f, 6.3744f, 10.4087f, 6.2801f, 10.3504f, 6.1054f)
                    curveTo(10.2922f, 5.9308f, 10.3866f, 5.742f, 10.5613f, 5.6838f)
                    lineTo(12.5613f, 5.0171f)
                    close()
                }
            }
        }
        .build()
        return _ec!!
    }

private var _ec: ImageVector? = null
