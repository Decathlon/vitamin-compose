package com.decathlon.vitamin.badges.utils

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.badges.BadgeSizes
import com.decathlon.vitamin.compose.badges.VitaminBadges
import com.decathlon.vitamin.compose.badges.VitaminCountBadges
import com.decathlon.vitamin.compose.badges.VitaminStandaloneBadges
import com.decathlon.vitamin.compose.vitaminicons.Fill
import com.decathlon.vitamin.compose.vitaminicons.fill.Heart

object BadgesVariantsFactory {

    @Composable
    fun Badges(
        variant: Variant,
        content: @Composable BoxScope.() -> Unit = {
            Icon(
                imageVector = VitaminIcons.Fill.Heart, contentDescription = ""
            )
        }
    ) {
        when (variant) {
            Variant.Accent -> VitaminBadges.Accent(anchor = { content() })
            Variant.Default -> VitaminBadges.Default(anchor = { content() })
            Variant.Brand -> VitaminBadges.Brand(anchor = { content() })
            Variant.Reversed -> VitaminBadges.Reversed(anchor = { content() })
            Variant.Alert -> VitaminBadges.Alert(anchor = { content() })
        }
    }

    @Composable
    fun CountBadges(
        count: Int,
        sizes: BadgeSizes,
        variant: Variant,
        content: @Composable BoxScope.() -> Unit = {
            Icon(
                imageVector = VitaminIcons.Fill.Heart, contentDescription = ""
            )
        }
    ) {
        when (variant) {
            Variant.Accent -> VitaminCountBadges.Accent(
                count = count,
                sizes = sizes,
                anchor = { content() })

            Variant.Default -> VitaminCountBadges.Default(
                count = count,
                sizes = sizes,
                anchor = { content() })

            Variant.Brand -> VitaminCountBadges.Brand(
                count = count,
                sizes = sizes,
                anchor = { content() })

            Variant.Reversed -> VitaminCountBadges.Reversed(
                count = count,
                sizes = sizes,
                anchor = { content() })

            Variant.Alert -> VitaminCountBadges.Alert(
                count = count,
                sizes = sizes,
                anchor = { content() })
        }
    }


    @Composable
    fun StandaloneBadges(
        count: Int,
        sizes: BadgeSizes,
        variant: Variant
    ) {
        when (variant) {
            Variant.Accent -> VitaminStandaloneBadges.Accent(
                count = count,
                sizes = sizes)

            Variant.Default -> VitaminStandaloneBadges.Default(
                count = count,
                sizes = sizes)

            Variant.Brand -> VitaminStandaloneBadges.Brand(
                count = count,
                sizes = sizes)

            Variant.Reversed -> VitaminStandaloneBadges.Reversed(
                count = count,
                sizes = sizes)

            Variant.Alert -> VitaminStandaloneBadges.Alert(
                count = count,
                sizes = sizes)
        }
    }
}
