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

public val LineGroup.Group: ImageVector
    get() {
        if (_group != null) {
            return _group!!
        }
        _group = Builder(name = "Group", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3333f, 14.6666f)
                curveTo(1.3333f, 13.2521f, 1.8952f, 11.8956f, 2.8954f, 10.8954f)
                curveTo(3.8956f, 9.8952f, 5.2522f, 9.3333f, 6.6666f, 9.3333f)
                curveTo(8.0811f, 9.3333f, 9.4377f, 9.8952f, 10.4379f, 10.8954f)
                curveTo(11.4381f, 11.8956f, 12.0f, 13.2521f, 12.0f, 14.6666f)
                horizontalLineTo(10.6666f)
                curveTo(10.6666f, 13.6058f, 10.2452f, 12.5883f, 9.4951f, 11.8382f)
                curveTo(8.7449f, 11.0881f, 7.7275f, 10.6666f, 6.6666f, 10.6666f)
                curveTo(5.6058f, 10.6666f, 4.5884f, 11.0881f, 3.8382f, 11.8382f)
                curveTo(3.0881f, 12.5883f, 2.6667f, 13.6058f, 2.6667f, 14.6666f)
                horizontalLineTo(1.3333f)
                close()
                moveTo(6.6666f, 8.6666f)
                curveTo(4.4566f, 8.6666f, 2.6667f, 6.8766f, 2.6667f, 4.6666f)
                curveTo(2.6667f, 2.4566f, 4.4566f, 0.6666f, 6.6666f, 0.6666f)
                curveTo(8.8766f, 0.6666f, 10.6666f, 2.4566f, 10.6666f, 4.6666f)
                curveTo(10.6666f, 6.8766f, 8.8766f, 8.6666f, 6.6666f, 8.6666f)
                close()
                moveTo(6.6666f, 7.3333f)
                curveTo(8.14f, 7.3333f, 9.3333f, 6.14f, 9.3333f, 4.6666f)
                curveTo(9.3333f, 3.1933f, 8.14f, 2.0f, 6.6666f, 2.0f)
                curveTo(5.1933f, 2.0f, 4.0f, 3.1933f, 4.0f, 4.6666f)
                curveTo(4.0f, 6.14f, 5.1933f, 7.3333f, 6.6666f, 7.3333f)
                close()
                moveTo(12.1893f, 9.802f)
                curveTo(13.1262f, 10.2239f, 13.9213f, 10.9075f, 14.479f, 11.7704f)
                curveTo(15.0368f, 12.6334f, 15.3334f, 13.6391f, 15.3333f, 14.6666f)
                horizontalLineTo(14.0f)
                curveTo(14.0001f, 13.8959f, 13.7777f, 13.1416f, 13.3594f, 12.4943f)
                curveTo(12.9411f, 11.8471f, 12.3447f, 11.3344f, 11.642f, 11.018f)
                lineTo(12.1886f, 9.802f)
                horizontalLineTo(12.1893f)
                close()
                moveTo(11.7306f, 2.2753f)
                curveTo(12.4023f, 2.5522f, 12.9766f, 3.0223f, 13.3807f, 3.6261f)
                curveTo(13.7847f, 4.2299f, 14.0002f, 4.9401f, 14.0f, 5.6666f)
                curveTo(14.0003f, 6.5815f, 13.6584f, 7.4634f, 13.0417f, 8.1392f)
                curveTo(12.4249f, 8.8149f, 11.5778f, 9.2356f, 10.6666f, 9.3186f)
                verticalLineTo(7.9766f)
                curveTo(11.1606f, 7.9059f, 11.6189f, 7.6786f, 11.9742f, 7.3283f)
                curveTo(12.3295f, 6.9779f, 12.5631f, 6.5228f, 12.6408f, 6.0299f)
                curveTo(12.7184f, 5.537f, 12.636f, 5.0322f, 12.4056f, 4.5895f)
                curveTo(12.1752f, 4.1469f, 11.8089f, 3.7898f, 11.3606f, 3.5706f)
                lineTo(11.7306f, 2.2753f)
                close()
            }
        }
        .build()
        return _group!!
    }

private var _group: ImageVector? = null
