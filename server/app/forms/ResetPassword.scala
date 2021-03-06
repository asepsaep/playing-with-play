package forms

import play.api.data.Form
import play.api.data.Forms._

object ResetPassword {

  val form = Form(
    mapping(
      "password" → nonEmptyText(minLength = 6),
      "confirmPassword" → nonEmptyText(minLength = 6)
    )(Data.apply)(Data.unapply)
  )

  case class Data(
    password: String,
    confirmPassword: String
  )

}
