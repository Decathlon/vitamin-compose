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

public val LineGroup.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic = Builder(name = "Mic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 3.0f)
                curveTo(11.2044f, 3.0f, 10.4413f, 3.3161f, 9.8787f, 3.8787f)
                curveTo(9.3161f, 4.4413f, 9.0f, 5.2043f, 9.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 10.7956f, 9.3161f, 11.5587f, 9.8787f, 12.1213f)
                curveTo(10.4413f, 12.6839f, 11.2044f, 13.0f, 12.0001f, 13.0f)
                curveTo(12.7957f, 13.0f, 13.5588f, 12.6839f, 14.1214f, 12.1213f)
                curveTo(14.684f, 11.5587f, 15.0001f, 10.7956f, 15.0001f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(15.0001f, 5.2043f, 14.684f, 4.4413f, 14.1214f, 3.8787f)
                curveTo(13.5588f, 3.3161f, 12.7957f, 3.0f, 12.0001f, 3.0f)
                close()
                moveTo(12.0001f, 1.0f)
                curveTo(12.6567f, 1.0f, 13.3068f, 1.1293f, 13.9135f, 1.3806f)
                curveTo(14.5201f, 1.6319f, 15.0713f, 2.0002f, 15.5356f, 2.4645f)
                curveTo(15.9999f, 2.9288f, 16.3682f, 3.4799f, 16.6195f, 4.0866f)
                curveTo(16.8707f, 4.6932f, 17.0001f, 5.3434f, 17.0001f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(17.0001f, 11.3261f, 16.4733f, 12.5979f, 15.5356f, 13.5355f)
                curveTo(14.5979f, 14.4732f, 13.3261f, 15.0f, 12.0001f, 15.0f)
                curveTo(10.674f, 15.0f, 9.4022f, 14.4732f, 8.4645f, 13.5355f)
                curveTo(7.5268f, 12.5979f, 7.0001f, 11.3261f, 7.0001f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(7.0001f, 4.6739f, 7.5268f, 3.4021f, 8.4645f, 2.4645f)
                curveTo(9.4022f, 1.5268f, 10.674f, 1.0f, 12.0001f, 1.0f)
                close()
                moveTo(3.055f, 11.0f)
                horizontalLineTo(5.07f)
                curveTo(5.3123f, 12.6648f, 6.1459f, 14.1867f, 7.4183f, 15.2873f)
                curveTo(8.6906f, 16.3879f, 10.3167f, 16.9936f, 11.9991f, 16.9936f)
                curveTo(13.6814f, 16.9936f, 15.3075f, 16.3879f, 16.5798f, 15.2873f)
                curveTo(17.8522f, 14.1867f, 18.6858f, 12.6648f, 18.9281f, 11.0f)
                horizontalLineTo(20.9441f)
                curveTo(20.7167f, 13.0287f, 19.8067f, 14.9199f, 18.3633f, 16.3635f)
                curveTo(16.9199f, 17.8071f, 15.0287f, 18.7174f, 13.0001f, 18.945f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0001f)
                verticalLineTo(18.945f)
                curveTo(8.9712f, 18.7176f, 7.0798f, 17.8074f, 5.6362f, 16.3638f)
                curveTo(4.1926f, 14.9202f, 3.2825f, 13.0289f, 3.055f, 11.0f)
                close()
            }
        }
        .build()
        return _mic!!
    }

private var _mic: ImageVector? = null
