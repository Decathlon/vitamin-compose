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

public val FlagsGroup.Nu: ImageVector
    get() {
        if (_nu != null) {
            return _nu!!
        }
        _nu = Builder(name = "Nu", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0001f,1.52588E-5f), end = Offset(14.0001f,20.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0001f, 0.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFCD54E), 1.0f to Color(0xFFFCD036),
                        start = Offset(14.0001f,1.52588E-5f), end = Offset(14.0001f,20.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0001f, 0.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF053C8A), 1.0f to Color(0xFF002B67),
                        start = Offset(6.00012f,1.52588E-5f), end = Offset(6.00012f,9.33335f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(12.0001f, 0.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(9.3334f)
                    horizontalLineTo(12.0001f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(5.43229f,-1.2028f), end = Offset(5.43229f,10.5362f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(4.0001f, 4.3067f)
                    lineTo(-1.8021f, -0.6666f)
                    horizontalLineTo(0.8804f)
                    lineTo(5.547f, 2.6667f)
                    horizontalLineTo(6.4755f)
                    lineTo(12.6667f, -1.2028f)
                    verticalLineTo(0.3334f)
                    curveTo(12.6667f, 0.7367f, 12.4442f, 1.1687f, 12.1096f, 1.4077f)
                    lineTo(8.0f, 4.3431f)
                    verticalLineTo(5.0267f)
                    lineTo(12.183f, 8.6121f)
                    curveTo(12.7992f, 9.1403f, 12.4548f, 10.0f, 11.6667f, 10.0f)
                    curveTo(11.3398f, 10.0f, 10.9404f, 9.8719f, 10.6679f, 9.6773f)
                    lineTo(6.4531f, 6.6667f)
                    horizontalLineTo(5.5246f)
                    lineTo(-0.6666f, 10.5362f)
                    verticalLineTo(8.3236f)
                    lineTo(4.0001f, 4.9903f)
                    verticalLineTo(4.3067f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.00012f,1.52588E-5f), end = Offset(6.00012f,9.33335f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.6668f, 4.0f)
                    lineTo(1.0E-4f, 0.0f)
                    horizontalLineTo(0.6668f)
                    lineTo(5.3335f, 3.3333f)
                    horizontalLineTo(6.6668f)
                    lineTo(12.0001f, 0.0f)
                    verticalLineTo(0.3333f)
                    curveTo(12.0001f, 0.5174f, 11.8848f, 0.7491f, 11.7222f, 0.8652f)
                    lineTo(7.3335f, 4.0f)
                    verticalLineTo(5.3334f)
                    lineTo(11.7492f, 9.1183f)
                    curveTo(11.8878f, 9.2371f, 11.8455f, 9.3334f, 11.6668f, 9.3334f)
                    curveTo(11.4827f, 9.3334f, 11.2181f, 9.2509f, 11.0555f, 9.1348f)
                    lineTo(6.6668f, 6.0f)
                    horizontalLineTo(5.3335f)
                    lineTo(1.0E-4f, 9.3334f)
                    verticalLineTo(8.6667f)
                    lineTo(4.6668f, 5.3334f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(6.33346f,1.52588E-5f), end = Offset(6.33346f,10.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(1.0E-4f, 3.3333f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(4.6668f)
                    verticalLineTo(9.3395f)
                    curveTo(4.6668f, 9.7043f, 4.9522f, 10.0f, 5.3397f, 10.0f)
                    horizontalLineTo(6.6605f)
                    curveTo(7.0322f, 10.0f, 7.3335f, 9.7123f, 7.3335f, 9.3395f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(12.0128f)
                    curveTo(12.374f, 6.0f, 12.6668f, 5.7146f, 12.6668f, 5.3271f)
                    verticalLineTo(4.0063f)
                    curveTo(12.6668f, 3.6346f, 12.38f, 3.3333f, 12.0128f, 3.3333f)
                    horizontalLineTo(7.3335f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(4.6668f)
                    verticalLineTo(3.3333f)
                    horizontalLineTo(1.0E-4f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.00012f,1.52588E-5f), end = Offset(6.00012f,9.33335f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(1.0E-4f, 4.0f)
                    horizontalLineTo(5.3335f)
                    verticalLineTo(3.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.6668f)
                    verticalLineTo(3.3333f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(12.0001f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(6.6668f)
                    verticalLineTo(6.0f)
                    verticalLineTo(9.3334f)
                    horizontalLineTo(5.3335f)
                    verticalLineTo(6.0f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF053C8A), 1.0f to Color(0xFF002B67),
                        start = Offset(6.00008f,3.33334f), end = Offset(6.00008f,6.00001f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(6.0001f, 6.0f)
                    curveTo(6.7365f, 6.0f, 7.3334f, 5.4031f, 7.3334f, 4.6667f)
                    curveTo(7.3334f, 3.9303f, 6.7365f, 3.3333f, 6.0001f, 3.3333f)
                    curveTo(5.2637f, 3.3333f, 4.6667f, 3.9303f, 4.6667f, 4.6667f)
                    curveTo(4.6667f, 5.4031f, 5.2637f, 6.0f, 6.0001f, 6.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFDD650), 1.0f to Color(0xFFFCD036),
                        start = Offset(6.00008f,1.33334f), end = Offset(6.00008f,8.00001f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(6.0001f, 5.3333f)
                    curveTo(5.6319f, 5.3333f, 5.3334f, 5.0349f, 5.3334f, 4.6667f)
                    curveTo(5.3334f, 4.2985f, 5.6319f, 4.0f, 6.0001f, 4.0f)
                    curveTo(6.3683f, 4.0f, 6.6667f, 4.2985f, 6.6667f, 4.6667f)
                    curveTo(6.6667f, 5.0349f, 6.3683f, 5.3333f, 6.0001f, 5.3333f)
                    close()
                    moveTo(8.6667f, 5.3333f)
                    curveTo(8.2986f, 5.3333f, 8.0001f, 5.0349f, 8.0001f, 4.6667f)
                    curveTo(8.0001f, 4.2985f, 8.2986f, 4.0f, 8.6667f, 4.0f)
                    curveTo(9.0349f, 4.0f, 9.3334f, 4.2985f, 9.3334f, 4.6667f)
                    curveTo(9.3334f, 5.0349f, 9.0349f, 5.3333f, 8.6667f, 5.3333f)
                    close()
                    moveTo(3.3334f, 5.3333f)
                    curveTo(2.9652f, 5.3333f, 2.6667f, 5.0349f, 2.6667f, 4.6667f)
                    curveTo(2.6667f, 4.2985f, 2.9652f, 4.0f, 3.3334f, 4.0f)
                    curveTo(3.7016f, 4.0f, 4.0001f, 4.2985f, 4.0001f, 4.6667f)
                    curveTo(4.0001f, 5.0349f, 3.7016f, 5.3333f, 3.3334f, 5.3333f)
                    close()
                    moveTo(6.0001f, 2.6667f)
                    curveTo(5.6319f, 2.6667f, 5.3334f, 2.3682f, 5.3334f, 2.0f)
                    curveTo(5.3334f, 1.6318f, 5.6319f, 1.3333f, 6.0001f, 1.3333f)
                    curveTo(6.3683f, 1.3333f, 6.6667f, 1.6318f, 6.6667f, 2.0f)
                    curveTo(6.6667f, 2.3682f, 6.3683f, 2.6667f, 6.0001f, 2.6667f)
                    close()
                    moveTo(6.0001f, 8.0f)
                    curveTo(5.6319f, 8.0f, 5.3334f, 7.7015f, 5.3334f, 7.3333f)
                    curveTo(5.3334f, 6.9651f, 5.6319f, 6.6667f, 6.0001f, 6.6667f)
                    curveTo(6.3683f, 6.6667f, 6.6667f, 6.9651f, 6.6667f, 7.3333f)
                    curveTo(6.6667f, 7.7015f, 6.3683f, 8.0f, 6.0001f, 8.0f)
                    close()
                }
            }
        }
        .build()
        return _nu!!
    }

private var _nu: ImageVector? = null
