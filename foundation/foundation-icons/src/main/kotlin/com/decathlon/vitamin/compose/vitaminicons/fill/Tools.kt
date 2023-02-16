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

public val FillGroup.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5507f, 2.1357f)
                curveTo(3.9667f, 1.9872f, 4.4163f, 1.96f, 4.8472f, 2.057f)
                curveTo(5.2782f, 2.154f, 5.6727f, 2.3714f, 5.985f, 2.6838f)
                curveTo(6.2972f, 2.9962f, 6.5144f, 3.3908f, 6.6113f, 3.8218f)
                curveTo(6.7081f, 4.2528f, 6.6806f, 4.7024f, 6.532f, 5.1183f)
                lineTo(13.762f, 12.3483f)
                lineTo(12.3473f, 13.7623f)
                lineTo(5.1173f, 6.533f)
                curveTo(4.7013f, 6.6814f, 4.2517f, 6.7087f, 3.8208f, 6.6117f)
                curveTo(3.3898f, 6.5146f, 2.9953f, 6.2973f, 2.683f, 5.9849f)
                curveTo(2.3708f, 5.6725f, 2.1536f, 5.2778f, 2.0568f, 4.8469f)
                curveTo(1.9599f, 4.4159f, 1.9874f, 3.9663f, 2.136f, 3.5503f)
                lineTo(3.6267f, 5.0417f)
                curveTo(3.7189f, 5.1372f, 3.8293f, 5.2133f, 3.9513f, 5.2658f)
                curveTo(4.0733f, 5.3182f, 4.2045f, 5.3458f, 4.3373f, 5.3469f)
                curveTo(4.47f, 5.3481f, 4.6017f, 5.3228f, 4.7246f, 5.2725f)
                curveTo(4.8475f, 5.2222f, 4.9592f, 5.148f, 5.0531f, 5.054f)
                curveTo(5.147f, 4.9602f, 5.2212f, 4.8485f, 5.2715f, 4.7256f)
                curveTo(5.3218f, 4.6027f, 5.3471f, 4.471f, 5.3459f, 4.3383f)
                curveTo(5.3448f, 4.2055f, 5.3172f, 4.0743f, 5.2648f, 3.9523f)
                curveTo(5.2124f, 3.8303f, 5.1362f, 3.7199f, 5.0407f, 3.6277f)
                lineTo(3.55f, 2.135f)
                lineTo(3.5507f, 2.1357f)
                close()
                moveTo(10.462f, 3.3917f)
                lineTo(12.5833f, 2.213f)
                lineTo(13.526f, 3.1557f)
                lineTo(12.3473f, 5.277f)
                lineTo(11.1687f, 5.513f)
                lineTo(9.7553f, 6.927f)
                lineTo(8.812f, 5.9843f)
                lineTo(10.226f, 4.5703f)
                lineTo(10.462f, 3.3917f)
                close()
                moveTo(5.748f, 8.577f)
                lineTo(7.162f, 9.9917f)
                lineTo(3.862f, 13.2917f)
                curveTo(3.68f, 13.4719f, 3.4358f, 13.5755f, 3.1797f, 13.581f)
                curveTo(2.9236f, 13.5865f, 2.6752f, 13.4935f, 2.4857f, 13.3213f)
                curveTo(2.2961f, 13.149f, 2.1799f, 12.9105f, 2.161f, 12.6551f)
                curveTo(2.1421f, 12.3996f, 2.2219f, 12.1466f, 2.384f, 11.9483f)
                lineTo(2.4487f, 11.877f)
                lineTo(5.7487f, 8.577f)
                horizontalLineTo(5.748f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
