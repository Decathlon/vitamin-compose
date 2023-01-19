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

public val LineGroup.Attachment: ImageVector
    get() {
        if (_attachment != null) {
            return _attachment!!
        }
        _attachment = Builder(name = "Attachment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8854f, 5.1713f)
                lineTo(6.1147f, 8.9427f)
                curveTo(5.9414f, 9.1101f, 5.8719f, 9.3579f, 5.9329f, 9.591f)
                curveTo(5.9939f, 9.8241f, 6.1759f, 10.0061f, 6.409f, 10.0671f)
                curveTo(6.6421f, 10.1281f, 6.89f, 10.0586f, 7.0574f, 9.8853f)
                lineTo(10.8287f, 6.1147f)
                curveTo(11.6098f, 5.3335f, 11.6098f, 4.0671f, 10.8287f, 3.286f)
                curveTo(10.0476f, 2.5049f, 8.7811f, 2.5049f, 8.0f, 3.286f)
                lineTo(4.2287f, 7.0573f)
                curveTo(3.3688f, 7.8958f, 3.0265f, 9.1319f, 3.3325f, 10.2932f)
                curveTo(3.6385f, 11.4545f, 4.5456f, 12.3615f, 5.7069f, 12.6673f)
                curveTo(6.8683f, 12.9731f, 8.1044f, 12.6306f, 8.9427f, 11.7707f)
                lineTo(12.714f, 8.0f)
                lineTo(13.6567f, 8.9427f)
                lineTo(9.8854f, 12.714f)
                curveTo(8.7064f, 13.893f, 6.988f, 14.3534f, 5.3775f, 13.9219f)
                curveTo(3.7669f, 13.4903f, 2.509f, 12.2324f, 2.0775f, 10.6219f)
                curveTo(1.6459f, 9.0114f, 2.1064f, 7.293f, 3.2854f, 6.114f)
                lineTo(7.0574f, 2.3433f)
                curveTo(8.3653f, 1.0801f, 10.4443f, 1.0982f, 11.7301f, 2.3839f)
                curveTo(13.0159f, 3.6697f, 13.0339f, 5.7487f, 11.7707f, 7.0567f)
                lineTo(8.0f, 10.8293f)
                curveTo(7.4946f, 11.3346f, 6.758f, 11.5319f, 6.0677f, 11.3468f)
                curveTo(5.3774f, 11.1618f, 4.8383f, 10.6225f, 4.6534f, 9.9322f)
                curveTo(4.4685f, 9.2418f, 4.6659f, 8.5053f, 5.1714f, 8.0f)
                lineTo(8.9427f, 4.2287f)
                lineTo(9.8854f, 5.1713f)
                close()
            }
        }
        .build()
        return _attachment!!
    }

private var _attachment: ImageVector? = null
