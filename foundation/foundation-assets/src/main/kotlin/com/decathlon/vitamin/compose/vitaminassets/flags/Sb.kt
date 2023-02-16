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

public val FlagsGroup.Sb: ImageVector
    get() {
        if (_sb != null) {
            return _sb!!
        }
        _sb = Builder(name = "Sb", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0002f,3.05176E-5f), end = Offset(14.0002f,20.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, 0.0f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(9.89343f,4.74669f), end = Offset(9.89343f,8.74669f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(7.8934f, 7.7498f)
                    curveTo(7.8934f, 7.564f, 7.9976f, 7.3092f, 8.1341f, 7.1727f)
                    lineTo(8.3194f, 6.9874f)
                    curveTo(8.4523f, 6.8545f, 8.4559f, 6.6425f, 8.3194f, 6.506f)
                    lineTo(8.1341f, 6.3207f)
                    curveTo(8.0012f, 6.1878f, 7.8934f, 5.9373f, 7.8934f, 5.7436f)
                    verticalLineTo(5.0831f)
                    curveTo(7.8934f, 4.8973f, 8.0361f, 4.7467f, 8.2299f, 4.7467f)
                    horizontalLineTo(8.8903f)
                    curveTo(9.0761f, 4.7467f, 9.2268f, 4.8894f, 9.2268f, 5.0831f)
                    verticalLineTo(5.7436f)
                    curveTo(9.2268f, 5.9294f, 9.2883f, 5.957f, 9.3814f, 5.7708f)
                    lineTo(9.7388f, 5.0559f)
                    curveTo(9.8242f, 4.8851f, 10.0504f, 4.7467f, 10.2237f, 4.7467f)
                    horizontalLineTo(11.5632f)
                    curveTo(11.7456f, 4.7467f, 11.8934f, 4.9013f, 11.8934f, 5.08f)
                    curveTo(11.8934f, 5.2641f, 11.7507f, 5.4134f, 11.557f, 5.4134f)
                    horizontalLineTo(10.8966f)
                    curveTo(10.7107f, 5.4134f, 10.5601f, 5.568f, 10.5601f, 5.7467f)
                    curveTo(10.5601f, 5.9308f, 10.7028f, 6.08f, 10.8966f, 6.08f)
                    horizontalLineTo(11.557f)
                    curveTo(11.7428f, 6.08f, 11.8934f, 6.2234f, 11.8934f, 6.407f)
                    verticalLineTo(8.4197f)
                    curveTo(11.8934f, 8.6003f, 11.7507f, 8.7467f, 11.557f, 8.7467f)
                    horizontalLineTo(10.8966f)
                    curveTo(10.7107f, 8.7467f, 10.5601f, 8.604f, 10.5601f, 8.4102f)
                    verticalLineTo(7.7498f)
                    curveTo(10.5601f, 7.564f, 10.7147f, 7.4134f, 10.8934f, 7.4134f)
                    curveTo(11.0775f, 7.4134f, 11.2268f, 7.2587f, 11.2268f, 7.08f)
                    curveTo(11.2268f, 6.8959f, 11.0841f, 6.7467f, 10.8903f, 6.7467f)
                    horizontalLineTo(10.2299f)
                    curveTo(10.0441f, 6.7467f, 9.8934f, 6.9036f, 9.8934f, 7.077f)
                    verticalLineTo(8.4164f)
                    curveTo(9.8934f, 8.5988f, 9.7388f, 8.7467f, 9.5601f, 8.7467f)
                    curveTo(9.376f, 8.7467f, 9.2268f, 8.604f, 9.2268f, 8.4102f)
                    verticalLineTo(7.7498f)
                    curveTo(9.2268f, 7.564f, 9.0721f, 7.4134f, 8.8934f, 7.4134f)
                    curveTo(8.7093f, 7.4134f, 8.5601f, 7.556f, 8.5601f, 7.7498f)
                    verticalLineTo(8.4102f)
                    curveTo(8.5601f, 8.5961f, 8.4055f, 8.7467f, 8.2268f, 8.7467f)
                    curveTo(8.0427f, 8.7467f, 7.8934f, 8.604f, 7.8934f, 8.4102f)
                    verticalLineTo(7.7498f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1DBE4F), 1.0f to Color(0xFF159B3F),
                        start = Offset(14.0002f,-0.0035553f), end = Offset(14.0002f,19.9964f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, -0.0036f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(19.9964f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(-0.0036f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF0660D4), 1.0f to Color(0xFF0051BB),
                        start = Offset(14.0002f,-0.0035553f), end = Offset(14.0002f,19.9964f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(2.0E-4f, -0.0036f)
                    horizontalLineTo(28.0002f)
                    lineTo(2.0E-4f, 19.9964f)
                    verticalLineTo(-0.0036f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF2C7442), 1.0f to Color(0xFF225B34),
                        start = Offset(14.0002f,-0.0035553f), end = Offset(14.0002f,19.9964f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(28.0002f, -0.0036f)
                    lineTo(2.0E-4f, 19.9964f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(-0.0036f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFD646), 1.0f to Color(0xFFFED02F),
                        start = Offset(13.2842f,8.87174f), end = Offset(14.7165f,11.1211f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(29.5922f, -1.5123f)
                    lineTo(-3.0237f, 19.2558f)
                    lineTo(-1.5914f, 21.5052f)
                    lineTo(31.0245f, 0.737f)
                    lineTo(29.5922f, -1.5123f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.0f, 3.8298f)
                    lineTo(2.0204f, 4.3448f)
                    lineTo(2.2075f, 3.254f)
                    lineTo(1.4149f, 2.4814f)
                    lineTo(2.5102f, 2.3223f)
                    lineTo(3.0f, 1.3298f)
                    lineTo(3.4898f, 2.3223f)
                    lineTo(4.5851f, 2.4814f)
                    lineTo(3.7926f, 3.254f)
                    lineTo(3.9797f, 4.3448f)
                    lineTo(3.0f, 3.8298f)
                    close()
                    moveTo(9.6667f, 3.8298f)
                    lineTo(8.687f, 4.3448f)
                    lineTo(8.8741f, 3.254f)
                    lineTo(8.0816f, 2.4814f)
                    lineTo(9.1769f, 2.3223f)
                    lineTo(9.6667f, 1.3298f)
                    lineTo(10.1565f, 2.3223f)
                    lineTo(11.2518f, 2.4814f)
                    lineTo(10.4592f, 3.254f)
                    lineTo(10.6463f, 4.3448f)
                    lineTo(9.6667f, 3.8298f)
                    close()
                    moveTo(9.6667f, 7.8298f)
                    lineTo(8.687f, 8.3448f)
                    lineTo(8.8741f, 7.254f)
                    lineTo(8.0816f, 6.4814f)
                    lineTo(9.1769f, 6.3223f)
                    lineTo(9.6667f, 5.3298f)
                    lineTo(10.1565f, 6.3223f)
                    lineTo(11.2518f, 6.4814f)
                    lineTo(10.4592f, 7.254f)
                    lineTo(10.6463f, 8.3448f)
                    lineTo(9.6667f, 7.8298f)
                    close()
                    moveTo(3.0f, 7.8298f)
                    lineTo(2.0204f, 8.3448f)
                    lineTo(2.2075f, 7.254f)
                    lineTo(1.4149f, 6.4814f)
                    lineTo(2.5102f, 6.3223f)
                    lineTo(3.0f, 5.3298f)
                    lineTo(3.4898f, 6.3223f)
                    lineTo(4.5851f, 6.4814f)
                    lineTo(3.7926f, 7.254f)
                    lineTo(3.9797f, 8.3448f)
                    lineTo(3.0f, 7.8298f)
                    close()
                    moveTo(6.3333f, 5.8298f)
                    lineTo(5.3537f, 6.3448f)
                    lineTo(5.5408f, 5.254f)
                    lineTo(4.7483f, 4.4814f)
                    lineTo(5.8435f, 4.3223f)
                    lineTo(6.3333f, 3.3298f)
                    lineTo(6.8232f, 4.3223f)
                    lineTo(7.9184f, 4.4814f)
                    lineTo(7.1259f, 5.254f)
                    lineTo(7.313f, 6.3448f)
                    lineTo(6.3333f, 5.8298f)
                    close()
                }
            }
        }
        .build()
        return _sb!!
    }

private var _sb: ImageVector? = null
