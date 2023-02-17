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

public val FillGroup.Alert: ImageVector
    get() {
        if (_alert != null) {
            return _alert!!
        }
        _alert = Builder(name = "Alert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.392f, 3.5f)
                lineTo(21.918f, 20.0f)
                curveTo(22.0057f, 20.152f, 22.0519f, 20.3244f, 22.0519f, 20.5f)
                curveTo(22.052f, 20.6755f, 22.0057f, 20.8479f, 21.918f, 20.9999f)
                curveTo(21.8302f, 21.152f, 21.704f, 21.2782f, 21.552f, 21.366f)
                curveTo(21.4f, 21.4537f, 21.2275f, 21.5f, 21.052f, 21.5f)
                horizontalLineTo(2.0f)
                curveTo(1.8244f, 21.5f, 1.652f, 21.4537f, 1.5f, 21.366f)
                curveTo(1.348f, 21.2782f, 1.2217f, 21.152f, 1.134f, 20.9999f)
                curveTo(1.0462f, 20.8479f, 1.0f, 20.6755f, 1.0f, 20.5f)
                curveTo(1.0f, 20.3244f, 1.0462f, 20.152f, 1.134f, 20.0f)
                lineTo(10.66f, 3.5f)
                curveTo(10.7477f, 3.3479f, 10.874f, 3.2217f, 11.026f, 3.134f)
                curveTo(11.178f, 3.0462f, 11.3504f, 3.0f, 11.526f, 3.0f)
                curveTo(11.7015f, 3.0f, 11.8739f, 3.0462f, 12.026f, 3.134f)
                curveTo(12.178f, 3.2217f, 12.3042f, 3.3479f, 12.392f, 3.5f)
                close()
                moveTo(10.526f, 16.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(12.526f)
                verticalLineTo(16.5f)
                horizontalLineTo(10.526f)
                close()
                moveTo(10.526f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(12.526f)
                verticalLineTo(9.5f)
                horizontalLineTo(10.526f)
                close()
            }
        }
        .build()
        return _alert!!
    }

private var _alert: ImageVector? = null
