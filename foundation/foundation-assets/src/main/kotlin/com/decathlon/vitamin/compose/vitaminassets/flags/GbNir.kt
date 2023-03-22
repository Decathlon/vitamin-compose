package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val FlagsGroup.GbNir: ImageVector
    get() {
        if (_gbNir != null) {
            return _gbNir!!
        }
        _gbNir = Builder(name = "GbNir", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp,
                viewportWidth = 28.0f, viewportHeight = 20.0f).apply {
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
                path(fill = linearGradient(0.0f to Color(0xFFE82739), 1.0f to Color(0xFFCA1A2B),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(12.0f, 8.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(12.0f)
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
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(13.9999f,5.33334f), end = Offset(13.9999f,14.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(15.3553f, 12.3475f)
                    lineTo(13.9999f, 14.6667f)
                    lineTo(12.6446f, 12.3475f)
                    lineTo(9.9585f, 12.3333f)
                    lineTo(11.2893f, 10.0f)
                    lineTo(9.9585f, 7.6667f)
                    lineTo(12.6446f, 7.6525f)
                    lineTo(13.9999f, 5.3333f)
                    lineTo(15.3553f, 7.6525f)
                    lineTo(18.0414f, 7.6667f)
                    lineTo(16.7106f, 10.0f)
                    lineTo(18.0414f, 12.3333f)
                    lineTo(15.3553f, 12.3475f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFE6101E), 1.0f to Color(0xFFCA0814),
                        start = Offset(14.0693f,8.17798f), end = Offset(14.0693f,12.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(12.7342f, 9.3413f)
                    curveTo(12.6969f, 8.9687f, 12.9448f, 8.574f, 13.2995f, 8.4558f)
                    lineTo(14.0339f, 8.211f)
                    curveTo(14.3834f, 8.0945f, 14.6667f, 8.2951f, 14.6667f, 8.6771f)
                    verticalLineTo(10.0f)
                    curveTo(14.6667f, 10.0f, 15.0949f, 8.6179f, 15.3334f, 9.3334f)
                    curveTo(15.5719f, 10.0488f, 15.1629f, 11.3686f, 15.1629f, 11.3686f)
                    curveTo(15.073f, 11.7173f, 14.7049f, 12.0f, 14.3229f, 12.0f)
                    horizontalLineTo(13.6772f)
                    curveTo(13.3032f, 12.0f, 12.9693f, 11.6924f, 12.9326f, 11.3255f)
                    lineTo(12.7342f, 9.3413f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(13.9974f,3.87793f), end = Offset(13.9974f,5.46804f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(13.9989f, 3.8779f)
                    curveTo(13.318f, 3.8779f, 12.7111f, 4.2821f, 12.4421f, 4.8948f)
                    lineTo(12.3081f, 5.2f)
                    lineTo(12.9185f, 5.468f)
                    lineTo(13.0525f, 5.1628f)
                    curveTo(13.2161f, 4.7902f, 13.585f, 4.5446f, 13.9989f, 4.5446f)
                    curveTo(14.41f, 4.5446f, 14.7767f, 4.7868f, 14.942f, 5.1554f)
                    lineTo(15.0784f, 5.4595f)
                    lineTo(15.6867f, 5.1867f)
                    lineTo(15.5503f, 4.8825f)
                    curveTo(15.2784f, 4.2764f, 14.675f, 3.8779f, 13.9989f, 3.8779f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFD148), 1.0f to Color(0xFFFFCB2F),
                        start = Offset(14.0f,2.66666f), end = Offset(14.0f,6.66666f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(12.0f, 5.0f)
                    lineTo(13.3333f, 5.3333f)
                    lineTo(14.0f, 4.6667f)
                    lineTo(14.6667f, 5.3333f)
                    lineTo(16.0f, 5.0f)
                    lineTo(15.4619f, 6.3453f)
                    curveTo(15.3909f, 6.5228f, 15.19f, 6.6667f, 15.0063f, 6.6667f)
                    horizontalLineTo(12.9937f)
                    curveTo(12.8131f, 6.6667f, 12.6144f, 6.5359f, 12.5381f, 6.3453f)
                    lineTo(12.0f, 5.0f)
                    close()
                    moveTo(14.0f, 4.0f)
                    curveTo(13.6318f, 4.0f, 13.3333f, 3.7015f, 13.3333f, 3.3333f)
                    curveTo(13.3333f, 2.9651f, 13.6318f, 2.6667f, 14.0f, 2.6667f)
                    curveTo(14.3682f, 2.6667f, 14.6667f, 2.9651f, 14.6667f, 3.3333f)
                    curveTo(14.6667f, 3.7015f, 14.3682f, 4.0f, 14.0f, 4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF5169E2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 7.3333f)
                    curveTo(14.7364f, 7.3333f, 15.3334f, 6.7364f, 15.3334f, 6.0f)
                    curveTo(15.3334f, 5.2636f, 14.7364f, 4.6667f, 14.0f, 4.6667f)
                    curveTo(13.2636f, 4.6667f, 12.6667f, 5.2636f, 12.6667f, 6.0f)
                    curveTo(12.6667f, 6.7364f, 13.2636f, 7.3333f, 14.0f, 7.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD34D43)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.3333f, 7.3333f)
                    curveTo(16.0697f, 7.3333f, 16.6667f, 6.7364f, 16.6667f, 6.0f)
                    curveTo(16.6667f, 5.2636f, 16.0697f, 4.6667f, 15.3333f, 4.6667f)
                    curveTo(14.597f, 4.6667f, 14.0f, 5.2636f, 14.0f, 6.0f)
                    curveTo(14.0f, 6.7364f, 14.597f, 7.3333f, 15.3333f, 7.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD34D43)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.6667f, 7.3333f)
                    curveTo(13.4031f, 7.3333f, 14.0f, 6.7364f, 14.0f, 6.0f)
                    curveTo(14.0f, 5.2636f, 13.4031f, 4.6667f, 12.6667f, 4.6667f)
                    curveTo(11.9303f, 4.6667f, 11.3334f, 5.2636f, 11.3334f, 6.0f)
                    curveTo(11.3334f, 6.7364f, 11.9303f, 7.3333f, 12.6667f, 7.3333f)
                    close()
                }
            }
        }
        .build()
        return _gbNir!!
    }

private var _gbNir: ImageVector? = null
