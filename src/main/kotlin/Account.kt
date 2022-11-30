data class Account(
    val username : String,
    val password : String,
    val email : String,
    val mobilePhoneNumber: String? = null,
    val isActivate : Boolean = mobilePhoneNumber != null
)
