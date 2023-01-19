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

public val LineGroup.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.3101f, 3.3973f)
                lineTo(5.674f, 11.6707f)
                lineTo(7.7007f, 7.6173f)
                lineTo(11.4587f, 6.114f)
                lineTo(3.3101f, 3.3973f)
                close()
                moveTo(1.9327f, 1.5333f)
                lineTo(14.47f, 5.712f)
                curveTo(14.5349f, 5.7335f, 14.5916f, 5.7744f, 14.6325f, 5.8293f)
                curveTo(14.6733f, 5.8841f, 14.6963f, 5.9501f, 14.6984f, 6.0185f)
                curveTo(14.7004f, 6.0868f, 14.6814f, 6.1541f, 14.6439f, 6.2112f)
                curveTo(14.6064f, 6.2684f, 14.5522f, 6.3127f, 14.4887f, 6.338f)
                lineTo(8.6667f, 8.6667f)
                lineTo(5.7167f, 14.5667f)
                curveTo(5.6867f, 14.6267f, 5.6392f, 14.6763f, 5.5805f, 14.709f)
                curveTo(5.5218f, 14.7416f, 5.4546f, 14.7558f, 5.3878f, 14.7496f)
                curveTo(5.3209f, 14.7434f, 5.2575f, 14.7171f, 5.2058f, 14.6743f)
                curveTo(5.1541f, 14.6314f, 5.1165f, 14.5739f, 5.0981f, 14.5093f)
                lineTo(1.5067f, 1.9407f)
                curveTo(1.4901f, 1.8823f, 1.4897f, 1.8204f, 1.5056f, 1.7619f)
                curveTo(1.5216f, 1.7033f, 1.5532f, 1.6501f, 1.5971f, 1.6082f)
                curveTo(1.641f, 1.5663f, 1.6956f, 1.5372f, 1.7548f, 1.524f)
                curveTo(1.8141f, 1.5108f, 1.8758f, 1.514f, 1.9334f, 1.5333f)
                horizontalLineTo(1.9327f)
                close()
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
