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

public val FlagsGroup.Csa: ImageVector
    get() {
        if (_csa != null) {
            return _csa!!
        }
        _csa = Builder(name = "Csa", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth
                = 28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF19BFBF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.0f, 16.041f)
                    curveTo(10.0f, 16.0138f, 10.0034f, 15.9866f, 10.01f, 15.9602f)
                    lineTo(10.6667f, 13.3333f)
                    lineTo(11.3098f, 10.7608f)
                    curveTo(11.3252f, 10.6993f, 11.3227f, 10.6347f, 11.3026f, 10.5746f)
                    lineTo(10.7103f, 8.7976f)
                    curveTo(10.6824f, 8.7138f, 10.6223f, 8.6445f, 10.5432f, 8.6049f)
                    lineTo(9.5176f, 8.0921f)
                    curveTo(9.4047f, 8.0357f, 9.3333f, 7.9202f, 9.3333f, 7.794f)
                    verticalLineTo(5.412f)
                    curveTo(9.3333f, 5.3603f, 9.3454f, 5.3092f, 9.3685f, 5.2629f)
                    lineTo(10.0f, 4.0f)
                    lineTo(10.5745f, 2.8509f)
                    curveTo(10.631f, 2.738f, 10.7464f, 2.6667f, 10.8727f, 2.6667f)
                    horizontalLineTo(14.3333f)
                    curveTo(14.5174f, 2.6667f, 14.6667f, 2.8159f, 14.6667f, 3.0f)
                    verticalLineTo(3.6667f)
                    curveTo(14.6667f, 3.8507f, 14.8159f, 4.0f, 15.0f, 4.0f)
                    horizontalLineTo(15.6667f)
                    curveTo(15.8508f, 4.0f, 16.0f, 4.1492f, 16.0f, 4.3333f)
                    verticalLineTo(5.1273f)
                    curveTo(16.0f, 5.2536f, 16.0713f, 5.369f, 16.1843f, 5.4254f)
                    lineTo(18.4824f, 6.5745f)
                    curveTo(18.5953f, 6.631f, 18.6667f, 6.7464f, 18.6667f, 6.8727f)
                    verticalLineTo(7.9213f)
                    curveTo(18.6667f, 7.9731f, 18.6546f, 8.0241f, 18.6315f, 8.0704f)
                    lineTo(18.0396f, 9.2542f)
                    curveTo(18.0137f, 9.306f, 17.9746f, 9.3503f, 17.9264f, 9.3824f)
                    lineTo(16.0737f, 10.6176f)
                    curveTo(16.0254f, 10.6497f, 15.9864f, 10.6939f, 15.9604f, 10.7458f)
                    lineTo(14.7063f, 13.2541f)
                    curveTo(14.6803f, 13.306f, 14.6413f, 13.3502f, 14.593f, 13.3824f)
                    lineTo(12.7403f, 14.6176f)
                    curveTo(12.6921f, 14.6497f, 12.653f, 14.6939f, 12.6271f, 14.7458f)
                    lineTo(11.4255f, 17.1491f)
                    curveTo(11.369f, 17.262f, 11.2536f, 17.3333f, 11.1273f, 17.3333f)
                    horizontalLineTo(10.3333f)
                    curveTo(10.1492f, 17.3333f, 10.0f, 17.1841f, 10.0f, 17.0f)
                    verticalLineTo(16.041f)
                    close()
                }
            }
        }
        .build()
        return _csa!!
    }

private var _csa: ImageVector? = null
