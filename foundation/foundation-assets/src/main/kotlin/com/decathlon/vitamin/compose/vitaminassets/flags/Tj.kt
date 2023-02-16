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

public val FlagsGroup.Tj: ImageVector
    get() {
        if (_tj != null) {
            return _tj!!
        }
        _tj = Builder(name = "Tj", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFD9101C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0F7811)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFAD14E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.3334f, 8.6667f)
                    curveTo(13.3334f, 9.0349f, 13.0349f, 9.3333f, 12.6667f, 9.3333f)
                    curveTo(12.2985f, 9.3333f, 12.0f, 9.0349f, 12.0f, 8.6667f)
                    curveTo(12.0f, 8.2985f, 12.2985f, 8.0f, 12.6667f, 8.0f)
                    curveTo(13.0349f, 8.0f, 13.3334f, 8.2985f, 13.3334f, 8.6667f)
                    close()
                    moveTo(14.6667f, 10.0f)
                    curveTo(14.6667f, 10.1206f, 14.6347f, 10.3767f, 14.5787f, 10.6667f)
                    horizontalLineTo(15.3334f)
                    curveTo(15.7016f, 10.6667f, 16.0f, 10.9651f, 16.0f, 11.3333f)
                    curveTo(16.0f, 11.7015f, 15.7016f, 12.0f, 15.3334f, 12.0f)
                    horizontalLineTo(14.0f)
                    horizontalLineTo(12.6667f)
                    curveTo(12.2985f, 12.0f, 12.0f, 11.7015f, 12.0f, 11.3333f)
                    curveTo(12.0f, 10.9651f, 12.2985f, 10.6667f, 12.6667f, 10.6667f)
                    horizontalLineTo(13.4214f)
                    curveTo(13.3654f, 10.3767f, 13.3334f, 10.1206f, 13.3334f, 10.0f)
                    curveTo(13.3334f, 9.6318f, 13.6319f, 9.3333f, 14.0f, 9.3333f)
                    curveTo(14.3682f, 9.3333f, 14.6667f, 9.6318f, 14.6667f, 10.0f)
                    close()
                    moveTo(16.0f, 8.6667f)
                    curveTo(16.0f, 9.0349f, 15.7016f, 9.3333f, 15.3334f, 9.3333f)
                    curveTo(14.9652f, 9.3333f, 14.6667f, 9.0349f, 14.6667f, 8.6667f)
                    curveTo(14.6667f, 8.2985f, 14.9652f, 8.0f, 15.3334f, 8.0f)
                    curveTo(15.7016f, 8.0f, 16.0f, 8.2985f, 16.0f, 8.6667f)
                    close()
                    moveTo(18.0f, 10.6667f)
                    curveTo(18.3682f, 10.6667f, 18.6667f, 10.3682f, 18.6667f, 10.0f)
                    curveTo(18.6667f, 9.6318f, 18.3682f, 9.3333f, 18.0f, 9.3333f)
                    curveTo(17.6319f, 9.3333f, 17.3334f, 9.6318f, 17.3334f, 10.0f)
                    curveTo(17.3334f, 10.3682f, 17.6319f, 10.6667f, 18.0f, 10.6667f)
                    close()
                    moveTo(10.6667f, 10.0f)
                    curveTo(10.6667f, 10.3682f, 10.3682f, 10.6667f, 10.0f, 10.6667f)
                    curveTo(9.6319f, 10.6667f, 9.3334f, 10.3682f, 9.3334f, 10.0f)
                    curveTo(9.3334f, 9.6318f, 9.6319f, 9.3333f, 10.0f, 9.3333f)
                    curveTo(10.3682f, 9.3333f, 10.6667f, 9.6318f, 10.6667f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _tj!!
    }

private var _tj: ImageVector? = null
