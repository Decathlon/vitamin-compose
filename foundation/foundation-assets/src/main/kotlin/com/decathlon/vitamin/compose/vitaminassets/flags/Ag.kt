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

public val FlagsGroup.Ag: ImageVector
    get() {
        if (_ag != null) {
            return _ag!!
        }
        _ag = Builder(name = "Ag", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, 1.0E-4f, 18.6667f, -2.0E-4f, 28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE2243B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    lineTo(14.0f, 20.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.6667f, 13.3334f)
                    lineTo(14.0f, 20.0f)
                    lineTo(9.3334f, 13.3334f)
                    horizontalLineTo(18.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1984D8)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.3334f, 13.3334f)
                    lineTo(5.6f, 8.0f)
                    horizontalLineTo(22.4f)
                    lineTo(18.6667f, 13.3334f)
                    horizontalLineTo(9.3334f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFCF3C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.5f, 8.0f)
                    horizontalLineTo(14.0f)
                    horizontalLineTo(13.0f)
                    horizontalLineTo(12.0f)
                    horizontalLineTo(11.0f)
                    lineTo(8.0f, 5.3333f)
                    lineTo(11.8787f, 6.0f)
                    lineTo(11.3333f, 2.0f)
                    lineTo(14.0f, 5.3333f)
                    lineTo(16.6667f, 2.0f)
                    lineTo(16.1213f, 6.0f)
                    lineTo(20.0f, 5.3333f)
                    lineTo(17.0f, 8.0f)
                    horizontalLineTo(15.0f)
                    horizontalLineTo(14.5f)
                    close()
                }
            }
        }
        .build()
        return _ag!!
    }

private var _ag: ImageVector? = null
