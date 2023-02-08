package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                horizontalLineTo(20.533f)
                curveTo(20.577f, 11.385f, 20.6f, 11.78f, 20.6f, 12.184f)
                curveTo(20.6f, 14.918f, 19.62f, 17.22f, 17.922f, 18.784f)
                curveTo(16.437f, 20.155f, 14.404f, 20.959f, 11.98f, 20.959f)
                curveTo(9.5982f, 20.9601f, 7.3136f, 20.0144f, 5.6294f, 18.3303f)
                curveTo(3.9451f, 16.6463f, 2.9992f, 14.3618f, 3.0f, 11.98f)
                curveTo(2.9989f, 9.598f, 3.9447f, 7.3133f, 5.629f, 5.629f)
                curveTo(7.3133f, 3.9447f, 9.598f, 2.9989f, 11.98f, 3.0f)
                curveTo(14.4f, 3.0f, 16.433f, 3.89f, 17.988f, 5.339f)
                lineTo(16.526f, 6.8f)
                curveTo(15.368f, 5.681f, 13.803f, 5.0f, 12.0f, 5.0f)
                curveTo(9.4991f, 5.0f, 7.1883f, 6.3342f, 5.9378f, 8.5f)
                curveTo(4.6874f, 10.6658f, 4.6874f, 13.3342f, 5.9378f, 15.5f)
                curveTo(7.1883f, 17.6658f, 9.4991f, 19.0f, 12.0f, 19.0f)
                curveTo(15.526f, 19.0f, 18.144f, 16.392f, 18.577f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
