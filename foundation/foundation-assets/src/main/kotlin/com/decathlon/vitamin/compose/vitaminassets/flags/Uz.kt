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

public val FlagsGroup.Uz: ImageVector
    get() {
        if (_uz != null) {
            return _uz!!
        }
        _uz = Builder(name = "Uz", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF04AAC8)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF23C840)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.6667f, 5.3333f)
                    curveTo(5.078f, 5.3333f, 5.4602f, 5.2092f, 5.7781f, 4.9963f)
                    curveTo(5.7413f, 4.9988f, 5.7041f, 5.0f, 5.6667f, 5.0f)
                    curveTo(4.7462f, 5.0f, 4.0f, 4.2538f, 4.0f, 3.3333f)
                    curveTo(4.0f, 2.4128f, 4.7462f, 1.6667f, 5.6667f, 1.6667f)
                    curveTo(5.7041f, 1.6667f, 5.7413f, 1.6679f, 5.7781f, 1.6703f)
                    curveTo(5.4602f, 1.4575f, 5.078f, 1.3333f, 4.6667f, 1.3333f)
                    curveTo(3.5621f, 1.3333f, 2.6667f, 2.2288f, 2.6667f, 3.3333f)
                    curveTo(2.6667f, 4.4379f, 3.5621f, 5.3333f, 4.6667f, 5.3333f)
                    close()
                    moveTo(8.0f, 4.6667f)
                    curveTo(8.0f, 5.0349f, 7.7015f, 5.3333f, 7.3334f, 5.3333f)
                    curveTo(6.9652f, 5.3333f, 6.6667f, 5.0349f, 6.6667f, 4.6667f)
                    curveTo(6.6667f, 4.2985f, 6.9652f, 4.0f, 7.3334f, 4.0f)
                    curveTo(7.7015f, 4.0f, 8.0f, 4.2985f, 8.0f, 4.6667f)
                    close()
                    moveTo(10.0f, 2.6667f)
                    curveTo(10.3682f, 2.6667f, 10.6667f, 2.3682f, 10.6667f, 2.0f)
                    curveTo(10.6667f, 1.6318f, 10.3682f, 1.3333f, 10.0f, 1.3333f)
                    curveTo(9.6318f, 1.3333f, 9.3334f, 1.6318f, 9.3334f, 2.0f)
                    curveTo(9.3334f, 2.3682f, 9.6318f, 2.6667f, 10.0f, 2.6667f)
                    close()
                    moveTo(13.3334f, 2.0f)
                    curveTo(13.3334f, 2.3682f, 13.0349f, 2.6667f, 12.6667f, 2.6667f)
                    curveTo(12.2985f, 2.6667f, 12.0f, 2.3682f, 12.0f, 2.0f)
                    curveTo(12.0f, 1.6318f, 12.2985f, 1.3333f, 12.6667f, 1.3333f)
                    curveTo(13.0349f, 1.3333f, 13.3334f, 1.6318f, 13.3334f, 2.0f)
                    close()
                    moveTo(12.6667f, 5.3333f)
                    curveTo(13.0349f, 5.3333f, 13.3334f, 5.0349f, 13.3334f, 4.6667f)
                    curveTo(13.3334f, 4.2985f, 13.0349f, 4.0f, 12.6667f, 4.0f)
                    curveTo(12.2985f, 4.0f, 12.0f, 4.2985f, 12.0f, 4.6667f)
                    curveTo(12.0f, 5.0349f, 12.2985f, 5.3333f, 12.6667f, 5.3333f)
                    close()
                    moveTo(10.6667f, 4.6667f)
                    curveTo(10.6667f, 5.0349f, 10.3682f, 5.3333f, 10.0f, 5.3333f)
                    curveTo(9.6318f, 5.3333f, 9.3334f, 5.0349f, 9.3334f, 4.6667f)
                    curveTo(9.3334f, 4.2985f, 9.6318f, 4.0f, 10.0f, 4.0f)
                    curveTo(10.3682f, 4.0f, 10.6667f, 4.2985f, 10.6667f, 4.6667f)
                    close()
                }
            }
        }
        .build()
        return _uz!!
    }

private var _uz: ImageVector? = null
