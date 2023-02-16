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
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                curveTo(11.5947f, 2.0f, 14.5854f, 4.5867f, 15.2127f, 8.0f)
                curveTo(14.586f, 11.4133f, 11.5947f, 14.0f, 8.0f, 14.0f)
                curveTo(4.4054f, 14.0f, 1.4147f, 11.4133f, 0.7874f, 8.0f)
                curveTo(1.414f, 4.5867f, 4.4054f, 2.0f, 8.0f, 2.0f)
                close()
                moveTo(8.0f, 12.6667f)
                curveTo(9.3597f, 12.6664f, 10.6789f, 12.2045f, 11.7419f, 11.3568f)
                curveTo(12.8049f, 10.509f, 13.5486f, 9.3255f, 13.8514f, 8.0f)
                curveTo(13.5475f, 6.6755f, 12.8033f, 5.4933f, 11.7404f, 4.6467f)
                curveTo(10.6776f, 3.8f, 9.3589f, 3.339f, 8.0f, 3.339f)
                curveTo(6.6411f, 3.339f, 5.3225f, 3.8f, 4.2596f, 4.6467f)
                curveTo(3.1967f, 5.4933f, 2.4525f, 6.6755f, 2.1487f, 8.0f)
                curveTo(2.4514f, 9.3255f, 3.1951f, 10.509f, 4.2581f, 11.3568f)
                curveTo(5.3211f, 12.2045f, 6.6404f, 12.6664f, 8.0f, 12.6667f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(7.2044f, 11.0f, 6.4413f, 10.6839f, 5.8787f, 10.1213f)
                curveTo(5.3161f, 9.5587f, 5.0f, 8.7956f, 5.0f, 8.0f)
                curveTo(5.0f, 7.2043f, 5.3161f, 6.4413f, 5.8787f, 5.8787f)
                curveTo(6.4413f, 5.3161f, 7.2044f, 5.0f, 8.0f, 5.0f)
                curveTo(8.7957f, 5.0f, 9.5587f, 5.3161f, 10.1213f, 5.8787f)
                curveTo(10.6839f, 6.4413f, 11.0f, 7.2043f, 11.0f, 8.0f)
                curveTo(11.0f, 8.7956f, 10.6839f, 9.5587f, 10.1213f, 10.1213f)
                curveTo(9.5587f, 10.6839f, 8.7957f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(8.0f, 9.6667f)
                curveTo(8.442f, 9.6667f, 8.866f, 9.4911f, 9.1785f, 9.1785f)
                curveTo(9.4911f, 8.8659f, 9.6667f, 8.442f, 9.6667f, 8.0f)
                curveTo(9.6667f, 7.558f, 9.4911f, 7.134f, 9.1785f, 6.8215f)
                curveTo(8.866f, 6.5089f, 8.442f, 6.3333f, 8.0f, 6.3333f)
                curveTo(7.558f, 6.3333f, 7.1341f, 6.5089f, 6.8215f, 6.8215f)
                curveTo(6.509f, 7.134f, 6.3334f, 7.558f, 6.3334f, 8.0f)
                curveTo(6.3334f, 8.442f, 6.509f, 8.8659f, 6.8215f, 9.1785f)
                curveTo(7.1341f, 9.4911f, 7.558f, 9.6667f, 8.0f, 9.6667f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
