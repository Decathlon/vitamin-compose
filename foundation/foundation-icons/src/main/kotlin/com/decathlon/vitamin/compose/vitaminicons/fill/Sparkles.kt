package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Sparkles: ImageVector
    get() {
        if (_sparkles != null) {
            return _sparkles!!
        }
        _sparkles = Builder(name = "Sparkles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.667f, 1.3333f)
                    lineTo(12.1268f, 2.7931f)
                    lineTo(10.667f, 3.3333f)
                    lineTo(12.1268f, 3.8735f)
                    lineTo(12.667f, 5.3333f)
                    lineTo(13.2072f, 3.8735f)
                    lineTo(14.667f, 3.3333f)
                    lineTo(13.2072f, 2.7931f)
                    lineTo(12.667f, 1.3333f)
                    close()
                    moveTo(8.5307f, 6.1361f)
                    lineTo(7.0002f, 2.0f)
                    lineTo(5.4696f, 6.1361f)
                    lineTo(1.3335f, 7.6667f)
                    lineTo(5.4696f, 9.1972f)
                    lineTo(7.0002f, 13.3333f)
                    lineTo(8.5307f, 9.1972f)
                    lineTo(12.6668f, 7.6667f)
                    lineTo(8.5307f, 6.1361f)
                    close()
                    moveTo(12.0002f, 9.3333f)
                    lineTo(12.7204f, 11.2797f)
                    lineTo(14.6668f, 12.0f)
                    lineTo(12.7204f, 12.7202f)
                    lineTo(12.0002f, 14.6666f)
                    lineTo(11.2799f, 12.7202f)
                    lineTo(9.3335f, 12.0f)
                    lineTo(11.2799f, 11.2797f)
                    lineTo(12.0002f, 9.3333f)
                    close()
                }
            }
        }
        .build()
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
