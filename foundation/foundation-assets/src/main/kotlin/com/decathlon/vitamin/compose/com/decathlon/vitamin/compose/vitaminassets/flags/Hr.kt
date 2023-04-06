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

public val FlagsGroup.Hr: ImageVector
    get() {
        if (_hr != null) {
            return _hr!!
        }
        _hr = Builder(name = "Hr", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, -1.0E-4f)
                    lineTo(28.0f, 0.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 1.0E-4f, 6.6666f, 0.0f, -1.0E-4f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF202D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6666f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    lineTo(0.0f, -1.0E-4f)
                    lineTo(0.0f, 6.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8B5A84)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.6667f, 5.3333f)
                    lineTo(11.3333f, 4.6666f)
                    lineTo(12.0f, 5.3333f)
                    verticalLineTo(6.6666f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8B5A84)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.3333f, 5.3333f)
                    lineTo(14.0f, 4.6666f)
                    lineTo(14.6667f, 5.3333f)
                    verticalLineTo(6.6666f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8B5A84)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.6667f, 4.6666f)
                    lineTo(16.0f, 5.3333f)
                    verticalLineTo(6.6666f)
                    horizontalLineTo(17.3334f)
                    verticalLineTo(5.3333f)
                    lineTo(16.6667f, 4.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8C1F60)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.6667f, 4.6666f)
                    lineTo(12.0f, 5.3333f)
                    verticalLineTo(6.6666f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(5.3333f)
                    lineTo(12.6667f, 4.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8C1F60)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.3333f, 4.6666f)
                    lineTo(14.6667f, 5.3333f)
                    verticalLineTo(6.6666f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(5.3333f)
                    lineTo(15.3333f, 4.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF2027AC)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF212E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 6.6666f)
                    horizontalLineTo(11.3333f)
                    lineTo(10.6667f, 7.9999f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(10.6666f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(14.6666f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(14.6666f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(17.3334f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(10.6666f)
                    horizontalLineTo(17.3334f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(7.9999f)
                    horizontalLineTo(17.3334f)
                    lineTo(16.6667f, 6.6666f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(7.9999f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(6.6666f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(7.9999f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(6.6666f)
                    close()
                    moveTo(13.3333f, 9.3333f)
                    verticalLineTo(7.9999f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(13.3333f)
                    close()
                    moveTo(13.3333f, 10.6666f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(10.6666f)
                    horizontalLineTo(13.3333f)
                    close()
                    moveTo(14.6667f, 10.6666f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(10.6666f)
                    close()
                    moveTo(14.6667f, 10.6666f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(10.6666f)
                    close()
                }
            }
        }
        .build()
        return _hr!!
    }

private var _hr: ImageVector? = null
