package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
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
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.TextCurved: ImageVector
    get() {
        if (_textCurved != null) {
            return _textCurved!!
        }
        _textCurved = Builder(name = "TextCurved", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0812f, 3.0f)
                    lineTo(11.9469f, 11.6244f)
                    lineTo(13.7692f, 3.0679f)
                    lineTo(19.6274f, 4.3106f)
                    curveTo(21.2452f, 4.6538f, 22.2778f, 6.2409f, 21.9339f, 7.8554f)
                    curveTo(21.7744f, 8.6046f, 21.3465f, 9.228f, 20.7721f, 9.6468f)
                    curveTo(21.1267f, 10.2618f, 21.2633f, 11.0046f, 21.1038f, 11.7532f)
                    curveTo(20.7599f, 13.3678f, 19.1698f, 14.3984f, 17.5521f, 14.0552f)
                    lineTo(12.1657f, 12.9126f)
                    lineTo(10.5968f, 13.2454f)
                    lineTo(8.7798f, 10.5754f)
                    lineTo(4.7121f, 11.4383f)
                    lineTo(4.1423f, 14.6147f)
                    lineTo(2.0f, 15.0691f)
                    lineTo(4.0921f, 3.422f)
                    lineTo(6.0812f, 3.0f)
                    close()
                    moveTo(5.6853f, 6.0225f)
                    lineTo(5.0915f, 9.3209f)
                    lineTo(7.5699f, 8.7951f)
                    lineTo(5.6853f, 6.0225f)
                    close()
                    moveTo(18.3822f, 10.1574f)
                    lineTo(14.4767f, 9.3289f)
                    lineTo(14.0617f, 11.2778f)
                    lineTo(17.9672f, 12.1063f)
                    curveTo(18.5064f, 12.2207f, 19.0364f, 11.8772f, 19.1511f, 11.339f)
                    curveTo(19.2652f, 10.803f, 18.9192f, 10.2713f, 18.3822f, 10.1574f)
                    close()
                    moveTo(19.2124f, 6.2596f)
                    lineTo(15.3069f, 5.4311f)
                    lineTo(14.8918f, 7.38f)
                    lineTo(18.7973f, 8.2085f)
                    curveTo(19.3365f, 8.3229f, 19.8666f, 7.9793f, 19.9812f, 7.4412f)
                    curveTo(20.0953f, 6.9052f, 19.7494f, 6.3735f, 19.2124f, 6.2596f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.2464f, 19.2588f)
                    curveTo(9.0981f, 16.2626f, 14.8657f, 16.2715f, 18.7169f, 19.2594f)
                    lineTo(16.9728f, 21.0f)
                    horizontalLineTo(21.9638f)
                    verticalLineTo(16.0189f)
                    lineTo(20.1377f, 17.8413f)
                    curveTo(15.5046f, 14.0904f, 8.4652f, 14.0759f, 3.8257f, 17.8409f)
                    lineTo(2.0001f, 16.0189f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(6.991f)
                    lineTo(5.2464f, 19.2588f)
                    close()
                }
            }
        }
        .build()
        return _textCurved!!
    }

private var _textCurved: ImageVector? = null
