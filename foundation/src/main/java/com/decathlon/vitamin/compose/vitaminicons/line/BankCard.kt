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

public val LineGroup.BankCard: ImageVector
    get() {
        if (_bankCard != null) {
            return _bankCard!!
        }
        _bankCard = Builder(name = "BankCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.2652f, 3.0f, 21.5196f, 3.1054f, 21.7071f, 3.2929f)
                curveTo(21.8946f, 3.4804f, 22.0f, 3.7348f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.2652f, 21.8946f, 20.5196f, 21.7071f, 20.7071f)
                curveTo(21.5196f, 20.8946f, 21.2652f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.7348f, 21.0f, 2.4804f, 20.8946f, 2.2929f, 20.7071f)
                curveTo(2.1054f, 20.5196f, 2.0f, 20.2652f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.7348f, 2.1054f, 3.4804f, 2.2929f, 3.2929f)
                curveTo(2.4804f, 3.1054f, 2.7348f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(20.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(20.0f, 9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _bankCard!!
    }

private var _bankCard: ImageVector? = null
