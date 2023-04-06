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

public val FlagsGroup.As: ImageVector
    get() {
        if (_as != null) {
            return _as!!
        }
        _as = Builder(name = "As", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF071585)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD32636)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 20.0f)
                    lineTo(0.0f, 10.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 1.2369f)
                    lineTo(3.9015f, 10.0f)
                    lineTo(28.0f, 18.763f)
                    verticalLineTo(1.2369f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFAB5423)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(21.3333f, 9.3847f)
                    curveTo(21.1754f, 9.2267f, 20.2589f, 9.5923f, 20.2589f, 9.5923f)
                    lineTo(18.6666f, 8.0f)
                    curveTo(18.6666f, 8.0f, 18.5845f, 7.116f, 19.3333f, 6.6667f)
                    curveTo(19.8996f, 6.3269f, 20.9606f, 6.453f, 21.9986f, 6.0f)
                    curveTo(23.6613f, 5.2743f, 25.3333f, 4.0f, 25.3333f, 4.0f)
                    lineTo(24.2639f, 6.9408f)
                    curveTo(24.2639f, 6.9408f, 25.4888f, 7.5723f, 25.3333f, 8.0f)
                    curveTo(25.2882f, 8.1239f, 24.0926f, 8.5128f, 24.0f, 8.6667f)
                    curveTo(23.8241f, 8.9591f, 24.6986f, 9.0477f, 24.4264f, 9.3847f)
                    curveTo(23.6437f, 10.3533f, 22.6666f, 11.3333f, 22.6666f, 11.3333f)
                    lineTo(21.3333f, 10.6667f)
                    curveTo(21.3333f, 10.6667f, 21.5335f, 9.5848f, 21.3333f, 9.3847f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC322)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.1549f, 10.6666f)
                    curveTo(19.2684f, 10.4705f, 19.3333f, 10.2428f, 19.3333f, 10.0f)
                    curveTo(19.3333f, 9.2636f, 18.7363f, 8.6666f, 18.0f, 8.6666f)
                    curveTo(17.2636f, 8.6666f, 16.6666f, 9.2636f, 16.6666f, 10.0f)
                    curveTo(16.6666f, 10.2428f, 16.7316f, 10.4705f, 16.845f, 10.6666f)
                    horizontalLineTo(16.6667f)
                    curveTo(16.2985f, 10.6666f, 16.0f, 10.9651f, 16.0f, 11.3333f)
                    curveTo(16.0f, 11.7015f, 16.2985f, 12.0f, 16.6667f, 12.0f)
                    horizontalLineTo(20.0855f)
                    lineTo(18.4041f, 12.7206f)
                    curveTo(18.0657f, 12.8656f, 17.9089f, 13.2575f, 18.054f, 13.5959f)
                    curveTo(18.199f, 13.9344f, 18.5909f, 14.0911f, 18.9293f, 13.9461f)
                    lineTo(23.5834f, 11.9515f)
                    curveTo(23.6132f, 11.9394f, 23.642f, 11.9252f, 23.6695f, 11.9092f)
                    curveTo(23.7689f, 11.8513f, 23.8488f, 11.7704f, 23.9051f, 11.6764f)
                    curveTo(23.9926f, 11.5303f, 24.0232f, 11.3525f, 23.9823f, 11.1801f)
                    curveTo(23.9424f, 11.0103f, 23.8375f, 10.8655f, 23.6954f, 10.7734f)
                    curveTo(23.5842f, 10.7017f, 23.4529f, 10.6638f, 23.3188f, 10.6666f)
                    horizontalLineTo(19.1549f)
                    close()
                }
            }
        }
        .build()
        return _as!!
    }

private var _as: ImageVector? = null
