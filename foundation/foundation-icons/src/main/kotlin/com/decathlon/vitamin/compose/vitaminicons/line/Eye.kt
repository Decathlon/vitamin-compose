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

public val LineGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(17.392f, 3.0f, 21.878f, 6.88f, 22.819f, 12.0f)
                curveTo(21.879f, 17.12f, 17.392f, 21.0f, 12.0f, 21.0f)
                curveTo(6.608f, 21.0f, 2.122f, 17.12f, 1.181f, 12.0f)
                curveTo(2.121f, 6.88f, 6.608f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(14.0395f, 18.9996f, 16.0184f, 18.3068f, 17.6129f, 17.0352f)
                curveTo(19.2074f, 15.7635f, 20.3229f, 13.9883f, 20.777f, 12.0f)
                curveTo(20.3213f, 10.0133f, 19.205f, 8.24f, 17.6107f, 6.97f)
                curveTo(16.0163f, 5.7f, 14.0383f, 5.0085f, 12.0f, 5.0085f)
                curveTo(9.9617f, 5.0085f, 7.9837f, 5.7f, 6.3894f, 6.97f)
                curveTo(4.7951f, 8.24f, 3.6788f, 10.0133f, 3.223f, 12.0f)
                curveTo(3.6771f, 13.9883f, 4.7927f, 15.7635f, 6.3872f, 17.0352f)
                curveTo(7.9816f, 18.3068f, 9.9606f, 18.9996f, 12.0f, 19.0f)
                close()
                moveTo(12.0f, 16.5f)
                curveTo(10.8066f, 16.5f, 9.662f, 16.0259f, 8.8181f, 15.182f)
                curveTo(7.9741f, 14.3381f, 7.5f, 13.1935f, 7.5f, 12.0f)
                curveTo(7.5f, 10.8065f, 7.9741f, 9.6619f, 8.8181f, 8.818f)
                curveTo(9.662f, 7.9741f, 10.8066f, 7.5f, 12.0f, 7.5f)
                curveTo(13.1935f, 7.5f, 14.3381f, 7.9741f, 15.182f, 8.818f)
                curveTo(16.0259f, 9.6619f, 16.5f, 10.8065f, 16.5f, 12.0f)
                curveTo(16.5f, 13.1935f, 16.0259f, 14.3381f, 15.182f, 15.182f)
                curveTo(14.3381f, 16.0259f, 13.1935f, 16.5f, 12.0f, 16.5f)
                close()
                moveTo(12.0f, 14.5f)
                curveTo(12.6631f, 14.5f, 13.299f, 14.2366f, 13.7678f, 13.7678f)
                curveTo(14.2366f, 13.2989f, 14.5f, 12.663f, 14.5f, 12.0f)
                curveTo(14.5f, 11.337f, 14.2366f, 10.7011f, 13.7678f, 10.2322f)
                curveTo(13.299f, 9.7634f, 12.6631f, 9.5f, 12.0f, 9.5f)
                curveTo(11.337f, 9.5f, 10.7011f, 9.7634f, 10.2323f, 10.2322f)
                curveTo(9.7634f, 10.7011f, 9.5f, 11.337f, 9.5f, 12.0f)
                curveTo(9.5f, 12.663f, 9.7634f, 13.2989f, 10.2323f, 13.7678f)
                curveTo(10.7011f, 14.2366f, 11.337f, 14.5f, 12.0f, 14.5f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
