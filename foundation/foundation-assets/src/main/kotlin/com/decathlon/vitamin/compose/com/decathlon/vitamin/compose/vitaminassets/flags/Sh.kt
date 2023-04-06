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

public val FlagsGroup.Sh: ImageVector
    get() {
        if (_sh != null) {
            return _sh!!
        }
        _sh = Builder(name = "Sh", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.004f, 9.0E-4f)
                    horizontalLineTo(28.0039f)
                    curveTo(28.0039f, 9.0E-4f, 28.0039f, 0.8963f, 28.0039f, 2.0009f)
                    verticalLineTo(20.0009f)
                    curveTo(28.0039f, 20.0009f, 27.1085f, 20.0009f, 26.0039f, 20.0009f)
                    horizontalLineTo(2.0039f)
                    curveTo(0.8994f, 20.0009f, 0.0039f, 20.0009f, 0.0039f, 20.0009f)
                    curveTo(0.0039f, 13.3342f, 0.0039f, 6.6675f, 0.004f, 9.0E-4f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF07319C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.004f, 9.0E-4f)
                    horizontalLineTo(28.0039f)
                    verticalLineTo(20.0009f)
                    lineTo(0.0039f, 20.0009f)
                    lineTo(0.004f, 9.0E-4f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8FC5FF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.3374f, 10.0008f)
                    curveTo(17.3374f, 8.9071f, 17.3374f, 7.614f, 17.3374f, 6.6666f)
                    curveTo(17.3374f, 5.9303f, 17.9344f, 5.3342f, 18.6708f, 5.3342f)
                    horizontalLineTo(22.6708f)
                    curveTo(23.4072f, 5.3342f, 24.0041f, 5.9303f, 24.0041f, 6.6667f)
                    curveTo(24.0041f, 7.614f, 24.0041f, 8.9071f, 24.0041f, 10.0008f)
                    curveTo(24.0041f, 13.3342f, 20.6708f, 14.6675f, 20.6708f, 14.6675f)
                    curveTo(20.6708f, 14.6675f, 17.3374f, 13.3342f, 17.3374f, 10.0008f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF366CC9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.0941f, 11.8844f)
                    curveTo(20.0941f, 11.8844f, 20.7614f, 11.0203f, 21.1539f, 11.0203f)
                    curveTo(21.5464f, 11.0203f, 21.6185f, 11.5941f, 22.2221f, 11.5941f)
                    curveTo(22.8257f, 11.5941f, 23.144f, 10.6796f, 23.7253f, 10.6796f)
                    curveTo(24.3067f, 10.6796f, 22.5039f, 13.0009f, 22.5039f, 13.0009f)
                    lineTo(21.0039f, 14.0009f)
                    lineTo(19.0039f, 13.5009f)
                    lineTo(20.0941f, 11.8844f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFCF6200)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.1301f, 10.5521f)
                    lineTo(18.7186f, 10.0009f)
                    lineTo(19.2969f, 11.4166f)
                    lineTo(20.0732f, 10.0009f)
                    lineTo(20.7408f, 14.0362f)
                    lineTo(19.6306f, 13.8104f)
                    lineTo(18.0039f, 11.8844f)
                    lineTo(18.1301f, 10.5521f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFF00)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0039f, 6.0009f)
                    horizontalLineTo(23.5039f)
                    lineTo(24.0041f, 9.3342f)
                    horizontalLineTo(17.3374f)
                    lineTo(18.0039f, 6.0009f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.0041f, 10.0008f)
                    curveTo(18.0041f, 11.4195f, 18.7064f, 12.4193f, 19.4501f, 13.0886f)
                    curveTo(19.8224f, 13.4238f, 20.197f, 13.6675f, 20.4786f, 13.8271f)
                    curveTo(20.5496f, 13.8673f, 20.6142f, 13.9019f, 20.6708f, 13.931f)
                    curveTo(20.7274f, 13.9019f, 20.792f, 13.8673f, 20.8629f, 13.8271f)
                    curveTo(21.1445f, 13.6675f, 21.5191f, 13.4238f, 21.8915f, 13.0886f)
                    curveTo(22.6351f, 12.4193f, 23.3374f, 11.4195f, 23.3374f, 10.0008f)
                    verticalLineTo(6.6667f)
                    curveTo(23.3374f, 6.299f, 23.0395f, 6.0008f, 22.6708f, 6.0008f)
                    horizontalLineTo(18.6708f)
                    curveTo(18.302f, 6.0008f, 18.0041f, 6.299f, 18.0041f, 6.6666f)
                    verticalLineTo(10.0008f)
                    close()
                    moveTo(17.3374f, 6.6666f)
                    verticalLineTo(10.0008f)
                    curveTo(17.3374f, 13.3342f, 20.6708f, 14.6675f, 20.6708f, 14.6675f)
                    curveTo(20.6708f, 14.6675f, 24.0041f, 13.3342f, 24.0041f, 10.0008f)
                    verticalLineTo(6.6667f)
                    curveTo(24.0041f, 5.9303f, 23.4072f, 5.3342f, 22.6708f, 5.3342f)
                    horizontalLineTo(18.6708f)
                    curveTo(17.9344f, 5.3342f, 17.3374f, 5.9303f, 17.3374f, 6.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0046f, 0.9483f)
                    lineTo(11.4354f, 3.1031f)
                    horizontalLineTo(14.0046f)
                    verticalLineTo(6.6708f)
                    horizontalLineTo(11.4358f)
                    lineTo(14.0046f, 8.8246f)
                    verticalLineTo(10.0034f)
                    horizontalLineTo(10.8084f)
                    lineTo(8.7903f, 8.3137f)
                    verticalLineTo(10.0034f)
                    horizontalLineTo(5.2189f)
                    verticalLineTo(8.3122f)
                    lineTo(3.1972f, 10.0034f)
                    horizontalLineTo(0.004f)
                    verticalLineTo(8.8145f)
                    lineTo(2.5674f, 6.6708f)
                    horizontalLineTo(0.004f)
                    verticalLineTo(3.1031f)
                    horizontalLineTo(2.5711f)
                    lineTo(0.004f, 0.9529f)
                    verticalLineTo(0.0034f)
                    horizontalLineTo(3.4775f)
                    lineTo(5.2189f, 1.461f)
                    verticalLineTo(0.0034f)
                    horizontalLineTo(8.7903f)
                    verticalLineTo(1.4639f)
                    lineTo(10.5391f, 0.0034f)
                    horizontalLineTo(14.0046f)
                    verticalLineTo(0.9483f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDC1F37)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.6868f, 4.1031f)
                    lineTo(13.5749f, 0.0034f)
                    lineTo(12.0982f, 9.0E-4f)
                    lineTo(7.7903f, 3.6018f)
                    verticalLineTo(0.0053f)
                    lineTo(6.2189f, 0.0053f)
                    verticalLineTo(3.602f)
                    lineTo(1.932f, 0.014f)
                    lineTo(0.4301f, 0.0054f)
                    lineTo(5.3222f, 4.1031f)
                    horizontalLineTo(0.0046f)
                    verticalLineTo(5.6708f)
                    horizontalLineTo(5.3222f)
                    lineTo(0.143f, 10.0017f)
                    lineTo(1.643f, 9.9998f)
                    lineTo(6.2189f, 6.1719f)
                    verticalLineTo(10.0013f)
                    horizontalLineTo(7.7903f)
                    verticalLineTo(6.1721f)
                    lineTo(12.364f, 10.0017f)
                    lineTo(13.8542f, 10.0037f)
                    lineTo(8.6869f, 5.6708f)
                    horizontalLineTo(14.0046f)
                    verticalLineTo(4.1031f)
                    horizontalLineTo(8.6868f)
                    close()
                }
            }
        }
        .build()
        return _sh!!
    }

private var _sh: ImageVector? = null
