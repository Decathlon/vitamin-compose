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

public val FillGroup.MailSend: ImageVector
    get() {
        if (_mailSend != null) {
            return _mailSend!!
        }
        _mailSend = Builder(name = "MailSend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 5.5f)
                verticalLineTo(3.993f)
                curveTo(2.0038f, 3.4466f, 2.4456f, 3.0044f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(21.9962f, 20.5534f, 21.5544f, 20.9956f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 20.9994f, 2.0f, 20.555f, 2.0f, 20.007f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.3f)
                lineTo(12.0f, 14.5f)
                lineTo(2.0f, 5.5f)
                close()
                moveTo(0.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(8.0f, 15.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _mailSend!!
    }

private var _mailSend: ImageVector? = null
