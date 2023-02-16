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

public val LineGroup.Logout: ImageVector
    get() {
        if (_logout != null) {
            return _logout!!
        }
        _logout = Builder(name = "Logout", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.3333f, 14.6666f)
                    curveTo(3.1565f, 14.6666f, 2.9869f, 14.5964f, 2.8619f, 14.4714f)
                    curveTo(2.7369f, 14.3464f, 2.6666f, 14.1768f, 2.6666f, 14.0f)
                    verticalLineTo(2.0f)
                    curveTo(2.6666f, 1.8232f, 2.7369f, 1.6536f, 2.8619f, 1.5286f)
                    curveTo(2.9869f, 1.4036f, 3.1565f, 1.3333f, 3.3333f, 1.3333f)
                    horizontalLineTo(12.6666f)
                    curveTo(12.8434f, 1.3333f, 13.013f, 1.4036f, 13.138f, 1.5286f)
                    curveTo(13.2631f, 1.6536f, 13.3333f, 1.8232f, 13.3333f, 2.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(14.0f)
                    curveTo(13.3333f, 14.1768f, 13.2631f, 14.3464f, 13.138f, 14.4714f)
                    curveTo(13.013f, 14.5964f, 12.8434f, 14.6666f, 12.6666f, 14.6666f)
                    horizontalLineTo(3.3333f)
                    close()
                    moveTo(12.0f, 10.6666f)
                    verticalLineTo(8.6666f)
                    horizontalLineTo(7.3333f)
                    verticalLineTo(7.3333f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(5.3333f)
                    lineTo(15.3333f, 8.0f)
                    lineTo(12.0f, 10.6666f)
                    close()
                }
            }
        }
        .build()
        return _logout!!
    }

private var _logout: ImageVector? = null
