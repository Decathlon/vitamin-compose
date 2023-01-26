package com.decathlon.vitamin.compose.vitaminicons.fill

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
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Seed3: ImageVector
    get() {
        if (_seed3 != null) {
            return _seed3!!
        }
        _seed3 = Builder(name = "Seed3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 7.0247f)
                    verticalLineTo(9.5247f)
                    curveTo(22.0f, 13.1147f, 19.09f, 16.0247f, 15.5f, 16.0247f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(21.0247f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(14.0247f)
                    lineTo(11.019f, 13.0247f)
                    curveTo(11.274f, 9.6687f, 14.079f, 7.0247f, 17.5f, 7.0247f)
                    horizontalLineTo(22.0f)
                    close()
                    moveTo(6.0f, 3.0247f)
                    curveTo(9.092f, 3.0247f, 11.716f, 5.0297f, 12.643f, 7.8107f)
                    curveTo(11.143f, 9.0857f, 10.153f, 10.9387f, 10.016f, 13.0247f)
                    horizontalLineTo(9.0f)
                    curveTo(5.134f, 13.0247f, 2.0f, 9.8907f, 2.0f, 6.0247f)
                    verticalLineTo(3.0247f)
                    horizontalLineTo(6.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.6138f, 5.2937f)
                    curveTo(15.0658f, 6.0563f, 14.0034f, 6.2303f, 13.2409f, 5.6823f)
                    curveTo(12.4783f, 5.1343f, 12.3043f, 4.0718f, 12.8523f, 3.3092f)
                    curveTo(13.4002f, 2.5466f, 14.5196f, 2.1553f, 15.8866f, 2.0f)
                    curveTo(16.1205f, 2.961f, 16.1617f, 4.531f, 15.6138f, 5.2937f)
                    close()
                }
            }
        }
        .build()
        return _seed3!!
    }

private var _seed3: ImageVector? = null
