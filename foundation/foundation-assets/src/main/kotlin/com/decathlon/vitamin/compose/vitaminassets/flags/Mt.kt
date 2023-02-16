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

public val FlagsGroup.Mt: ImageVector
    get() {
        if (_mt != null) {
            return _mt!!
        }
        _mt = Builder(name = "Mt", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFDE233C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.6665f, 20.0f)
                    horizontalLineTo(27.9998f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(14.6665f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFCCCCCD)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.3333f, 2.6667f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(2.6665f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(6.6665f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(2.6667f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFF7B716A)), stroke = null, fillAlpha = 0.66f,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(4.0f, 2.6667f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(3.3333f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(4.0f)
                    close()
                    moveTo(5.3333f, 2.6667f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(2.6667f)
                    close()
                    moveTo(4.0f, 4.0f)
                    verticalLineTo(4.6667f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(4.0f)
                    close()
                    moveTo(2.6665f, 4.0f)
                    verticalLineTo(3.3333f)
                    horizontalLineTo(1.9998f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(2.6665f)
                    close()
                    moveTo(2.6665f, 5.3334f)
                    horizontalLineTo(1.9998f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(2.6665f)
                    verticalLineTo(5.3334f)
                    close()
                    moveTo(4.0f, 5.3334f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(4.6667f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(5.3334f)
                    close()
                    moveTo(4.0f, 6.6667f)
                    horizontalLineTo(3.3333f)
                    verticalLineTo(7.3334f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(6.6667f)
                    close()
                    moveTo(5.3333f, 6.6667f)
                    verticalLineTo(7.3334f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(5.3333f)
                    close()
                    moveTo(5.3333f, 5.3334f)
                    verticalLineTo(4.6667f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(5.3333f)
                    close()
                    moveTo(6.6665f, 5.3334f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(7.3332f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(6.6665f)
                    close()
                    moveTo(6.6665f, 4.0f)
                    horizontalLineTo(7.3332f)
                    verticalLineTo(3.3333f)
                    horizontalLineTo(6.6665f)
                    verticalLineTo(4.0f)
                    close()
                    moveTo(5.3333f, 4.0f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(4.6667f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(4.0f)
                    close()
                    moveTo(4.0f, 3.3333f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(3.3333f)
                    close()
                    moveTo(4.6667f, 4.0f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(3.3333f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(4.6667f)
                    close()
                    moveTo(2.6665f, 4.6667f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(3.3333f)
                    horizontalLineTo(2.6665f)
                    verticalLineTo(4.6667f)
                    close()
                    moveTo(3.3332f, 5.3334f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(1.9998f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(3.3332f)
                    close()
                    moveTo(4.0f, 4.6667f)
                    horizontalLineTo(2.6665f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(4.6667f)
                    close()
                    moveTo(4.6667f, 6.6667f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(3.3333f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(4.6667f)
                    close()
                    moveTo(5.3333f, 6.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(7.3334f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(6.0f)
                    close()
                    moveTo(4.6667f, 5.3334f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(4.6667f)
                    close()
                    moveTo(6.6665f, 4.6667f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(6.6665f)
                    verticalLineTo(4.6667f)
                    close()
                    moveTo(5.9998f, 4.0f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(7.3332f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(5.9998f)
                    close()
                    moveTo(5.3333f, 4.6667f)
                    horizontalLineTo(6.6665f)
                    verticalLineTo(3.3333f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(4.6667f)
                    close()
                    moveTo(4.6667f, 2.6667f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(4.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF7B716A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.6667f, 5.3333f)
                    curveTo(5.0349f, 5.3333f, 5.3333f, 5.0349f, 5.3333f, 4.6667f)
                    curveTo(5.3333f, 4.2985f, 5.0349f, 4.0f, 4.6667f, 4.0f)
                    curveTo(4.2985f, 4.0f, 4.0f, 4.2985f, 4.0f, 4.6667f)
                    curveTo(4.0f, 5.0349f, 4.2985f, 5.3333f, 4.6667f, 5.3333f)
                    close()
                }
            }
        }
        .build()
        return _mt!!
    }

private var _mt: ImageVector? = null
