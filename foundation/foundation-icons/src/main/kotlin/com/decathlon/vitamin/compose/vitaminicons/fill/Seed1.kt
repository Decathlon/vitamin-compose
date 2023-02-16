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

public val FillGroup.Seed1: ImageVector
    get() {
        if (_seed1 != null) {
            return _seed1!!
        }
        _seed1 = Builder(name = "Seed1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.6f, 4.0f)
                    verticalLineTo(5.5278f)
                    curveTo(11.6f, 7.7217f, 9.854f, 9.5f, 7.7f, 9.5f)
                    horizontalLineTo(6.2f)
                    verticalLineTo(12.5556f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(8.2778f)
                    lineTo(5.0114f, 7.6667f)
                    curveTo(5.1644f, 5.6158f, 6.8474f, 4.0f, 8.9f, 4.0f)
                    horizontalLineTo(11.6f)
                    close()
                }
            }
        }
        .build()
        return _seed1!!
    }

private var _seed1: ImageVector? = null
