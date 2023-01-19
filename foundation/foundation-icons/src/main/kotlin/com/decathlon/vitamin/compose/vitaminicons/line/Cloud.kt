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

public val LineGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3334f, 4.0f)
                curveTo(5.1841f, 4.0f, 4.0819f, 4.4565f, 3.2692f, 5.2692f)
                curveTo(2.4566f, 6.0818f, 2.0f, 7.184f, 2.0f, 8.3333f)
                curveTo(2.0f, 9.4826f, 2.4566f, 10.5848f, 3.2692f, 11.3974f)
                curveTo(4.0819f, 12.2101f, 5.1841f, 12.6666f, 6.3334f, 12.6666f)
                horizontalLineTo(11.0f)
                curveTo(11.4208f, 12.6662f, 11.8368f, 12.5773f, 12.221f, 12.4056f)
                curveTo(12.6052f, 12.234f, 12.9489f, 11.9834f, 13.23f, 11.6702f)
                curveTo(13.511f, 11.3571f, 13.723f, 10.9883f, 13.8522f, 10.5878f)
                curveTo(13.9814f, 10.1874f, 14.0249f, 9.7642f, 13.9799f, 9.3458f)
                curveTo(13.9349f, 8.9275f, 13.8024f, 8.5232f, 13.591f, 8.1594f)
                curveTo(13.3796f, 7.7956f, 13.094f, 7.4803f, 12.7528f, 7.234f)
                curveTo(12.4116f, 6.9878f, 12.0224f, 6.8161f, 11.6105f, 6.73f)
                curveTo(11.1986f, 6.644f, 10.7733f, 6.6455f, 10.362f, 6.7346f)
                curveTo(10.0416f, 5.9278f, 9.4862f, 5.2358f, 8.7679f, 4.7482f)
                curveTo(8.0496f, 4.2606f, 7.2015f, 3.9999f, 6.3334f, 4.0f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineTo(6.3334f)
                curveTo(5.3468f, 13.9997f, 4.3775f, 13.742f, 3.5212f, 13.2521f)
                curveTo(2.6648f, 12.7623f, 1.9512f, 12.0575f, 1.4509f, 11.2072f)
                curveTo(0.9506f, 10.357f, 0.6809f, 9.3909f, 0.6685f, 8.4045f)
                curveTo(0.6561f, 7.418f, 0.9014f, 6.4455f, 1.3802f, 5.5829f)
                curveTo(1.8591f, 4.7204f, 2.5547f, 3.9978f, 3.3985f, 3.4867f)
                curveTo(4.2422f, 2.9755f, 5.2048f, 2.6935f, 6.191f, 2.6685f)
                curveTo(7.1772f, 2.6434f, 8.1528f, 2.8763f, 9.0214f, 3.344f)
                curveTo(9.89f, 3.8118f, 10.6214f, 4.4981f, 11.1433f, 5.3353f)
                curveTo(12.2818f, 5.3697f, 13.3609f, 5.851f, 14.1473f, 6.675f)
                curveTo(14.9336f, 7.499f, 15.3639f, 8.5995f, 15.345f, 9.7383f)
                curveTo(15.3262f, 10.8771f, 14.8597f, 11.9628f, 14.0466f, 12.7603f)
                curveTo(13.2334f, 13.5578f, 12.139f, 14.0032f, 11.0f, 14.0f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
