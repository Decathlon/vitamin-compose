package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val FlagsGroup.Ao: ImageVector
    get() {
        if (_ao != null) {
            return _ao!!
        }
        _ao = Builder(name = "Ao", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFF323E), 1.0f to Color(0xFFFD0D1B),
                        start = Offset(0.0f,0.0f), end = Offset(0.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDD2137)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 10.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF8D84B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.1978f, 11.5527f)
                    curveTo(16.3641f, 11.261f, 16.4961f, 10.9434f, 16.5871f, 10.6039f)
                    curveTo(17.1589f, 8.47f, 15.8926f, 6.2767f, 13.7587f, 5.7049f)
                    curveTo(13.403f, 5.6096f, 13.0375f, 5.8207f, 12.9422f, 6.1763f)
                    curveTo(12.8469f, 6.532f, 13.0579f, 6.8975f, 13.4136f, 6.9928f)
                    curveTo(14.8362f, 7.374f, 15.6804f, 8.8362f, 15.2992f, 10.2588f)
                    curveTo(15.2469f, 10.4541f, 15.1742f, 10.6385f, 15.084f, 10.8103f)
                    lineTo(13.0365f, 9.4453f)
                    curveTo(12.7302f, 9.241f, 12.3163f, 9.3238f, 12.112f, 9.6302f)
                    curveTo(11.9078f, 9.9365f, 11.9906f, 10.3504f, 12.2969f, 10.5547f)
                    lineTo(14.1742f, 11.8061f)
                    curveTo(13.5628f, 12.2023f, 12.7923f, 12.3478f, 12.0332f, 12.1444f)
                    curveTo(11.6776f, 12.0491f, 11.312f, 12.2602f, 11.2167f, 12.6158f)
                    curveTo(11.1214f, 12.9715f, 11.3325f, 13.337f, 11.6881f, 13.4323f)
                    curveTo(13.0213f, 13.7895f, 14.3777f, 13.4293f, 15.3473f, 12.5883f)
                    lineTo(16.2969f, 13.2213f)
                    curveTo(16.6033f, 13.4256f, 17.0172f, 13.3428f, 17.2214f, 13.0364f)
                    curveTo(17.4257f, 12.7301f, 17.3429f, 12.3162f, 17.0365f, 12.1119f)
                    lineTo(16.1978f, 11.5527f)
                    close()
                    moveTo(12.6666f, 8.6666f)
                    curveTo(13.0348f, 8.6666f, 13.3333f, 8.3682f, 13.3333f, 8.0f)
                    curveTo(13.3333f, 7.6318f, 13.0348f, 7.3333f, 12.6666f, 7.3333f)
                    curveTo(12.2984f, 7.3333f, 12.0f, 7.6318f, 12.0f, 8.0f)
                    curveTo(12.0f, 8.3682f, 12.2984f, 8.6666f, 12.6666f, 8.6666f)
                    close()
                }
            }
        }
        .build()
        return _ao!!
    }

private var _ao: ImageVector? = null
