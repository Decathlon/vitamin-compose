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

public val FillGroup.Mastercard: ImageVector
    get() {
        if (_mastercard != null) {
            return _mastercard!!
        }
        _mastercard = Builder(name = "Mastercard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.13f, 6.072f)
                curveTo(9.3955f, 7.5526f, 8.3976f, 9.7195f, 8.4f, 12.0f)
                curveTo(8.3976f, 14.2795f, 9.3947f, 16.4455f, 11.128f, 17.926f)
                curveTo(8.2689f, 19.531f, 4.6715f, 18.8665f, 2.5745f, 16.346f)
                curveTo(0.4774f, 13.8254f, 0.4784f, 10.1672f, 2.5767f, 7.6477f)
                curveTo(4.675f, 5.1283f, 8.2727f, 4.4655f, 11.131f, 6.072f)
                horizontalLineTo(11.13f)
                close()
                moveTo(12.0f, 6.654f)
                curveTo(13.6406f, 7.9418f, 14.5979f, 9.9124f, 14.596f, 11.998f)
                curveTo(14.5972f, 14.0829f, 13.64f, 16.0527f, 12.0f, 17.34f)
                curveTo(10.3597f, 16.0525f, 9.4024f, 14.0823f, 9.404f, 11.997f)
                curveTo(9.4024f, 9.9117f, 10.3597f, 7.9415f, 12.0f, 6.654f)
                close()
                moveTo(15.6f, 12.0f)
                curveTo(15.6024f, 14.2795f, 14.6053f, 16.4455f, 12.872f, 17.926f)
                horizontalLineTo(12.873f)
                curveTo(15.7321f, 19.531f, 19.3295f, 18.8665f, 21.4265f, 16.346f)
                curveTo(23.5236f, 13.8254f, 23.5226f, 10.1672f, 21.4243f, 7.6477f)
                curveTo(19.326f, 5.1283f, 15.7283f, 4.4655f, 12.87f, 6.072f)
                curveTo(14.6046f, 7.5526f, 15.6024f, 9.7195f, 15.6f, 12.0f)
                close()
            }
        }
        .build()
        return _mastercard!!
    }

private var _mastercard: ImageVector? = null
