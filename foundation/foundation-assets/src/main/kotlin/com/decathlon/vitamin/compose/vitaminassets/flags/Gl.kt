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

public val FlagsGroup.Gl: ImageVector
    get() {
        if (_gl != null) {
            return _gl!!
        }
        _gl = Builder(name = "Gl", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE82245)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.0f, 10.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(14.6667f)
                    curveTo(14.6667f, 7.7211f, 12.2789f, 5.3333f, 9.3333f, 5.3333f)
                    curveTo(6.3878f, 5.3333f, 4.0f, 7.7211f, 4.0f, 10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.0f, 10.6667f)
                    curveTo(4.0f, 13.6122f, 6.3878f, 16.0f, 9.3333f, 16.0f)
                    curveTo(12.2789f, 16.0f, 14.6667f, 13.6122f, 14.6667f, 10.6667f)
                    horizontalLineTo(4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    verticalLineTo(10.6567f)
                    horizontalLineTo(27.5f)
                    verticalLineTo(0.5f)
                    horizontalLineTo(0.5f)
                    lineTo(0.5f, 10.6567f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(28.0f)
                    close()
                }
            }
        }
        .build()
        return _gl!!
    }

private var _gl: ImageVector? = null
