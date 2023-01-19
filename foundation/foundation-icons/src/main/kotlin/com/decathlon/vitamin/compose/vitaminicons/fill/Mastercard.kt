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

public val FillGroup.Mastercard: ImageVector
    get() {
        if (_mastercard != null) {
            return _mastercard!!
        }
        _mastercard = Builder(name = "Mastercard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.42f, 4.048f)
                curveTo(6.2636f, 5.0351f, 5.5984f, 6.4796f, 5.6f, 8.0f)
                curveTo(5.5984f, 9.5197f, 6.2632f, 10.9636f, 7.4187f, 11.9507f)
                curveTo(5.5126f, 13.0207f, 3.1143f, 12.5777f, 1.7163f, 10.8973f)
                curveTo(0.3183f, 9.2169f, 0.3189f, 6.7781f, 1.7178f, 5.0985f)
                curveTo(3.1167f, 3.4188f, 5.5145f, 2.977f, 7.42f, 4.048f)
                close()
                moveTo(7.9999f, 4.436f)
                curveTo(9.0937f, 5.2945f, 9.7318f, 6.6083f, 9.7306f, 7.9987f)
                curveTo(9.7314f, 9.3886f, 9.0933f, 10.7018f, 7.9999f, 11.56f)
                curveTo(6.9064f, 10.7016f, 6.2682f, 9.3882f, 6.2693f, 7.998f)
                curveTo(6.2682f, 6.6078f, 6.9064f, 5.2944f, 7.9999f, 4.436f)
                close()
                moveTo(10.4f, 8.0f)
                curveTo(10.4016f, 9.5197f, 9.7368f, 10.9636f, 8.5813f, 11.9507f)
                curveTo(10.4874f, 13.0207f, 12.8863f, 12.5777f, 14.2844f, 10.8973f)
                curveTo(15.6824f, 9.2169f, 15.6818f, 6.7781f, 14.2829f, 5.0985f)
                curveTo(12.884f, 3.4188f, 10.4855f, 2.977f, 8.58f, 4.048f)
                curveTo(9.7364f, 5.0351f, 10.4016f, 6.4796f, 10.4f, 8.0f)
                close()
            }
        }
        .build()
        return _mastercard!!
    }

private var _mastercard: ImageVector? = null
