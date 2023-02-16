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

public val FillGroup.Slack: ImageVector
    get() {
        if (_slack != null) {
            return _slack!!
        }
        _slack = Builder(name = "Slack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.3241f, 4.3513f)
                curveTo(5.601f, 4.3488f, 5.0156f, 3.7631f, 5.0134f, 3.04f)
                curveTo(5.0134f, 2.318f, 5.6028f, 1.7287f, 6.3248f, 1.7287f)
                curveTo(7.0468f, 1.7287f, 7.6368f, 2.318f, 7.6368f, 3.04f)
                verticalLineTo(4.352f)
                lineTo(6.3241f, 4.3513f)
                close()
                moveTo(3.0401f, 10.9867f)
                curveTo(3.7631f, 10.9845f, 4.3489f, 10.399f, 4.3514f, 9.676f)
                lineTo(4.3521f, 8.3633f)
                horizontalLineTo(3.0401f)
                curveTo(2.3181f, 8.3633f, 1.7288f, 8.9533f, 1.7288f, 9.6753f)
                curveTo(1.731f, 10.3986f, 2.3168f, 10.9845f, 3.0401f, 10.9867f)
                close()
                moveTo(6.3241f, 8.364f)
                curveTo(5.6021f, 8.364f, 5.0128f, 8.954f, 5.0128f, 9.676f)
                verticalLineTo(12.9607f)
                curveTo(5.0149f, 13.684f, 5.6008f, 14.2698f, 6.3241f, 14.272f)
                curveTo(7.0477f, 14.2702f, 7.6339f, 13.6842f, 7.6361f, 12.9607f)
                verticalLineTo(9.676f)
                curveTo(7.6361f, 8.954f, 7.0461f, 8.364f, 6.3241f, 8.364f)
                close()
                moveTo(7.6361f, 6.324f)
                curveTo(7.6361f, 5.602f, 7.0461f, 5.0127f, 6.3241f, 5.0127f)
                horizontalLineTo(3.0401f)
                curveTo(2.3181f, 5.0127f, 1.7288f, 5.602f, 1.7288f, 6.324f)
                curveTo(1.7306f, 7.0476f, 2.3165f, 7.6338f, 3.0401f, 7.636f)
                horizontalLineTo(6.3241f)
                curveTo(7.0479f, 7.6342f, 7.6343f, 7.0478f, 7.6361f, 6.324f)
                close()
                moveTo(11.6488f, 6.324f)
                curveTo(11.6488f, 5.602f, 12.2388f, 5.0127f, 12.9608f, 5.0127f)
                curveTo(13.6828f, 5.0127f, 14.2721f, 5.602f, 14.2721f, 6.324f)
                curveTo(14.2703f, 7.0476f, 13.6844f, 7.6338f, 12.9608f, 7.636f)
                horizontalLineTo(11.6488f)
                verticalLineTo(6.324f)
                close()
                moveTo(9.6761f, 7.636f)
                curveTo(10.3997f, 7.6338f, 10.9856f, 7.0476f, 10.9875f, 6.324f)
                verticalLineTo(3.04f)
                curveTo(10.9875f, 2.318f, 10.3981f, 1.7287f, 9.6761f, 1.7287f)
                curveTo(8.9541f, 1.7287f, 8.3641f, 2.318f, 8.3641f, 3.04f)
                verticalLineTo(6.324f)
                curveTo(8.366f, 7.0478f, 8.9523f, 7.6342f, 9.6761f, 7.636f)
                close()
                moveTo(9.6761f, 11.6487f)
                curveTo(10.3981f, 11.6487f, 10.9875f, 12.2387f, 10.9875f, 12.9607f)
                curveTo(10.9853f, 13.684f, 10.3995f, 14.2698f, 9.6761f, 14.272f)
                curveTo(8.9525f, 14.2702f, 8.3663f, 13.6842f, 8.3641f, 12.9607f)
                verticalLineTo(11.6487f)
                horizontalLineTo(9.6761f)
                close()
                moveTo(8.3641f, 9.676f)
                curveTo(8.3663f, 10.3996f, 8.9525f, 10.9855f, 9.6761f, 10.9873f)
                horizontalLineTo(12.9608f)
                curveTo(13.6841f, 10.9851f, 14.2699f, 10.3993f, 14.2721f, 9.676f)
                curveTo(14.2721f, 8.954f, 13.6828f, 8.364f, 12.9608f, 8.364f)
                horizontalLineTo(9.6761f)
                curveTo(8.9541f, 8.364f, 8.3641f, 8.954f, 8.3641f, 9.676f)
                close()
            }
        }
        .build()
        return _slack!!
    }

private var _slack: ImageVector? = null
