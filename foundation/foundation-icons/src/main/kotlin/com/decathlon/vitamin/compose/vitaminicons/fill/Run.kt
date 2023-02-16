package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Run: ImageVector
    get() {
        if (_run != null) {
            return _run!!
        }
        _run = Builder(name = "Run", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.5534f, 5.86f)
                    lineTo(5.3334f, 6.304f)
                    verticalLineTo(8.6667f)
                    horizontalLineTo(4.0001f)
                    verticalLineTo(5.3667f)
                    horizontalLineTo(4.0101f)
                    lineTo(7.5221f, 4.088f)
                    curveTo(7.6848f, 4.026f, 7.8621f, 3.9947f, 8.0434f, 4.0007f)
                    curveTo(8.4058f, 4.0097f, 8.7563f, 4.1314f, 9.0463f, 4.3489f)
                    curveTo(9.3362f, 4.5663f, 9.5513f, 4.8687f, 9.6614f, 5.214f)
                    curveTo(9.7854f, 5.6027f, 9.8988f, 5.8653f, 10.0014f, 6.002f)
                    curveTo(10.3117f, 6.4158f, 10.7141f, 6.7515f, 11.1768f, 6.9826f)
                    curveTo(11.6394f, 7.2137f, 12.1496f, 7.3338f, 12.6668f, 7.3333f)
                    verticalLineTo(8.6667f)
                    curveTo(11.9783f, 8.6674f, 11.2982f, 8.5155f, 10.6755f, 8.2219f)
                    curveTo(10.0528f, 7.9283f, 9.5029f, 7.5003f, 9.0654f, 6.9687f)
                    lineTo(8.6007f, 9.606f)
                    lineTo(10.0001f, 10.78f)
                    verticalLineTo(15.3333f)
                    horizontalLineTo(8.6667f)
                    verticalLineTo(11.4013f)
                    lineTo(7.1534f, 10.132f)
                    lineTo(6.6687f, 12.8833f)
                    lineTo(2.0728f, 12.0733f)
                    lineTo(2.3047f, 10.76f)
                    lineTo(5.5874f, 11.3387f)
                    lineTo(6.5534f, 5.86f)
                    close()
                    moveTo(9.0001f, 3.6667f)
                    curveTo(8.6465f, 3.6667f, 8.3073f, 3.5262f, 8.0573f, 3.2761f)
                    curveTo(7.8072f, 3.0261f, 7.6667f, 2.687f, 7.6667f, 2.3333f)
                    curveTo(7.6667f, 1.9797f, 7.8072f, 1.6406f, 8.0573f, 1.3905f)
                    curveTo(8.3073f, 1.1405f, 8.6465f, 1.0f, 9.0001f, 1.0f)
                    curveTo(9.3537f, 1.0f, 9.6929f, 1.1405f, 9.9429f, 1.3905f)
                    curveTo(10.1929f, 1.6406f, 10.3334f, 1.9797f, 10.3334f, 2.3333f)
                    curveTo(10.3334f, 2.687f, 10.1929f, 3.0261f, 9.9429f, 3.2761f)
                    curveTo(9.6929f, 3.5262f, 9.3537f, 3.6667f, 9.0001f, 3.6667f)
                    close()
                }
            }
        }
        .build()
        return _run!!
    }

private var _run: ImageVector? = null
