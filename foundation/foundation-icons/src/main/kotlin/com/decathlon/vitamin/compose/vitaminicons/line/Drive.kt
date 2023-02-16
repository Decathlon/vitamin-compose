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

public val LineGroup.Drive: ImageVector
    get() {
        if (_drive != null) {
            return _drive!!
        }
        _drive = Builder(name = "Drive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0647f, 4.1f)
                lineTo(2.8733f, 9.6287f)
                lineTo(4.0433f, 11.65f)
                lineTo(7.2333f, 6.1233f)
                lineTo(6.0647f, 4.1f)
                close()
                moveTo(5.198f, 12.316f)
                horizontalLineTo(11.5766f)
                lineTo(12.744f, 10.2933f)
                horizontalLineTo(6.3667f)
                lineTo(5.1986f, 12.316f)
                horizontalLineTo(5.198f)
                close()
                moveTo(12.7406f, 8.96f)
                lineTo(9.55f, 3.4333f)
                horizontalLineTo(7.22f)
                lineTo(10.4113f, 8.96f)
                horizontalLineTo(12.7413f)
                horizontalLineTo(12.7406f)
                close()
                moveTo(5.68f, 2.1f)
                horizontalLineTo(10.32f)
                lineTo(14.6666f, 9.6293f)
                lineTo(12.3466f, 13.6493f)
                horizontalLineTo(3.66f)
                lineTo(1.3333f, 9.6293f)
                lineTo(5.68f, 2.1f)
                close()
                moveTo(8.0033f, 7.4573f)
                lineTo(7.1353f, 8.96f)
                horizontalLineTo(8.8707f)
                lineTo(8.0033f, 7.4573f)
                close()
            }
        }
        .build()
        return _drive!!
    }

private var _drive: ImageVector? = null
