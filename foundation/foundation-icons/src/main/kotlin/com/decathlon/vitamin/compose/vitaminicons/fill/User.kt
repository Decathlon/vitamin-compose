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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 5.3334f)
                curveTo(4.0f, 7.5434f, 5.79f, 9.3334f, 8.0f, 9.3334f)
                curveTo(10.21f, 9.3334f, 12.0f, 7.5434f, 12.0f, 5.3334f)
                curveTo(12.0f, 3.1234f, 10.21f, 1.3334f, 8.0f, 1.3334f)
                curveTo(5.79f, 1.3334f, 4.0f, 3.1234f, 4.0f, 5.3334f)
                close()
                moveTo(8.0f, 10.0f)
                curveTo(5.0544f, 10.0f, 2.6666f, 12.3879f, 2.6666f, 15.3334f)
                horizontalLineTo(13.3333f)
                curveTo(13.3333f, 12.3879f, 10.9455f, 10.0f, 8.0f, 10.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
