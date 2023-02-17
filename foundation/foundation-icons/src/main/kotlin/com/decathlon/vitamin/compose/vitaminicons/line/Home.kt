package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 20.6484f)
                curveTo(4.0f, 21.2006f, 4.4477f, 21.6484f, 5.0f, 21.6484f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 21.6484f, 20.0f, 21.2006f, 20.0f, 20.6484f)
                verticalLineTo(11.6484f)
                horizontalLineTo(23.0f)
                lineTo(12.673f, 2.2604f)
                curveTo(12.2915f, 1.9132f, 11.7085f, 1.9132f, 11.327f, 2.2604f)
                lineTo(1.0f, 11.6484f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.6484f)
                close()
                moveTo(18.0f, 9.8054f)
                verticalLineTo(19.6484f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.8054f)
                lineTo(12.0f, 4.3514f)
                lineTo(18.0f, 9.8054f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
