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

public val LineGroup.MailSend: ImageVector
    get() {
        if (_mailSend != null) {
            return _mailSend!!
        }
        _mailSend = Builder(name = "MailSend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0053f, 14.0f)
                curveTo(14.3696f, 13.9971f, 14.6641f, 13.7023f, 14.6667f, 13.338f)
                verticalLineTo(2.6667f)
                curveTo(14.6667f, 2.2985f, 14.3682f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(2.0f)
                curveTo(1.6318f, 2.0f, 1.3333f, 2.2985f, 1.3333f, 2.6667f)
                verticalLineTo(3.6667f)
                lineTo(8.0f, 9.6667f)
                lineTo(13.3333f, 4.8667f)
                verticalLineTo(12.6667f)
                horizontalLineTo(1.3333f)
                verticalLineTo(13.338f)
                curveTo(1.3333f, 13.7034f, 1.6293f, 13.9996f, 1.9947f, 14.0f)
                horizontalLineTo(14.0053f)
                close()
                moveTo(8.0f, 7.8733f)
                lineTo(2.956f, 3.3333f)
                horizontalLineTo(13.044f)
                lineTo(8.0f, 7.8733f)
                close()
                moveTo(0.0f, 10.0f)
                horizontalLineTo(5.3333f)
                verticalLineTo(11.3333f)
                horizontalLineTo(0.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(3.3333f, 6.6667f)
                horizontalLineTo(0.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.3333f)
                verticalLineTo(6.6667f)
                close()
            }
        }
        .build()
        return _mailSend!!
    }

private var _mailSend: ImageVector? = null
