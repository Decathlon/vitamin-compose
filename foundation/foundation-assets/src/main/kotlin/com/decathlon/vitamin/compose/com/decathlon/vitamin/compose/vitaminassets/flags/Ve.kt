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

public val FlagsGroup.Ve: ImageVector
    get() {
        if (_ve != null) {
            return _ve!!
        }
        _ve = Builder(name = "Ve", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 2.0f)
                    curveTo(0.0f, 0.8954f, 0.8954f, 0.0f, 2.0f, 0.0f)
                    horizontalLineTo(26.0f)
                    curveTo(27.1046f, 0.0f, 28.0f, 0.8954f, 28.0f, 2.0f)
                    verticalLineTo(18.0f)
                    curveTo(28.0f, 19.1046f, 27.1046f, 20.0f, 26.0f, 20.0f)
                    horizontalLineTo(2.0f)
                    curveTo(0.8954f, 20.0f, 0.0f, 19.1046f, 0.0f, 18.0f)
                    verticalLineTo(2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF063191)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE2213B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 9.3333f)
                    curveTo(14.3682f, 9.3333f, 14.6667f, 9.0349f, 14.6667f, 8.6667f)
                    curveTo(14.6667f, 8.2985f, 14.3682f, 8.0f, 14.0f, 8.0f)
                    curveTo(13.6318f, 8.0f, 13.3333f, 8.2985f, 13.3333f, 8.6667f)
                    curveTo(13.3333f, 9.0349f, 13.6318f, 9.3333f, 14.0f, 9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.3333f, 10.0f)
                    curveTo(11.7015f, 10.0f, 12.0f, 9.7015f, 12.0f, 9.3333f)
                    curveTo(12.0f, 8.9651f, 11.7015f, 8.6667f, 11.3333f, 8.6667f)
                    curveTo(10.9651f, 8.6667f, 10.6667f, 8.9651f, 10.6667f, 9.3333f)
                    curveTo(10.6667f, 9.7015f, 10.9651f, 10.0f, 11.3333f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.3333f, 9.3333f)
                    curveTo(17.3333f, 9.7015f, 17.0349f, 10.0f, 16.6667f, 10.0f)
                    curveTo(16.2985f, 10.0f, 16.0f, 9.7015f, 16.0f, 9.3333f)
                    curveTo(16.0f, 8.9651f, 16.2985f, 8.6667f, 16.6667f, 8.6667f)
                    curveTo(17.0349f, 8.6667f, 17.3333f, 8.9651f, 17.3333f, 9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0f, 12.0f)
                    curveTo(10.3682f, 12.0f, 10.6667f, 11.7015f, 10.6667f, 11.3333f)
                    curveTo(10.6667f, 10.9651f, 10.3682f, 10.6667f, 10.0f, 10.6667f)
                    curveTo(9.6318f, 10.6667f, 9.3333f, 10.9651f, 9.3333f, 11.3333f)
                    curveTo(9.3333f, 11.7015f, 9.6318f, 12.0f, 10.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.6667f, 11.3333f)
                    curveTo(18.6667f, 11.7015f, 18.3682f, 12.0f, 18.0f, 12.0f)
                    curveTo(17.6318f, 12.0f, 17.3333f, 11.7015f, 17.3333f, 11.3333f)
                    curveTo(17.3333f, 10.9651f, 17.6318f, 10.6667f, 18.0f, 10.6667f)
                    curveTo(18.3682f, 10.6667f, 18.6667f, 10.9651f, 18.6667f, 11.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD044)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
            }
        }
        .build()
        return _ve!!
    }

private var _ve: ImageVector? = null
