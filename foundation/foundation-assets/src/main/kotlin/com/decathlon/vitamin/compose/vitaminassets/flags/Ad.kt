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

public val FlagsGroup.Ad: ImageVector
    get() {
        if (_ad != null) {
            return _ad!!
        }
        _ad = Builder(name = "Ad", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1537D1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEA3058)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.3334f, 0.0f)
                    horizontalLineToRelative(14.6667f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFCF3C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3334f, 20.0f)
                    horizontalLineTo(18.6667f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(9.3334f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFEDB1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.6666f, 8.6667f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(12.6666f)
                    verticalLineTo(8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFD32E28)),
                        strokeLineWidth = 0.666667f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(12.3923f, 8.6944f)
                    curveTo(12.3761f, 8.5f, 12.5295f, 8.3333f, 12.7245f, 8.3333f)
                    horizontalLineTo(15.2754f)
                    curveTo(15.4704f, 8.3333f, 15.6238f, 8.5f, 15.6076f, 8.6944f)
                    lineTo(15.4363f, 10.7497f)
                    curveTo(15.3931f, 11.268f, 14.9599f, 11.6667f, 14.4398f, 11.6667f)
                    horizontalLineTo(13.5601f)
                    curveTo(13.04f, 11.6667f, 12.6068f, 11.268f, 12.5636f, 10.7497f)
                    lineTo(12.3923f, 8.6944f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD32E28)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.6666f, 9.3333f)
                    horizontalLineTo(15.3333f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(14.6666f)
                    horizontalLineTo(13.3333f)
                    horizontalLineTo(12.6666f)
                    verticalLineTo(9.3333f)
                    close()
                }
            }
        }
        .build()
        return _ad!!
    }

private var _ad: ImageVector? = null
