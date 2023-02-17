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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 3.0f)
                curveTo(19.538f, 3.0f, 22.0f, 5.5f, 22.0f, 9.0f)
                curveTo(22.0f, 16.0f, 14.5f, 20.0f, 12.0f, 21.5f)
                curveTo(9.5f, 20.0f, 2.0f, 16.0f, 2.0f, 9.0f)
                curveTo(2.0f, 5.5f, 4.5f, 3.0f, 7.5f, 3.0f)
                curveTo(9.36f, 3.0f, 11.0f, 4.0f, 12.0f, 5.0f)
                curveTo(13.0f, 4.0f, 14.64f, 3.0f, 16.5f, 3.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
