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

public val LineGroup.Safari: ImageVector
    get() {
        if (_safari != null) {
            return _safari!!
        }
        _safari = Builder(name = "Safari", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8747f, 4.3353f)
                lineTo(8.9427f, 8.9427f)
                lineTo(4.3354f, 11.8747f)
                curveTo(5.158f, 12.6547f, 6.2085f, 13.1514f, 7.3334f, 13.292f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.6667f)
                verticalLineTo(13.292f)
                curveTo(9.6161f, 13.1738f, 10.5158f, 12.8011f, 11.2707f, 12.2133f)
                lineTo(10.3574f, 11.3f)
                lineTo(11.3f, 10.3573f)
                lineTo(12.2134f, 11.2707f)
                curveTo(12.8011f, 10.5158f, 13.1738f, 9.616f, 13.292f, 8.6667f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.3333f)
                horizontalLineTo(13.292f)
                curveTo(13.1514f, 6.2084f, 12.6548f, 5.158f, 11.8747f, 4.3353f)
                close()
                moveTo(11.6647f, 4.1253f)
                curveTo(10.8421f, 3.3453f, 9.7916f, 2.8487f, 8.6667f, 2.708f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.3334f)
                verticalLineTo(2.708f)
                curveTo(6.384f, 2.8263f, 5.4843f, 3.199f, 4.7294f, 3.7867f)
                lineTo(5.6427f, 4.7f)
                lineTo(4.7f, 5.6427f)
                lineTo(3.7867f, 4.7293f)
                curveTo(3.199f, 5.4842f, 2.8263f, 6.384f, 2.708f, 7.3333f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.6667f)
                horizontalLineTo(2.708f)
                curveTo(2.8487f, 9.7916f, 3.3453f, 10.8421f, 4.1254f, 11.6647f)
                lineTo(7.0574f, 7.0573f)
                lineTo(11.6647f, 4.1253f)
                close()
                moveTo(8.0f, 14.6667f)
                curveTo(4.318f, 14.6667f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 4.318f, 4.318f, 1.3333f, 8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6667f, 8.0f, 14.6667f)
                close()
            }
        }
        .build()
        return _safari!!
    }

private var _safari: ImageVector? = null
