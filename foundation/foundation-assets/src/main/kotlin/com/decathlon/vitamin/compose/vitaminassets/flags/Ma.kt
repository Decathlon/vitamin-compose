package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val FlagsGroup.Ma: ImageVector
    get() {
        if (_ma != null) {
            return _ma!!
        }
        _ma = Builder(name = "Ma", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
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
                path(fill = SolidColor(Color(0xFFE33B44)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0A6135)),
                        strokeLineWidth = 1.33333f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(14.387f, 11.7971f)
                    lineTo(14.0f, 11.5213f)
                    lineTo(13.613f, 11.7971f)
                    lineTo(11.7072f, 13.1557f)
                    lineTo(12.4104f, 10.9234f)
                    lineTo(12.5532f, 10.4701f)
                    lineTo(12.1712f, 10.1873f)
                    lineTo(10.2902f, 8.7946f)
                    lineTo(12.6306f, 8.7735f)
                    lineTo(13.1058f, 8.7693f)
                    lineTo(13.2567f, 8.3186f)
                    lineTo(14.0f, 6.0993f)
                    lineTo(14.7433f, 8.3186f)
                    lineTo(14.8942f, 8.7693f)
                    lineTo(15.3694f, 8.7735f)
                    lineTo(17.7098f, 8.7946f)
                    lineTo(15.8288f, 10.1873f)
                    lineTo(15.4468f, 10.4701f)
                    lineTo(15.5896f, 10.9234f)
                    lineTo(16.2928f, 13.1557f)
                    lineTo(14.387f, 11.7971f)
                    close()
                }
            }
        }
        .build()
        return _ma!!
    }

private var _ma: ImageVector? = null
