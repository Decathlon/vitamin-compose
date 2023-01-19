package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(13.0254f, 2.0f, 14.6667f, 3.6667f, 14.6667f, 6.0f)
                curveTo(14.6667f, 10.6667f, 9.6667f, 13.3333f, 8.0f, 14.3333f)
                curveTo(6.3334f, 13.3333f, 1.3334f, 10.6667f, 1.3334f, 6.0f)
                curveTo(1.3334f, 3.6667f, 3.0f, 2.0f, 5.0f, 2.0f)
                curveTo(6.24f, 2.0f, 7.3334f, 2.6667f, 8.0f, 3.3333f)
                curveTo(8.6667f, 2.6667f, 9.76f, 2.0f, 11.0f, 2.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
