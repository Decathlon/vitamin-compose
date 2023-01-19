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

public val FillGroup.Tablet: ImageVector
    get() {
        if (_tablet != null) {
            return _tablet!!
        }
        _tablet = Builder(name = "Tablet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.3333f, 1.3333f)
                    horizontalLineTo(12.6666f)
                    curveTo(12.8434f, 1.3333f, 13.013f, 1.4036f, 13.138f, 1.5286f)
                    curveTo(13.2631f, 1.6536f, 13.3333f, 1.8232f, 13.3333f, 2.0f)
                    verticalLineTo(14.0f)
                    curveTo(13.3333f, 14.1768f, 13.2631f, 14.3464f, 13.138f, 14.4714f)
                    curveTo(13.013f, 14.5964f, 12.8434f, 14.6667f, 12.6666f, 14.6667f)
                    horizontalLineTo(3.3333f)
                    curveTo(3.1565f, 14.6667f, 2.9869f, 14.5964f, 2.8619f, 14.4714f)
                    curveTo(2.7369f, 14.3464f, 2.6666f, 14.1768f, 2.6666f, 14.0f)
                    verticalLineTo(2.0f)
                    curveTo(2.6666f, 1.8232f, 2.7369f, 1.6536f, 2.8619f, 1.5286f)
                    curveTo(2.9869f, 1.4036f, 3.1565f, 1.3333f, 3.3333f, 1.3333f)
                    close()
                    moveTo(8.0f, 11.3333f)
                    curveTo(7.8232f, 11.3333f, 7.6536f, 11.4036f, 7.5286f, 11.5286f)
                    curveTo(7.4035f, 11.6536f, 7.3333f, 11.8232f, 7.3333f, 12.0f)
                    curveTo(7.3333f, 12.1768f, 7.4035f, 12.3464f, 7.5286f, 12.4714f)
                    curveTo(7.6536f, 12.5964f, 7.8232f, 12.6667f, 8.0f, 12.6667f)
                    curveTo(8.1768f, 12.6667f, 8.3463f, 12.5964f, 8.4714f, 12.4714f)
                    curveTo(8.5964f, 12.3464f, 8.6666f, 12.1768f, 8.6666f, 12.0f)
                    curveTo(8.6666f, 11.8232f, 8.5964f, 11.6536f, 8.4714f, 11.5286f)
                    curveTo(8.3463f, 11.4036f, 8.1768f, 11.3333f, 8.0f, 11.3333f)
                    close()
                }
            }
        }
        .build()
        return _tablet!!
    }

private var _tablet: ImageVector? = null
