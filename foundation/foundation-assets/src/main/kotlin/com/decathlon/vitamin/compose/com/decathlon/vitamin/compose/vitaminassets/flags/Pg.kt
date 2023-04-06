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

public val FlagsGroup.Pg: ImageVector
    get() {
        if (_pg != null) {
            return _pg!!
        }
        _pg = Builder(name = "Pg", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, -0.0f, 18.6667f, 0.0f, 28.0f, 0.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE8283F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.6667f, 16.6667f)
                    lineTo(5.7239f, 16.9428f)
                    lineTo(6.0f, 16.0f)
                    lineTo(5.7239f, 15.0572f)
                    lineTo(6.6667f, 15.3333f)
                    lineTo(7.6095f, 15.0572f)
                    lineTo(7.3333f, 16.0f)
                    lineTo(7.6095f, 16.9428f)
                    lineTo(6.6667f, 16.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.6667f, 8.6667f)
                    lineTo(5.7239f, 8.9428f)
                    lineTo(6.0f, 8.0f)
                    lineTo(5.7239f, 7.0572f)
                    lineTo(6.6667f, 7.3333f)
                    lineTo(7.6095f, 7.0572f)
                    lineTo(7.3333f, 8.0f)
                    lineTo(7.6095f, 8.9428f)
                    lineTo(6.6667f, 8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.3333f, 12.0f)
                    lineTo(2.3905f, 12.2761f)
                    lineTo(2.6667f, 11.3333f)
                    lineTo(2.3905f, 10.3905f)
                    lineTo(3.3333f, 10.6667f)
                    lineTo(4.2761f, 10.3905f)
                    lineTo(4.0f, 11.3333f)
                    lineTo(4.2761f, 12.2761f)
                    lineTo(3.3333f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3333f, 11.3333f)
                    lineTo(8.3905f, 11.6095f)
                    lineTo(8.6667f, 10.6667f)
                    lineTo(8.3905f, 9.7239f)
                    lineTo(9.3333f, 10.0f)
                    lineTo(10.2761f, 9.7239f)
                    lineTo(10.0f, 10.6667f)
                    lineTo(10.2761f, 11.6095f)
                    lineTo(9.3333f, 11.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD84E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.8612f, 9.2656f)
                    curveTo(18.7016f, 9.1698f, 18.5722f, 8.9442f, 18.5722f, 8.7637f)
                    verticalLineTo(7.535f)
                    curveTo(18.5722f, 7.3536f, 18.4417f, 7.2501f, 18.2442f, 7.3159f)
                    lineTo(17.486f, 7.5686f)
                    curveTo(17.3049f, 7.629f, 17.0275f, 7.6344f, 16.83f, 7.5686f)
                    lineTo(16.0718f, 7.3159f)
                    curveTo(15.8907f, 7.2555f, 15.8705f, 7.1305f, 16.0328f, 7.0331f)
                    lineTo(17.8118f, 5.9657f)
                    curveTo(17.9714f, 5.87f, 18.0573f, 5.6618f, 17.9915f, 5.4643f)
                    lineTo(17.7388f, 4.7061f)
                    curveTo(17.6784f, 4.525f, 17.7599f, 4.4216f, 17.9574f, 4.4875f)
                    lineTo(18.7156f, 4.7402f)
                    curveTo(18.8968f, 4.8006f, 19.1197f, 4.7228f, 19.217f, 4.5605f)
                    lineTo(20.2844f, 2.7815f)
                    curveTo(20.3802f, 2.6219f, 20.5013f, 2.623f, 20.5672f, 2.8205f)
                    lineTo(20.8199f, 3.5787f)
                    curveTo(20.8803f, 3.7599f, 20.8857f, 4.0372f, 20.8199f, 4.2347f)
                    lineTo(20.5672f, 4.9929f)
                    curveTo(20.5068f, 5.1741f, 20.6058f, 5.3209f, 20.7863f, 5.3209f)
                    horizontalLineTo(22.015f)
                    curveTo(22.1964f, 5.3209f, 22.4195f, 5.4476f, 22.5169f, 5.6099f)
                    lineTo(23.5843f, 7.3889f)
                    curveTo(23.68f, 7.5486f, 23.603f, 7.7089f, 23.4299f, 7.7435f)
                    lineTo(21.7284f, 8.0838f)
                    curveTo(21.5474f, 8.12f, 21.3697f, 8.304f, 21.3351f, 8.4771f)
                    lineTo(20.9948f, 10.1786f)
                    curveTo(20.9586f, 10.3596f, 20.8025f, 10.4303f, 20.6402f, 10.333f)
                    lineTo(18.8612f, 9.2656f)
                    close()
                }
            }
        }
        .build()
        return _pg!!
    }

private var _pg: ImageVector? = null
