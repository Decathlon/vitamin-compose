package com.decathlon.vitamin.compose.vitaminassets

import androidx.compose.ui.graphics.vector.ImageVector
import com.decathlon.vitamin.compose.VitaminAssets
import com.decathlon.vitamin.compose.vitaminassets.payments.AmazonPay
import com.decathlon.vitamin.compose.vitaminassets.payments.Amex
import com.decathlon.vitamin.compose.vitaminassets.payments.ApplePay
import com.decathlon.vitamin.compose.vitaminassets.payments.Bancontact
import com.decathlon.vitamin.compose.vitaminassets.payments.BancontactPayconiq
import com.decathlon.vitamin.compose.vitaminassets.payments.Belfius
import com.decathlon.vitamin.compose.vitaminassets.payments.Bitcoin
import com.decathlon.vitamin.compose.vitaminassets.payments.Bitpay
import com.decathlon.vitamin.compose.vitaminassets.payments.Bvr
import com.decathlon.vitamin.compose.vitaminassets.payments.Cadhoc
import com.decathlon.vitamin.compose.vitaminassets.payments.Cash
import com.decathlon.vitamin.compose.vitaminassets.payments.Cb
import com.decathlon.vitamin.compose.vitaminassets.payments.ChequePayment
import com.decathlon.vitamin.compose.vitaminassets.payments.ClickAndBuy
import com.decathlon.vitamin.compose.vitaminassets.payments.DinersClubInternational
import com.decathlon.vitamin.compose.vitaminassets.payments.Discover
import com.decathlon.vitamin.compose.vitaminassets.payments.Dwolla
import com.decathlon.vitamin.compose.vitaminassets.payments.Elo
import com.decathlon.vitamin.compose.vitaminassets.payments.Eps
import com.decathlon.vitamin.compose.vitaminassets.payments.Eway
import com.decathlon.vitamin.compose.vitaminassets.payments.GiftCardPayment
import com.decathlon.vitamin.compose.vitaminassets.payments.GiroPay
import com.decathlon.vitamin.compose.vitaminassets.payments.GooglePay
import com.decathlon.vitamin.compose.vitaminassets.payments.Ideal
import com.decathlon.vitamin.compose.vitaminassets.payments.Illicado
import com.decathlon.vitamin.compose.vitaminassets.payments.Ing
import com.decathlon.vitamin.compose.vitaminassets.payments.Ingenico
import com.decathlon.vitamin.compose.vitaminassets.payments.Jcb
import com.decathlon.vitamin.compose.vitaminassets.payments.Kbc
import com.decathlon.vitamin.compose.vitaminassets.payments.Klarna
import com.decathlon.vitamin.compose.vitaminassets.payments.Maestro
import com.decathlon.vitamin.compose.vitaminassets.payments.MaestroSubtext
import com.decathlon.vitamin.compose.vitaminassets.payments.Mastercard
import com.decathlon.vitamin.compose.vitaminassets.payments.MastercardFull
import com.decathlon.vitamin.compose.vitaminassets.payments.MastercardIdCheck
import com.decathlon.vitamin.compose.vitaminassets.payments.MbMay
import com.decathlon.vitamin.compose.vitaminassets.payments.MbMultibanco
import com.decathlon.vitamin.compose.vitaminassets.payments.Mnp
import com.decathlon.vitamin.compose.vitaminassets.payments.Neteller
import com.decathlon.vitamin.compose.vitaminassets.payments.Oney3x
import com.decathlon.vitamin.compose.vitaminassets.payments.Oney3x4x
import com.decathlon.vitamin.compose.vitaminassets.payments.Oney4x
import com.decathlon.vitamin.compose.vitaminassets.payments.OneyClassic
import com.decathlon.vitamin.compose.vitaminassets.payments.PayU
import com.decathlon.vitamin.compose.vitaminassets.payments.Paylib
import com.decathlon.vitamin.compose.vitaminassets.payments.Paymill
import com.decathlon.vitamin.compose.vitaminassets.payments.Payoneer
import com.decathlon.vitamin.compose.vitaminassets.payments.Paypal
import com.decathlon.vitamin.compose.vitaminassets.payments.PaysafeCard
import com.decathlon.vitamin.compose.vitaminassets.payments.PointsPay
import com.decathlon.vitamin.compose.vitaminassets.payments.PostEfinance
import com.decathlon.vitamin.compose.vitaminassets.payments.PostFinance
import com.decathlon.vitamin.compose.vitaminassets.payments.PostePay
import com.decathlon.vitamin.compose.vitaminassets.payments.PowerPay
import com.decathlon.vitamin.compose.vitaminassets.payments.Przelewy24
import com.decathlon.vitamin.compose.vitaminassets.payments.Sepa
import com.decathlon.vitamin.compose.vitaminassets.payments.Skrill
import com.decathlon.vitamin.compose.vitaminassets.payments.SpiritOfCadeau
import com.decathlon.vitamin.compose.vitaminassets.payments.Stripe
import com.decathlon.vitamin.compose.vitaminassets.payments.UnionPay
import com.decathlon.vitamin.compose.vitaminassets.payments.Verifone
import com.decathlon.vitamin.compose.vitaminassets.payments.VisaClassic
import com.decathlon.vitamin.compose.vitaminassets.payments.VisaElectron
import com.decathlon.vitamin.compose.vitaminassets.payments.Wallet
import com.decathlon.vitamin.compose.vitaminassets.payments.WebMoney
import com.decathlon.vitamin.compose.vitaminassets.payments.WesternUnion
import kotlin.collections.List as ____KtList

public object PaymentsGroup

public val VitaminAssets.Payments: PaymentsGroup
  get() = PaymentsGroup

private var __AllAssets: ____KtList<ImageVector>? = null

public val PaymentsGroup.AllAssets: ____KtList<ImageVector>
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Eway, OneyClassic, Elo, PostePay, MbMultibanco, PaysafeCard, PostEfinance,
        GiroPay, BancontactPayconiq, PowerPay, Przelewy24, Oney4x, Maestro, ClickAndBuy, PointsPay,
        Bancontact, Oney3x, Neteller, Cadhoc, Bvr, MbMay, Discover, MastercardFull, Bitcoin,
        Verifone, Wallet, Payoneer, Bitpay, Belfius, Eps, Dwolla, SpiritOfCadeau, UnionPay,
        Ingenico, DinersClubInternational, Paylib, Cb, ChequePayment, Paypal, Skrill, Mastercard,
        Klarna, Stripe, Amex, Cash, WebMoney, Jcb, Illicado, VisaElectron, PayU, WesternUnion,
        Oney3x4x, ApplePay, Ideal, GooglePay, Mnp, Paymill, Sepa, MaestroSubtext, Kbc,
        MastercardIdCheck, Ing, VisaClassic, PostFinance, AmazonPay, GiftCardPayment)
    return __AllAssets!!
  }
