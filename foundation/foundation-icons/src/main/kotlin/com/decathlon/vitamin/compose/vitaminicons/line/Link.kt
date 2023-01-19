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

public val LineGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2427f, 10.3573f)
                lineTo(11.3f, 9.4133f)
                lineTo(12.2427f, 8.4707f)
                curveTo(12.5545f, 8.1616f, 12.8021f, 7.7941f, 12.9714f, 7.3891f)
                curveTo(13.1407f, 6.9841f, 13.2284f, 6.5496f, 13.2294f, 6.1107f)
                curveTo(13.2303f, 5.6717f, 13.1446f, 5.2368f, 12.977f, 4.8311f)
                curveTo(12.8095f, 4.4254f, 12.5635f, 4.0567f, 12.2531f, 3.7463f)
                curveTo(11.9427f, 3.4359f, 11.574f, 3.1899f, 11.1683f, 3.0224f)
                curveTo(10.7625f, 2.8548f, 10.3277f, 2.7691f, 9.8887f, 2.77f)
                curveTo(9.4498f, 2.771f, 9.0153f, 2.8586f, 8.6103f, 3.028f)
                curveTo(8.2053f, 3.1973f, 7.8377f, 3.4449f, 7.5287f, 3.7567f)
                lineTo(6.5861f, 4.7f)
                lineTo(5.6427f, 3.7573f)
                lineTo(6.5867f, 2.8147f)
                curveTo(7.4619f, 1.9395f, 8.649f, 1.4478f, 9.8867f, 1.4478f)
                curveTo(11.1245f, 1.4478f, 12.3115f, 1.9395f, 13.1867f, 2.8147f)
                curveTo(14.0619f, 3.6899f, 14.5536f, 4.8769f, 14.5536f, 6.1147f)
                curveTo(14.5536f, 7.3524f, 14.0619f, 8.5395f, 13.1867f, 9.4147f)
                lineTo(12.2434f, 10.3573f)
                horizontalLineTo(12.2427f)
                close()
                moveTo(10.3574f, 12.2427f)
                lineTo(9.4141f, 13.1853f)
                curveTo(8.5388f, 14.0606f, 7.3518f, 14.5522f, 6.114f, 14.5522f)
                curveTo(4.8763f, 14.5522f, 3.6893f, 14.0606f, 2.814f, 13.1853f)
                curveTo(1.9388f, 12.3101f, 1.4471f, 11.1231f, 1.4471f, 9.8853f)
                curveTo(1.4471f, 8.6476f, 1.9388f, 7.4606f, 2.814f, 6.5853f)
                lineTo(3.7574f, 5.6427f)
                lineTo(4.7f, 6.5867f)
                lineTo(3.7574f, 7.5293f)
                curveTo(3.4456f, 7.8384f, 3.198f, 8.2059f, 3.0287f, 8.6109f)
                curveTo(2.8593f, 9.0159f, 2.7717f, 9.4504f, 2.7707f, 9.8894f)
                curveTo(2.7698f, 10.3283f, 2.8555f, 10.7632f, 3.0231f, 11.1689f)
                curveTo(3.1906f, 11.5746f, 3.4366f, 11.9433f, 3.747f, 12.2537f)
                curveTo(4.0574f, 12.5641f, 4.4261f, 12.8101f, 4.8318f, 12.9777f)
                curveTo(5.2376f, 13.1452f, 5.6724f, 13.231f, 6.1114f, 13.23f)
                curveTo(6.5503f, 13.229f, 6.9848f, 13.1414f, 7.3898f, 12.9721f)
                curveTo(7.7948f, 12.8027f, 8.1623f, 12.5551f, 8.4714f, 12.2433f)
                lineTo(9.4141f, 11.3007f)
                lineTo(10.3574f, 12.2433f)
                verticalLineTo(12.2427f)
                close()
                moveTo(9.8854f, 5.1713f)
                lineTo(10.8287f, 6.1147f)
                lineTo(6.1147f, 10.828f)
                lineTo(5.1714f, 9.8853f)
                lineTo(9.8854f, 5.172f)
                verticalLineTo(5.1713f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
