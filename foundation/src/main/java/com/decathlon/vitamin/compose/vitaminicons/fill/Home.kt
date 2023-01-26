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

public val FillGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.6484f)
                curveTo(20.0f, 21.2006f, 19.5523f, 21.6484f, 19.0f, 21.6484f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 21.6484f, 4.0f, 21.2006f, 4.0f, 20.6484f)
                verticalLineTo(11.6484f)
                horizontalLineTo(1.0f)
                lineTo(11.327f, 2.2604f)
                curveTo(11.7085f, 1.9132f, 12.2915f, 1.9132f, 12.673f, 2.2604f)
                lineTo(23.0f, 11.6484f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.6484f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
