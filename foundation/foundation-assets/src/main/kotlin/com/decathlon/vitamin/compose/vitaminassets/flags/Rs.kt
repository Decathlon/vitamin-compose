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

public val FlagsGroup.Rs: ImageVector
    get() {
        if (_rs != null) {
            return _rs!!
        }
        _rs = Builder(name = "Rs", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF17508F), 1.0f to Color(0xFF114175),
                        start = Offset(14.0002f,6.66667f), end = Offset(14.0002f,13.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, 6.6667f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFE1444D), 1.0f to Color(0xFFC53840),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,6.66667f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0002f,13.3333f), end = Offset(14.0002f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, 13.3333f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(8.66685f,6.66667f), end = Offset(8.66685f,14.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(6.0002f, 10.0f)
                    curveTo(6.0002f, 9.1016f, 6.4986f, 7.3128f, 6.4986f, 7.3128f)
                    curveTo(6.5915f, 6.956f, 6.9545f, 6.6667f, 7.3274f, 6.6667f)
                    horizontalLineTo(10.0063f)
                    curveTo(10.3711f, 6.6667f, 10.7433f, 6.9522f, 10.8351f, 7.3082f)
                    curveTo(10.8351f, 7.3082f, 11.3335f, 9.0801f, 11.3335f, 10.0f)
                    curveTo(11.3335f, 10.86f, 10.8316f, 12.6926f, 10.8316f, 12.6926f)
                    curveTo(10.7406f, 13.0465f, 10.4739f, 13.5656f, 10.2235f, 13.8298f)
                    curveTo(10.2235f, 13.8298f, 9.6669f, 14.6667f, 8.6669f, 14.6667f)
                    curveTo(7.6669f, 14.6667f, 7.1102f, 13.8298f, 7.1102f, 13.8298f)
                    curveTo(6.8653f, 13.5556f, 6.5904f, 13.0438f, 6.4986f, 12.6835f)
                    curveTo(6.4986f, 12.6835f, 6.0002f, 10.8814f, 6.0002f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFC43840)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.2297f, 6.3963f)
                    lineTo(5.0635f, 14.1041f)
                    lineTo(6.1046f, 14.9371f)
                    lineTo(12.2709f, 7.2292f)
                    lineTo(11.2297f, 6.3963f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFC43840)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.0635f, 7.2292f)
                    lineTo(11.2297f, 14.9371f)
                    lineTo(12.2709f, 14.1041f)
                    lineTo(6.1046f, 6.3963f)
                    lineTo(5.0635f, 7.2292f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.6668f, 12.0f)
                    curveTo(9.4032f, 12.0f, 10.0002f, 11.1046f, 10.0002f, 10.0f)
                    curveTo(10.0002f, 8.8954f, 9.4032f, 8.0f, 8.6668f, 8.0f)
                    curveTo(7.9304f, 8.0f, 7.3335f, 8.8954f, 7.3335f, 10.0f)
                    curveTo(7.3335f, 11.1046f, 7.9304f, 12.0f, 8.6668f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD1A43A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.6669f, 5.3333f)
                    lineTo(6.0002f, 4.0f)
                    lineTo(7.3335f, 4.6667f)
                    lineTo(8.6669f, 4.0f)
                    lineTo(10.0002f, 4.6667f)
                    lineTo(11.3335f, 4.0f)
                    lineTo(10.6669f, 5.3333f)
                    verticalLineTo(6.0f)
                    curveTo(10.6669f, 6.3682f, 10.3792f, 6.6667f, 10.0063f, 6.6667f)
                    horizontalLineTo(7.3274f)
                    curveTo(6.9626f, 6.6667f, 6.6669f, 6.3574f, 6.6669f, 6.0f)
                    verticalLineTo(5.3333f)
                    close()
                }
            }
        }
        .build()
        return _rs!!
    }

private var _rs: ImageVector? = null
