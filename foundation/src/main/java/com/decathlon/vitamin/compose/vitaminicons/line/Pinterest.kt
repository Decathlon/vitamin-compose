package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Pinterest: ImageVector
    get() {
        if (_pinterest != null) {
            return _pinterest!!
        }
        _pinterest = Builder(name = "Pinterest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                close()
                moveTo(8.634f, 18.19f)
                curveTo(8.562f, 18.52f, 8.514f, 18.855f, 8.49f, 19.191f)
                verticalLineTo(19.192f)
                curveTo(4.6731f, 17.3293f, 2.9771f, 12.8086f, 4.6269f, 8.8949f)
                curveTo(6.2767f, 4.9813f, 10.6972f, 3.039f, 14.6957f, 4.4708f)
                curveTo(18.6942f, 5.9026f, 20.8769f, 10.2095f, 19.6674f, 14.2808f)
                curveTo(18.4579f, 18.3521f, 14.2777f, 20.7686f, 10.146f, 19.785f)
                curveTo(10.306f, 19.448f, 10.44f, 19.1f, 10.546f, 18.745f)
                curveTo(10.586f, 18.588f, 10.688f, 18.171f, 10.834f, 17.571f)
                lineTo(10.836f, 17.564f)
                lineTo(11.086f, 16.535f)
                curveTo(11.5772f, 17.1612f, 12.3365f, 17.5171f, 13.132f, 17.494f)
                curveTo(15.89f, 17.494f, 17.822f, 14.922f, 17.822f, 11.39f)
                curveTo(17.822f, 8.579f, 15.476f, 6.25f, 12.341f, 6.25f)
                curveTo(8.64f, 6.25f, 6.149f, 8.849f, 6.149f, 11.834f)
                curveTo(6.149f, 13.496f, 6.785f, 14.795f, 7.945f, 15.274f)
                curveTo(8.0567f, 15.3307f, 8.1889f, 15.3299f, 8.3f, 15.272f)
                curveTo(8.4148f, 15.2126f, 8.4948f, 15.1025f, 8.516f, 14.975f)
                curveTo(8.552f, 14.847f, 8.651f, 14.463f, 8.692f, 14.295f)
                curveTo(8.767f, 14.088f, 8.698f, 13.845f, 8.517f, 13.705f)
                curveTo(8.1611f, 13.2328f, 7.9801f, 12.6518f, 8.005f, 12.061f)
                curveTo(7.9903f, 10.9537f, 8.4208f, 9.8869f, 9.2f, 9.1f)
                curveTo(9.9635f, 8.3293f, 11.0149f, 7.9137f, 12.099f, 7.954f)
                curveTo(14.241f, 7.954f, 15.531f, 9.258f, 15.531f, 11.228f)
                curveTo(15.531f, 13.791f, 14.423f, 15.776f, 12.931f, 15.776f)
                curveTo(12.5415f, 15.7965f, 12.1663f, 15.6265f, 11.925f, 15.32f)
                curveTo(11.68f, 15.011f, 11.592f, 14.6f, 11.688f, 14.214f)
                curveTo(11.725f, 14.05f, 11.769f, 13.88f, 11.82f, 13.692f)
                curveTo(11.866f, 13.525f, 11.915f, 13.359f, 11.986f, 13.121f)
                curveTo(12.354f, 11.884f, 12.439f, 11.539f, 12.439f, 11.086f)
                curveTo(12.485f, 10.734f, 12.375f, 10.365f, 12.137f, 10.09f)
                curveTo(11.899f, 9.814f, 11.555f, 9.658f, 11.195f, 9.664f)
                curveTo(10.215f, 9.664f, 9.459f, 10.7f, 9.459f, 12.037f)
                curveTo(9.452f, 12.5261f, 9.5488f, 13.0111f, 9.743f, 13.46f)
                curveTo(9.7027f, 13.5466f, 9.643f, 13.8035f, 9.5658f, 14.1356f)
                lineTo(9.175f, 15.82f)
                lineTo(9.168f, 15.85f)
                curveTo(8.888f, 17.06f, 8.697f, 17.895f, 8.634f, 18.19f)
                close()
            }
        }
        .build()
        return _pinterest!!
    }

private var _pinterest: ImageVector? = null
