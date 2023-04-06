package com.decathlon.vitamin.compose.vitaminassets.payments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.Elo: ImageVector
    get() {
        if (_elo != null) {
            return _elo!!
        }
        _elo = Builder(name = "Elo", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp, viewportWidth
                = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFFF3F3F3)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 0.5f)
                lineTo(54.0f, 0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 57.5f, 4.0f)
                lineTo(57.5f, 36.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 54.0f, 39.5f)
                lineTo(4.0f, 39.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.5f, 36.0f)
                lineTo(0.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFF200)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.207f, 15.0056f)
                curveTo(12.7492f, 14.828f, 13.3292f, 14.7316f, 13.9327f, 14.7316f)
                curveTo(16.5666f, 14.7316f, 18.7636f, 16.5648f, 19.2676f, 19.0f)
                lineTo(23.0f, 18.2543f)
                curveTo(22.1436f, 14.1155f, 18.4099f, 11.0f, 13.9327f, 11.0f)
                curveTo(12.9077f, 11.0f, 11.921f, 11.1636f, 11.0f, 11.465f)
                lineTo(12.207f, 15.0056f)
                close()
            }
            path(fill = SolidColor(Color(0xFF00A4E0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7652f, 27.0f)
                lineTo(10.0f, 24.1179f)
                curveTo(9.0025f, 23.1101f, 8.3729f, 21.6388f, 8.3729f, 19.9988f)
                curveTo(8.3729f, 18.3601f, 9.0019f, 16.8888f, 9.9991f, 15.8818f)
                lineTo(7.7632f, 13.0f)
                curveTo(6.0682f, 14.7122f, 5.0f, 17.2132f, 5.0f, 19.9988f)
                curveTo(5.0f, 22.7859f, 6.0697f, 25.2878f, 7.7652f, 27.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEF4123)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2688f, 21.0f)
                curveTo(18.7631f, 23.4348f, 16.5674f, 25.2657f, 13.9359f, 25.2657f)
                curveTo(13.3321f, 25.2657f, 12.751f, 25.169f, 12.2087f, 24.9909f)
                lineTo(11.0f, 28.5333f)
                curveTo(11.9225f, 28.8362f, 12.9094f, 29.0f, 13.9359f, 29.0f)
                curveTo(18.409f, 29.0f, 22.1402f, 25.8866f, 23.0f, 21.7494f)
                lineTo(19.2688f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(40.9576f, 13.0f)
                verticalLineTo(23.2425f)
                lineTo(42.7978f, 23.9792f)
                lineTo(41.9272f, 25.9994f)
                lineTo(40.1074f, 25.2688f)
                curveTo(39.6982f, 25.0974f, 39.4213f, 24.8363f, 39.2109f, 24.5414f)
                curveTo(39.0089f, 24.2396f, 38.8591f, 23.8272f, 38.8591f, 23.2707f)
                verticalLineTo(13.0f)
                horizontalLineTo(40.9576f)
                close()
                moveTo(27.0007f, 20.6125f)
                curveTo(27.0464f, 17.6835f, 29.5438f, 15.3454f, 32.5742f, 15.3902f)
                curveTo(35.1462f, 15.4292f, 37.2773f, 17.1692f, 37.837f, 19.4835f)
                lineTo(27.8893f, 23.59f)
                curveTo(27.3114f, 22.7367f, 26.983f, 21.7103f, 27.0007f, 20.6125f)
                close()
                moveTo(29.2768f, 21.0232f)
                curveTo(29.2632f, 20.9003f, 29.2535f, 20.7743f, 29.2572f, 20.6471f)
                curveTo(29.2857f, 18.9214f, 30.756f, 17.5444f, 32.5414f, 17.573f)
                curveTo(33.5133f, 17.5855f, 34.3762f, 18.0154f, 34.9595f, 18.6806f)
                lineTo(29.2768f, 21.0232f)
                close()
                moveTo(34.7501f, 22.9248f)
                curveTo(34.1505f, 23.488f, 33.3375f, 23.8312f, 32.4398f, 23.8189f)
                curveTo(31.8245f, 23.809f, 31.2544f, 23.631f, 30.7696f, 23.3346f)
                lineTo(29.5679f, 25.184f)
                curveTo(30.3909f, 25.6865f, 31.3613f, 25.9838f, 32.4075f, 25.9994f)
                curveTo(33.9304f, 26.0213f, 35.3184f, 25.4435f, 36.3277f, 24.4894f)
                lineTo(34.7501f, 22.9248f)
                close()
                moveTo(48.6164f, 17.573f)
                curveTo(48.258f, 17.573f, 47.9135f, 17.6289f, 47.5916f, 17.7333f)
                lineTo(46.8755f, 15.6608f)
                curveTo(47.4221f, 15.4846f, 48.0073f, 15.3888f, 48.6164f, 15.3888f)
                curveTo(51.2743f, 15.3888f, 53.4916f, 17.2124f, 54.0f, 19.6347f)
                lineTo(51.7834f, 20.0711f)
                curveTo(51.4847f, 18.6455f, 50.1803f, 17.573f, 48.6164f, 17.573f)
                close()
                moveTo(44.977f, 24.6683f)
                lineTo(46.4748f, 23.0325f)
                curveTo(45.8059f, 22.4605f, 45.3846f, 21.6251f, 45.3846f, 20.6939f)
                curveTo(45.3846f, 19.7637f, 45.8059f, 18.9288f, 46.4742f, 18.3572f)
                lineTo(44.9753f, 16.7213f)
                curveTo(43.839f, 17.6933f, 43.1231f, 19.1135f, 43.1231f, 20.6939f)
                curveTo(43.1231f, 22.2763f, 43.8396f, 23.696f, 44.977f, 24.6683f)
                close()
                moveTo(48.6164f, 23.8161f)
                curveTo(50.1788f, 23.8161f, 51.483f, 22.7444f, 51.7834f, 21.3209f)
                lineTo(53.9994f, 21.7592f)
                curveTo(53.4885f, 24.1789f, 51.2719f, 26.0f, 48.6164f, 26.0f)
                curveTo(48.0068f, 26.0f, 47.4208f, 25.9039f, 46.8728f, 25.7268f)
                lineTo(47.5906f, 23.6551f)
                curveTo(47.913f, 23.7592f, 48.2577f, 23.8161f, 48.6164f, 23.8161f)
                close()
            }
        }
        .build()
        return _elo!!
    }

private var _elo: ImageVector? = null
