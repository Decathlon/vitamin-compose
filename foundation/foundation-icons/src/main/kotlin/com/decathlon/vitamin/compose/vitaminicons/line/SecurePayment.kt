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

public val LineGroup.SecurePayment: ImageVector
    get() {
        if (_securePayment != null) {
            return _securePayment!!
        }
        _securePayment = Builder(name = "SecurePayment", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                lineTo(18.298f, 4.28f)
                curveTo(18.5015f, 4.3435f, 18.6794f, 4.4705f, 18.8057f, 4.6423f)
                curveTo(18.932f, 4.8141f, 19.0001f, 5.0218f, 19.0f, 5.235f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                curveTo(21.2652f, 7.0f, 21.5196f, 7.1054f, 21.7071f, 7.2929f)
                curveTo(21.8946f, 7.4804f, 22.0f, 7.7348f, 22.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 16.2652f, 21.8946f, 16.5196f, 21.7071f, 16.7071f)
                curveTo(21.5196f, 16.8946f, 21.2652f, 17.0f, 21.0f, 17.0f)
                lineTo(17.78f, 17.001f)
                curveTo(17.393f, 17.511f, 16.923f, 17.961f, 16.38f, 18.331f)
                lineTo(11.0f, 22.0f)
                lineTo(5.62f, 18.332f)
                curveTo(4.8125f, 17.7815f, 4.1518f, 17.042f, 3.6951f, 16.1779f)
                curveTo(3.2385f, 15.3138f, 2.9999f, 14.3513f, 3.0f, 13.374f)
                verticalLineTo(5.235f)
                curveTo(3.0001f, 5.0219f, 3.0683f, 4.8145f, 3.1946f, 4.6429f)
                curveTo(3.3208f, 4.4713f, 3.4986f, 4.3445f, 3.702f, 4.281f)
                lineTo(11.0f, 2.0f)
                close()
                moveTo(11.0f, 4.094f)
                lineTo(5.0f, 5.97f)
                verticalLineTo(13.374f)
                curveTo(4.9999f, 13.9862f, 5.1403f, 14.5903f, 5.4104f, 15.1397f)
                curveTo(5.6805f, 15.6892f, 6.0731f, 16.1692f, 6.558f, 16.543f)
                lineTo(6.747f, 16.679f)
                lineTo(11.0f, 19.58f)
                lineTo(14.782f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(9.7348f, 17.0f, 9.4804f, 16.8946f, 9.2929f, 16.7071f)
                curveTo(9.1054f, 16.5196f, 9.0f, 16.2652f, 9.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(9.0f, 7.7348f, 9.1054f, 7.4804f, 9.2929f, 7.2929f)
                curveTo(9.4804f, 7.1054f, 9.7348f, 7.0f, 10.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.97f)
                lineTo(11.0f, 4.094f)
                close()
                moveTo(11.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _securePayment!!
    }

private var _securePayment: ImageVector? = null
