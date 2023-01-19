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

public val FlagsGroup.Ca: ImageVector
    get() {
        if (_ca != null) {
            return _ca!!
        }
        _ca = Builder(name = "Ca", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFFF3131)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 0.0f)
                    horizontalLineToRelative(8.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF3131)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF3131)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.1118f, 9.2215f)
                    curveTo(15.8786f, 9.4547f, 15.4845f, 9.2439f, 15.5492f, 8.9205f)
                    lineTo(16.0f, 6.6667f)
                    lineTo(14.6666f, 7.3333f)
                    lineTo(14.0f, 5.3333f)
                    lineTo(13.3333f, 7.3333f)
                    lineTo(12.0f, 6.6667f)
                    lineTo(12.4507f, 8.9205f)
                    curveTo(12.5154f, 9.2439f, 12.1214f, 9.4547f, 11.8882f, 9.2215f)
                    lineTo(11.569f, 8.9024f)
                    curveTo(11.4388f, 8.7722f, 11.2278f, 8.7722f, 11.0976f, 8.9024f)
                    lineTo(10.6666f, 9.3333f)
                    lineTo(9.3333f, 8.6667f)
                    lineTo(10.0f, 10.0f)
                    lineTo(9.569f, 10.431f)
                    curveTo(9.4388f, 10.5611f, 9.4388f, 10.7722f, 9.569f, 10.9024f)
                    lineTo(11.3333f, 12.6667f)
                    horizontalLineTo(13.3333f)
                    lineTo(13.6666f, 14.6667f)
                    horizontalLineTo(14.3333f)
                    lineTo(14.6666f, 12.6667f)
                    horizontalLineTo(16.6666f)
                    lineTo(18.4309f, 10.9024f)
                    curveTo(18.5611f, 10.7722f, 18.5611f, 10.5611f, 18.4309f, 10.431f)
                    lineTo(18.0f, 10.0f)
                    lineTo(18.6666f, 8.6667f)
                    lineTo(17.3333f, 9.3333f)
                    lineTo(16.9023f, 8.9024f)
                    curveTo(16.7722f, 8.7722f, 16.5611f, 8.7722f, 16.4309f, 8.9024f)
                    lineTo(16.1118f, 9.2215f)
                    close()
                }
            }
        }
        .build()
        return _ca!!
    }

private var _ca: ImageVector? = null
