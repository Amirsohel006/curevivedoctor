package com.curevivedoctor.app.modules.wallettransactions.`data`.model

import com.curevivedoctor.app.R
import com.curevivedoctor.app.appcomponents.di.MyApp
import kotlin.String

data class WalletTransactionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAnalysis: String? = MyApp.getInstance().resources.getString(R.string.lbl_analysis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccounts: String? = MyApp.getInstance().resources.getString(R.string.lbl_accounts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_2552)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHDFCBank: String? = MyApp.getInstance().resources.getString(R.string.lbl_hdfc_bank)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_4560)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWithdrawableba: String? =
      MyApp.getInstance().resources.getString(R.string.msg_withdrawable_ba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyBanks: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_banks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCards: String? = MyApp.getInstance().resources.getString(R.string.lbl_cards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvailable: String? = MyApp.getInstance().resources.getString(R.string.lbl_available)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_255)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVisa: String? = MyApp.getInstance().resources.getString(R.string.lbl_visa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWallet: String? = MyApp.getInstance().resources.getString(R.string.lbl_wallet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalincome: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_income)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonthly: String? = MyApp.getInstance().resources.getString(R.string.lbl_monthly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_599_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBalanceavailab: String? =
      MyApp.getInstance().resources.getString(R.string.msg_balance_availab)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactions: String? = MyApp.getInstance().resources.getString(R.string.lbl_transactions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEarnings: String? = MyApp.getInstance().resources.getString(R.string.lbl_earnings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFines: String? = MyApp.getInstance().resources.getString(R.string.lbl_fines)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionsOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_transactions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_march_31_2022)

)
