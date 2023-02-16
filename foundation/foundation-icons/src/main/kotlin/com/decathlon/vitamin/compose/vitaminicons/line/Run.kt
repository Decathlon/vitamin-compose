package com.decathlon.vitamin.compose.vitaminicons.line

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
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Run: ImageVector
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
                    moveTo(6.5533f, 5.86f)
                    lineTo(5.3333f, 6.304f)
                    verticalLineTo(8.6667f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(5.3667f)
                    horizontalLineTo(4.01f)
                    lineTo(7.522f, 4.088f)
                    curveTo(7.6846f, 4.026f, 7.862f, 3.9947f, 8.0433f, 4.0007f)
                    curveTo(8.4056f, 4.0097f, 8.7562f, 4.1314f, 9.0461f, 4.3489f)
                    curveTo(9.3361f, 4.5663f, 9.5511f, 4.8687f, 9.6613f, 5.214f)
                    curveTo(9.7853f, 5.6027f, 9.8986f, 5.8653f, 10.0013f, 6.002f)
                    curveTo(10.3116f, 6.4158f, 10.714f, 6.7515f, 11.1767f, 6.9826f)
                    curveTo(11.6393f, 7.2137f, 12.1495f, 7.3338f, 12.6666f, 7.3333f)
                    verticalLineTo(8.6667f)
                    curveTo(11.9782f, 8.6674f, 11.2981f, 8.5155f, 10.6754f, 8.2219f)
                    curveTo(10.0526f, 7.9283f, 9.5028f, 7.5003f, 9.0653f, 6.9687f)
                    lineTo(8.678f, 9.1667f)
                    lineTo(10.0f, 10.4467f)
                    verticalLineTo(15.3333f)
                    horizontalLineTo(8.6666f)
                    verticalLineTo(11.3427f)
                    lineTo(7.3f, 10.018f)
                    lineTo(6.6686f, 12.8833f)
                    lineTo(2.0726f, 12.0733f)
                    lineTo(2.3046f, 10.76f)
                    lineTo(5.5873f, 11.3387f)
                    lineTo(6.5533f, 5.86f)
                    close()
                    moveTo(9.0f, 3.6667f)
                    curveTo(8.6463f, 3.6667f, 8.3072f, 3.5262f, 8.0572f, 3.2761f)
                    curveTo(7.8071f, 3.0261f, 7.6666f, 2.687f, 7.6666f, 2.3333f)
                    curveTo(7.6666f, 1.9797f, 7.8071f, 1.6406f, 8.0572f, 1.3905f)
                    curveTo(8.3072f, 1.1405f, 8.6463f, 1.0f, 9.0f, 1.0f)
                    curveTo(9.3536f, 1.0f, 9.6927f, 1.1405f, 9.9428f, 1.3905f)
                    curveTo(10.1928f, 1.6406f, 10.3333f, 1.9797f, 10.3333f, 2.3333f)
                    curveTo(10.3333f, 2.687f, 10.1928f, 3.0261f, 9.9428f, 3.2761f)
                    curveTo(9.6927f, 3.5262f, 9.3536f, 3.6667f, 9.0f, 3.6667f)
                    close()
                }
            }
        }
        .build()
        return _run!!
    }

private var _run: ImageVector? = null
