package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Gb: ImageVector
    get() {
        if (_gb != null) {
            return _gb!!
        }
        _gb = Builder(name = "Gb", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF0A17A7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.2824f, -1.9164f)
                    lineTo(10.6667f, 6.1434f)
                    verticalLineTo(-1.3333f)
                    horizontalLineTo(17.3334f)
                    verticalLineTo(6.1434f)
                    lineTo(29.2825f, -1.9164f)
                    lineTo(30.7737f, 0.2943f)
                    lineTo(21.3263f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(21.3263f)
                    lineTo(30.7737f, 19.7057f)
                    lineTo(29.2825f, 21.9165f)
                    lineTo(17.3334f, 13.8567f)
                    verticalLineTo(21.3333f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(13.8567f)
                    lineTo(-1.2824f, 21.9165f)
                    lineTo(-2.7736f, 19.7057f)
                    lineTo(6.6738f, 13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(6.6738f)
                    lineTo(-2.7736f, 0.2943f)
                    lineTo(-1.2824f, -1.9164f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFDB1F35)),
                        strokeLineWidth = 0.666667f, strokeLineCap = Round, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(18.668f, 6.3322f)
                    lineTo(31.3333f, -2.0f)
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFDB1F35)),
                        strokeLineWidth = 0.666667f, strokeLineCap = Round, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(20.0128f, 13.6975f)
                    lineTo(31.3666f, 21.3503f)
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFDB1F35)),
                        strokeLineWidth = 0.666667f, strokeLineCap = Round, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(8.0056f, 6.3105f)
                    lineTo(-3.8375f, -1.671f)
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFDB1F35)),
                        strokeLineWidth = 0.666667f, strokeLineCap = Round, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.2901f, 13.6049f)
                    lineTo(-3.8375f, 22.3105f)
                }
                path(fill = SolidColor(Color(0xFFE6273E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 12.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(12.0f)
                    close()
                }
            }
        }
        .build()
        return _gb!!
    }

private var _gb: ImageVector? = null
