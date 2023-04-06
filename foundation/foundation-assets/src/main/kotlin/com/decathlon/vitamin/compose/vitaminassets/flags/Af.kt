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

public val FlagsGroup.Af: ImageVector
    get() {
        if (_af != null) {
            return _af!!
        }
        _af = Builder(name = "Af", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 3.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1AB11F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.3334f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(9.3334f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(9.3334f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDC0D18)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3334f, 20.0f)
                    horizontalLineTo(18.6667f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(9.3334f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF8ABAF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.3334f, 8.6667f)
                    curveTo(11.7016f, 8.6667f, 12.0f, 8.9651f, 12.0f, 9.3333f)
                    curveTo(12.0f, 10.0718f, 12.4f, 10.7177f, 12.9982f, 11.0648f)
                    curveTo(13.3167f, 11.2496f, 13.4251f, 11.6576f, 13.2403f, 11.9761f)
                    curveTo(13.0555f, 12.2945f, 12.6475f, 12.4029f, 12.3291f, 12.2181f)
                    curveTo(11.3366f, 11.6422f, 10.6667f, 10.5664f, 10.6667f, 9.3333f)
                    curveTo(10.6667f, 8.9651f, 10.9652f, 8.6667f, 11.3334f, 8.6667f)
                    close()
                    moveTo(16.6667f, 8.6667f)
                    curveTo(17.0349f, 8.6667f, 17.3334f, 8.9651f, 17.3334f, 9.3333f)
                    curveTo(17.3334f, 10.5147f, 16.7183f, 11.552f, 15.7941f, 12.1431f)
                    curveTo(15.4839f, 12.3415f, 15.0716f, 12.2508f, 14.8733f, 11.9407f)
                    curveTo(14.6749f, 11.6305f, 14.7655f, 11.2182f, 15.0757f, 11.0198f)
                    curveTo(15.633f, 10.6634f, 16.0f, 10.041f, 16.0f, 9.3333f)
                    curveTo(16.0f, 8.9651f, 16.2985f, 8.6667f, 16.6667f, 8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, fillAlpha = 0.5f,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.0f, 10.6667f)
                    curveTo(14.7364f, 10.6667f, 15.3334f, 9.7712f, 15.3334f, 8.6667f)
                    curveTo(15.3334f, 7.5621f, 14.7364f, 6.6667f, 14.0f, 6.6667f)
                    curveTo(13.2637f, 6.6667f, 12.6667f, 7.5621f, 12.6667f, 8.6667f)
                    curveTo(12.6667f, 9.7712f, 13.2637f, 10.6667f, 14.0f, 10.6667f)
                    close()
                }
            }
        }
        .build()
        return _af!!
    }

private var _af: ImageVector? = null
