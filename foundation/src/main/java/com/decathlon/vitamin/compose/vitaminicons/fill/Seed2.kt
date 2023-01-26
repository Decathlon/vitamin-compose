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

public val FillGroup.Seed2: ImageVector
    get() {
        if (_seed2 != null) {
            return _seed2!!
        }
        _seed2 = Builder(name = "Seed2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 7.0f)
                    verticalLineTo(9.5f)
                    curveTo(22.0f, 13.09f, 19.09f, 16.0f, 15.5f, 16.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(14.0f)
                    lineTo(11.019f, 13.0f)
                    curveTo(11.274f, 9.644f, 14.079f, 7.0f, 17.5f, 7.0f)
                    horizontalLineTo(22.0f)
                    close()
                    moveTo(6.0f, 3.0f)
                    curveTo(9.092f, 3.0f, 11.716f, 5.005f, 12.643f, 7.786f)
                    curveTo(11.143f, 9.061f, 10.153f, 10.914f, 10.016f, 13.0f)
                    horizontalLineTo(9.0f)
                    curveTo(5.134f, 13.0f, 2.0f, 9.866f, 2.0f, 6.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(6.0f)
                    close()
                }
            }
        }
        .build()
        return _seed2!!
    }

private var _seed2: ImageVector? = null
