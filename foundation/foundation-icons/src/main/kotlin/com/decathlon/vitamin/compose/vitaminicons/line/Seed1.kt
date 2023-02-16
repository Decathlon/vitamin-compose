package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Seed1: ImageVector
    get() {
        if (_seed1 != null) {
            return _seed1!!
        }
        _seed1 = Builder(name = "Seed1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.6f, 5.5278f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(8.9f)
                    curveTo(6.8474f, 4.0f, 5.1644f, 5.6158f, 5.0114f, 7.6667f)
                    lineTo(5.0f, 8.2778f)
                    verticalLineTo(12.5556f)
                    horizontalLineTo(6.2f)
                    verticalLineTo(9.5f)
                    horizontalLineTo(7.7f)
                    curveTo(9.854f, 9.5f, 11.6f, 7.7217f, 11.6f, 5.5278f)
                    close()
                    moveTo(8.9f, 5.2222f)
                    horizontalLineTo(10.4f)
                    verticalLineTo(5.5278f)
                    curveTo(10.4f, 7.0464f, 9.191f, 8.2778f, 7.7f, 8.2778f)
                    horizontalLineTo(6.2f)
                    verticalLineTo(7.9722f)
                    curveTo(6.2f, 6.4536f, 7.409f, 5.2222f, 8.9f, 5.2222f)
                    close()
                }
            }
        }
        .build()
        return _seed1!!
    }

private var _seed1: ImageVector? = null
