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

public val FlagsGroup.Lr: ImageVector
    get() {
        if (_lr != null) {
            return _lr!!
        }
        _lr = Builder(name = "Lr", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -0.0f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE1244A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE1244A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 5.3333f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE1244A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.3333f, 10.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE1244A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 16.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(18.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0C3F8E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(13.3333f)
                    lineTo(0.0f, 13.3333f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.6667f, 8.2267f)
                    lineTo(4.3155f, 9.9027f)
                    lineTo(5.183f, 7.1487f)
                    lineTo(2.8624f, 5.4306f)
                    lineTo(5.7497f, 5.4046f)
                    lineTo(6.6667f, 2.6667f)
                    lineTo(7.5836f, 5.4046f)
                    lineTo(10.4709f, 5.4306f)
                    lineTo(8.1503f, 7.1487f)
                    lineTo(9.0178f, 9.9027f)
                    lineTo(6.6667f, 8.2267f)
                    close()
                }
            }
        }
        .build()
        return _lr!!
    }

private var _lr: ImageVector? = null
