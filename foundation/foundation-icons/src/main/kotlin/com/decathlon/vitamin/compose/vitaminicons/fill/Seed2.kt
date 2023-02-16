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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 5.4444f)
                    verticalLineTo(6.9722f)
                    curveTo(14.0f, 9.1661f, 12.254f, 10.9444f, 10.1f, 10.9444f)
                    horizontalLineTo(8.6f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(7.4f)
                    verticalLineTo(9.7222f)
                    lineTo(7.4114f, 9.1111f)
                    curveTo(7.5644f, 7.0602f, 9.2474f, 5.4444f, 11.3f, 5.4444f)
                    horizontalLineTo(14.0f)
                    close()
                    moveTo(4.4f, 3.0f)
                    curveTo(6.2552f, 3.0f, 7.8296f, 4.2253f, 8.3858f, 5.9248f)
                    curveTo(7.4858f, 6.7039f, 6.8918f, 7.8363f, 6.8096f, 9.1111f)
                    horizontalLineTo(6.2f)
                    curveTo(3.8804f, 9.1111f, 2.0f, 7.1959f, 2.0f, 4.8333f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(4.4f)
                    close()
                }
            }
        }
        .build()
        return _seed2!!
    }

private var _seed2: ImageVector? = null
