package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 8.0f)
                curveTo(6.0f, 11.315f, 8.685f, 14.0f, 12.0f, 14.0f)
                curveTo(15.315f, 14.0f, 18.0f, 11.315f, 18.0f, 8.0f)
                curveTo(18.0f, 4.685f, 15.315f, 2.0f, 12.0f, 2.0f)
                curveTo(8.685f, 2.0f, 6.0f, 4.685f, 6.0f, 8.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(7.5817f, 15.0f, 4.0f, 18.5817f, 4.0f, 23.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 18.5817f, 16.4183f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
