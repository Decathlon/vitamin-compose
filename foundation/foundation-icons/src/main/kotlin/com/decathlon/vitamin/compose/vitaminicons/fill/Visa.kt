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

public val FillGroup.Visa: ImageVector
    get() {
        if (_visa != null) {
            return _visa!!
        }
        _visa = Builder(name = "Visa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(1.0f, 18.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(19.622f, 14.914f)
                lineTo(19.448f, 14.044f)
                horizontalLineTo(17.499f)
                lineTo(17.189f, 14.907f)
                lineTo(15.627f, 14.91f)
                curveTo(16.632f, 12.504f, 17.377f, 10.72f, 17.863f, 9.562f)
                curveTo(17.99f, 9.259f, 18.216f, 9.105f, 18.548f, 9.107f)
                curveTo(18.802f, 9.109f, 19.217f, 9.109f, 19.793f, 9.107f)
                lineTo(21.0f, 14.912f)
                lineTo(19.622f, 14.915f)
                verticalLineTo(14.914f)
                close()
                moveTo(17.938f, 12.852f)
                horizontalLineTo(19.194f)
                lineTo(18.724f, 10.672f)
                lineTo(17.938f, 12.852f)
                close()
                moveTo(7.872f, 9.106f)
                lineTo(9.442f, 9.108f)
                lineTo(7.015f, 14.914f)
                lineTo(5.425f, 14.913f)
                curveTo(4.888f, 12.843f, 4.493f, 11.307f, 4.241f, 10.308f)
                curveTo(4.164f, 10.001f, 4.011f, 9.787f, 3.715f, 9.686f)
                curveTo(3.452f, 9.596f, 3.014f, 9.456f, 2.4f, 9.267f)
                verticalLineTo(9.107f)
                horizontalLineTo(4.909f)
                curveTo(5.343f, 9.107f, 5.596f, 9.317f, 5.678f, 9.747f)
                lineTo(6.298f, 13.036f)
                lineTo(7.872f, 9.106f)
                close()
                moveTo(11.599f, 9.108f)
                lineTo(10.359f, 14.913f)
                lineTo(8.864f, 14.911f)
                lineTo(10.104f, 9.106f)
                lineTo(11.599f, 9.108f)
                close()
                moveTo(14.631f, 9.0f)
                curveTo(15.077f, 9.0f, 15.641f, 9.138f, 15.965f, 9.267f)
                lineTo(15.703f, 10.471f)
                curveTo(15.41f, 10.353f, 14.928f, 10.194f, 14.523f, 10.201f)
                curveTo(13.933f, 10.21f, 13.569f, 10.457f, 13.569f, 10.694f)
                curveTo(13.569f, 11.078f, 14.201f, 11.272f, 14.853f, 11.693f)
                curveTo(15.596f, 12.173f, 15.693f, 12.603f, 15.684f, 13.071f)
                curveTo(15.674f, 14.042f, 14.853f, 15.0f, 13.12f, 15.0f)
                curveTo(12.329f, 14.988f, 12.044f, 14.922f, 11.4f, 14.694f)
                lineTo(11.672f, 13.438f)
                curveTo(12.328f, 13.712f, 12.607f, 13.799f, 13.167f, 13.799f)
                curveTo(13.682f, 13.799f, 14.123f, 13.592f, 14.127f, 13.231f)
                curveTo(14.129f, 12.974f, 13.972f, 12.847f, 13.395f, 12.529f)
                curveTo(12.818f, 12.212f, 12.01f, 11.773f, 12.02f, 10.889f)
                curveTo(12.033f, 9.759f, 13.107f, 9.0f, 14.63f, 9.0f)
                horizontalLineTo(14.631f)
                close()
            }
        }
        .build()
        return _visa!!
    }

private var _visa: ImageVector? = null
