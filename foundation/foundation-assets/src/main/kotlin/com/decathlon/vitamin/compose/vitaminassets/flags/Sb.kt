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

public val FlagsGroup.Sb: ImageVector
    get() {
        if (_sb != null) {
            return _sb!!
        }
        _sb = Builder(name = "Sb", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0002f, 0.0f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1DBE4F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0002f, -0.0036f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(19.9964f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(-0.0036f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0660D4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(2.0E-4f, -0.0036f)
                    horizontalLineTo(28.0002f)
                    lineTo(2.0E-4f, 19.9964f)
                    verticalLineTo(-0.0036f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF2C7442)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0002f, -0.0036f)
                    lineTo(2.0E-4f, 19.9964f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(-0.0036f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD646)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(27.207f, -0.0039f)
                    lineTo(-0.0178f, 17.3196f)
                    lineTo(2.0E-4f, 19.9964f)
                    lineTo(0.8294f, 20.0006f)
                    lineTo(28.0f, 2.6563f)
                    lineTo(28.0002f, -0.0036f)
                    lineTo(27.207f, -0.0039f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.0f, 3.8298f)
                    lineTo(2.0204f, 4.3448f)
                    lineTo(2.2075f, 3.254f)
                    lineTo(1.4149f, 2.4814f)
                    lineTo(2.5102f, 2.3223f)
                    lineTo(3.0f, 1.3298f)
                    lineTo(3.4899f, 2.3223f)
                    lineTo(4.5851f, 2.4814f)
                    lineTo(3.7926f, 3.254f)
                    lineTo(3.9797f, 4.3448f)
                    lineTo(3.0f, 3.8298f)
                    close()
                    moveTo(9.6667f, 3.8298f)
                    lineTo(8.687f, 4.3448f)
                    lineTo(8.8742f, 3.254f)
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
                    lineTo(8.8742f, 7.254f)
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
                    lineTo(3.4899f, 6.3223f)
                    lineTo(4.5851f, 6.4814f)
                    lineTo(3.7926f, 7.254f)
                    lineTo(3.9797f, 8.3448f)
                    lineTo(3.0f, 7.8298f)
                    close()
                    moveTo(6.3334f, 5.8298f)
                    lineTo(5.3537f, 6.3448f)
                    lineTo(5.5408f, 5.254f)
                    lineTo(4.7483f, 4.4814f)
                    lineTo(5.8435f, 4.3223f)
                    lineTo(6.3334f, 3.3298f)
                    lineTo(6.8232f, 4.3223f)
                    lineTo(7.9184f, 4.4814f)
                    lineTo(7.1259f, 5.254f)
                    lineTo(7.313f, 6.3448f)
                    lineTo(6.3334f, 5.8298f)
                    close()
                }
            }
        }
        .build()
        return _sb!!
    }

private var _sb: ImageVector? = null
