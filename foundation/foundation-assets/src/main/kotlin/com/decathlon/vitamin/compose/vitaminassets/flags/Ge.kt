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

public val FlagsGroup.Ge: ImageVector
    get() {
        if (_ge != null) {
            return _ge!!
        }
        _ge = Builder(name = "Ge", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF5F5F5)),
                        strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(2.0f, 0.25f)
                    lineTo(26.0f, 0.25f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 27.75f, 2.0f)
                    lineTo(27.75f, 18.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 26.0f, 19.75f)
                    lineTo(2.0f, 19.75f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 0.25f, 18.0f)
                    lineTo(0.25f, 2.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 0.25f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF2B37)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 21.3333f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(-1.3333f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(-1.3333f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(29.3333f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(21.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFD0D1B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(21.6f, 4.4f)
                    lineTo(20.0f, 4.6667f)
                    verticalLineTo(3.3333f)
                    lineTo(21.6f, 3.6f)
                    lineTo(21.3333f, 2.0f)
                    horizontalLineTo(22.6667f)
                    lineTo(22.4f, 3.6f)
                    lineTo(24.0f, 3.3333f)
                    verticalLineTo(4.6667f)
                    lineTo(22.4f, 4.4f)
                    lineTo(22.6667f, 6.0f)
                    horizontalLineTo(21.3333f)
                    lineTo(21.6f, 4.4f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFD0D1B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.6f, 4.4f)
                    lineTo(4.0f, 4.6667f)
                    verticalLineTo(3.3333f)
                    lineTo(5.6f, 3.6f)
                    lineTo(5.3333f, 2.0f)
                    horizontalLineTo(6.6667f)
                    lineTo(6.4f, 3.6f)
                    lineTo(8.0f, 3.3333f)
                    verticalLineTo(4.6667f)
                    lineTo(6.4f, 4.4f)
                    lineTo(6.6667f, 6.0f)
                    horizontalLineTo(5.3333f)
                    lineTo(5.6f, 4.4f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFD0D1B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.6f, 16.4f)
                    lineTo(4.0f, 16.6667f)
                    verticalLineTo(15.3333f)
                    lineTo(5.6f, 15.6f)
                    lineTo(5.3333f, 14.0f)
                    horizontalLineTo(6.6667f)
                    lineTo(6.4f, 15.6f)
                    lineTo(8.0f, 15.3333f)
                    verticalLineTo(16.6667f)
                    lineTo(6.4f, 16.4f)
                    lineTo(6.6667f, 18.0f)
                    horizontalLineTo(5.3333f)
                    lineTo(5.6f, 16.4f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFD0D1B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(21.6f, 16.4f)
                    lineTo(20.0f, 16.6667f)
                    verticalLineTo(15.3333f)
                    lineTo(21.6f, 15.6f)
                    lineTo(21.3333f, 14.0f)
                    horizontalLineTo(22.6667f)
                    lineTo(22.4f, 15.6f)
                    lineTo(24.0f, 15.3333f)
                    verticalLineTo(16.6667f)
                    lineTo(22.4f, 16.4f)
                    lineTo(22.6667f, 18.0f)
                    horizontalLineTo(21.3333f)
                    lineTo(21.6f, 16.4f)
                    close()
                }
            }
        }
        .build()
        return _ge!!
    }

private var _ge: ImageVector? = null
