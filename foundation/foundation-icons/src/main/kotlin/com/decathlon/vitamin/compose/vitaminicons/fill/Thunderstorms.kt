package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Thunderstorms: ImageVector
    get() {
        if (_thunderstorms != null) {
            return _thunderstorms!!
        }
        _thunderstorms = Builder(name = "Thunderstorms", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3254f, 12.0f)
                lineTo(12.1361f, 10.9467f)
                curveTo(12.2501f, 10.7987f, 12.3203f, 10.6217f, 12.3388f, 10.4358f)
                curveTo(12.3573f, 10.2499f, 12.3234f, 10.0626f, 12.2409f, 9.895f)
                curveTo(12.1584f, 9.7274f, 12.0306f, 9.5863f, 11.8719f, 9.4876f)
                curveTo(11.7133f, 9.3889f, 11.5302f, 9.3367f, 11.3434f, 9.3367f)
                horizontalLineTo(10.0001f)
                verticalLineTo(6.686f)
                curveTo(10.0002f, 6.477f, 9.9349f, 6.2733f, 9.8132f, 6.1034f)
                curveTo(9.6915f, 5.9334f, 9.5197f, 5.8059f, 9.3218f, 5.7387f)
                curveTo(9.124f, 5.6714f, 8.91f, 5.6679f, 8.71f, 5.7285f)
                curveTo(8.51f, 5.7891f, 8.334f, 5.9109f, 8.2068f, 6.0767f)
                lineTo(3.9634f, 11.5974f)
                curveTo(2.8231f, 11.1255f, 1.8816f, 10.2729f, 1.2994f, 9.1847f)
                curveTo(0.7172f, 8.0966f, 0.5303f, 6.8403f, 0.7705f, 5.6297f)
                curveTo(1.0107f, 4.4192f, 1.6631f, 3.3294f, 2.6167f, 2.546f)
                curveTo(3.5703f, 1.7626f, 4.766f, 1.3341f, 6.0001f, 1.3334f)
                curveTo(7.0748f, 1.3333f, 8.1245f, 1.6578f, 9.0117f, 2.2644f)
                curveTo(9.8988f, 2.8709f, 10.5821f, 3.7313f, 10.9721f, 4.7327f)
                curveTo(11.4737f, 4.6362f, 11.9899f, 4.6456f, 12.4876f, 4.7602f)
                curveTo(12.9853f, 4.8749f, 13.4536f, 5.0922f, 13.8624f, 5.3984f)
                curveTo(14.2713f, 5.7045f, 14.6116f, 6.0927f, 14.8617f, 6.538f)
                curveTo(15.1118f, 6.9834f, 15.2661f, 7.476f, 15.3147f, 7.9845f)
                curveTo(15.3633f, 8.4929f, 15.3051f, 9.0059f, 15.1439f, 9.4906f)
                curveTo(14.9828f, 9.9752f, 14.7221f, 10.4208f, 14.3787f, 10.7989f)
                curveTo(14.0352f, 11.1769f, 13.6166f, 11.4791f, 13.1496f, 11.6859f)
                curveTo(12.6826f, 11.8927f, 12.1775f, 11.9997f, 11.6668f, 12.0f)
                horizontalLineTo(11.3254f)
                close()
                moveTo(8.6668f, 10.67f)
                horizontalLineTo(10.6668f)
                lineTo(7.3334f, 15.0034f)
                verticalLineTo(12.0034f)
                horizontalLineTo(5.3334f)
                lineTo(8.6668f, 7.6667f)
                verticalLineTo(10.67f)
                close()
            }
        }
        .build()
        return _thunderstorms!!
    }

private var _thunderstorms: ImageVector? = null
