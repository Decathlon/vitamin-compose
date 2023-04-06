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
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0E-4f, -0.0015f)
                    horizontalLineTo(28.0002f)
                    curveTo(28.0014f, 6.6652f, 28.0003f, 13.3318f, 28.0002f, 19.9985f)
                    curveTo(18.667f, 19.9985f, 9.3334f, 19.9704f, 2.0E-4f, 20.0015f)
                    curveTo(2.0E-4f, 13.3338f, -0.0014f, 6.6662f, 4.0E-4f, -0.0015f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDE233C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.6669f, 19.9985f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(-0.0015f)
                    horizontalLineTo(14.6669f)
                    verticalLineTo(19.9985f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFCCCCCD)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.3337f, 2.6652f)
                    horizontalLineTo(4.0004f)
                    verticalLineTo(3.9985f)
                    horizontalLineTo(2.6669f)
                    verticalLineTo(5.3319f)
                    horizontalLineTo(4.0004f)
                    verticalLineTo(6.6652f)
                    horizontalLineTo(5.3337f)
                    verticalLineTo(5.3319f)
                    horizontalLineTo(6.6669f)
                    verticalLineTo(3.9985f)
                    horizontalLineTo(5.3337f)
                    verticalLineTo(2.6652f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF7B716A)), stroke = null, fillAlpha = 0.66f,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.3337f, 1.9985f)
                    horizontalLineTo(6.0004f)
                    verticalLineTo(3.3319f)
                    horizontalLineTo(7.3336f)
                    verticalLineTo(5.9985f)
                    horizontalLineTo(6.0004f)
                    verticalLineTo(7.3319f)
                    horizontalLineTo(3.3337f)
                    verticalLineTo(5.9985f)
                    horizontalLineTo(2.0002f)
                    verticalLineTo(3.3319f)
                    horizontalLineTo(3.3337f)
                    verticalLineTo(1.9985f)
                    close()
                    moveTo(4.0004f, 3.9985f)
                    horizontalLineTo(2.6669f)
                    verticalLineTo(5.3319f)
                    horizontalLineTo(4.0004f)
                    verticalLineTo(6.6652f)
                    horizontalLineTo(5.3337f)
                    verticalLineTo(5.3319f)
                    horizontalLineTo(6.6669f)
                    verticalLineTo(3.9985f)
                    horizontalLineTo(5.3337f)
                    verticalLineTo(2.6652f)
                    horizontalLineTo(4.0004f)
                    verticalLineTo(3.9985f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF7B716A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.6671f, 5.3318f)
                    curveTo(5.0353f, 5.3318f, 5.3337f, 5.0334f, 5.3337f, 4.6652f)
                    curveTo(5.3337f, 4.297f, 5.0353f, 3.9985f, 4.6671f, 3.9985f)
                    curveTo(4.2989f, 3.9985f, 4.0004f, 4.297f, 4.0004f, 4.6652f)
                    curveTo(4.0004f, 5.0334f, 4.2989f, 5.3318f, 4.6671f, 5.3318f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 19.9985f)
                    lineTo(4.0E-4f, -0.0015f)
                    lineTo(14.6627f, -0.0015f)
                    verticalLineTo(0.4985f)
                    lineTo(0.5f, 0.4985f)
                    lineTo(0.5f, 19.4985f)
                    lineTo(14.6627f, 19.4985f)
                    verticalLineTo(19.9985f)
                    horizontalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _mt!!
    }

private var _mt: ImageVector? = null
