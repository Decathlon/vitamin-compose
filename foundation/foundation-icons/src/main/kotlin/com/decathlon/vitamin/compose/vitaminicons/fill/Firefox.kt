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

public val FillGroup.Firefox: ImageVector
    get() {
        if (_firefox != null) {
            return _firefox!!
        }
        _firefox = Builder(name = "Firefox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 10.536f, 2.314f, 9.146f, 2.88f, 7.894f)
                curveTo(3.346f, 6.955f, 4.113f, 6.02f, 4.73f, 5.7f)
                curveTo(4.077f, 6.983f, 3.757f, 8.24f, 3.69f, 9.083f)
                curveTo(4.144f, 7.583f, 5.005f, 6.326f, 6.21f, 5.439f)
                curveTo(8.276f, 3.92f, 11.058f, 3.852f, 12.166f, 4.819f)
                curveTo(10.11f, 5.526f, 7.87f, 8.367f, 8.363f, 11.695f)
                curveTo(8.443f, 12.245f, 8.608f, 12.779f, 8.852f, 13.277f)
                curveTo(8.468f, 12.267f, 8.434f, 10.844f, 9.054f, 9.919f)
                curveTo(9.746f, 8.889f, 10.732f, 8.671f, 11.26f, 8.783f)
                curveTo(11.052f, 8.739f, 10.592f, 9.619f, 10.524f, 9.774f)
                curveTo(10.351f, 10.168f, 10.265f, 10.594f, 10.273f, 11.024f)
                curveTo(10.2879f, 11.9224f, 10.6583f, 12.7782f, 11.303f, 13.404f)
                curveTo(13.225f, 15.275f, 16.326f, 14.539f, 17.715f, 12.402f)
                curveTo(18.668f, 10.931f, 18.784f, 8.434f, 17.56f, 6.45f)
                curveTo(17.2546f, 5.9669f, 16.8905f, 5.5235f, 16.476f, 5.13f)
                curveTo(14.626f, 3.364f, 11.996f, 2.56f, 9.494f, 2.925f)
                curveTo(8.388f, 3.102f, 7.447f, 3.421f, 6.67f, 3.881f)
                curveTo(7.755f, 2.798f, 9.91f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _firefox!!
    }

private var _firefox: ImageVector? = null
