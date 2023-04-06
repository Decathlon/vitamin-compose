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

public val FlagsGroup.Gi: ImageVector
    get() {
        if (_gi != null) {
            return _gi!!
        }
        _gi = Builder(name = "Gi", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3138f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
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
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE71924)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEA1824)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 8.0f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(5.9873f)
                    curveTo(10.6667f, 5.6201f, 10.3654f, 5.3333f, 9.9938f, 5.3333f)
                    horizontalLineTo(8.6729f)
                    curveTo(8.2854f, 5.3333f, 8.0f, 5.6261f, 8.0f, 5.9873f)
                    verticalLineTo(10.6667f)
                    lineTo(6.6667f, 12.0f)
                    horizontalLineTo(21.3334f)
                    lineTo(20.0f, 10.6667f)
                    verticalLineTo(5.9873f)
                    curveTo(20.0f, 5.6201f, 19.6988f, 5.3333f, 19.3271f, 5.3333f)
                    horizontalLineTo(18.0063f)
                    curveTo(17.6188f, 5.3333f, 17.3334f, 5.6261f, 17.3334f, 5.9873f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(4.654f)
                    curveTo(16.0f, 4.2867f, 15.7043f, 4.0f, 15.3395f, 4.0f)
                    horizontalLineTo(12.6606f)
                    curveTo(12.2877f, 4.0f, 12.0f, 4.2928f, 12.0f, 4.654f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3334f, 10.6667f)
                    curveTo(8.9652f, 10.6667f, 8.6667f, 10.3682f, 8.6667f, 10.0f)
                    curveTo(8.6667f, 9.6318f, 8.9652f, 9.3333f, 9.3334f, 9.3333f)
                    curveTo(9.7016f, 9.3333f, 10.0f, 9.6318f, 10.0f, 10.0f)
                    curveTo(10.0f, 10.3682f, 9.7016f, 10.6667f, 9.3334f, 10.6667f)
                    close()
                    moveTo(9.3334f, 8.0f)
                    curveTo(8.9652f, 8.0f, 8.6667f, 7.7015f, 8.6667f, 7.3333f)
                    curveTo(8.6667f, 6.9651f, 8.9652f, 6.6667f, 9.3334f, 6.6667f)
                    curveTo(9.7016f, 6.6667f, 10.0f, 6.9651f, 10.0f, 7.3333f)
                    curveTo(10.0f, 7.7015f, 9.7016f, 8.0f, 9.3334f, 8.0f)
                    close()
                    moveTo(14.0f, 10.6667f)
                    curveTo(13.6319f, 10.6667f, 13.3334f, 10.3682f, 13.3334f, 10.0f)
                    curveTo(13.3334f, 9.6318f, 13.6319f, 9.3333f, 14.0f, 9.3333f)
                    curveTo(14.3682f, 9.3333f, 14.6667f, 9.6318f, 14.6667f, 10.0f)
                    curveTo(14.6667f, 10.3682f, 14.3682f, 10.6667f, 14.0f, 10.6667f)
                    close()
                    moveTo(14.0f, 6.6667f)
                    curveTo(13.6319f, 6.6667f, 13.3334f, 6.3682f, 13.3334f, 6.0f)
                    curveTo(13.3334f, 5.6318f, 13.6319f, 5.3333f, 14.0f, 5.3333f)
                    curveTo(14.3682f, 5.3333f, 14.6667f, 5.6318f, 14.6667f, 6.0f)
                    curveTo(14.6667f, 6.3682f, 14.3682f, 6.6667f, 14.0f, 6.6667f)
                    close()
                    moveTo(18.6667f, 10.6667f)
                    curveTo(18.2985f, 10.6667f, 18.0f, 10.3682f, 18.0f, 10.0f)
                    curveTo(18.0f, 9.6318f, 18.2985f, 9.3333f, 18.6667f, 9.3333f)
                    curveTo(19.0349f, 9.3333f, 19.3334f, 9.6318f, 19.3334f, 10.0f)
                    curveTo(19.3334f, 10.3682f, 19.0349f, 10.6667f, 18.6667f, 10.6667f)
                    close()
                    moveTo(18.6667f, 8.0f)
                    curveTo(18.2985f, 8.0f, 18.0f, 7.7015f, 18.0f, 7.3333f)
                    curveTo(18.0f, 6.9651f, 18.2985f, 6.6667f, 18.6667f, 6.6667f)
                    curveTo(19.0349f, 6.6667f, 19.3334f, 6.9651f, 19.3334f, 7.3333f)
                    curveTo(19.3334f, 7.7015f, 19.0349f, 8.0f, 18.6667f, 8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFECCE3E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.3334f, 13.2575f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(17.3333f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(13.2575f)
                    curveTo(15.4435f, 13.0744f, 16.0f, 12.5805f, 16.0f, 12.0f)
                    curveTo(16.0f, 11.2636f, 15.1046f, 10.6667f, 14.0f, 10.6667f)
                    curveTo(12.8955f, 10.6667f, 12.0f, 11.2636f, 12.0f, 12.0f)
                    curveTo(12.0f, 12.5805f, 12.5566f, 13.0744f, 13.3334f, 13.2575f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    verticalLineTo(13.3138f)
                    horizontalLineTo(27.5f)
                    verticalLineTo(0.5f)
                    horizontalLineTo(0.5f)
                    lineTo(0.5f, 13.3138f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(28.0f)
                    close()
                }
            }
        }
        .build()
        return _gi!!
    }

private var _gi: ImageVector? = null
