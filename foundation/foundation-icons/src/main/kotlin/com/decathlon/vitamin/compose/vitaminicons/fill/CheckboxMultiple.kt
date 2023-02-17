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

public val FillGroup.CheckboxMultiple: ImageVector
    get() {
        if (_checkboxMultiple != null) {
            return _checkboxMultiple!!
        }
        _checkboxMultiple = Builder(name = "CheckboxMultiple", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                verticalLineTo(3.0f)
                curveTo(7.0f, 2.7348f, 7.1054f, 2.4804f, 7.2929f, 2.2929f)
                curveTo(7.4804f, 2.1054f, 7.7348f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(21.2652f, 2.0f, 21.5196f, 2.1054f, 21.7071f, 2.2929f)
                curveTo(21.8946f, 2.4804f, 22.0f, 2.7348f, 22.0f, 3.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 16.2652f, 21.8946f, 16.5196f, 21.7071f, 16.7071f)
                curveTo(21.5196f, 16.8946f, 21.2652f, 17.0f, 21.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.993f)
                curveTo(17.0f, 21.549f, 16.551f, 22.0f, 15.993f, 22.0f)
                horizontalLineTo(3.007f)
                curveTo(2.8747f, 22.0001f, 2.7437f, 21.9742f, 2.6215f, 21.9236f)
                curveTo(2.4992f, 21.8731f, 2.3882f, 21.7989f, 2.2947f, 21.7053f)
                curveTo(2.2011f, 21.6118f, 2.127f, 21.5008f, 2.0764f, 21.3785f)
                curveTo(2.0258f, 21.2563f, 1.9999f, 21.1253f, 2.0f, 20.993f)
                lineTo(2.003f, 8.007f)
                curveTo(2.003f, 7.451f, 2.452f, 7.0f, 3.01f, 7.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(9.0f, 7.0f)
                horizontalLineTo(15.993f)
                curveTo(16.549f, 7.0f, 17.0f, 7.449f, 17.0f, 8.007f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(8.503f, 18.0f)
                lineTo(14.159f, 12.343f)
                lineTo(12.745f, 10.929f)
                lineTo(8.503f, 15.172f)
                lineTo(6.38f, 13.05f)
                lineTo(4.966f, 14.464f)
                lineTo(8.503f, 18.0f)
                close()
            }
        }
        .build()
        return _checkboxMultiple!!
    }

private var _checkboxMultiple: ImageVector? = null
