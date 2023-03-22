package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val FlagsGroup.Nc: ImageVector
    get() {
        if (_nc != null) {
            return _nc!!
        }
        _nc = Builder(name = "Nc", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF094CC7), 1.0f to Color(0xFF003CAB),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,6.66667f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF2AAD55), 1.0f to Color(0xFF219447),
                        start = Offset(14.0f,13.3333f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF65D55), 1.0f to Color(0xFFE9443C),
                        start = Offset(14.0f,6.66666f), end = Offset(14.0f,13.3333f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFAE749), 1.0f to Color(0xFFFBE533),
                        start = Offset(14.0f,5.33334f), end = Offset(14.0f,14.6667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(14.0f, 14.6667f)
                    curveTo(16.5773f, 14.6667f, 18.6667f, 12.5773f, 18.6667f, 10.0f)
                    curveTo(18.6667f, 7.4227f, 16.5773f, 5.3333f, 14.0f, 5.3333f)
                    curveTo(11.4227f, 5.3333f, 9.3333f, 7.4227f, 9.3333f, 10.0f)
                    curveTo(9.3333f, 12.5773f, 11.4227f, 14.6667f, 14.0f, 14.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D),
                        start = Offset(13.9999f,6.31943f), end = Offset(13.9999f,14.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(13.4556f, 8.2816f)
                    curveTo(13.3786f, 8.3903f, 13.3333f, 8.5232f, 13.3333f, 8.6666f)
                    curveTo(13.3333f, 9.0348f, 13.6317f, 9.3333f, 13.9999f, 9.3333f)
                    curveTo(14.3681f, 9.3333f, 14.6666f, 9.0348f, 14.6666f, 8.6666f)
                    curveTo(14.6666f, 8.3469f, 14.4415f, 8.0798f, 14.1412f, 8.015f)
                    curveTo(14.205f, 7.9825f, 14.2691f, 7.9477f, 14.3333f, 7.9107f)
                    curveTo(15.1304f, 7.4504f, 15.6274f, 6.8188f, 15.4433f, 6.5f)
                    curveTo(15.2592f, 6.1811f, 14.4637f, 6.2957f, 13.6666f, 6.756f)
                    curveTo(12.8694f, 7.2162f, 12.3725f, 7.8478f, 12.5566f, 8.1666f)
                    curveTo(12.6704f, 8.3639f, 13.0182f, 8.3953f, 13.4556f, 8.2816f)
                    close()
                    moveTo(13.9999f, 14.0f)
                    curveTo(12.8954f, 14.0f, 12.6666f, 13.0348f, 12.6666f, 12.6666f)
                    curveTo(12.6666f, 12.2985f, 12.8954f, 12.0f, 13.9999f, 12.0f)
                    curveTo(15.1045f, 12.0f, 15.3333f, 12.2985f, 15.3333f, 12.6666f)
                    curveTo(15.3333f, 13.0348f, 15.1045f, 14.0f, 13.9999f, 14.0f)
                    close()
                    moveTo(13.9999f, 12.0f)
                    curveTo(13.6317f, 12.0f, 13.3333f, 11.7015f, 13.3333f, 11.3333f)
                    curveTo(13.3333f, 10.9651f, 13.6317f, 10.6666f, 13.9999f, 10.6666f)
                    curveTo(14.3681f, 10.6666f, 14.6666f, 10.9651f, 14.6666f, 11.3333f)
                    curveTo(14.6666f, 11.7015f, 14.3681f, 12.0f, 13.9999f, 12.0f)
                    close()
                    moveTo(13.9999f, 10.6666f)
                    curveTo(13.6317f, 10.6666f, 13.3333f, 10.3682f, 13.3333f, 10.0f)
                    curveTo(13.3333f, 9.6318f, 13.6317f, 9.3333f, 13.9999f, 9.3333f)
                    curveTo(14.3681f, 9.3333f, 14.6666f, 9.6318f, 14.6666f, 10.0f)
                    curveTo(14.6666f, 10.3682f, 14.3681f, 10.6666f, 13.9999f, 10.6666f)
                    close()
                }
            }
        }
        .build()
        return _nc!!
    }

private var _nc: ImageVector? = null
