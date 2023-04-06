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

public val FlagsGroup.Ai: ImageVector
    get() {
        if (_ai != null) {
            return _ai!!
        }
        _ai = Builder(name = "Ai", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0E-4f, 0.0028f)
                    horizontalLineTo(28.0002f)
                    curveTo(28.0002f, 6.6695f, 28.0002f, 13.3361f, 28.0002f, 20.0028f)
                    curveTo(18.6669f, 20.0028f, 9.3335f, 20.0028f, 2.0E-4f, 20.0028f)
                    curveTo(2.0E-4f, 13.3361f, -3.0E-4f, 6.6695f, 3.0E-4f, 0.0028f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0A17A7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0E-4f, 0.0028f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(20.0028f)
                    horizontalLineTo(2.0E-4f)
                    lineTo(3.0E-4f, 0.0028f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.3337f, 10.0028f)
                    curveTo(17.3337f, 8.0028f, 17.3337f, 6.6695f, 17.3337f, 6.6695f)
                    lineTo(18.667f, 7.3362f)
                    lineTo(20.0004f, 6.6695f)
                    lineTo(21.3337f, 7.3362f)
                    lineTo(22.667f, 6.6695f)
                    curveTo(22.667f, 6.6695f, 22.667f, 8.0028f, 22.667f, 10.0028f)
                    curveTo(22.667f, 12.0028f, 20.0004f, 13.3362f, 20.0004f, 13.3362f)
                    curveTo(20.0004f, 13.3362f, 17.3337f, 12.0028f, 17.3337f, 10.0028f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF9ACCFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.2376f, 12.0028f)
                    horizontalLineTo(21.7631f)
                    curveTo(21.2037f, 12.5928f, 20.8295f, 12.8914f, 20.0004f, 13.3362f)
                    curveTo(19.0956f, 12.8255f, 18.7465f, 12.5316f, 18.2376f, 12.0028f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFA51B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0004f, 9.3361f)
                    curveTo(20.3686f, 9.3361f, 20.667f, 9.0377f, 20.667f, 8.6695f)
                    curveTo(20.667f, 8.3013f, 20.3686f, 8.0028f, 20.0004f, 8.0028f)
                    curveTo(19.6322f, 8.0028f, 19.3337f, 8.3013f, 19.3337f, 8.6695f)
                    curveTo(19.3337f, 9.0377f, 19.6322f, 9.3361f, 20.0004f, 9.3361f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFA51B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.6669f, 10.6695f)
                    curveTo(19.0351f, 10.6695f, 19.3335f, 10.371f, 19.3335f, 10.0028f)
                    curveTo(19.3335f, 9.6346f, 19.0351f, 9.3361f, 18.6669f, 9.3361f)
                    curveTo(18.2987f, 9.3361f, 18.0002f, 9.6346f, 18.0002f, 10.0028f)
                    curveTo(18.0002f, 10.371f, 18.2987f, 10.6695f, 18.6669f, 10.6695f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFA51B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 10.0028f)
                    curveTo(22.0f, 10.371f, 21.7016f, 10.6695f, 21.3334f, 10.6695f)
                    curveTo(20.9652f, 10.6695f, 20.6667f, 10.371f, 20.6667f, 10.0028f)
                    curveTo(20.6667f, 9.6346f, 20.9652f, 9.3361f, 21.3334f, 9.3361f)
                    curveTo(21.7016f, 9.3361f, 22.0f, 9.6346f, 22.0f, 10.0028f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0008f, 0.9449f)
                    lineTo(11.4316f, 3.0997f)
                    horizontalLineTo(14.0008f)
                    verticalLineTo(6.6674f)
                    horizontalLineTo(11.4321f)
                    lineTo(14.0008f, 8.8212f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(10.8046f)
                    lineTo(8.7866f, 8.3103f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(5.2152f)
                    verticalLineTo(8.3088f)
                    lineTo(3.1934f, 10.0f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(8.811f)
                    lineTo(2.5637f, 6.6674f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(3.0997f)
                    horizontalLineTo(2.5673f)
                    lineTo(2.0E-4f, 0.9495f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.4737f)
                    lineTo(5.2152f, 1.4576f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(8.7866f)
                    verticalLineTo(1.4605f)
                    lineTo(10.5354f, 0.0f)
                    horizontalLineTo(14.0008f)
                    verticalLineTo(0.9449f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDC1F37)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.6824f, 4.1023f)
                    lineTo(13.5706f, 0.0026f)
                    lineTo(12.0939f, 0.0f)
                    lineTo(7.786f, 3.601f)
                    verticalLineTo(0.0045f)
                    lineTo(6.2146f, 0.0045f)
                    verticalLineTo(3.6011f)
                    lineTo(1.9277f, 0.0131f)
                    lineTo(0.4257f, 0.0045f)
                    lineTo(5.3179f, 4.1023f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(5.67f)
                    horizontalLineTo(5.3178f)
                    lineTo(0.1386f, 10.0008f)
                    lineTo(1.6387f, 9.9989f)
                    lineTo(6.2146f, 6.171f)
                    verticalLineTo(10.0004f)
                    horizontalLineTo(7.786f)
                    verticalLineTo(6.1713f)
                    lineTo(12.3596f, 10.0008f)
                    lineTo(13.8499f, 10.0028f)
                    lineTo(8.6825f, 5.67f)
                    horizontalLineTo(14.0002f)
                    verticalLineTo(4.1023f)
                    horizontalLineTo(8.6824f)
                    close()
                }
            }
        }
        .build()
        return _ai!!
    }

private var _ai: ImageVector? = null
