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
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.83f, 8.79f)
                    lineTo(8.0f, 9.456f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(8.05f)
                    horizontalLineTo(6.015f)
                    lineTo(11.283f, 6.132f)
                    curveTo(11.527f, 6.039f, 11.793f, 5.992f, 12.065f, 6.001f)
                    curveTo(12.6085f, 6.0146f, 13.1343f, 6.1971f, 13.5693f, 6.5233f)
                    curveTo(14.0042f, 6.8495f, 14.3267f, 7.3031f, 14.492f, 7.821f)
                    curveTo(14.678f, 8.404f, 14.848f, 8.798f, 15.002f, 9.003f)
                    curveTo(15.4674f, 9.6236f, 16.0711f, 10.1272f, 16.7651f, 10.4739f)
                    curveTo(17.459f, 10.8205f, 18.2243f, 11.0007f, 19.0f, 11.0f)
                    verticalLineTo(13.0f)
                    curveTo(17.9673f, 13.0011f, 16.9472f, 12.7733f, 16.0131f, 12.3329f)
                    curveTo(15.079f, 11.8925f, 14.2542f, 11.2504f, 13.598f, 10.453f)
                    lineTo(13.017f, 13.75f)
                    lineTo(15.0f, 15.67f)
                    verticalLineTo(23.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(17.014f)
                    lineTo(10.95f, 15.027f)
                    lineTo(10.003f, 19.325f)
                    lineTo(3.109f, 18.11f)
                    lineTo(3.457f, 16.14f)
                    lineTo(8.381f, 17.008f)
                    lineTo(9.83f, 8.79f)
                    close()
                    moveTo(13.5f, 5.5f)
                    curveTo(12.9696f, 5.5f, 12.4609f, 5.2893f, 12.0858f, 4.9142f)
                    curveTo(11.7107f, 4.5391f, 11.5f, 4.0304f, 11.5f, 3.5f)
                    curveTo(11.5f, 2.9696f, 11.7107f, 2.4609f, 12.0858f, 2.0858f)
                    curveTo(12.4609f, 1.7107f, 12.9696f, 1.5f, 13.5f, 1.5f)
                    curveTo(14.0304f, 1.5f, 14.5391f, 1.7107f, 14.9142f, 2.0858f)
                    curveTo(15.2893f, 2.4609f, 15.5f, 2.9696f, 15.5f, 3.5f)
                    curveTo(15.5f, 4.0304f, 15.2893f, 4.5391f, 14.9142f, 4.9142f)
                    curveTo(14.5391f, 5.2893f, 14.0304f, 5.5f, 13.5f, 5.5f)
                    close()
                }
            }
        }
        .build()
        return _run!!
    }

private var _run: ImageVector? = null
