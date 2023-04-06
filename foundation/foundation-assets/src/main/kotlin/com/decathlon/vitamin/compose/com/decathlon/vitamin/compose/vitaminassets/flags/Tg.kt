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

public val FlagsGroup.Tg: ImageVector
    get() {
        if (_tg != null) {
            return _tg!!
        }
        _tg = Builder(name = "Tg", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 0.0f)
                    curveTo(9.3334f, 0.0f, 18.6667f, -0.0f, 28.0001f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    curveTo(4.0E-4f, 13.3333f, -1.0E-4f, 6.6667f, 1.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD44D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 0.0f)
                    lineTo(28.0001f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(1.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF159A74)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 0.0f)
                    lineTo(28.0001f, 0.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(12.0001f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF159A74)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 8.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(12.0001f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF159A74)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0001f, 16.0f)
                    horizontalLineTo(1.0E-4f)
                    lineTo(0.0f, 20.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFED1F45)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 0.0f)
                    horizontalLineTo(12.0001f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(1.0E-4f)
                    lineTo(1.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0001f, 7.56f)
                    lineTo(3.6489f, 9.2361f)
                    lineTo(4.5164f, 6.4821f)
                    lineTo(2.1958f, 4.7639f)
                    lineTo(5.0831f, 4.7379f)
                    lineTo(6.0001f, 2.0f)
                    lineTo(6.917f, 4.7379f)
                    lineTo(9.8043f, 4.7639f)
                    lineTo(7.4837f, 6.4821f)
                    lineTo(8.3512f, 9.2361f)
                    lineTo(6.0001f, 7.56f)
                    close()
                }
            }
        }
        .build()
        return _tg!!
    }

private var _tg: ImageVector? = null
