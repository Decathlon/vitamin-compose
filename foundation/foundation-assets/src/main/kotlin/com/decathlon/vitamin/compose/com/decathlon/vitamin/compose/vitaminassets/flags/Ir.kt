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

public val FlagsGroup.Ir: ImageVector
    get() {
        if (_ir != null) {
            return _ir!!
        }
        _ir = Builder(name = "Ir", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -2.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF38BB56)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDE1B27)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9BDDAB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.3333f, 5.6667f)
                    curveTo(1.3333f, 5.4826f, 1.4826f, 5.3333f, 1.6667f, 5.3333f)
                    horizontalLineTo(2.3333f)
                    curveTo(2.5174f, 5.3333f, 2.6667f, 5.4826f, 2.6667f, 5.6667f)
                    verticalLineTo(6.3333f)
                    curveTo(2.6667f, 6.5174f, 2.5174f, 6.6667f, 2.3333f, 6.6667f)
                    horizontalLineTo(1.6667f)
                    curveTo(1.4826f, 6.6667f, 1.3333f, 6.5174f, 1.3333f, 6.3333f)
                    verticalLineTo(5.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9BDDAB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0f, 5.6667f)
                    curveTo(4.0f, 5.4826f, 4.1492f, 5.3333f, 4.3333f, 5.3333f)
                    horizontalLineTo(5.0f)
                    curveTo(5.1841f, 5.3333f, 5.3333f, 5.4826f, 5.3333f, 5.6667f)
                    verticalLineTo(6.3333f)
                    curveTo(5.3333f, 6.5174f, 5.1841f, 6.6667f, 5.0f, 6.6667f)
                    horizontalLineTo(4.3333f)
                    curveTo(4.1492f, 6.6667f, 4.0f, 6.5174f, 4.0f, 6.3333f)
                    verticalLineTo(5.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9BDDAB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.6666f, 5.6667f)
                    curveTo(6.6666f, 5.4826f, 6.8159f, 5.3333f, 7.0f, 5.3333f)
                    horizontalLineTo(7.6666f)
                    curveTo(7.8507f, 5.3333f, 8.0f, 5.4826f, 8.0f, 5.6667f)
                    verticalLineTo(6.3333f)
                    curveTo(8.0f, 6.5174f, 7.8507f, 6.6667f, 7.6666f, 6.6667f)
                    horizontalLineTo(7.0f)
                    curveTo(6.8159f, 6.6667f, 6.6666f, 6.5174f, 6.6666f, 6.3333f)
                    verticalLineTo(5.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9BDDAB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.3333f, 5.6667f)
                    curveTo(9.3333f, 5.4826f, 9.4825f, 5.3333f, 9.6666f, 5.3333f)
                    horizontalLineTo(10.3333f)
                    curveTo(10.5174f, 5.3333f, 10.6666f, 5.4826f, 10.6666f, 5.6667f)
                    verticalLineTo(6.3333f)
                    curveTo(10.6666f, 6.5174f, 10.5174f, 6.6667f, 10.3333f, 6.6667f)
                    horizontalLineTo(9.6666f)
                    curveTo(9.4825f, 6.6667f, 9.3333f, 6.5174f, 9.3333f, 6.3333f)
                    verticalLineTo(5.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9BDDAB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 5.6667f)
                    curveTo(12.0f, 5.4826f, 12.1492f, 5.3333f, 12.3333f, 5.3333f)
                    horizontalLineTo(13.0f)
                    curveTo(13.1841f, 5.3333f, 13.3333f, 5.4826f, 13.3333f, 5.6667f)
                    verticalLineTo(6.3333f)
                    curveTo(13.3333f, 6.5174f, 13.1841f, 6.6667f, 13.0f, 6.6667f)
                    horizontalLineTo(12.3333f)
                    curveTo(12.1492f, 6.6667f, 12.0f, 6.5174f, 12.0f, 6.3333f)
                    verticalLineTo(5.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9BDDAB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.6666f, 5.6667f)
                    curveTo(14.6666f, 5.4826f, 14.8159f, 5.3333f, 15.0f, 5.3333f)
                    horizontalLineTo(15.6666f)
                    curveTo(15.8507f, 5.3333f, 16.0f, 5.4826f, 16.0f, 5.6667f)
                    verticalLineTo(6.3333f)
                    curveTo(16.0f, 6.5174f, 15.8507f, 6.6667f, 15.6666f, 6.6667f)
                    horizontalLineTo(15.0f)
                    curveTo(14.8159f, 6.6667f, 14.6666f, 6.5174f, 14.6666f, 6.3333f)
                    verticalLineTo(5.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9BDDAB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.3333f, 5.6667f)
                    curveTo(17.3333f, 5.4826f, 17.4826f, 5.3333f, 17.6666f, 5.3333f)
                    horizontalLineTo(18.3333f)
                    curveTo(18.5174f, 5.3333f, 18.6666f, 5.4826f, 18.6666f, 5.6667f)
                    verticalLineTo(6.3333f)
                    curveTo(18.6666f, 6.5174f, 18.5174f, 6.6667f, 18.3333f, 6.6667f)
                    horizontalLineTo(17.6666f)
                    curveTo(17.4826f, 6.6667f, 17.3333f, 6.5174f, 17.3333f, 6.3333f)
                    verticalLineTo(5.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9BDDAB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 5.6667f)
                    curveTo(20.0f, 5.4826f, 20.1492f, 5.3333f, 20.3333f, 5.3333f)
                    horizontalLineTo(21.0f)
                    curveTo(21.1841f, 5.3333f, 21.3333f, 5.4826f, 21.3333f, 5.6667f)
                    verticalLineTo(6.3333f)
                    curveTo(21.3333f, 6.5174f, 21.1841f, 6.6667f, 21.0f, 6.6667f)
                    horizontalLineTo(20.3333f)
                    curveTo(20.1492f, 6.6667f, 20.0f, 6.5174f, 20.0f, 6.3333f)
                    verticalLineTo(5.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9BDDAB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.6666f, 5.6667f)
                    curveTo(22.6666f, 5.4826f, 22.8159f, 5.3333f, 23.0f, 5.3333f)
                    horizontalLineTo(23.6666f)
                    curveTo(23.8507f, 5.3333f, 24.0f, 5.4826f, 24.0f, 5.6667f)
                    verticalLineTo(6.3333f)
                    curveTo(24.0f, 6.5174f, 23.8507f, 6.6667f, 23.6666f, 6.6667f)
                    horizontalLineTo(23.0f)
                    curveTo(22.8159f, 6.6667f, 22.6666f, 6.5174f, 22.6666f, 6.3333f)
                    verticalLineTo(5.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9BDDAB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(25.3333f, 5.6667f)
                    curveTo(25.3333f, 5.4826f, 25.4826f, 5.3333f, 25.6666f, 5.3333f)
                    horizontalLineTo(26.3333f)
                    curveTo(26.5174f, 5.3333f, 26.6666f, 5.4826f, 26.6666f, 5.6667f)
                    verticalLineTo(6.3333f)
                    curveTo(26.6666f, 6.5174f, 26.5174f, 6.6667f, 26.3333f, 6.6667f)
                    horizontalLineTo(25.6666f)
                    curveTo(25.4826f, 6.6667f, 25.3333f, 6.5174f, 25.3333f, 6.3333f)
                    verticalLineTo(5.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF8D93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.3333f, 13.6667f)
                    curveTo(1.3333f, 13.4826f, 1.4826f, 13.3333f, 1.6667f, 13.3333f)
                    horizontalLineTo(2.3333f)
                    curveTo(2.5174f, 13.3333f, 2.6667f, 13.4826f, 2.6667f, 13.6667f)
                    verticalLineTo(14.3333f)
                    curveTo(2.6667f, 14.5174f, 2.5174f, 14.6667f, 2.3333f, 14.6667f)
                    horizontalLineTo(1.6667f)
                    curveTo(1.4826f, 14.6667f, 1.3333f, 14.5174f, 1.3333f, 14.3333f)
                    verticalLineTo(13.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF8D93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0f, 13.6667f)
                    curveTo(4.0f, 13.4826f, 4.1492f, 13.3333f, 4.3333f, 13.3333f)
                    horizontalLineTo(5.0f)
                    curveTo(5.1841f, 13.3333f, 5.3333f, 13.4826f, 5.3333f, 13.6667f)
                    verticalLineTo(14.3333f)
                    curveTo(5.3333f, 14.5174f, 5.1841f, 14.6667f, 5.0f, 14.6667f)
                    horizontalLineTo(4.3333f)
                    curveTo(4.1492f, 14.6667f, 4.0f, 14.5174f, 4.0f, 14.3333f)
                    verticalLineTo(13.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF8D93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.6666f, 13.6667f)
                    curveTo(6.6666f, 13.4826f, 6.8159f, 13.3333f, 7.0f, 13.3333f)
                    horizontalLineTo(7.6666f)
                    curveTo(7.8507f, 13.3333f, 8.0f, 13.4826f, 8.0f, 13.6667f)
                    verticalLineTo(14.3333f)
                    curveTo(8.0f, 14.5174f, 7.8507f, 14.6667f, 7.6666f, 14.6667f)
                    horizontalLineTo(7.0f)
                    curveTo(6.8159f, 14.6667f, 6.6666f, 14.5174f, 6.6666f, 14.3333f)
                    verticalLineTo(13.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF8D93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.3333f, 13.6667f)
                    curveTo(9.3333f, 13.4826f, 9.4825f, 13.3333f, 9.6666f, 13.3333f)
                    horizontalLineTo(10.3333f)
                    curveTo(10.5174f, 13.3333f, 10.6666f, 13.4826f, 10.6666f, 13.6667f)
                    verticalLineTo(14.3333f)
                    curveTo(10.6666f, 14.5174f, 10.5174f, 14.6667f, 10.3333f, 14.6667f)
                    horizontalLineTo(9.6666f)
                    curveTo(9.4825f, 14.6667f, 9.3333f, 14.5174f, 9.3333f, 14.3333f)
                    verticalLineTo(13.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF8D93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 13.6667f)
                    curveTo(12.0f, 13.4826f, 12.1492f, 13.3333f, 12.3333f, 13.3333f)
                    horizontalLineTo(13.0f)
                    curveTo(13.1841f, 13.3333f, 13.3333f, 13.4826f, 13.3333f, 13.6667f)
                    verticalLineTo(14.3333f)
                    curveTo(13.3333f, 14.5174f, 13.1841f, 14.6667f, 13.0f, 14.6667f)
                    horizontalLineTo(12.3333f)
                    curveTo(12.1492f, 14.6667f, 12.0f, 14.5174f, 12.0f, 14.3333f)
                    verticalLineTo(13.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF8D93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.6666f, 13.6667f)
                    curveTo(14.6666f, 13.4826f, 14.8159f, 13.3333f, 15.0f, 13.3333f)
                    horizontalLineTo(15.6666f)
                    curveTo(15.8507f, 13.3333f, 16.0f, 13.4826f, 16.0f, 13.6667f)
                    verticalLineTo(14.3333f)
                    curveTo(16.0f, 14.5174f, 15.8507f, 14.6667f, 15.6666f, 14.6667f)
                    horizontalLineTo(15.0f)
                    curveTo(14.8159f, 14.6667f, 14.6666f, 14.5174f, 14.6666f, 14.3333f)
                    verticalLineTo(13.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF8D93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.3333f, 13.6667f)
                    curveTo(17.3333f, 13.4826f, 17.4826f, 13.3333f, 17.6666f, 13.3333f)
                    horizontalLineTo(18.3333f)
                    curveTo(18.5174f, 13.3333f, 18.6666f, 13.4826f, 18.6666f, 13.6667f)
                    verticalLineTo(14.3333f)
                    curveTo(18.6666f, 14.5174f, 18.5174f, 14.6667f, 18.3333f, 14.6667f)
                    horizontalLineTo(17.6666f)
                    curveTo(17.4826f, 14.6667f, 17.3333f, 14.5174f, 17.3333f, 14.3333f)
                    verticalLineTo(13.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF8D93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 13.6667f)
                    curveTo(20.0f, 13.4826f, 20.1492f, 13.3333f, 20.3333f, 13.3333f)
                    horizontalLineTo(21.0f)
                    curveTo(21.1841f, 13.3333f, 21.3333f, 13.4826f, 21.3333f, 13.6667f)
                    verticalLineTo(14.3333f)
                    curveTo(21.3333f, 14.5174f, 21.1841f, 14.6667f, 21.0f, 14.6667f)
                    horizontalLineTo(20.3333f)
                    curveTo(20.1492f, 14.6667f, 20.0f, 14.5174f, 20.0f, 14.3333f)
                    verticalLineTo(13.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF8D93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.6666f, 13.6667f)
                    curveTo(22.6666f, 13.4826f, 22.8159f, 13.3333f, 23.0f, 13.3333f)
                    horizontalLineTo(23.6666f)
                    curveTo(23.8507f, 13.3333f, 24.0f, 13.4826f, 24.0f, 13.6667f)
                    verticalLineTo(14.3333f)
                    curveTo(24.0f, 14.5174f, 23.8507f, 14.6667f, 23.6666f, 14.6667f)
                    horizontalLineTo(23.0f)
                    curveTo(22.8159f, 14.6667f, 22.6666f, 14.5174f, 22.6666f, 14.3333f)
                    verticalLineTo(13.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF8D93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(25.3333f, 13.6667f)
                    curveTo(25.3333f, 13.4826f, 25.4826f, 13.3333f, 25.6666f, 13.3333f)
                    horizontalLineTo(26.3333f)
                    curveTo(26.5174f, 13.3333f, 26.6666f, 13.4826f, 26.6666f, 13.6667f)
                    verticalLineTo(14.3333f)
                    curveTo(26.6666f, 14.5174f, 26.5174f, 14.6667f, 26.3333f, 14.6667f)
                    horizontalLineTo(25.6666f)
                    curveTo(25.4826f, 14.6667f, 25.3333f, 14.5174f, 25.3333f, 14.3333f)
                    verticalLineTo(13.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD80915)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 10.0f)
                    curveTo(12.0f, 9.4141f, 12.252f, 8.8869f, 12.6535f, 8.5211f)
                    lineTo(13.1025f, 9.014f)
                    curveTo(12.8338f, 9.2587f, 12.6667f, 9.6094f, 12.6667f, 10.0f)
                    curveTo(12.6667f, 10.4935f, 12.9348f, 10.9244f, 13.3333f, 11.155f)
                    verticalLineTo(10.0f)
                    curveTo(13.3333f, 9.6318f, 13.6318f, 9.3333f, 14.0f, 9.3333f)
                    curveTo(14.3682f, 9.3333f, 14.6666f, 9.6318f, 14.6666f, 10.0f)
                    verticalLineTo(11.155f)
                    curveTo(15.0652f, 10.9244f, 15.3333f, 10.4935f, 15.3333f, 10.0f)
                    curveTo(15.3333f, 9.6167f, 15.1725f, 9.272f, 14.9126f, 9.0279f)
                    lineTo(15.3691f, 8.542f)
                    curveTo(15.7574f, 8.9069f, 16.0f, 9.4251f, 16.0f, 10.0f)
                    curveTo(16.0f, 11.1046f, 15.1046f, 12.0f, 14.0f, 12.0f)
                    curveTo(12.8954f, 12.0f, 12.0f, 11.1046f, 12.0f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _ir!!
    }

private var _ir: ImageVector? = null
