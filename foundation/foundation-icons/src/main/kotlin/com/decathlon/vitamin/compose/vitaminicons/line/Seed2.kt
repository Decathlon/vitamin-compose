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

public val LineGroup.Seed2: ImageVector
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
                    moveTo(4.4f, 3.0f)
                    curveTo(6.494f, 3.0f, 8.2298f, 4.5608f, 8.5478f, 6.6025f)
                    curveTo(9.2528f, 5.8869f, 10.226f, 5.4444f, 11.3f, 5.4444f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(6.9722f)
                    curveTo(14.0f, 9.1661f, 12.254f, 10.9444f, 10.1f, 10.9444f)
                    horizontalLineTo(8.6f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(7.4f)
                    verticalLineTo(9.1111f)
                    horizontalLineTo(6.2f)
                    curveTo(3.8804f, 9.1111f, 2.0f, 7.1959f, 2.0f, 4.8333f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(4.4f)
                    close()
                    moveTo(12.8f, 6.6667f)
                    horizontalLineTo(11.3f)
                    curveTo(9.809f, 6.6667f, 8.6f, 7.8981f, 8.6f, 9.4167f)
                    verticalLineTo(9.7222f)
                    horizontalLineTo(10.1f)
                    curveTo(11.591f, 9.7222f, 12.8f, 8.4908f, 12.8f, 6.9722f)
                    verticalLineTo(6.6667f)
                    close()
                    moveTo(4.4f, 4.2222f)
                    horizontalLineTo(3.2f)
                    verticalLineTo(4.8333f)
                    curveTo(3.2f, 6.5206f, 4.5434f, 7.8889f, 6.2f, 7.8889f)
                    horizontalLineTo(7.4f)
                    verticalLineTo(7.2778f)
                    curveTo(7.4f, 5.5905f, 6.0566f, 4.2222f, 4.4f, 4.2222f)
                    close()
                }
            }
        }
        .build()
        return _seed2!!
    }

private var _seed2: ImageVector? = null
