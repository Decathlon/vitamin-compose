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

public val FlagsGroup.Et: ImageVector
    get() {
        if (_et != null) {
            return _et!!
        }
        _et = Builder(name = "Et", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 2.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF20AA46)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE92F3B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFADF50)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF205CCA)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 14.6667f)
                    curveTo(16.5774f, 14.6667f, 18.6667f, 12.5773f, 18.6667f, 10.0f)
                    curveTo(18.6667f, 7.4227f, 16.5774f, 5.3333f, 14.0f, 5.3333f)
                    curveTo(11.4227f, 5.3333f, 9.3334f, 7.4227f, 9.3334f, 10.0f)
                    curveTo(9.3334f, 12.5773f, 11.4227f, 14.6667f, 14.0f, 14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFDB3D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 10.4813f)
                    lineTo(14.7254f, 10.9984f)
                    lineTo(14.4577f, 10.1487f)
                    lineTo(15.1737f, 9.6187f)
                    lineTo(14.2829f, 9.6106f)
                    lineTo(14.0f, 8.766f)
                    lineTo(13.7171f, 9.6106f)
                    lineTo(12.8264f, 9.6187f)
                    lineTo(13.5423f, 10.1487f)
                    lineTo(13.2747f, 10.9984f)
                    lineTo(14.0f, 10.4813f)
                    close()
                    moveTo(12.0407f, 12.6967f)
                    lineTo(12.7637f, 10.4017f)
                    lineTo(10.8298f, 8.9699f)
                    lineTo(13.2359f, 8.9483f)
                    lineTo(14.0f, 6.6667f)
                    lineTo(14.7641f, 8.9483f)
                    lineTo(17.1702f, 8.9699f)
                    lineTo(15.2364f, 10.4017f)
                    lineTo(15.9593f, 12.6967f)
                    lineTo(14.0f, 11.3f)
                    lineTo(12.0407f, 12.6967f)
                    close()
                }
            }
        }
        .build()
        return _et!!
    }

private var _et: ImageVector? = null
