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

public val FillGroup.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) {
            return _externalLink!!
        }
        _externalLink = Builder(name = "ExternalLink", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                lineTo(15.792f, 6.793f)
                lineTo(9.793f, 12.793f)
                lineTo(11.207f, 14.207f)
                lineTo(17.206f, 8.207f)
                lineTo(21.0f, 12.0f)
                close()
                moveTo(10.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 6.0f, 3.0f, 6.4477f, 3.0f, 7.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.5523f, 3.4477f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 21.0f, 18.0f, 20.5523f, 18.0f, 20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _externalLink!!
    }

private var _externalLink: ImageVector? = null
