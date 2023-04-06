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

public val FlagsGroup.Sm: ImageVector
    get() {
        if (_sm != null) {
            return _sm!!
        }
        _sm = Builder(name = "Sm", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    curveTo(28.0f, 3.1111f, 28.0f, 6.2222f, 28.0f, 9.3333f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 6.2222f, -0.0f, 3.1111f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF7CCCF5)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF445F42)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.3333f, 8.6667f)
                    curveTo(11.7015f, 8.6667f, 12.0f, 8.9651f, 12.0f, 9.3333f)
                    curveTo(12.0f, 10.0718f, 12.3999f, 10.7177f, 12.9982f, 11.0648f)
                    curveTo(13.3167f, 11.2496f, 13.425f, 11.6576f, 13.2402f, 11.9761f)
                    curveTo(13.0555f, 12.2945f, 12.6475f, 12.4029f, 12.329f, 12.2181f)
                    curveTo(11.3365f, 11.6422f, 10.6667f, 10.5664f, 10.6667f, 9.3333f)
                    curveTo(10.6667f, 8.9651f, 10.9652f, 8.6667f, 11.3333f, 8.6667f)
                    close()
                    moveTo(16.6667f, 8.6667f)
                    curveTo(17.0349f, 8.6667f, 17.3333f, 8.9651f, 17.3333f, 9.3333f)
                    curveTo(17.3333f, 10.5147f, 16.7183f, 11.552f, 15.7941f, 12.1431f)
                    curveTo(15.4839f, 12.3415f, 15.0716f, 12.2508f, 14.8732f, 11.9407f)
                    curveTo(14.6749f, 11.6305f, 14.7655f, 11.2182f, 15.0757f, 11.0198f)
                    curveTo(15.6329f, 10.6634f, 16.0f, 10.041f, 16.0f, 9.3333f)
                    curveTo(16.0f, 8.9651f, 16.2985f, 8.6667f, 16.6667f, 8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD89F3D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 10.6667f)
                    curveTo(14.7364f, 10.6667f, 15.3333f, 9.7712f, 15.3333f, 8.6667f)
                    curveTo(15.3333f, 7.5621f, 14.7364f, 6.6667f, 14.0f, 6.6667f)
                    curveTo(13.2636f, 6.6667f, 12.6667f, 7.5621f, 12.6667f, 8.6667f)
                    curveTo(12.6667f, 9.7712f, 13.2636f, 10.6667f, 14.0f, 10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    verticalLineTo(9.3333f)
                    lineTo(27.5f, 9.3339f)
                    verticalLineTo(0.5f)
                    horizontalLineTo(0.5f)
                    lineTo(0.5f, 9.3339f)
                    lineTo(0.0f, 9.3333f)
                    lineTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _sm!!
    }

private var _sm: ImageVector? = null
