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

public val FlagsGroup.Gg: ImageVector
    get() {
        if (_gg != null) {
            return _gg!!
        }
        _gg = Builder(name = "Gg", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFE8112D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.6665f, 0.0f)
                    horizontalLineToRelative(6.6667f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE8112D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(6.6667f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9DD16)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.333f, 2.6667f)
                    horizontalLineToRelative(1.3333f)
                    verticalLineToRelative(14.6667f)
                    horizontalLineToRelative(-1.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9DD16)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.9998f, 16.0f)
                    lineTo(15.3332f, 17.3334f)
                    horizontalLineTo(12.6665f)
                    lineTo(13.9998f, 16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9DD16)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.6665f, 9.3333f)
                    horizontalLineToRelative(14.6667f)
                    verticalLineToRelative(1.3333f)
                    horizontalLineToRelative(-14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9DD16)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.9998f, 4.0f)
                    lineTo(15.3332f, 2.6667f)
                    horizontalLineTo(12.6665f)
                    lineTo(13.9998f, 4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9DD16)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 10.0f)
                    lineTo(6.6667f, 8.6667f)
                    verticalLineTo(11.3334f)
                    lineTo(8.0f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9DD16)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.0f, 10.0f)
                    lineTo(21.3333f, 8.6667f)
                    verticalLineTo(11.3334f)
                    lineTo(20.0f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _gg!!
    }

private var _gg: ImageVector? = null
