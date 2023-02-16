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

public val LineGroup.ThumbUp: ImageVector
    get() {
        if (_thumbUp != null) {
            return _thumbUp!!
        }
        _thumbUp = Builder(name = "ThumbUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.7387f, 5.3389f)
                horizontalLineTo(14.0063f)
                curveTo(14.36f, 5.3389f, 14.6992f, 5.4794f, 14.9493f, 5.7295f)
                curveTo(15.1994f, 5.9796f, 15.3399f, 6.3189f, 15.3399f, 6.6726f)
                verticalLineTo(8.0755f)
                curveTo(15.3401f, 8.2498f, 15.3061f, 8.4225f, 15.2399f, 8.5837f)
                lineTo(13.1761f, 13.5948f)
                curveTo(13.1258f, 13.717f, 13.0402f, 13.8214f, 12.9304f, 13.8949f)
                curveTo(12.8206f, 13.9684f, 12.6914f, 14.0076f, 12.5593f, 14.0076f)
                horizontalLineTo(1.3367f)
                curveTo(1.1599f, 14.0076f, 0.9903f, 13.9373f, 0.8652f, 13.8123f)
                curveTo(0.7402f, 13.6872f, 0.6699f, 13.5176f, 0.6699f, 13.3407f)
                verticalLineTo(6.6726f)
                curveTo(0.6699f, 6.4957f, 0.7402f, 6.3261f, 0.8652f, 6.201f)
                curveTo(0.9903f, 6.076f, 1.1599f, 6.0057f, 1.3367f, 6.0057f)
                horizontalLineTo(3.6586f)
                curveTo(3.7654f, 6.0058f, 3.8706f, 5.9802f, 3.9654f, 5.9311f)
                curveTo(4.0602f, 5.882f, 4.1418f, 5.8109f, 4.2034f, 5.7237f)
                lineTo(7.8396f, 0.5712f)
                curveTo(7.8855f, 0.506f, 7.9533f, 0.4595f, 8.0306f, 0.4401f)
                curveTo(8.1079f, 0.4206f, 8.1897f, 0.4295f, 8.261f, 0.4651f)
                lineTo(9.4706f, 1.0699f)
                curveTo(9.811f, 1.2401f, 10.0829f, 1.5216f, 10.2413f, 1.8677f)
                curveTo(10.3996f, 2.2138f, 10.4347f, 2.6036f, 10.3408f, 2.9724f)
                lineTo(9.7387f, 5.3389f)
                close()
                moveTo(4.6708f, 7.0647f)
                verticalLineTo(12.6739f)
                horizontalLineTo(12.1125f)
                lineTo(14.0063f, 8.0755f)
                verticalLineTo(6.6726f)
                horizontalLineTo(9.7387f)
                curveTo(9.5355f, 6.6725f, 9.3351f, 6.6261f, 9.1527f, 6.5368f)
                curveTo(8.9702f, 6.4476f, 8.8106f, 6.3178f, 8.6859f, 6.1574f)
                curveTo(8.5613f, 5.9971f, 8.4749f, 5.8104f, 8.4334f, 5.6115f)
                curveTo(8.3918f, 5.4127f, 8.3963f, 5.207f, 8.4464f, 5.0102f)
                lineTo(9.0485f, 2.6443f)
                curveTo(9.0673f, 2.5705f, 9.0604f, 2.4925f, 9.0287f, 2.4232f)
                curveTo(8.997f, 2.3539f, 8.9426f, 2.2976f, 8.8744f, 2.2636f)
                lineTo(8.4337f, 2.0435f)
                lineTo(5.293f, 6.4925f)
                curveTo(5.1263f, 6.7286f, 4.9129f, 6.9219f, 4.6708f, 7.0647f)
                close()
                moveTo(3.3372f, 7.3394f)
                horizontalLineTo(2.0036f)
                verticalLineTo(12.6739f)
                horizontalLineTo(3.3372f)
                verticalLineTo(7.3394f)
                close()
            }
        }
        .build()
        return _thumbUp!!
    }

private var _thumbUp: ImageVector? = null
