package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) {
            return _externalLink!!
        }
        _externalLink = Builder(name = "ExternalLink", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 7.3333f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.6667f)
                verticalLineTo(3.3333f)
                horizontalLineTo(11.7233f)
                lineTo(6.5287f, 8.5287f)
                lineTo(7.4713f, 9.4713f)
                lineTo(12.6667f, 4.2753f)
                verticalLineTo(7.3333f)
                horizontalLineTo(14.0f)
                close()
                moveTo(6.6667f, 5.3333f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.6667f)
                curveTo(2.2985f, 4.0f, 2.0f, 4.2985f, 2.0f, 4.6667f)
                verticalLineTo(13.3333f)
                curveTo(2.0f, 13.7015f, 2.2985f, 14.0f, 2.6667f, 14.0f)
                horizontalLineTo(11.3333f)
                curveTo(11.7015f, 14.0f, 12.0f, 13.7015f, 12.0f, 13.3333f)
                verticalLineTo(9.3333f)
                horizontalLineTo(10.6667f)
                verticalLineTo(12.6667f)
                horizontalLineTo(3.3333f)
                verticalLineTo(5.3333f)
                horizontalLineTo(6.6667f)
                close()
            }
        }
        .build()
        return _externalLink!!
    }

private var _externalLink: ImageVector? = null
