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

public val FlagsGroup.Mh: ImageVector
    get() {
        if (_mh != null) {
            return _mh!!
        }
        _mh = Builder(name = "Mh", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF064DAE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF18D36)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0f, 0.0f)
                    verticalLineTo(5.3333f)
                    lineTo(0.0f, 20.0f)
                    lineTo(28.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0f, 10.6667f)
                    verticalLineTo(5.3333f)
                    lineTo(0.0f, 20.0f)
                    lineTo(28.0f, 10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.4518f, 5.829f)
                    lineTo(6.0f, 2.6667f)
                    lineTo(5.5482f, 5.829f)
                    lineTo(4.3333f, 4.4466f)
                    lineTo(4.9571f, 6.2904f)
                    lineTo(3.1133f, 5.6667f)
                    lineTo(4.4957f, 6.8816f)
                    lineTo(1.3333f, 7.3333f)
                    lineTo(4.4957f, 7.7851f)
                    lineTo(3.1133f, 9.0f)
                    lineTo(4.9571f, 8.3763f)
                    lineTo(4.3333f, 10.2201f)
                    lineTo(5.5482f, 8.8377f)
                    lineTo(6.0f, 12.0f)
                    lineTo(6.4518f, 8.8377f)
                    lineTo(7.6667f, 10.2201f)
                    lineTo(7.0429f, 8.3763f)
                    lineTo(8.8868f, 9.0f)
                    lineTo(7.5043f, 7.7851f)
                    lineTo(10.6667f, 7.3333f)
                    lineTo(7.5043f, 6.8816f)
                    lineTo(8.8868f, 5.6667f)
                    lineTo(7.0429f, 6.2904f)
                    lineTo(7.6667f, 4.4466f)
                    lineTo(6.4518f, 5.829f)
                    close()
                }
            }
        }
        .build()
        return _mh!!
    }

private var _mh: ImageVector? = null
